package com.google.android.libraries.search.assistant.p2697j.p2698a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.coroutines.flow.ExtensionsKt$logOnLifecycle$2", mo61344c = "Extensions.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.j.a.c */
/* compiled from: PG */
final class C34735c extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f92176a;

    /* renamed from: b */
    final /* synthetic */ C59071e f92177b;

    /* renamed from: c */
    final /* synthetic */ String f92178c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34735c(C59071e eVar, String str, C69577g gVar) {
        super(3, gVar);
        this.f92177b = eVar;
        this.f92178c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C34735c cVar = new C34735c(this.f92177b, this.f92178c, (C69577g) obj3);
        cVar.f92176a = (Throwable) obj2;
        return cVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f92176a;
        if (obj2 == null) {
            C59052c cVar = (C59052c) this.f92177b.mo56224b();
            String str = this.f92178c;
            cVar.mo56379ah(new C59094n(50636));
            cVar.mo56389s("%s flow completed.", str);
        } else if (obj2 instanceof CancellationException) {
            C59052c cVar2 = (C59052c) ((C59052c) this.f92177b.mo56226d()).mo56382g((Throwable) obj2);
            String str2 = this.f92178c;
            cVar2.mo56379ah(new C59094n(50635));
            cVar2.mo56389s("%s flow cancelled.", str2);
        } else {
            C59052c cVar3 = (C59052c) ((C59052c) this.f92177b.mo56226d()).mo56382g((Throwable) obj2);
            String str3 = this.f92178c;
            cVar3.mo56379ah(new C59094n(50634));
            cVar3.mo56389s("%s flow failed.", str3);
        }
        return C69788q.f186170a;
    }
}
