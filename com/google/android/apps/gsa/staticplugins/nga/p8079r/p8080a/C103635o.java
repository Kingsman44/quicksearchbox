package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.bs;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.assistant.p3897e.p3921j.C52247kr;
import com.google.assistant.p3897e.p3921j.C52260ld;
import com.google.assistant.p3897e.p3921j.C52263lg;
import com.google.assistant.p3897e.p3921j.C52264lh;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.common.base.C58817ah;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.o */
/* compiled from: PG */
public final /* synthetic */ class C103635o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C69464a f288691a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f288692b;

    public /* synthetic */ C103635o(C69464a aVar, C69464a aVar2) {
        this.f288691a = aVar;
        this.f288692b = aVar2;
    }

    public final Object apply(Object obj) {
        C69464a aVar = this.f288691a;
        C69464a aVar2 = this.f288692b;
        C51715bm bmVar = (C51715bm) obj;
        if (!((C74720bx) aVar.mo17428b()).mo71089f().a() || ((bs) aVar2.mo17428b()).iS()) {
            return bmVar;
        }
        C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
        C51771cx cxVar = (C51771cx) C51772cy.f135824p.createBuilder();
        C52264lh lhVar = (C52264lh) C52265li.f137167I.createBuilder();
        C52260ld ldVar = (C52260ld) C52263lg.f137151o.createBuilder();
        C52247kr krVar = C52247kr.NGA_ESCAPE_HATCH;
        ldVar.copyOnWrite();
        C52263lg lgVar = (C52263lg) ldVar.instance;
        lgVar.f137157e = krVar.f137120c;
        lgVar.f137153a |= 8;
        lhVar.copyOnWrite();
        C52265li liVar = (C52265li) lhVar.instance;
        C52263lg lgVar2 = (C52263lg) ldVar.build();
        lgVar2.getClass();
        liVar.f137198v = lgVar2;
        liVar.f137177a |= 268435456;
        cxVar.copyOnWrite();
        C51772cy cyVar = (C51772cy) cxVar.instance;
        C52265li liVar2 = (C52265li) lhVar.build();
        liVar2.getClass();
        cyVar.f135828c = liVar2;
        cyVar.f135826a |= 1;
        blVar.copyOnWrite();
        C51715bm bmVar2 = (C51715bm) blVar.instance;
        C51772cy cyVar2 = (C51772cy) cxVar.build();
        cyVar2.getClass();
        bmVar2.f135671h = cyVar2;
        bmVar2.f135664a |= 128;
        C51714bl blVar2 = (C51714bl) bmVar.toBuilder();
        blVar2.mergeFrom((C51715bm) blVar.build());
        return (C51715bm) blVar2.build();
    }
}
