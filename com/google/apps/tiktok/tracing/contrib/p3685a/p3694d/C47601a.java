package com.google.apps.tiktok.tracing.contrib.p3685a.p3694d;

import android.view.Choreographer;
import com.google.android.libraries.lens.view.gleam.C26529dg;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C47601a implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ C47602b f123523a;

    /* renamed from: b */
    public final /* synthetic */ Choreographer.FrameCallback f123524b;

    public /* synthetic */ C47601a(C47602b bVar, Choreographer.FrameCallback frameCallback) {
        this.f123523a = bVar;
        this.f123524b = frameCallback;
    }

    public final void doFrame(long j) {
        C47602b bVar = this.f123523a;
        Choreographer.FrameCallback frameCallback = this.f123524b;
        if (C47831fm.m85027v()) {
            ((C26529dg) frameCallback).f72319a.mo31812e();
            return;
        }
        C47538ax c = bVar.f123525a.mo51613c("GleamFragmentPeer.doFrame");
        try {
            ((C26529dg) frameCallback).f72319a.mo31812e();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
