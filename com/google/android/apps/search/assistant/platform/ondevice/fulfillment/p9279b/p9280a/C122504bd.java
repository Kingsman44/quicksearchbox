package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122393al;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122394am;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122428bt;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17593c;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17594d;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17596f;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bd */
/* compiled from: PG */
public final class C122504bd implements C122549e {

    /* renamed from: a */
    public static final C59071e f339601a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bd");

    /* renamed from: b */
    public final C17597g f339602b;

    /* renamed from: c */
    public final Executor f339603c;

    /* renamed from: d */
    public final C122501ba f339604d;

    /* renamed from: e */
    private final C122532n f339605e;

    /* renamed from: f */
    private final AtomicInteger f339606f = new AtomicInteger(1);

    public C122504bd(C122412bd bdVar, C60887da daVar) {
        C58976aa aaVar = C58975e.f156826a;
        HashMap hashMap = new HashMap();
        C60904dr drVar = new C60904dr(daVar);
        this.f339603c = drVar;
        C122501ba baVar = new C122501ba(hashMap, drVar);
        this.f339604d = baVar;
        C122520bt btVar = new C122520bt();
        C122532n nVar = new C122532n(daVar, new C122484ak(this, hashMap));
        this.f339605e = nVar;
        C17602l lVar = new C17602l(daVar, C70876o.m103761b(bdVar.f189039a.mo39510a(C122413be.m201882h(), bdVar.f189040b), new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122488ao.f339571a, new C17594d(C122487an.f339570a, nVar)), new C17593c(C122490aq.f339573a, new C17594d(C122489ap.f339572a, new C17602l(daVar, baVar))), btVar})), true));
        this.f339602b = lVar;
        nVar.mo105660d(new C17594d(C122491ar.f339574a, new C17602l(daVar, lVar)));
        Objects.requireNonNull(lVar);
        btVar.mo105656d(new C122492as(lVar));
    }

    /* renamed from: a */
    public final void mo105649a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f339602b.mo20121a();
    }

    /* renamed from: b */
    public final void mo105650b(C122419bk bkVar) {
        C58976aa aaVar = C58975e.f156826a;
        C17597g gVar = this.f339602b;
        C122428bt btVar = (C122428bt) C122430bv.f339419c.createBuilder();
        btVar.copyOnWrite();
        C122430bv bvVar = (C122430bv) btVar.instance;
        bkVar.getClass();
        bvVar.f339422b = bkVar;
        bvVar.f339421a = 1;
        gVar.mo20123c((C122430bv) btVar.build());
    }

    /* renamed from: c */
    public final void mo105651c(C122502bb bbVar) {
        this.f339604d.mo105648e(new C122486am(this, C58485gu.m89846n(bbVar)), "Cancelling failed");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo105652d(C122461p pVar, C52091ex exVar, C70862aj ajVar, C122108a aVar) {
        mo105653e(pVar, exVar, 5, C122454i.f339472b, ajVar, aVar);
    }

    /* renamed from: e */
    public final C122502bb mo105653e(C122461p pVar, C52091ex exVar, int i, C122454i iVar, C70862aj ajVar, C122108a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        int andIncrement = this.f339606f.getAndIncrement();
        C122428bt btVar = (C122428bt) C122430bv.f339419c.createBuilder();
        C122393al alVar = (C122393al) C122394am.f339314f.createBuilder();
        alVar.copyOnWrite();
        exVar.getClass();
        ((C122394am) alVar.instance).f339318c = exVar;
        alVar.copyOnWrite();
        pVar.getClass();
        ((C122394am) alVar.instance).f339316a = pVar;
        alVar.copyOnWrite();
        iVar.getClass();
        ((C122394am) alVar.instance).f339319d = iVar;
        alVar.copyOnWrite();
        ((C122394am) alVar.instance).f339320e = C64802b.m96463a(i);
        alVar.copyOnWrite();
        ((C122394am) alVar.instance).f339317b = andIncrement;
        btVar.copyOnWrite();
        C122430bv bvVar = (C122430bv) btVar.instance;
        C122394am amVar = (C122394am) alVar.build();
        amVar.getClass();
        bvVar.f339422b = amVar;
        bvVar.f339421a = 2;
        this.f339604d.mo105648e(new C122494au(this, andIncrement, ajVar, aVar, (C122430bv) btVar.build()), "Sending fulfill failed");
        return new C122502bb(andIncrement);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo105654f(C122461p pVar, C52091ex exVar, C70862aj ajVar, C122108a aVar) {
        mo105653e(pVar, exVar, 4, C122454i.f339472b, ajVar, aVar);
    }
}
