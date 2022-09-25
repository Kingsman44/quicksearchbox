package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.firstrundataservice.FirstRunDataService$setDefaultValuesForSettingsBySwaaInternal$2", mo61344c = "FirstRunDataService.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.ad */
/* compiled from: PG */
final class C135530ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f369204a;

    /* renamed from: b */
    final /* synthetic */ C135531ae f369205b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135530ad(C135531ae aeVar, C69577g gVar) {
        super(2, gVar);
        this.f369205b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135530ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369204a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135531ae aeVar = this.f369205b;
            C69585o oVar = aeVar.f369209d;
            C135529ac acVar = new C135529ac(aeVar, (C69577g) null);
            this.f369204a = 1;
            obj = C71803m.m105040a(oVar, acVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135530ad(this.f369205b, gVar);
    }
}
