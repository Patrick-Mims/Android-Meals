cmake_minimum_required(VERSION 3.22.1)

project(main LANGUAGES C)

set(CMAKE_VERBOSE_MAKEFILE ON)

add_library(${PROJECT_NAME} SHARED
        main.c
        stack/ListImpl.c
        stack/StackImpl.c)

find_package(JSON-C)
find_package(CURL)

find_library(${CURL} curl HINTS /usr/bin/curl)

include_directories(${PROJECT_NAME} include)

target_include_directories(${PROJECT_NAME} PUBLIC /usr/local/include/curl/)
target_include_directories(${PROJECT_NAME} PUBLIC /usr/local/include/json-c/)

#include_directories(/usr/local/include/json-c)
# include_directories(${PROJECT_SOURCE_DIR})

target_link_libraries(${PROJECT_NAME}
         #PRIVATE json-c::json-c
        ${CURL}
        android
        log)

link_directories()

## For more information about using CMake with Android Studio, read the
## documentation: https://d.android.com/studio/projects/add-native-code.html.
## For more examples on how to use CMake, see https://github.com/android/ndk-samples.
#
## Sets the minimum CMake version required for this project.
# cmake_minimum_required(VERSION 3.22.1)
## cmake_minimum_required(VERSION 3.27.6)
#
## Declares the project name. The project name can be accessed via ${ PROJECT_NAME},
## Since this is the top level CMakeLists.txt, the project name is also accessible
## with ${CMAKE_PROJECT_NAME} (both CMake variables are in-sync within the top level
## build script scope).
##project("meals")
#project ("main")
#
##set(CURL_LIBRARY "-lcurl")
#link_directories("/usr/local/lib")
#set(CURL_INCLUDE_DIR "/usr/local/lib")
#set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS}")
#
##add_definitions(-w)
#
#find_package(CURL REQUIRED)
#find_package(json-c CONFIG)
#
#include_directories(include)
#include_directories(${CURL_INCLUDE_DIR})
#include_directories(${PROJECT_SOURCE_DIR})
## include_directories(${CURL_INCLUDE_DIR})
## Creates and names a library, sets it as either STATIC
## or SHARED, and provides the relative paths to its source code.
## You can define multiple libraries, and CMake builds them for you.
## Gradle automatically packages shared libraries with your APK.
##
## In this top level CMakeLists.txt, ${CMAKE_PROJECT_NAME} is used to define
## the target library name; in the sub-module's CMakeLists.txt, ${PROJECT_NAME}
## is preferred for the same purpose.
##
## In order to load a library into your app from Java/Kotlin, you must call
## System.loadLibrary() and pass the name of the library defined here;
## for GameActivity/NativeActivity derived applications, the same library name must be
## used in the AndroidManifest.xml file.
#
#add_library(${PROJECT_NAME} SHARED
#        main.c
#        stack/ListImpl.c
#        stack/StackImpl.c)
#
## Specifies libraries CMake should link to your target library. You
## can link libraries from various origins, such as libraries defined in this
## build script, prebuilt third-party libraries, or Android system libraries.
#target_link_libraries(${PROJECT_NAME}
#        # List libraries link to the target library
#        CURL::libcurl
#        android
#        log)
#