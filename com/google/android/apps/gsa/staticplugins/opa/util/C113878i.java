package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60951j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.i */
/* compiled from: PG */
public final /* synthetic */ class C113878i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113880k f315303a;

    /* renamed from: b */
    public final /* synthetic */ int f315304b;

    public /* synthetic */ C113878i(C113880k kVar, int i) {
        this.f315303a = kVar;
        this.f315304b = i;
    }

    public final Object apply(Object obj) {
        C113880k kVar = this.f315303a;
        int i = this.f315304b;
        ArrayList arrayList = new ArrayList(C58869cf.m90936b(new C58903m(',')).mo56151a().mo56155i((String) obj));
        C58976aa aaVar = C58975e.f156826a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        LocalDate localDate = Instant.ofEpochMilli(kVar.f315309d.mo26870b()).atZone(C60951j.f165070a).toLocalDate();
        long a = ((C86124t) kVar.f315308c.mo27525b()).mo79743a(C90037cp.f248503be);
        HashMap hashMap = new HashMap();
        long j = (long) i;
        if (a <= j) {
            C59104x b = C113880k.f315306a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AssistActivatedStat");
            ((C59052c) ((C59052c) b).mo56372aa(28389)).mo56349B("Not enough OPA active dates (%d) stored to compute Last%d metric", a, i);
        } else {
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = 0;
            for (long j2 = 1; j2 <= j; j2++) {
                if (hashSet.contains(C113880k.m188516d(localDate.minusDays(j2)))) {
                    arrayDeque.add(true);
                    i2++;
                } else {
                    arrayDeque.add(false);
                }
            }
            Integer valueOf = Integer.valueOf(i2);
            hashMap.put("yesterday", valueOf);
            hashMap.put(C113880k.m188516d(localDate.minusDays(1)), valueOf);
            for (long j3 = 2; j3 <= a - j; j3++) {
                if (hashSet.contains(C113880k.m188516d(localDate.minusDays((j3 + j) - 1)))) {
                    arrayDeque.add(true);
                    i2++;
                } else {
                    arrayDeque.add(false);
                }
                if (((Boolean) arrayDeque.remove()).booleanValue()) {
                    i2--;
                }
                hashMap.put(C113880k.m188516d(localDate.minusDays(j3)), Integer.valueOf(i2));
            }
        }
        return hashMap;
    }
}
