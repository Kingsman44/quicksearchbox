package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21469q;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21470r;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21730d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.x */
/* compiled from: PG */
public final /* synthetic */ class C84457x implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229849a;

    /* renamed from: b */
    public final /* synthetic */ String[] f229850b;

    /* renamed from: c */
    public final /* synthetic */ ConditionVariable f229851c;

    /* renamed from: d */
    public final /* synthetic */ C21470r[] f229852d;

    /* renamed from: e */
    public final /* synthetic */ C21469q[] f229853e;

    public /* synthetic */ C84457x(C84425ag agVar, C21470r[] rVarArr, String[] strArr, C21469q[] qVarArr, ConditionVariable conditionVariable) {
        this.f229849a = agVar;
        this.f229852d = rVarArr;
        this.f229850b = strArr;
        this.f229853e = qVarArr;
        this.f229851c = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229849a;
        C21470r[] rVarArr = this.f229852d;
        String[] strArr = this.f229850b;
        C21469q[] qVarArr = this.f229853e;
        ConditionVariable conditionVariable = this.f229851c;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        C21470r rVar = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            C84424af afVar = acVar.f229707a;
            try {
                C21730d dVar = (C21730d) afVar.f229711b.mo27077b(afVar.f229713d, strArr, qVarArr).mo26995b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (!((C21543k) dVar.mo26997c()).f59946b.mo119097c()) {
                    C59104x c = C84425ag.f229718a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                    ((C59052c) ((C59052c) c).mo56372aa(9279)).mo56389s("Got error status from getPhraseAffinity: %s", ((C21543k) dVar.mo26997c()).f59946b.f389622h);
                } else {
                    C21470r rVar2 = new C21470r(dVar.f60037a.f394496b);
                    if (rVar2.f59911a.f387492a != null) {
                        C59104x c2 = C84425ag.f229718a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                        ((C59052c) ((C59052c) c2).mo56372aa(9277)).mo56389s("Got error for search: %s", rVar2.f59911a.f387492a);
                    } else {
                        rVar = rVar2;
                    }
                }
            } catch (RuntimeException e) {
                C59104x c3 = C84425ag.f229718a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(9280)).mo56386p("Exception when calling getPhraseAffinity");
            }
        }
        rVarArr[0] = rVar;
        conditionVariable.open();
    }
}
