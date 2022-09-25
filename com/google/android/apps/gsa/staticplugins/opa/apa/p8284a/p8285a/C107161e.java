package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C107161e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51715bm f298289a;

    /* renamed from: b */
    public final /* synthetic */ C63042fg f298290b;

    public /* synthetic */ C107161e(C51715bm bmVar, C63042fg fgVar) {
        this.f298289a = bmVar;
        this.f298290b = fgVar;
    }

    public final Object apply(Object obj) {
        C51715bm bmVar = this.f298289a;
        C63042fg fgVar = this.f298290b;
        C107159c cVar = (C107159c) ((C107160d) obj).toBuilder();
        C107157a aVar = (C107157a) C107158b.f298279c.createBuilder();
        aVar.copyOnWrite();
        bmVar.getClass();
        ((C107158b) aVar.instance).f298282b = bmVar;
        aVar.copyOnWrite();
        fgVar.getClass();
        ((C107158b) aVar.instance).f298281a = fgVar;
        cVar.copyOnWrite();
        C107160d dVar = (C107160d) cVar.instance;
        C107158b bVar = (C107158b) aVar.build();
        bVar.getClass();
        dVar.f298287b = bVar;
        dVar.f298286a |= 1;
        return (C107160d) cVar.build();
    }
}
