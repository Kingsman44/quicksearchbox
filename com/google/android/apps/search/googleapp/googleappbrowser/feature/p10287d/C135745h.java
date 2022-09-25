package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135531ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135553m;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.firstrun.FirstRunFragmentPeer$onOkButtonClicked$1", mo61344c = "FirstRunFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {226})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.h */
/* compiled from: PG */
final class C135745h extends C69572j implements C69630p {

    /* renamed from: a */
    int f369736a;

    /* renamed from: b */
    final /* synthetic */ C135748k f369737b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135745h(C135748k kVar, C69577g gVar) {
        super(2, gVar);
        this.f369737b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135745h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369736a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C135748k.f369742a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(40605));
                cVar.mo56386p("Unable to update record GAB FRE complete");
            }
        } else {
            C69714l.m101134b(obj);
            C135531ae aeVar = this.f369737b.f369746e;
            this.f369736a = 1;
            if (C71423ax.m104196a(new C135553m(aeVar, (C69577g) null), this) == aVar) {
                return aVar;
            }
        }
        C135572a aVar2 = this.f369737b.f369757p;
        aVar2.f369290a.mo83702b(C89849ae.NAVIGATION_AFTER_BROWSER_FIRST_RUN_EXPERIENCE);
        this.f369737b.f369758q.f379927a.mo19974a(C37182a.f98098gL);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135745h(this.f369737b, gVar);
    }
}
