package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.p3087j.p3089b.C39802b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C63088z;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.n.b.b.y */
/* compiled from: PG */
final class C39350y implements C39802b {

    /* renamed from: a */
    final /* synthetic */ C39280aa f103633a;

    /* renamed from: b */
    private boolean f103634b = false;

    public C39350y(C39280aa aaVar) {
        this.f103633a = aaVar;
    }

    /* renamed from: a */
    public final void mo41778a() {
        ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53397)).mo56386p("Got end of audio.");
        this.f103633a.mo41764l();
    }

    /* renamed from: b */
    public final void mo41779b(C63088z zVar, long j, Instant instant) {
        if (!this.f103634b) {
            ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53398)).mo56359L("#onTimestampedAudio size %d, pos %d, time %s", Integer.valueOf(zVar.mo59031d()), Long.valueOf(j), instant);
        }
        this.f103634b = true;
        this.f103633a.mo41762j(zVar, j, C60945d.m93096a(instant));
    }
}
