package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87705an;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87706ao;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87707ap;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3897e.p3921j.C52409qr;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.a */
/* compiled from: PG */
public final /* synthetic */ class C94653a implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94656d f264734a;

    /* renamed from: b */
    public final /* synthetic */ C52409qr f264735b;

    public /* synthetic */ C94653a(C94656d dVar, C52409qr qrVar) {
        this.f264734a = dVar;
        this.f264735b = qrVar;
    }

    public final void run() {
        C94656d dVar = this.f264734a;
        C52409qr qrVar = this.f264735b;
        C94785f fVar = dVar.f264740a;
        C63088z E = C63088z.m96143E(qrVar.f137530a);
        C87705an anVar = (C87705an) C87706ao.f237167c.createBuilder();
        anVar.copyOnWrite();
        C87706ao aoVar = (C87706ao) anVar.instance;
        aoVar.f237169a |= 1;
        aoVar.f237170b = E;
        C87684al alVar = new C87684al(C88244um.BISTO_CUSTOM_DEVICE_ACTION);
        alVar.mo81965b(C87707ap.f237171a, (C87706ao) anVar.build());
        fVar.mo88613g(alVar.mo81964a());
    }
}
