package com.google.android.libraries.gsa.conversation.p1855h;

import android.content.Context;
import com.google.android.libraries.gsa.conversation.C22594g;
import com.google.android.libraries.gsa.conversation.clientop.C22458f;
import com.google.android.libraries.gsa.conversation.p1837a.C22314ae;
import com.google.android.libraries.gsa.conversation.p1837a.C22315af;
import com.google.android.libraries.gsa.conversation.p1839c.C22361h;
import com.google.android.libraries.gsa.conversation.p1839c.C22362i;
import com.google.android.libraries.gsa.conversation.p1839c.C22363j;
import com.google.android.libraries.gsa.conversation.p1839c.C22364k;
import com.google.android.libraries.gsa.conversation.p1851e.C22572k;
import com.google.android.libraries.gsa.conversation.p1852f.C22580g;
import com.google.android.libraries.gsa.conversation.p1852f.C22588o;
import com.google.android.libraries.gsa.conversation.p1852f.C22593t;
import com.google.android.libraries.gsa.conversation.p1853g.C22621ah;
import com.google.android.libraries.gsa.conversation.p1853g.C22654bn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.h.d */
/* compiled from: PG */
public final class C22700d {

    /* renamed from: a */
    public C22720x f62476a;

    /* renamed from: b */
    public Context f62477b;

    /* renamed from: c */
    public C22695ah f62478c;

    /* renamed from: d */
    public C51715bm f62479d;

    /* renamed from: e */
    public Map f62480e = Collections.emptyMap();

    /* renamed from: f */
    public C22315af f62481f;

    /* renamed from: g */
    public C22314ae f62482g;

    /* renamed from: h */
    public C58833ax f62483h;

    /* renamed from: i */
    public C58833ax f62484i;

    /* renamed from: j */
    public C58833ax f62485j;

    /* renamed from: k */
    public C22692ae f62486k;

    /* renamed from: l */
    private C22593t f62487l;

    /* renamed from: m */
    private C22580g f62488m;

    /* renamed from: n */
    private C22588o f62489n;

    /* renamed from: o */
    private C22458f f62490o;

    public C22700d() {
        C58836b bVar = C58836b.f156633a;
        this.f62483h = bVar;
        this.f62484i = bVar;
        this.f62485j = bVar;
        this.f62486k = C22692ae.m42229h().mo27793a();
    }

    /* renamed from: a */
    public final C22699c mo27829a() {
        C51772cy cyVar;
        if (this.f62490o == null) {
            this.f62490o = new C22458f();
        }
        C58833ax axVar = this.f62483h;
        axVar.getClass();
        C58833ax axVar2 = this.f62484i;
        axVar2.getClass();
        C58833ax axVar3 = this.f62485j;
        axVar3.getClass();
        Context context = this.f62477b;
        context.getClass();
        C22695ah ahVar = this.f62478c;
        ahVar.getClass();
        C22720x xVar = this.f62476a;
        xVar.getClass();
        Map map = this.f62480e;
        map.getClass();
        C22458f fVar = this.f62490o;
        fVar.getClass();
        C22692ae aeVar = this.f62486k;
        aeVar.getClass();
        C22593t tVar = this.f62487l;
        tVar.getClass();
        C22580g gVar = this.f62488m;
        gVar.getClass();
        C22588o oVar = this.f62489n;
        oVar.getClass();
        C22361h hVar = r2;
        C22361h hVar2 = new C22361h(axVar, axVar2, this.f62481f, this.f62482g, context, ahVar, xVar, map, fVar, aeVar, gVar, tVar, oVar, axVar3);
        C22594g gVar2 = (C22594g) new C22362i(hVar2.f61719a).f61745a.mo17428b();
        C51714bl blVar = (C51714bl) this.f62479d.toBuilder();
        C22363j a = gVar2.mo27707k().mo27585a();
        C69464a aVar = gVar2.f62239e.f62200a;
        a.f61757a = C22572k.m42029a();
        C51771cx cxVar = (C51771cx) C51772cy.f135824p.createBuilder();
        cxVar.mo53723b((Set) ((C22364k) a.mo27584a()).f61825b.mo17428b());
        C51772cy cyVar2 = (C51772cy) cxVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        cyVar2.getClass();
        C51772cy cyVar3 = bmVar.f135671h;
        if (cyVar3 == null || cyVar3 == (cyVar = C51772cy.f135824p)) {
            bmVar.f135671h = cyVar2;
        } else {
            C51771cx cxVar2 = (C51771cx) cyVar.createBuilder(cyVar3);
            cxVar2.mergeFrom(cyVar2);
            bmVar.f135671h = (C51772cy) cxVar2.buildPartial();
        }
        bmVar.f135664a |= 128;
        C22654bn bnVar = gVar2.f62237c.f62313a;
        bnVar.f62405c.execute(C47810es.m84977q(new C22621ah(bnVar, (C51715bm) blVar.build())));
        return gVar2;
    }

    /* renamed from: b */
    public final void mo27830b(C22593t tVar, C22580g gVar, C22588o oVar) {
        this.f62487l = tVar;
        this.f62488m = gVar;
        this.f62489n = oVar;
    }
}
