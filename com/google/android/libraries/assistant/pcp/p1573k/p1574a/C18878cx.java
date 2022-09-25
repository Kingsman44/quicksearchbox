package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.Context;
import android.os.Handler;
import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cx */
/* compiled from: PG */
final class C18878cx extends C0268e {

    /* renamed from: c */
    public MediaBrowserCompat f53145c;

    /* renamed from: d */
    final /* synthetic */ C18887df f53146d;

    /* renamed from: e */
    private boolean f53147e;

    /* renamed from: f */
    private boolean f53148f;

    /* renamed from: g */
    private final C2164c f53149g;

    public C18878cx(C18887df dfVar, C2164c cVar) {
        this.f53146d = dfVar;
        this.f53149g = cVar;
    }

    /* renamed from: a */
    public final void mo839a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f53147e = true;
        mo24205d();
        MediaBrowserCompat mediaBrowserCompat = this.f53145c;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.mo799c();
            this.f53146d.mo24215k(this.f53145c);
        }
    }

    /* renamed from: b */
    public final void mo840b() {
        C59104x d = C18887df.f53161a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(47490)).mo56386p("Connection to media browser service failed.");
        mo24205d();
        MediaBrowserCompat mediaBrowserCompat = this.f53145c;
        if (mediaBrowserCompat != null) {
            this.f53146d.mo24215k(mediaBrowserCompat);
        }
    }

    /* renamed from: c */
    public final void mo841c() {
        C59104x d = C18887df.f53161a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) d).mo56372aa(47491)).mo56386p("Connection to media browser service suspended.");
        this.f53149g.mo5437b(Optional.empty());
        MediaBrowserCompat mediaBrowserCompat = this.f53145c;
        if (mediaBrowserCompat != null) {
            this.f53146d.mo24215k(mediaBrowserCompat);
        }
    }

    /* renamed from: d */
    public final void mo24205d() {
        if (this.f53147e) {
            if (this.f53148f) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            this.f53148f = true;
            try {
                Context context = this.f53146d.f53162b;
                MediaBrowserCompat mediaBrowserCompat = this.f53145c;
                mediaBrowserCompat.getClass();
                C0320v vVar = new C0320v(context, mediaBrowserCompat.mo798b());
                vVar.mo1040h(new C18877cw(this.f53145c, vVar), (Handler) null);
                C58976aa aaVar2 = C58975e.f156826a;
                this.f53149g.mo5437b(Optional.m71637of(vVar));
            } catch (IllegalArgumentException | IllegalStateException unused) {
                C58976aa aaVar3 = C58975e.f156826a;
                this.f53149g.mo5437b(Optional.empty());
                MediaBrowserCompat mediaBrowserCompat2 = this.f53145c;
                if (mediaBrowserCompat2 != null) {
                    this.f53146d.mo24215k(mediaBrowserCompat2);
                }
            }
        }
    }
}
