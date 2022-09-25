package com.google.research.xeno.effect;

import android.util.Pair;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureReleaseCallback;
import java.util.Set;

/* compiled from: PG */
public class Control {

    /* compiled from: PG */
    public class BoolSetting {
        private BoolSetting(long j) {
        }
    }

    /* compiled from: PG */
    public class FloatSetting {
        private FloatSetting(long j) {
            Control.nativeGetFloatRange(j);
        }
    }

    /* compiled from: PG */
    public class GpuBufferSetting {
        private GpuBufferSetting(long j) {
        }

        private static void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
            textureReleaseCallback.release(new GraphGlSyncToken(j));
        }
    }

    /* compiled from: PG */
    public class IntSetting {
        private IntSetting(long j) {
            Control.nativeGetIntRange(j);
        }
    }

    /* compiled from: PG */
    public class RuntimeOptionsSetting {
        private RuntimeOptionsSetting(long j) {
        }
    }

    /* compiled from: PG */
    public class StringSetting {
        private StringSetting(long j) {
        }
    }

    private Control(BoolSetting boolSetting, FloatSetting floatSetting, GpuBufferSetting gpuBufferSetting, IntSetting intSetting, RuntimeOptionsSetting runtimeOptionsSetting, StringSetting stringSetting) {
    }

    private static native boolean nativeGetBoolValue(long j);

    public static native Pair nativeGetFloatRange(long j);

    private static native float nativeGetFloatValue(long j);

    public static native Pair nativeGetIntRange(long j);

    private static native int nativeGetIntValue(long j);

    private static native byte[] nativeGetRuntimeOptionsValue(long j);

    private static native Set nativeGetStringPossibleValues(long j);

    private static native String nativeGetStringValue(long j);

    private static native void nativeSetBoolValue(long j, boolean z);

    private static native void nativeSetFloatValue(long j, float f);

    private static native void nativeSetGpuBufferValue(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    private static native void nativeSetIntValue(long j, int i);

    private static native void nativeSetRuntimeOptionsValue(long j, byte[] bArr);

    private static native void nativeSetStringValue(long j, String str);

    private static native void nativeUnsetGpuBufferValue(long j);
}
