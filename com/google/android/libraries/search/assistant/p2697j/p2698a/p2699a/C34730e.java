package com.google.android.libraries.search.assistant.p2697j.p2698a.p2699a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71350ad;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.j.a.a.e */
/* compiled from: PG */
final class C34730e extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ String f92164a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f92165b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34730e(C71361ao aoVar, String str) {
        super(0);
        this.f92165b = aoVar;
        this.f92164a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        Object a = C71350ad.m103990a(this.f92165b, C69788q.f186170a);
        String str = this.f92164a;
        if (a instanceof C71347aa) {
            Throwable b = C71348ab.m103984b(a);
            C59052c cVar = (C59052c) C34733h.f92173a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "DataFlowAdapter");
            C59052c cVar2 = (C59052c) cVar.mo56382g(b);
            cVar2.mo56379ah(new C59094n(50638));
            cVar2.mo56389s("[%s] On data changed event failed.", str);
        }
        return C69788q.f186170a;
    }
}
