package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.protobuf.C62942bv;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5573a.C71347aa;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cq */
/* compiled from: PG */
final class C121617cq implements C33883a {

    /* renamed from: a */
    final /* synthetic */ C71361ao f337458a;

    public C121617cq(C71361ao aoVar) {
        this.f337458a = aoVar;
    }

    /* renamed from: a */
    public final void mo39110a(String str) {
        C69664n.m101061g(str, "it");
        C71361ao aoVar = this.f337458a;
        C121553ag agVar = (C121553ag) C121554ah.f337299b.createBuilder();
        C69664n.m101060f(agVar, "newBuilder()");
        C69664n.m101061g(agVar, "builder");
        C69664n.m101061g(str, "value");
        agVar.copyOnWrite();
        str.getClass();
        ((C121554ah) agVar.instance).f337301a = str;
        C62942bv build = agVar.build();
        C69664n.m101060f(build, "_builder.build()");
        Object w = aoVar.mo62730w((C121554ah) build);
        C71361ao aoVar2 = this.f337458a;
        if (w instanceof C71347aa) {
            aoVar2.mo62727D(C71348ab.m103984b(w));
            C71423ax.m104198c(aoVar2, (CancellationException) null);
        }
    }
}
