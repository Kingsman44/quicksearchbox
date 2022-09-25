package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C120015c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32780ab;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32783ae;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.b */
/* compiled from: PG */
public final class C119911b implements C119912c {

    /* renamed from: a */
    final /* synthetic */ C120015c f333924a;

    public C119911b(C120015c cVar) {
        this.f333924a = cVar;
    }

    /* renamed from: a */
    public final Object mo104560a(C32796ar arVar, boolean z, C69577g gVar) {
        C60870cx b = this.f333924a.mo104585b(arVar);
        C69664n.m101060f(b, "this@toSelectedContextFe….fetchContext(contextKey)");
        return C71663i.m104690c(b, gVar);
    }

    /* renamed from: b */
    public final Object mo104561b(C69577g gVar) {
        C58485gu<C32836cd> a = this.f333924a.mo104584a();
        C69664n.m101060f(a, "this@toSelectedContextFe…er.supportedContextKeys()");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(a, 10));
        for (C32836cd cdVar : a) {
            C32780ab abVar = (C32780ab) C32781ac.f87950e.createBuilder();
            C69664n.m101060f(abVar, "newBuilder()");
            C32783ae a2 = C69664n.m101061g(abVar, "builder");
            C32796ar arVar = cdVar.f88043b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            C69664n.m101060f(arVar, "it.contextKey");
            a2.mo38293b(arVar);
            if ((cdVar.f88042a & 2) != 0) {
                boolean z = cdVar.f88044c;
                C32780ab abVar2 = a2.f87956a;
                abVar2.copyOnWrite();
                C32781ac acVar = (C32781ac) abVar2.instance;
                acVar.f87952a |= 2;
                acVar.f87954c = z;
            }
            arrayList.add(a2.mo38292a());
        }
        return C58479go.m89810b(arrayList);
    }
}
