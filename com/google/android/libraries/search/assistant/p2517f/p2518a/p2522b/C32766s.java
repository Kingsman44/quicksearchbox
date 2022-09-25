package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$fetchContext$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {221, 222})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.s */
/* compiled from: PG */
final class C32766s extends C69572j implements C69630p {

    /* renamed from: a */
    int f87917a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87918b;

    /* renamed from: c */
    final /* synthetic */ List f87919c;

    /* renamed from: d */
    final /* synthetic */ C32879y f87920d;

    /* renamed from: e */
    final /* synthetic */ C32871q f87921e;

    /* renamed from: f */
    final /* synthetic */ long f87922f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32766s(C32607ac acVar, List list, C32879y yVar, C32871q qVar, long j, C69577g gVar) {
        super(2, gVar);
        this.f87918b = acVar;
        this.f87919c = list;
        this.f87920d = yVar;
        this.f87921e = qVar;
        this.f87922f = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32766s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f87917a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C32607ac acVar = this.f87918b;
            List list = this.f87919c;
            C32879y yVar = this.f87920d;
            C32871q qVar = this.f87921e;
            this.f87917a = 1;
            if (acVar.mo38187h(list, yVar, qVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C32762o oVar = this.f87918b.f87322m;
        long j = this.f87922f;
        C32879y yVar2 = this.f87920d;
        C32871q qVar2 = this.f87921e;
        this.f87917a = 2;
        obj = oVar.mo38286b(j, yVar2, qVar2, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32766s(this.f87918b, this.f87919c, this.f87920d, this.f87921e, this.f87922f, gVar);
    }
}
