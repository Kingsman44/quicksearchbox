package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37636go;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.p2911c.C37433c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37837aj;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37855j;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37856k;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37864s;
import com.google.android.libraries.search.p2904c.p2967t.p2969b.C38046q;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.android.libraries.search.p2904c.p2982x.C38246e;
import com.google.android.libraries.search.p2904c.p2982x.C38248g;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import com.google.android.libraries.search.p2904c.p2982x.C38252k;
import com.google.android.libraries.search.p2904c.p2982x.C38253l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.c.k.a.am */
/* compiled from: PG */
public final class C37790am {

    /* renamed from: a */
    public static final C59071e f100276a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.am");

    /* renamed from: b */
    public final C38248g f100277b;

    /* renamed from: c */
    public final C38246e f100278c;

    /* renamed from: d */
    public final Executor f100279d;

    /* renamed from: e */
    public final C37433c f100280e;

    /* renamed from: f */
    public final C38046q f100281f;

    /* renamed from: g */
    public final C37856k f100282g;

    /* renamed from: h */
    public final C37799g f100283h;

    /* renamed from: i */
    public final C60836bq f100284i = new C60836bq();

    /* renamed from: j */
    private final C37837aj f100285j;

    public C37790am(C38248g gVar, C38246e eVar, Executor executor, C37433c cVar, C38046q qVar, C37856k kVar, C37837aj ajVar, C37799g gVar2) {
        this.f100277b = gVar;
        this.f100278c = eVar;
        this.f100279d = executor;
        this.f100280e = cVar;
        this.f100281f = qVar;
        this.f100282g = kVar;
        this.f100285j = ajVar;
        this.f100283h = gVar2;
    }

    /* renamed from: a */
    public final C37405bj mo41086a(C38227aj ajVar) {
        C60870cx b = this.f100284i.mo57305b(C47810es.m84965e(new C37815w(this, ajVar)), this.f100279d);
        return new C37636go(new C37855j(this.f100282g, C60922j.m93044g(b, C47810es.m84963c(C37816x.f100336a), this.f100279d)), new C37864s(this.f100285j, C60922j.m93044g(b, C47810es.m84963c(C37817y.f100337a), this.f100279d)));
    }

    /* renamed from: b */
    public final void mo41087b(C37639gr grVar, C2164c cVar) {
        ((C59052c) ((C59052c) f100276a.mo56224b()).mo56372aa(52809)).mo56386p("#audio# addClientDeactivatedResponseCallback");
        C38252k kVar = (C38252k) C38253l.f101358c.createBuilder();
        kVar.copyOnWrite();
        C38253l lVar = (C38253l) kVar.instance;
        grVar.getClass();
        lVar.f101361b = grVar;
        lVar.f101360a |= 1;
        C38246e eVar = this.f100278c;
        C60856cj.m92911t(C70876o.m103760a(eVar.f189039a.mo39510a(C38250i.m67537e(), eVar.f189040b), (C38253l) kVar.build()), C47810es.m84974n(new C37781ad(cVar)), this.f100279d);
    }
}
