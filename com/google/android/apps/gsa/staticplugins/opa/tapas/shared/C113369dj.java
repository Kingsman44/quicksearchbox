package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dj */
/* compiled from: PG */
public final class C113369dj {

    /* renamed from: a */
    public static final C59071e f313918a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dj");

    /* renamed from: b */
    public final Object f313919b = new Object();

    /* renamed from: c */
    public final Map f313920c = new HashMap();

    /* renamed from: d */
    public final C21370a f313921d;

    /* renamed from: e */
    public final C86124t f313922e;

    public C113369dj(C21370a aVar, C86124t tVar) {
        this.f313921d = aVar;
        this.f313922e = tVar;
    }

    /* renamed from: a */
    public final C58485gu mo100145a(String str) {
        C58485gu guVar;
        synchronized (this.f313919b) {
            ArrayList arrayList = new ArrayList();
            long j = -2147483648L;
            C113415ez ezVar = null;
            for (String str2 : this.f313920c.keySet()) {
                str = str.replaceAll("\\s+", " ").trim();
                if (!TextUtils.isEmpty(str) && C58890d.m90988c(str2).startsWith(C58890d.m90988c(str))) {
                    C113368di diVar = (C113368di) this.f313920c.get(str2);
                    if (diVar.f313917c < this.f313921d.mo26870b()) {
                        arrayList.add(str2);
                    } else {
                        long j2 = diVar.f313916b;
                        if (j2 > j) {
                            ezVar = diVar.f313915a;
                            j = j2;
                        }
                    }
                }
            }
            this.f313920c.keySet().removeAll(arrayList);
            if (ezVar != null) {
                guVar = C58485gu.m89846n(ezVar);
            } else {
                guVar = C58485gu.m89845m();
            }
        }
        return guVar;
    }
}
