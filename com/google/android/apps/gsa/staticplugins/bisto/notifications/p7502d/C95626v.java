package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90365ad;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p;
import com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.v */
/* compiled from: PG */
public final class C95626v implements C89683v, C95621q, C90365ad {

    /* renamed from: a */
    public static final long f267626a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: b */
    public final Map f267627b = new HashMap();

    /* renamed from: c */
    public final C95622r f267628c;

    /* renamed from: d */
    public final C89656k f267629d;

    /* renamed from: e */
    public final C21370a f267630e;

    /* renamed from: f */
    public final Context f267631f;

    public C95626v(Context context, C95622r rVar, C89656k kVar, C21370a aVar) {
        this.f267631f = context;
        this.f267628c = rVar;
        this.f267629d = kVar;
        this.f267630e = aVar;
    }

    /* renamed from: a */
    public final C90381o mo84075a(GroupDataKey groupDataKey, long j) {
        C90382p pVar = (C90382p) this.f267627b.get(groupDataKey);
        if (pVar == null) {
            return null;
        }
        if (pVar.f252435f.isEmpty()) {
            C59104x d = C90382p.f252430a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GroupData");
            ((C59052c) ((C59052c) d).mo56372aa(10875)).mo56386p("versions is empty somehow!");
            int i = C90755l.f253831a;
            return new C90381o(pVar, 0);
        } else if (pVar.f252435f.size() == 1) {
            return (C90381o) pVar.f252435f.first();
        } else {
            C90381o oVar = (C90381o) pVar.f252435f.floor(new C90381o(pVar, j));
            C90381o oVar2 = (C90381o) pVar.f252435f.ceiling(new C90381o(pVar, j));
            if (oVar == null && oVar2 == null) {
                C59104x d2 = C90382p.f252430a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "GroupData");
                ((C59052c) ((C59052c) d2).mo56372aa(10874)).mo56386p("Somehow no past or future!");
                return (C90381o) pVar.f252435f.last();
            }
            if (oVar == null) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                if (oVar2 == null) {
                    C58976aa aaVar2 = C58975e.f156826a;
                } else if (oVar == oVar2) {
                    C58976aa aaVar3 = C58975e.f156826a;
                } else {
                    boolean c = oVar.mo84083c(j);
                    boolean c2 = oVar2.mo84083c(j);
                    C90381o oVar3 = Math.abs(j - oVar.f252421a) <= Math.abs(j - oVar2.f252421a) ? oVar : oVar2;
                    if (c) {
                        if (!c2) {
                            c2 = false;
                        } else if (!oVar.f252426f) {
                            C58976aa aaVar4 = C58975e.f156826a;
                        } else if (!oVar2.f252426f) {
                            C58976aa aaVar5 = C58975e.f156826a;
                        } else {
                            C58976aa aaVar6 = C58975e.f156826a;
                            return oVar3;
                        }
                    }
                    if (c) {
                        C58976aa aaVar7 = C58975e.f156826a;
                    } else if (c2) {
                        C58976aa aaVar8 = C58975e.f156826a;
                    } else {
                        C58976aa aaVar9 = C58975e.f156826a;
                        return oVar3;
                    }
                }
                return oVar;
            }
            return oVar2;
        }
    }

    /* renamed from: b */
    public final void mo89539b() {
        for (C90382p b : this.f267627b.values()) {
            b.mo84086b();
        }
    }

    /* renamed from: c */
    public final void mo89579c() {
        this.f267627b.clear();
        C95622r rVar = this.f267628c;
        synchronized (rVar.f267614a) {
            rVar.f267615b.remove(this);
            rVar.mo89576b();
        }
    }

    /* renamed from: d */
    public final void mo89580d(String str) {
        Iterator it = this.f267627b.entrySet().iterator();
        while (it.hasNext()) {
            if (((C90382p) ((Map.Entry) it.next()).getValue()).f252434e.equals(str)) {
                C58976aa aaVar = C58975e.f156826a;
                it.remove();
            }
        }
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        for (Map.Entry entry : this.f267627b.entrySet()) {
            GroupDataKey groupDataKey = (GroupDataKey) entry.getKey();
            C90382p pVar = (C90382p) entry.getValue();
            if (this.f267629d.mo83556k()) {
                String valueOf = String.valueOf(groupDataKey);
                String valueOf2 = String.valueOf(pVar);
                aqVar.println("Group with key = [" + valueOf + "]: " + valueOf2);
            } else {
                aqVar.println("Group: ".concat(String.valueOf(String.valueOf(pVar))));
            }
        }
    }
}
