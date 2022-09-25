package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.speech.p5208h.C66565av;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.response.PinholeHandler$handle$input$3", mo61344c = "PinholeHandler.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.ab */
/* compiled from: PG */
public final class C126517ab extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C69644aa f348432a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f348433b;

    /* renamed from: c */
    final /* synthetic */ C126436e f348434c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126517ab(C69644aa aaVar, C70862aj ajVar, C126436e eVar, C69577g gVar) {
        super(2, gVar);
        this.f348432a = aaVar;
        this.f348433b = ajVar;
        this.f348434c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126517ab) mo5194c((C66565av) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69644aa aaVar = this.f348432a;
        if (!aaVar.f186023a) {
            aaVar.f186023a = true;
            this.f348433b.mo20123c(C126558c.m206923e(C126516aa.f348431a));
            this.f348434c.mo107613e(C37176a.f97319m.mo40815i(C62722b.OK));
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126517ab(this.f348432a, this.f348433b, this.f348434c, gVar);
    }
}
