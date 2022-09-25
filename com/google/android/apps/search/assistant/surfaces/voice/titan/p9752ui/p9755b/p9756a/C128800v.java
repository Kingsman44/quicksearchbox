package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9770i.p9771a.C128931a;
import com.google.android.libraries.search.assistant.performer.p2754f.p2756b.C36002b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71557dg;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.v */
/* compiled from: PG */
public final class C128800v {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f354054a = C59071e.m91331h();

    /* renamed from: b */
    private final C36002b f354055b;

    /* renamed from: c */
    private final C71587n f354056c;

    /* renamed from: d */
    private final C71547cx f354057d;

    public C128800v(Optional optional, Optional optional2, C71422aw awVar) {
        C71587n nVar;
        C69664n.m101061g(optional, "intentPlateClientOpServiceStubOptional");
        C69664n.m101061g(optional2, "intentPlateClientOpHandlerOptional");
        C69664n.m101061g(awVar, "scope");
        C36002b bVar = (C36002b) optional.orElse(null);
        this.f354055b = bVar;
        C128931a aVar = (C128931a) optional2.orElse(null);
        if (bVar == null) {
            C59052c cVar = (C59052c) f354054a.mo56226d();
            cVar.mo56379ah(new C59094n(37987));
            cVar.mo56386p("No IntentPlate service stub");
            C51809dy dyVar = C51809dy.f135933f;
            C69664n.m101060f(dyVar, "getDefaultInstance()");
            nVar = C71574dx.m104480b(dyVar);
        } else {
            nVar = C71590q.m104504a(new C128799u(this, (C69577g) null));
        }
        this.f354056c = nVar;
        this.f354057d = C71557dg.m104447e(0, 0, (C71387t) null, 7);
    }

    /* renamed from: a */
    public final Object mo108650a(C69577g gVar) {
        C71547cx cxVar = this.f354057d;
        C51809dy dyVar = C51809dy.f135933f;
        C69664n.m101060f(dyVar, "getDefaultInstance()");
        Object a = cxVar.mo20883a(dyVar, gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final C71587n mo108651b(C71587n nVar) {
        return C71506bj.m104338d(this.f354056c, C71506bj.m104339e(C71471ab.m104286a(nVar), new C128798t((C69577g) null)), this.f354057d);
    }
}
