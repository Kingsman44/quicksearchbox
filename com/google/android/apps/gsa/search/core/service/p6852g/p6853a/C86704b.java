package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86747d;
import com.google.android.apps.gsa.search.core.service.p6859i.C86749a;
import com.google.android.apps.gsa.search.core.service.p6859i.p6860a.C86750a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86940bg;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C86704b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86710h f234204a;

    public /* synthetic */ C86704b(C86710h hVar) {
        this.f234204a = hVar;
    }

    public final void run() {
        C86710h hVar = this.f234204a;
        if (hVar.f234224j) {
            C59104x b = C86710h.f234215a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WorkController");
            ((C59052c) ((C59052c) b).mo56372aa(8512)).mo56386p("Work is not performed because WorkController is disposed");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90884s(C22872h.m42744d(C86593a.class), "checkEventBusThread failed");
        if (!hVar.f234223i) {
            hVar.f234223i = true;
            HashSet hashSet = null;
            HashSet hashSet2 = null;
            do {
                try {
                    C86712j jVar = hVar.f234216b;
                    jVar.f234234a.set(false);
                    for (C86731k kVar : jVar.mo80318b()) {
                        String i = kVar.mo80347i();
                        if (hVar.f234220f.mo80311a(i)) {
                            String i2 = kVar.mo80347i();
                            if (hVar.f234222h.add(i2)) {
                                C60856cj.m92911t(((C86749a) hVar.f234218d.mo27525b()).mo80361b(i2), new C86708f(hVar, i2), C60826bg.f164896a);
                            }
                        } else {
                            C58833ax a = ((C86747d) hVar.f234217c.mo27525b()).mo80355a(i);
                            if (a.mo56113h()) {
                                hVar.mo80317h(kVar, (C86744b) a.mo56107c());
                                if (hashSet == null) {
                                    hashSet = new HashSet();
                                }
                                hashSet.add(i);
                            } else {
                                if (hashSet2 == null) {
                                    hashSet2 = new HashSet();
                                }
                                hashSet2.add(i);
                            }
                        }
                    }
                } finally {
                    hVar.f234223i = false;
                }
            } while (hVar.f234216b.f234234a.get());
            Set c = C86710h.m139667c(hashSet2);
            Set c2 = C86710h.m139667c(hashSet);
            C58838bb.m90884s(C22872h.m42744d(C86593a.class), "checkEventBusThread failed");
            if (c2 != null) {
                ((C86940bg) hVar.f234219e.mo27525b()).f234815c.removeAll(c2);
            }
            if (c != null) {
                C86940bg bgVar = (C86940bg) hVar.f234219e.mo27525b();
                if (bgVar.f234815c.addAll(c)) {
                    bgVar.mo80591ar();
                }
            }
            for (C86731k kVar2 : Collections.unmodifiableCollection(Collections.unmodifiableCollection(hVar.f234216b.f234235b.f234202b))) {
                Integer num = (Integer) ((C86940bg) hVar.f234219e.mo27525b()).f234813a.get(kVar2.mo80347i());
                if (num != null && num.intValue() == 6) {
                    hVar.f234216b.mo80319c(kVar2);
                    kVar2.mo57357o(new C86750a("Worker " + kVar2.mo80347i() + " not found"));
                }
            }
        }
    }
}
