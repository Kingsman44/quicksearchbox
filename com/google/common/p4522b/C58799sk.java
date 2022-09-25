package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: com.google.common.b.sk */
/* compiled from: PG */
public final class C58799sk extends C58320ar implements Serializable {

    /* renamed from: a */
    final NavigableMap f156587a;

    /* renamed from: b */
    private transient Set f156588b;

    public C58799sk(NavigableMap navigableMap) {
        this.f156587a = navigableMap;
    }

    /* renamed from: a */
    public final void mo54980a(C58714pg pgVar) {
        if (!pgVar.mo55824o()) {
            C58406dw dwVar = pgVar.f156456b;
            C58406dw dwVar2 = pgVar.f156457c;
            Map.Entry lowerEntry = this.f156587a.lowerEntry(dwVar);
            if (lowerEntry != null) {
                C58714pg pgVar2 = (C58714pg) lowerEntry.getValue();
                if (pgVar2.f156457c.compareTo(dwVar) >= 0) {
                    if (pgVar2.f156457c.compareTo(dwVar2) >= 0) {
                        dwVar2 = pgVar2.f156457c;
                    }
                    dwVar = pgVar2.f156456b;
                }
            }
            Map.Entry floorEntry = this.f156587a.floorEntry(dwVar2);
            if (floorEntry != null) {
                C58714pg pgVar3 = (C58714pg) floorEntry.getValue();
                if (pgVar3.f156457c.compareTo(dwVar2) >= 0) {
                    dwVar2 = pgVar3.f156457c;
                }
            }
            this.f156587a.subMap(dwVar, dwVar2).clear();
            C58714pg pgVar4 = new C58714pg(dwVar, dwVar2);
            if (pgVar4.mo55824o()) {
                this.f156587a.remove(pgVar4.f156456b);
            } else {
                this.f156587a.put(pgVar4.f156456b, pgVar4);
            }
        }
    }

    /* renamed from: d */
    public final Set mo55484d() {
        Set set = this.f156588b;
        if (set != null) {
            return set;
        }
        C58798sj sjVar = new C58798sj(this.f156587a.values());
        this.f156588b = sjVar;
        return sjVar;
    }
}
