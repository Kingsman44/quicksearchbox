package com.google.android.libraries.animation;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58520ib;
import com.google.common.p4522b.C58522id;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.libraries.animation.v */
/* compiled from: PG */
public final class C147796v {

    /* renamed from: a */
    public final C58480gp f398770a = new C58480gp(4);

    /* renamed from: b */
    private final C147768a f398771b;

    public C147796v(C147768a aVar) {
        C58838bb.m90866a(aVar, "animatable can not be null");
        this.f398771b = aVar;
    }

    /* renamed from: a */
    public final C147768a mo124469a() {
        C58485gu f = this.f398770a.mo55394f();
        C58838bb.m90869d(!f.isEmpty(), "at least one range has to be specified");
        C58522id idVar = C58522id.f156167a;
        ArrayList arrayList = new ArrayList();
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C147794t tVar = (C147794t) f.get(i2);
            C58520ib.m89987b(tVar.f398761a, tVar.mo124467a(), arrayList);
        }
        C58522id a = C58520ib.m89986a(arrayList);
        C58495hd a2 = a.mo55476b();
        C58800sl lA = a2.entrySet().iterator();
        Map.Entry entry = null;
        Map.Entry entry2 = null;
        C58714pg pgVar = null;
        int i3 = 0;
        while (lA.hasNext()) {
            Map.Entry entry3 = (Map.Entry) lA.next();
            if (i3 == 0) {
                entry = entry3;
            }
            if (i3 == a2.size() - 1) {
                entry2 = entry3;
            }
            if (pgVar != null) {
                C58838bb.m90879n(pgVar.mo55823n((C58714pg) entry3.getKey()), "ranges have to be connected. Range %s and %s were not", pgVar, entry3.getKey());
            }
            pgVar = (C58714pg) entry3.getKey();
            i3++;
        }
        C58838bb.m90866a(entry, "first range can not be null");
        C58838bb.m90866a(entry2, "last range can not be null");
        if (!((C58714pg) entry.getKey()).mo55821l() && !(entry.getValue() instanceof C147791q)) {
            throw new IllegalArgumentException(String.format("Evaluator has to be constant for range without lower bound. Range: %s", new Object[]{entry.getKey()}));
        } else if (((C58714pg) entry2.getKey()).mo55822m() || (entry2.getValue() instanceof C147791q)) {
            return new C147795u(a, entry, entry2, this.f398771b);
        } else {
            throw new IllegalArgumentException(String.format("Evaluator has to be constant for range without upper bound. Range: %s", new Object[]{entry2.getKey()}));
        }
    }
}
