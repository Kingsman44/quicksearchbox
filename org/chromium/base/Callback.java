package org.chromium.base;

@FunctionalInterface
/* compiled from: PG */
public interface Callback {

    /* compiled from: PG */
    public abstract class Helper {
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.mo63827a();
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.mo63827a();
        }

        static void onLongResultFromNative(Callback callback, long j) {
            callback.mo63827a();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.mo63827a();
        }

        static void onTimeResultFromNative(Callback callback, long j) {
            callback.mo63827a();
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    void mo63827a();
}
