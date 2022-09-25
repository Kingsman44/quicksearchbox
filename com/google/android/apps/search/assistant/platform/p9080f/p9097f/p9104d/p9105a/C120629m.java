package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.fulfillment.ondevice.impl.OnDeviceContextFetcher$initialRequestContextAsync$1", mo61344c = "OnDeviceContextFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {43})
/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.m */
/* compiled from: PG */
final class C120629m extends C69572j implements C69630p {

    /* renamed from: a */
    int f335534a;

    /* renamed from: b */
    final /* synthetic */ C120632p f335535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120629m(C120632p pVar, C69577g gVar) {
        super(2, gVar);
        this.f335535b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120629m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335534a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C120632p.f335540a.mo56226d()).mo56382g(th);
                cVar.mo56379ah(new C59094n(35537));
                cVar.mo56386p("Initial context fetch failed");
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f335535b.f335541b.mo104563b(false);
            C69664n.m101060f(b, "contextProvider.fetchIni…eSentToServer = */ false)");
            this.f335534a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (C119937f) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120629m(this.f335535b, gVar);
    }
}
