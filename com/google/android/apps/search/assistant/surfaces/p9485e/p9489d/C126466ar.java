package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$6$1", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.ar */
/* compiled from: PG */
final class C126466ar extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f348296a;

    public C126466ar(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126466ar) mo5194c((C66611ci) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C66610ch a = C66610ch.m97260a(((C66611ci) this.f348296a).f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        return Boolean.valueOf(a != C66610ch.DONE_SUCCESS);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126466ar arVar = new C126466ar(gVar);
        arVar.f348296a = obj;
        return arVar;
    }
}
