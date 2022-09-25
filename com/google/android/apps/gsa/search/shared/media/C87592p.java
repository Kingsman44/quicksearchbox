package com.google.android.apps.gsa.search.shared.media;

import android.content.Context;
import android.os.Handler;
import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.shared.media.p */
/* compiled from: PG */
final class C87592p extends C0268e {

    /* renamed from: c */
    public MediaBrowserCompat f236643c;

    /* renamed from: d */
    final /* synthetic */ C87594r f236644d;

    /* renamed from: e */
    private boolean f236645e;

    /* renamed from: f */
    private boolean f236646f;

    public C87592p(C87594r rVar) {
        this.f236644d = rVar;
    }

    /* renamed from: a */
    public final void mo839a() {
        C59071e eVar = C87594r.f236647a;
        this.f236645e = true;
        mo81720d();
    }

    /* renamed from: b */
    public final void mo840b() {
        ((C59052c) ((C59052c) C87594r.f236647a.mo56225c()).mo56372aa(9628)).mo56386p("Connection to media browser service failed.");
        if (!this.f236645e) {
            this.f236644d.mo81729h();
        }
    }

    /* renamed from: c */
    public final void mo841c() {
        ((C59052c) ((C59052c) C87594r.f236647a.mo56225c()).mo56372aa(9629)).mo56386p("Connection to media browser service suspended.");
        if (!this.f236645e) {
            this.f236644d.mo81729h();
        }
    }

    /* renamed from: d */
    public final void mo81720d() {
        if (this.f236645e) {
            if (this.f236646f) {
                C59071e eVar = C87594r.f236647a;
                return;
            }
            this.f236646f = true;
            try {
                Context context = this.f236644d.f236649b;
                MediaBrowserCompat mediaBrowserCompat = this.f236643c;
                mediaBrowserCompat.getClass();
                C0320v vVar = new C0320v(context, mediaBrowserCompat.mo798b());
                vVar.mo1040h(new C87591o(this, vVar), (Handler) null);
                this.f236644d.mo81730j(vVar);
            } catch (IllegalArgumentException | IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) C87594r.f236647a.mo56225c()).mo56382g(e)).mo56372aa(9625)).mo56386p("Failed to create MediaControllerCompat from token of MediaBrowserCompat.");
                this.f236644d.mo81729h();
            }
        }
    }
}
