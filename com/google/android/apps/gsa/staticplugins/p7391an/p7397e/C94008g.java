package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.g */
/* compiled from: PG */
final class C94008g extends FrameSequenceDrawable {

    /* renamed from: a */
    private boolean f262557a;

    public C94008g(FrameSequence frameSequence) {
        super(frameSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88278a(boolean z) {
        this.f262557a = z;
        if (z) {
            stop();
        } else {
            start();
        }
    }

    public final void start() {
        if (!this.f262557a) {
            super.start();
        }
    }
}
