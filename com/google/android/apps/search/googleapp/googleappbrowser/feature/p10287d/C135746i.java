package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135537ak;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135538al;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.firstrun.FirstRunFragmentPeer$onViewCreated$1", mo61344c = "FirstRunFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {183})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.i */
/* compiled from: PG */
final class C135746i extends C69572j implements C69630p {

    /* renamed from: a */
    int f369738a;

    /* renamed from: b */
    final /* synthetic */ C135748k f369739b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135746i(C135748k kVar, C69577g gVar) {
        super(2, gVar);
        this.f369739b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135746i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369738a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C135748k.f369742a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(40606));
                cVar.mo56386p("Unable to record GAB FRE Opened");
            }
        } else {
            C69714l.m101134b(obj);
            C135538al alVar = this.f369739b.f369747f;
            this.f369738a = 1;
            if (C71423ax.m104196a(new C135537ak(alVar, (C69577g) null), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135746i(this.f369739b, gVar);
    }
}
