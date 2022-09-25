package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bm */
/* compiled from: PG */
abstract class C14825bm extends C0268e {

    /* renamed from: c */
    private boolean f44649c;

    /* renamed from: f */
    public MediaBrowserCompat f44650f;

    /* renamed from: g */
    final /* synthetic */ C14828bp f44651g;

    public C14825bm(C14828bp bpVar) {
        this.f44651g = bpVar;
    }

    /* renamed from: a */
    public final void mo839a() {
        mo21759f();
    }

    /* renamed from: b */
    public final void mo840b() {
        mo21758e(new RuntimeException("Media browser connection failed."));
    }

    /* renamed from: c */
    public final void mo841c() {
        mo21758e(new RuntimeException("Media browser connection suspended."));
    }

    /* renamed from: d */
    public abstract void mo21757d(C0320v vVar);

    /* renamed from: e */
    public abstract void mo21758e(Throwable th);

    /* renamed from: f */
    public final void mo21759f() {
        MediaBrowserCompat mediaBrowserCompat = this.f44650f;
        if (mediaBrowserCompat != null && mediaBrowserCompat.mo805i() && !this.f44649c) {
            this.f44649c = true;
            try {
                mo21757d(new C0320v(this.f44651g.f44656b, this.f44650f.mo798b()));
            } catch (IllegalArgumentException | IllegalStateException e) {
                C59104x c = C14828bp.f44655a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.MediaBrwsrClnt");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45568)).mo56386p("Failed to create MediaControllerCompat from token of MediaBrowserCompat.");
                mo21758e(e);
            }
        }
    }
}
