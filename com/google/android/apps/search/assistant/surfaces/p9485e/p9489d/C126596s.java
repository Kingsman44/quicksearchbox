package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.libraries.assistant.p1533o.C18496n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$fetchUserInfo$2$3", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {199})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.s */
/* compiled from: PG */
final class C126596s extends C69572j implements C69630p {

    /* renamed from: a */
    int f348629a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348630b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126596s(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348630b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126596s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348629a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348630b;
            this.f348629a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return ((C18496n) obj).f52442c;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126596s(this.f348630b, gVar);
    }
}
