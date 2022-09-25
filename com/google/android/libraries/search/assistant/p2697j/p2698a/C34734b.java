package com.google.android.libraries.search.assistant.p2697j.p2698a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.coroutines.flow.ExtensionsKt$logOnLifecycle$1", mo61344c = "Extensions.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.j.a.b */
/* compiled from: PG */
final class C34734b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C59071e f92174a;

    /* renamed from: b */
    final /* synthetic */ String f92175b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34734b(C59071e eVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f92174a = eVar;
        this.f92175b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34734b) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) this.f92174a.mo56224b();
        String str = this.f92175b;
        cVar.mo56379ah(new C59094n(50633));
        cVar.mo56389s("%s flow started.", str);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34734b(this.f92174a, this.f92175b, gVar);
    }
}
