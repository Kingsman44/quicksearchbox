package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SourceService$sessionTags$1", mo61344c = "SourceService.kt", mo61345d = "invokeSuspend", mo61346e = {102})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.fe */
/* compiled from: PG */
final class C32744fe extends C69572j implements C69626l {

    /* renamed from: a */
    int f87838a;

    /* renamed from: b */
    final /* synthetic */ C32750fk f87839b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32744fe(C32750fk fkVar, C69577g gVar) {
        super(1, gVar);
        this.f87839b = fkVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32744fe(this.f87839b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87838a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f87839b.f87864c;
            this.f87838a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C32691df(C32688dc.m60591d((C32849cq) obj, C32691df.f87608b));
    }
}
