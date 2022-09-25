package com.google.mediapipe.p4722a;

import com.google.mediapipe.framework.C62716a;
import com.google.mediapipe.framework.GlSyncToken;

/* renamed from: com.google.mediapipe.a.g */
/* compiled from: PG */
final class C62705g extends C62716a {

    /* renamed from: a */
    final /* synthetic */ C62706h f169289a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62705g(C62706h hVar, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f169289a = hVar;
    }

    public final void release() {
        super.release();
        this.f169289a.mo58585b(this);
    }

    public final void release(GlSyncToken glSyncToken) {
        super.release(glSyncToken);
        this.f169289a.mo58585b(this);
    }
}
