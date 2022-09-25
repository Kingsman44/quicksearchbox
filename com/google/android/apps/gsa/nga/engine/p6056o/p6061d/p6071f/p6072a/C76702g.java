package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6071f.p6072a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122400as;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122444ci;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C76702g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76703h f212007a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212008b;

    /* renamed from: c */
    public final /* synthetic */ String f212009c;

    public /* synthetic */ C76702g(C76703h hVar, C74965n nVar, String str) {
        this.f212007a = hVar;
        this.f212008b = nVar;
        this.f212009c = str;
    }

    public final C60870cx apply(Object obj) {
        C76703h hVar = this.f212007a;
        C74965n nVar = this.f212008b;
        String str = this.f212009c;
        String h = hVar.f212012c.mo74223h(nVar.mo71336k());
        C122419bk a = hVar.f212011b.mo72323a((C52091ex) obj, nVar.mo71342q(), nVar.mo71335j(), h);
        C122400as asVar = (C122400as) C122401at.f339337e.createBuilder();
        C122444ci ciVar = (C122444ci) C122445cj.f339450b.createBuilder();
        ciVar.copyOnWrite();
        str.getClass();
        ((C122445cj) ciVar.instance).f339452a = str;
        asVar.copyOnWrite();
        C122445cj cjVar = (C122445cj) ciVar.build();
        cjVar.getClass();
        ((C122401at) asVar.instance).f339339a = cjVar;
        asVar.copyOnWrite();
        a.getClass();
        ((C122401at) asVar.instance).f339340b = a;
        int x = nVar.mo71349x();
        asVar.copyOnWrite();
        ((C122401at) asVar.instance).f339342d = C64802b.m96463a(x);
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(hVar.f212010a.mo72312c()), new C76700e(hVar, (C122401at) asVar.build(), nVar), C60826bg.f164896a), new C76701f(hVar, nVar), C60826bg.f164896a);
    }
}
