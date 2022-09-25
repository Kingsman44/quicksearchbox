package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37636go;
import com.google.android.libraries.search.p2904c.C37638gq;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.p2982x.C38226ai;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.k.a.f */
/* compiled from: PG */
public final class C37798f implements C37404bi {

    /* renamed from: a */
    private static final C59071e f100297a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.f");

    /* renamed from: b */
    private final int f100298b;

    /* renamed from: c */
    private final C60870cx f100299c;

    /* renamed from: d */
    private final C37790am f100300d;

    /* renamed from: e */
    private final C37794b f100301e;

    public C37798f(int i, C60870cx cxVar, C37790am amVar, C37794b bVar) {
        this.f100298b = i;
        this.f100299c = C60856cj.m92901j(cxVar);
        this.f100300d = amVar;
        this.f100301e = bVar;
    }

    /* renamed from: a */
    public final C37402bg mo40935a(C37410bo boVar) {
        C59104x b = f100297a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcARC");
        ((C59052c) ((C59052c) b).mo56372aa(52796)).mo56387q("#audio# start listening for audio request client(token(%s)) remotely", this.f100298b);
        C37790am amVar = this.f100300d;
        C37638gq gqVar = (C37638gq) C37639gr.f100004c.createBuilder();
        int i = this.f100298b;
        gqVar.copyOnWrite();
        C37639gr grVar = (C37639gr) gqVar.instance;
        grVar.f100006a |= 1;
        grVar.f100007b = i;
        C37639gr grVar2 = (C37639gr) gqVar.build();
        ((C59052c) ((C59052c) C37790am.f100276a.mo56224b()).mo56372aa(52807)).mo56386p("#audio# startListening");
        C38226ai aiVar = (C38226ai) C38227aj.f101309e.createBuilder();
        aiVar.copyOnWrite();
        C38227aj ajVar = (C38227aj) aiVar.instance;
        boVar.getClass();
        ajVar.f101314d = boVar;
        ajVar.f101311a |= 1;
        aiVar.copyOnWrite();
        C38227aj ajVar2 = (C38227aj) aiVar.instance;
        grVar2.getClass();
        ajVar2.f101313c = grVar2;
        ajVar2.f101312b = 2;
        return ((C37636go) amVar.mo41086a((C38227aj) aiVar.build())).f100002a;
    }

    /* renamed from: b */
    public final C37402bg mo40936b(C37410bo boVar, C37362b bVar) {
        C37402bg a = mo40935a(boVar);
        this.f100301e.mo41088a(a.mo20357d(), bVar);
        return a;
    }

    /* renamed from: c */
    public final C37403bh mo40937c(C37462ck ckVar) {
        return null;
    }

    /* renamed from: d */
    public final C60870cx mo40938d() {
        C59104x b = f100297a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcARC");
        ((C59052c) ((C59052c) b).mo56372aa(52797)).mo56387q("#audio# deactivate audio request client(token(%s)) remotely", this.f100298b);
        C37790am amVar = this.f100300d;
        int i = this.f100298b;
        ((C59052c) ((C59052c) C37790am.f100276a.mo56224b()).mo56372aa(52810)).mo56387q("#audio# deactivateAudioRequestClient, token=%d", i);
        C46459k.m82829b(amVar.f100284i.mo57305b(C47810es.m84965e(new C37778aa(amVar, i)), amVar.f100279d), "Failed to deactivateAudioRequestClient", new Object[0]);
        return this.f100299c;
    }

    /* renamed from: e */
    public final C60870cx mo40939e() {
        return this.f100299c;
    }
}
