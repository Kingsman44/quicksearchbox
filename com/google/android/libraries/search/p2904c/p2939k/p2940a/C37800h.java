package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37855j;
import com.google.android.libraries.search.p2904c.p2982x.C38226ai;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.k.a.h */
/* compiled from: PG */
public final class C37800h implements C37419bx {

    /* renamed from: a */
    private static final C59071e f100304a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.h");

    /* renamed from: b */
    private final C37790am f100305b;

    public C37800h(C37790am amVar) {
        this.f100305b = amVar;
    }

    /* renamed from: a */
    public final C37404bi mo40942a(C37407bl blVar) {
        C59104x b = f100304a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcARCProvider");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52798);
        C37773c cVar2 = blVar.f99328b;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# activate audio request client(%s) remotely", C37772b.m66674a(cVar2.f100245a).name());
        C37790am amVar = this.f100305b;
        ((C59052c) ((C59052c) C37790am.f100276a.mo56224b()).mo56372aa(52808)).mo56386p("#audio# activateAudioRequestClient");
        return new C37855j(amVar.f100282g, amVar.f100284i.mo57305b(C47810es.m84965e(new C37814v(amVar, blVar)), amVar.f100279d));
    }

    /* renamed from: b */
    public final C37405bj mo40943b(C37407bl blVar, C37410bo boVar) {
        C59104x b = f100304a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcARCProvider");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52799);
        C37773c cVar2 = blVar.f99328b;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# activate audio request client(%s) and start listening remotely", C37772b.m66674a(cVar2.f100245a).name());
        C37790am amVar = this.f100305b;
        C38226ai aiVar = (C38226ai) C38227aj.f101309e.createBuilder();
        aiVar.copyOnWrite();
        C38227aj ajVar = (C38227aj) aiVar.instance;
        boVar.getClass();
        ajVar.f101314d = boVar;
        ajVar.f101311a |= 1;
        aiVar.copyOnWrite();
        C38227aj ajVar2 = (C38227aj) aiVar.instance;
        blVar.getClass();
        ajVar2.f101313c = blVar;
        ajVar2.f101312b = 3;
        return amVar.mo41086a((C38227aj) aiVar.build());
    }
}
