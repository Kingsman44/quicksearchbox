package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112008p;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4522b.C58550je;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.c */
/* compiled from: PG */
public final /* synthetic */ class C111795c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111800h f310712a;

    /* renamed from: b */
    public final /* synthetic */ C19167ba f310713b;

    /* renamed from: c */
    public final /* synthetic */ C112008p f310714c;

    public /* synthetic */ C111795c(C111800h hVar, C112008p pVar, C19167ba baVar) {
        this.f310712a = hVar;
        this.f310714c = pVar;
        this.f310713b = baVar;
    }

    public final void run() {
        C111800h hVar = this.f310712a;
        C112008p pVar = this.f310714c;
        C19167ba baVar = this.f310713b;
        C59104x b = C111800h.f310721a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TapasBench");
        ((C59052c) ((C59052c) b).mo56372aa(27436)).mo56386p("Starting load generation ...");
        Iterator k = C58570jy.m90159k(((C58550je) C58557jl.m90123d(C111800h.f310722b)).f156204a);
        int i = 0;
        while (k.hasNext()) {
            String str = (String) k.next();
            i++;
            if (i > 1000) {
                break;
            }
            C59104x b2 = C111800h.f310721a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TapasBench");
            ((C59052c) ((C59052c) b2).mo56372aa(27438)).mo56359L("Sending query %d/%d for '%s' ..", Integer.valueOf(i), 1000, str);
            try {
                pVar.f311170a.mo99257a(hVar.f310724d.mo99904b(str, baVar, C51331dt.FULLY_TRUSTED, hVar.f310725e).mo100001a());
                hVar.f310726f.mo99248a();
            } catch (InterruptedException unused) {
                C59104x b3 = C111800h.f310721a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "TapasBench");
                ((C59052c) ((C59052c) b3).mo56372aa(27439)).mo56386p("Benchmark interrupted, stopping run.");
                return;
            }
        }
        C59104x b4 = C111800h.f310721a.mo56224b();
        b4.mo56378ag(C58975e.f156826a, "TapasBench");
        ((C59052c) ((C59052c) b4).mo56372aa(27437)).mo56386p("Load generation finished.");
    }
}
