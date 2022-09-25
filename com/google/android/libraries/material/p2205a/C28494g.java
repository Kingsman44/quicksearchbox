package com.google.android.libraries.material.p2205a;

import android.view.Choreographer;

/* renamed from: com.google.android.libraries.material.a.g */
/* compiled from: PG */
public abstract class C28494g {

    /* renamed from: a */
    private Choreographer.FrameCallback f77326a;

    /* renamed from: a */
    public abstract void mo33947a(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Choreographer.FrameCallback mo33951b() {
        if (this.f77326a == null) {
            this.f77326a = new C28493f(this);
        }
        return this.f77326a;
    }
}
