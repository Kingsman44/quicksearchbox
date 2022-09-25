package com.google.android.apps.gsa.staticplugins.p7666ci.p7669c;

import android.content.Context;
import android.os.Handler;
import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.c.d */
/* compiled from: PG */
final class C97817d extends C0268e {

    /* renamed from: c */
    public MediaBrowserCompat f273158c;

    /* renamed from: d */
    final /* synthetic */ C97821h f273159d;

    /* renamed from: e */
    private boolean f273160e;

    /* renamed from: f */
    private boolean f273161f;

    /* renamed from: g */
    private final SettableFuture f273162g;

    public C97817d(C97821h hVar, SettableFuture settableFuture) {
        this.f273159d = hVar;
        this.f273162g = settableFuture;
    }

    /* renamed from: e */
    private final void m162104e() {
        if (!this.f273162g.isDone() && !(this.f273162g.value instanceof C60873d.C60875b)) {
            this.f273162g.cancel(true);
        }
    }

    /* renamed from: a */
    public final void mo839a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f273160e = true;
        mo90823d();
        MediaBrowserCompat mediaBrowserCompat = this.f273158c;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.mo799c();
            this.f273159d.mo90831h(this.f273158c);
        }
    }

    /* renamed from: b */
    public final void mo840b() {
        C59104x d = C97821h.f273172a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(30315)).mo56386p("Connection to media browser service failed.");
        mo90823d();
        MediaBrowserCompat mediaBrowserCompat = this.f273158c;
        if (mediaBrowserCompat != null) {
            this.f273159d.mo90831h(mediaBrowserCompat);
        }
    }

    /* renamed from: c */
    public final void mo841c() {
        C59104x d = C97821h.f273172a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(30316)).mo56386p("Connection to media browser service suspended.");
        m162104e();
        MediaBrowserCompat mediaBrowserCompat = this.f273158c;
        if (mediaBrowserCompat != null) {
            this.f273159d.mo90831h(mediaBrowserCompat);
        }
    }

    /* renamed from: d */
    public final void mo90823d() {
        if (this.f273160e) {
            if (this.f273161f) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            this.f273161f = true;
            try {
                Context context = this.f273159d.f273173b;
                MediaBrowserCompat mediaBrowserCompat = this.f273158c;
                mediaBrowserCompat.getClass();
                C0320v vVar = new C0320v(context, mediaBrowserCompat.mo798b());
                vVar.mo1040h(new C97816c(this.f273158c, vVar), (Handler) null);
                C58976aa aaVar2 = C58975e.f156826a;
                this.f273162g.mo57356n(vVar);
            } catch (IllegalArgumentException | IllegalStateException unused) {
                C58976aa aaVar3 = C58975e.f156826a;
                m162104e();
                MediaBrowserCompat mediaBrowserCompat2 = this.f273158c;
                if (mediaBrowserCompat2 != null) {
                    this.f273159d.mo90831h(mediaBrowserCompat2);
                }
            }
        }
    }
}
