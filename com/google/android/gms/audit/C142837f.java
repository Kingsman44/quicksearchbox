package com.google.android.gms.audit;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.audit.f */
/* compiled from: PG */
public final class C142837f {

    /* renamed from: a */
    public int f387635a;

    /* renamed from: b */
    public int f387636b;

    /* renamed from: c */
    public String f387637c;

    /* renamed from: d */
    public byte[] f387638d;

    /* renamed from: e */
    private final List f387639e = new ArrayList();

    /* renamed from: a */
    public final LogAuditRecordsRequest mo117763a() {
        int i = this.f387635a;
        if (i != 1 && i != 2) {
            throw new IllegalStateException("Invalid WriteMode.");
        } else if (!this.f387639e.isEmpty()) {
            int i2 = this.f387636b;
            if (i2 != 0) {
                return new LogAuditRecordsRequest(this.f387635a, i2, this.f387637c, (byte[][]) this.f387639e.toArray(new byte[0][]), (byte[]) null, this.f387638d);
            }
            throw new IllegalStateException("Invalid componentId.");
        } else {
            throw new IllegalStateException("Must specify at least one audit record.");
        }
    }

    /* renamed from: b */
    public final void mo117764b(byte[] bArr) {
        this.f387639e.add(bArr);
    }
}
