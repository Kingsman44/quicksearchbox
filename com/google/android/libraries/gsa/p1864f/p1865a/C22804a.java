package com.google.android.libraries.gsa.p1864f.p1865a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59693ch;
import com.google.common.p4552o.C59694ci;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.gsa.f.a.a */
/* compiled from: PG */
public final class C22804a implements Comparable {

    /* renamed from: h */
    private static final C58495hd f62784h = C58729pv.f156485a;

    /* renamed from: i */
    private static final AtomicLong f62785i = new AtomicLong();

    /* renamed from: a */
    public final C89849ae f62786a;

    /* renamed from: b */
    public final long f62787b;

    /* renamed from: c */
    public final long f62788c;

    /* renamed from: d */
    public final C58495hd f62789d;

    /* renamed from: e */
    public final String f62790e;

    /* renamed from: f */
    public final C58528ij f62791f;

    /* renamed from: g */
    public final C59687cb f62792g;

    public C22804a(C89849ae aeVar, long j, long j2, C58528ij ijVar, C58495hd hdVar, String str, C59687cb cbVar) {
        this.f62786a = aeVar;
        this.f62787b = j;
        this.f62788c = j2;
        this.f62791f = ijVar;
        this.f62789d = hdVar == null ? f62784h : hdVar;
        this.f62790e = str;
        this.f62792g = cbVar;
    }

    /* renamed from: b */
    public static C22804a m42624b(C89857g gVar, long j, C58495hd hdVar, String str, C59687cb cbVar) {
        C58528ij ijVar = gVar.f246207b;
        long j2 = gVar.f246210e;
        return new C22804a(gVar.f246206a, j2 > 0 ? j2 : j, f62785i.getAndIncrement(), ijVar, hdVar, str, cbVar);
    }

    /* renamed from: a */
    public final int compareTo(C22804a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot compare with <null> value.");
        } else if (this == aVar) {
            return 0;
        } else {
            int signum = Long.signum(this.f62787b - aVar.f62787b);
            if (signum != 0) {
                return signum;
            }
            int signum2 = Long.signum(this.f62788c - aVar.f62788c);
            if (signum2 != 0) {
                return signum2;
            }
            return Integer.valueOf(hashCode()).compareTo(Integer.valueOf(aVar.hashCode()));
        }
    }

    /* renamed from: c */
    public final C59694ci mo28151c() {
        C59693ch chVar = (C59693ch) C59694ci.f160157e.createBuilder();
        int i = this.f62786a.f245884YW;
        chVar.copyOnWrite();
        C59694ci ciVar = (C59694ci) chVar.instance;
        ciVar.f160159a |= 1;
        ciVar.f160160b = i;
        long j = this.f62787b;
        chVar.copyOnWrite();
        C59694ci ciVar2 = (C59694ci) chVar.instance;
        ciVar2.f160159a |= 2;
        ciVar2.f160161c = j;
        C59687cb cbVar = this.f62792g;
        if (cbVar != null) {
            chVar.copyOnWrite();
            C59694ci ciVar3 = (C59694ci) chVar.instance;
            ciVar3.f160162d = cbVar;
            ciVar3.f160159a |= 4;
        }
        return (C59694ci) chVar.build();
    }

    /* renamed from: d */
    public final boolean mo28153d(C58495hd hdVar) {
        if (!hdVar.isEmpty() && !this.f62789d.isEmpty()) {
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                Object obj = this.f62789d.get(entry.getKey());
                if (obj != null && !obj.equals(entry.getValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C22804a) || compareTo((C22804a) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62786a, Long.valueOf(this.f62787b), Long.valueOf(this.f62788c), this.f62789d, this.f62790e});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("eventId", this.f62786a);
        b.mo56103c("elapsedTimeNanos", String.valueOf(this.f62787b));
        return b.toString();
    }
}
