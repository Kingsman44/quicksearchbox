package com.google.speech.grammar.pumpkin;

/* compiled from: PG */
public class ActionFrameManager {

    /* renamed from: a */
    private long f180885a;

    /* renamed from: b */
    private final Object f180886b = new Object();

    public ActionFrameManager() {
        long nativeCreate = nativeCreate();
        this.f180885a = nativeCreate;
        if (nativeCreate == 0) {
            throw new IllegalArgumentException("Couldn't create action_frame_manager from the provided config");
        }
    }

    private static native long nativeCombine(long j, long j2, long j3);

    private static native long nativeCreate();

    private static native long nativeCreateFromMMap(String str);

    private static native void nativeDelete(long j);

    private static native long nativeLoadActionFrame(long j, byte[] bArr);

    /* renamed from: a */
    public final ActionFrame mo59648a(ActionFrame actionFrame, ActionFrame actionFrame2) {
        long nativeCombine = nativeCombine(this.f180885a, actionFrame.f180883a, actionFrame2.f180883a);
        if (nativeCombine != 0) {
            return new ActionFrame(nativeCombine);
        }
        throw new IllegalArgumentException("Couldn't combine the given two action frames.");
    }

    /* renamed from: b */
    public final ActionFrame mo59649b(byte[] bArr) {
        if (bArr != null) {
            long nativeLoadActionFrame = nativeLoadActionFrame(this.f180885a, bArr);
            if (nativeLoadActionFrame != 0) {
                return new ActionFrame(nativeLoadActionFrame);
            }
            throw new IllegalArgumentException("Couldn't create action_frame from the provided ActionSetConfig");
        }
        throw new IllegalArgumentException("ActionSetConfig bytes is null");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f180886b) {
            long j = this.f180885a;
            if (j != 0) {
                nativeDelete(j);
                this.f180885a = 0;
            }
        }
    }

    public ActionFrameManager(String str) {
        long nativeCreateFromMMap = nativeCreateFromMMap(str);
        this.f180885a = nativeCreateFromMMap;
        if (nativeCreateFromMMap == 0) {
            throw new IllegalArgumentException("Couldn't create action_frame_manager from the provided config");
        }
    }
}
