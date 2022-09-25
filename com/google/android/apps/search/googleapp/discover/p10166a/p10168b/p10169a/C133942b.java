package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.upload.requesthandler.ActionRequestHandler$getLastToken$2", mo61344c = "ActionRequestHandler.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.a.b */
/* compiled from: PG */
final class C133942b extends C69572j implements C69630p {

    /* renamed from: a */
    int f364820a;

    /* renamed from: b */
    final /* synthetic */ C133947g f364821b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133942b(C133947g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f364821b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133942b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364820a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f364821b.f364849b.mo46042d();
            C69664n.m101060f(d, "tokenProtoDataStore.data");
            this.f364820a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C57340w wVar = ((C133950j) obj).f364859b;
        return wVar == null ? C57340w.f153198a : wVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133942b(this.f364821b, gVar);
    }
}
