package com.badlogic.gdx.jnigen.gc;

import com.badlogic.gdx.jnigen.closure.Closure;
import com.badlogic.gdx.jnigen.closure.ClosureObject;

public class Closures {

    /*JNI
        #include "definitions.h"
     */

    public interface CallbackNoReturnNoArg extends Closure {
        void toCall();
    }

    public interface CallbackNoReturnLongArg extends Closure {
        void toCall(long arg);
    }

    public interface CallbackNoReturnIntArg extends Closure {
        void toCall(int arg);
    }


    public interface CallbackNoReturnShortArg extends Closure {
        void toCall(short arg);
    }

    public interface CallbackNoReturnByteArg extends Closure {
        void toCall(byte arg);
    }

    public interface CallbackNoReturnCharArg extends Closure {
        void toCall(char arg);
    }

    public interface CallbackNoReturnBooleanArg extends Closure {
        void toCall(boolean arg);
    }

    public interface CallbackNoReturnFloatArg extends Closure {
        void toCall(float arg);
    }

    public interface CallbackNoReturnDoubleArg extends Closure {
        void toCall(double arg);
    }

    public interface CallbackNoReturnAllArgs extends Closure {
        void toCall(long arg1, int arg2, short arg3, byte arg4, char arg5, boolean arg6, float arg7, double arg8);
    }

    public static void methodWithCallback(ClosureObject<CallbackNoReturnNoArg> closure) {
        methodWithCallback(closure.getFnPtr());
    }

    private static native void methodWithCallback(long fnPtr);/*
        ((void (*)())fnPtr)();
    */

    public static native void methodWithCallbackLongArg(long fnPtr);/*
        uint64_t arg = 5;
        ((void (*)(uint64_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackIntArg(long fnPtr);/*
        uint32_t arg = 5;
        ((void (*)(uint32_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackShortArg(long fnPtr);/*
        uint16_t arg = 5;
        ((void (*)(uint16_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackByteArg(long fnPtr);/*
        uint8_t arg = 5;
        ((void (*)(uint8_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackCharArg(long fnPtr);/*
        uint16_t arg = 5;
        ((void (*)(uint16_t))fnPtr)(arg);
    */

    public static native void methodWithCallbackBooleanArg(long fnPtr);/*
        bool arg = true;
        ((void (*)(bool))fnPtr)(arg);
    */

    public static native void methodWithCallbackFloatArg(long fnPtr);/*
        float arg = 5.5;
        ((void (*)(float))fnPtr)(arg);
    */

    public static native void methodWithCallbackDoubleArg(long fnPtr);/*
        double arg = 5.5;
        ((void (*)(double))fnPtr)(arg);
    */

    public static native void methodWithCallbackStructArg(long fnPtr);/*
        TestStruct arg = {
            .field1 = 1,
            .field2 = 2,
            .field3 = 3,
            .field4 = 4
        };
        ((void (*)(TestStruct))fnPtr)(arg);
    */

    public static native void methodWithCallbackAllArgs(long fnPtr);/*
        uint64_t arg1 = 1;
        uint32_t arg2 = 2;
        uint16_t arg3 = 3;
        uint8_t arg4 = 4;
        uint16_t arg5 = 5;
        bool arg6 = true;
        float arg7 = 6.6;
        double arg8 = 7.7;
        ((void (*)(uint64_t, uint32_t, uint16_t, uint8_t, uint16_t, bool, float, double))fnPtr)(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    */
}