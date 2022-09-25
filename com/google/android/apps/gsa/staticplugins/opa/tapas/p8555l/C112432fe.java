package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113392ec;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113393ed;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113396eg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113397eh;
import com.google.assistant.p3860as.C49740ac;
import com.google.assistant.p3860as.C49756as;
import com.google.assistant.p3860as.C49758au;
import com.google.assistant.p3860as.C49773bi;
import com.google.assistant.p3860as.C49775bk;
import com.google.assistant.p3860as.C49777bm;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fe */
/* compiled from: PG */
public final /* synthetic */ class C112432fe implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311921a;

    /* renamed from: b */
    public final /* synthetic */ C112433ff f311922b;

    /* renamed from: c */
    public final /* synthetic */ C49740ac f311923c;

    public /* synthetic */ C112432fe(C112435fh fhVar, C112433ff ffVar, C49740ac acVar) {
        this.f311921a = fhVar;
        this.f311922b = ffVar;
        this.f311923c = acVar;
    }

    public final void run() {
        C49756as asVar;
        C49756as asVar2;
        C49758au auVar;
        C112435fh fhVar = this.f311921a;
        C112433ff ffVar = this.f311922b;
        C49740ac acVar = this.f311923c;
        double m = fhVar.f311930c.mo79747m(C90063do.f249508ep);
        int i = 0;
        if (ffVar.f311924a.mo100206f() != 20020 && ffVar.f311924a.mo100206f() != 10051 && ffVar.f311924a.mo100206f() != 20010) {
            for (C49777bm bmVar : acVar.f128435b) {
                if (!Thread.interrupted()) {
                    i++;
                    if (!(bmVar.f128537b != 1 || ((C49758au) bmVar.f128538c).f128492a.size() == 0 || (bmVar.f128536a & 128) == 0)) {
                        C49773bi biVar = bmVar.f128539d;
                        if (biVar == null) {
                            biVar = C49773bi.f128525b;
                        }
                        if (biVar.f128527a >= m) {
                            if (bmVar.f128537b == 1) {
                                auVar = (C49758au) bmVar.f128538c;
                            } else {
                                auVar = C49758au.f128490b;
                            }
                            for (C49775bk bkVar : auVar.f128492a) {
                                if (bkVar.f128531a.equals(ffVar.f311924a.mo100199L())) {
                                    C113392ec ecVar = (C113392ec) C113393ed.f313985i.createBuilder();
                                    ecVar.copyOnWrite();
                                    C113393ed edVar = (C113393ed) ecVar.instance;
                                    edVar.f313987a |= 2;
                                    edVar.f313989c = true;
                                    C49773bi biVar2 = bmVar.f128539d;
                                    if (biVar2 == null) {
                                        biVar2 = C49773bi.f128525b;
                                    }
                                    double d = biVar2.f128527a;
                                    ecVar.copyOnWrite();
                                    C113393ed edVar2 = (C113393ed) ecVar.instance;
                                    edVar2.f313987a |= 8;
                                    edVar2.f313991e = (float) d;
                                    int i2 = bkVar.f128532b;
                                    ecVar.copyOnWrite();
                                    C113393ed edVar3 = (C113393ed) ecVar.instance;
                                    edVar3.f313987a |= 16;
                                    edVar3.f313992f = (float) i2;
                                    ecVar.copyOnWrite();
                                    C113393ed edVar4 = (C113393ed) ecVar.instance;
                                    edVar4.f313987a |= 64;
                                    edVar4.f313994h = (float) i;
                                    C113393ed edVar5 = (C113393ed) ecVar.build();
                                    C113396eg egVar = ffVar.f311925b;
                                    egVar.copyOnWrite();
                                    C113397eh ehVar = (C113397eh) egVar.instance;
                                    C113397eh ehVar2 = C113397eh.f314000f;
                                    edVar5.getClass();
                                    ehVar.f314006e = edVar5;
                                    ehVar.f314002a |= 8;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        } else if (!ffVar.f311924a.mo100054M().isEmpty()) {
            String str = (String) ffVar.f311924a.mo100054M().get(0);
            for (C49777bm bmVar2 : acVar.f128436c) {
                if (!Thread.interrupted()) {
                    i++;
                    if (bmVar2.f128537b == 6) {
                        asVar = (C49756as) bmVar2.f128538c;
                    } else {
                        asVar = C49756as.f128486c;
                    }
                    if (!((asVar.f128488a & 1) == 0 || (bmVar2.f128536a & 128) == 0)) {
                        C49773bi biVar3 = bmVar2.f128539d;
                        if (biVar3 == null) {
                            biVar3 = C49773bi.f128525b;
                        }
                        if (biVar3.f128527a >= m) {
                            if (bmVar2.f128537b == 6) {
                                asVar2 = (C49756as) bmVar2.f128538c;
                            } else {
                                asVar2 = C49756as.f128486c;
                            }
                            if (asVar2.f128489b.equals(str)) {
                                C113392ec ecVar2 = (C113392ec) C113393ed.f313985i.createBuilder();
                                ecVar2.copyOnWrite();
                                C113393ed edVar6 = (C113393ed) ecVar2.instance;
                                edVar6.f313987a |= 1;
                                edVar6.f313988b = true;
                                C49773bi biVar4 = bmVar2.f128539d;
                                if (biVar4 == null) {
                                    biVar4 = C49773bi.f128525b;
                                }
                                double d2 = biVar4.f128527a;
                                ecVar2.copyOnWrite();
                                C113393ed edVar7 = (C113393ed) ecVar2.instance;
                                edVar7.f313987a |= 4;
                                edVar7.f313990d = (float) d2;
                                ecVar2.copyOnWrite();
                                C113393ed edVar8 = (C113393ed) ecVar2.instance;
                                edVar8.f313987a |= 32;
                                edVar8.f313993g = (float) i;
                                C113393ed edVar9 = (C113393ed) ecVar2.build();
                                C113396eg egVar2 = ffVar.f311925b;
                                egVar2.copyOnWrite();
                                C113397eh ehVar3 = (C113397eh) egVar2.instance;
                                C113397eh ehVar4 = C113397eh.f314000f;
                                edVar9.getClass();
                                ehVar3.f314006e = edVar9;
                                ehVar3.f314002a |= 8;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
