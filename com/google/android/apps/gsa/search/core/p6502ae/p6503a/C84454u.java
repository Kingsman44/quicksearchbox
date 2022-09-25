package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21473u;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21477y;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21732f;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.u */
/* compiled from: PG */
public final /* synthetic */ class C84454u implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229836a;

    /* renamed from: b */
    public final /* synthetic */ C21479b[] f229837b;

    /* renamed from: c */
    public final /* synthetic */ String f229838c;

    /* renamed from: d */
    public final /* synthetic */ String f229839d;

    /* renamed from: e */
    public final /* synthetic */ String[] f229840e;

    /* renamed from: f */
    public final /* synthetic */ int f229841f;

    /* renamed from: g */
    public final /* synthetic */ ConditionVariable f229842g;

    /* renamed from: h */
    public final /* synthetic */ C21473u f229843h;

    public /* synthetic */ C84454u(C84425ag agVar, C21479b[] bVarArr, String str, String str2, String[] strArr, int i, C21473u uVar, ConditionVariable conditionVariable) {
        this.f229836a = agVar;
        this.f229837b = bVarArr;
        this.f229838c = str;
        this.f229839d = str2;
        this.f229840e = strArr;
        this.f229841f = i;
        this.f229843h = uVar;
        this.f229842g = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229836a;
        C21479b[] bVarArr = this.f229837b;
        String str = this.f229838c;
        String str2 = this.f229839d;
        String[] strArr = this.f229840e;
        int i = this.f229841f;
        C21473u uVar = this.f229843h;
        ConditionVariable conditionVariable = this.f229842g;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        C21477y yVar = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            C84424af afVar = acVar.f229707a;
            try {
                C21732f fVar = (C21732f) afVar.f229711b.mo27079d(afVar.f229713d, str, str2, strArr, i, uVar).mo26995b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (!((C21543k) fVar.mo26997c()).f59946b.mo119097c()) {
                    C89949q.m146523g(583);
                    C59104x c = C84425ag.f229718a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                    ((C59052c) ((C59052c) c).mo56372aa(9283)).mo56389s("Got error status from query: %s", ((C21543k) fVar.mo26997c()).f59946b.f389622h);
                } else {
                    C21477y yVar2 = new C21477y(fVar.f60039a.f394514b);
                    if (yVar2.f59907a.mo117665a()) {
                        C59104x c2 = C84425ag.f229718a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                        ((C59052c) ((C59052c) c2).mo56372aa(9281)).mo56389s("Got error for search: %s", yVar2.f59907a.f387537a);
                    } else {
                        yVar = yVar2;
                    }
                }
            } catch (RuntimeException e) {
                C89949q.m146523g(582);
                C59104x c3 = C84425ag.f229718a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(9284)).mo56386p("Exception when calling query");
            }
        }
        bVarArr[0] = yVar;
        conditionVariable.open();
    }
}
