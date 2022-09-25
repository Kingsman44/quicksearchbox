package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import android.net.Uri;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.C34638a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.AgsaLegacyHotwordInvocationSink$closeUriInBackground$2", mo61344c = "AgsaLegacyHotwordInvocationSink.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a */
/* compiled from: PG */
final class C34456a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ Uri f91559a;

    /* renamed from: b */
    final /* synthetic */ C34638a f91560b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34456a(C34638a aVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f91560b = aVar;
        this.f91559a = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34456a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34638a aVar2 = this.f91560b;
        String uri = this.f91559a.toString();
        C69664n.m101060f(uri, "uri.toString()");
        aVar2.mo39455a(uri);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34456a(this.f91560b, this.f91559a, gVar);
    }
}
