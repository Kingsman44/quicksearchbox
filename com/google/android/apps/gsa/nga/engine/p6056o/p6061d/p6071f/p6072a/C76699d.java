package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122444ci;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122455j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C76699d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76703h f211998a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211999b;

    /* renamed from: c */
    public final /* synthetic */ String f212000c;

    /* renamed from: d */
    public final /* synthetic */ C61752n f212001d;

    public /* synthetic */ C76699d(C76703h hVar, C74965n nVar, String str, C61752n nVar2) {
        this.f211998a = hVar;
        this.f211999b = nVar;
        this.f212000c = str;
        this.f212001d = nVar2;
    }

    public final C60870cx apply(Object obj) {
        C76703h hVar = this.f211998a;
        C74965n nVar = this.f211999b;
        String str = this.f212000c;
        C61752n nVar2 = this.f212001d;
        String h = hVar.f212012c.mo74223h(nVar.mo71336k());
        C122419bk a = hVar.f212011b.mo72323a((C52091ex) obj, nVar.mo71342q(), nVar.mo71335j(), h);
        C122455j jVar = (C122455j) C122456k.f339476f.createBuilder();
        C122444ci ciVar = (C122444ci) C122445cj.f339450b.createBuilder();
        ciVar.copyOnWrite();
        str.getClass();
        ((C122445cj) ciVar.instance).f339452a = str;
        jVar.copyOnWrite();
        C122445cj cjVar = (C122445cj) ciVar.build();
        cjVar.getClass();
        ((C122456k) jVar.instance).f339478a = cjVar;
        jVar.copyOnWrite();
        nVar2.getClass();
        ((C122456k) jVar.instance).f339479b = nVar2;
        jVar.copyOnWrite();
        a.getClass();
        ((C122456k) jVar.instance).f339480c = a;
        int x = nVar.mo71349x();
        jVar.copyOnWrite();
        ((C122456k) jVar.instance).f339482e = C64802b.m96463a(x);
        return C60922j.m93045h(hVar.f212010a.mo72312c(), new C76698c(hVar, (C122456k) jVar.build(), nVar), C60826bg.f164896a);
    }
}
