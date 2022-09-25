package com.google.common.p4543n.p4546c;

import com.google.common.base.C58830au;

/* renamed from: com.google.common.n.c.i */
/* compiled from: PG */
public final class C59401i extends C59403k {
    public C59401i(long j, double d, int i) {
        super(j, d, i);
    }

    public final String toString() {
        C58830au auVar = new C58830au("exponentialBackoff");
        auVar.mo56103c("firstDelayMs", String.valueOf(this.f157612b));
        auVar.mo56103c("multiplier", String.valueOf(this.f157613c));
        auVar.mo56103c("tries", String.valueOf(this.f157611a));
        return auVar.toString();
    }
}
