package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32780ab;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32783ae;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32853cu;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.common.p4522b.C58479go;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$supportedContextKeys$$inlined$ifOpenFuture$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {467})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.aa */
/* compiled from: PG */
public final class C32605aa extends C69572j implements C69630p {

    /* renamed from: a */
    int f87300a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87301b;

    /* renamed from: c */
    final /* synthetic */ C32607ac f87302c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32605aa(C32607ac acVar, C69577g gVar, C32607ac acVar2) {
        super(2, gVar);
        this.f87301b = acVar;
        this.f87302c = acVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32605aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87300a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f87301b.f87319j.mo62867mj()) {
                C71816z zVar = this.f87302c.f87323n;
                this.f87300a = 1;
                obj = zVar.mo62825a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw C34830d.m63594a(C34830d.m63595b(C32662cd.m60549a(this.f87301b.f87318i)));
            }
        }
        List<C32853cu> list = ((C32680cv) obj).f87586b;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C32853cu cuVar : list) {
            C69664n.m101061g(cuVar, "<this>");
            C32780ab abVar = (C32780ab) C32781ac.f87950e.createBuilder();
            C69664n.m101060f(abVar, "newBuilder()");
            C32783ae a = C69664n.m101061g(abVar, "builder");
            C32796ar arVar = cuVar.f88070b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            C69664n.m101060f(arVar, "this@toConsumerSupportedContextKey.contextKey");
            a.mo38293b(arVar);
            if ((cuVar.f88069a & 2) != 0) {
                boolean z = cuVar.f88071c;
                C32780ab abVar2 = a.f87956a;
                abVar2.copyOnWrite();
                C32781ac acVar = (C32781ac) abVar2.instance;
                acVar.f87952a |= 2;
                acVar.f87954c = z;
            }
            if ((cuVar.f88069a & 4) != 0) {
                boolean z2 = cuVar.f88072d;
                C32780ab abVar3 = a.f87956a;
                abVar3.copyOnWrite();
                C32781ac acVar2 = (C32781ac) abVar3.instance;
                acVar2.f87952a |= 4;
                acVar2.f87955d = z2;
            }
            arrayList.add(a.mo38292a());
        }
        return C58479go.m89810b(arrayList);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32605aa(this.f87301b, gVar, this.f87302c);
    }
}
