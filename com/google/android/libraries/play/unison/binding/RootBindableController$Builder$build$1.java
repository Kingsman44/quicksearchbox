package com.google.android.libraries.play.unison.binding;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;

/* compiled from: PG */
public final class RootBindableController$Builder$build$1 implements C2376g {

    /* renamed from: a */
    final /* synthetic */ boolean f85931a;

    /* renamed from: b */
    final /* synthetic */ C31979e f85932b;

    /* renamed from: c */
    final /* synthetic */ C31978d f85933c;

    /* renamed from: d */
    final /* synthetic */ C31974aw f85934d;

    public RootBindableController$Builder$build$1(boolean z, C31979e eVar, C31978d dVar, C31974aw awVar) {
        this.f85931a = z;
        this.f85932b = eVar;
        this.f85933c = dVar;
        this.f85934d = awVar;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        if (!this.f85931a || !this.f85933c.mo37747j()) {
            this.f85934d.f85969a = null;
        } else {
            new Handler(Looper.getMainLooper()).post(new C31971at(this.f85933c, this.f85934d));
        }
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        if (this.f85931a) {
            this.f85932b.f85981a.mo37745g();
        } else {
            this.f85932b.f85981a.mo37746h();
        }
    }
}
