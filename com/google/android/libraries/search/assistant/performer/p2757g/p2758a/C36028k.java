package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import android.support.p031v4.media.C0268e;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.k */
/* compiled from: PG */
final class C36028k extends C0268e {

    /* renamed from: c */
    public final C2164c f94242c;

    /* renamed from: d */
    public MediaBrowserCompat f94243d;

    /* renamed from: e */
    final /* synthetic */ C36029l f94244e;

    /* renamed from: f */
    private boolean f94245f;

    public C36028k(C36029l lVar, C2164c cVar) {
        this.f94244e = lVar;
        this.f94242c = cVar;
    }

    /* renamed from: a */
    public final void mo839a() {
        if (!this.f94245f) {
            this.f94245f = true;
            this.f94244e.f94248c.post(new C36025h(this));
        }
    }

    /* renamed from: b */
    public final void mo840b() {
        ((C59052c) ((C59052c) C36029l.f94246a.mo56226d()).mo56372aa(52148)).mo56386p("Connection to media browser service failed.");
        if (!this.f94245f) {
            this.f94242c.mo5437b(Optional.empty());
        }
    }

    /* renamed from: c */
    public final void mo841c() {
        ((C59052c) ((C59052c) C36029l.f94246a.mo56226d()).mo56372aa(52149)).mo56386p("Connection to media browser service suspended.");
        if (!this.f94245f) {
            this.f94242c.mo5437b(Optional.empty());
        }
    }
}
