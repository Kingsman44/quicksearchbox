package com.google.android.libraries.search.assistant.p2513e.p2514a;

import com.google.android.libraries.search.assistant.p2511d.C32538am;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.audio.encoding.EncoderUtils$encode$1", mo61344c = "EncoderUtils.kt", mo61345d = "invokeSuspend", mo61346e = {22})
/* renamed from: com.google.android.libraries.search.assistant.e.a.b */
/* compiled from: PG */
final class C32565b extends C69572j implements C69630p {

    /* renamed from: a */
    int f87204a;

    /* renamed from: b */
    final /* synthetic */ C69626l f87205b;

    /* renamed from: c */
    final /* synthetic */ C32542e f87206c;

    /* renamed from: d */
    final /* synthetic */ C32574k f87207d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32565b(C32574k kVar, C69626l lVar, C32542e eVar, C69577g gVar) {
        super(2, gVar);
        this.f87207d = kVar;
        this.f87205b = lVar;
        this.f87206c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32565b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87204a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C71587n a = this.f87207d.mo38152a(C32538am.m60349a(this.f87205b));
        C32564a aVar2 = new C32564a(this.f87206c);
        this.f87204a = 1;
        if (a.mo38165mp(aVar2, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32565b(this.f87207d, this.f87205b, this.f87206c, gVar);
    }
}
