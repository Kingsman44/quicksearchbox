package com.google.android.libraries.search.p2994f.p2995a;

import com.google.android.libraries.storage.protostore.C42905ba;
import com.google.apps.tiktok.account.p3606d.p3608b.C46080b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.creator.accesscontrol.CreatorMenuVisibilityManager$retrieveVisibility$1$1", mo61344c = "CreatorMenuVisibilityManager.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.libraries.search.f.a.a */
/* compiled from: PG */
final class C38306a extends C69572j implements C69630p {

    /* renamed from: a */
    int f101475a;

    /* renamed from: b */
    final /* synthetic */ C38310c f101476b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38306a(C38310c cVar, C69577g gVar) {
        super(2, gVar);
        this.f101476b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38306a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101475a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C38310c.f101483a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(53087));
                cVar.mo56386p("Creator menu visibility async refresh failed.");
            }
        } else {
            C69714l.m101134b(obj);
            C71604be d = C71663i.m104691d(C42905ba.m75775c(((C46080b) this.f101476b.f101485c.f122808a).f120944a));
            this.f101475a = 1;
            if (d.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38306a(this.f101476b, gVar);
    }
}
