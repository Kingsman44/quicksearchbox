package com.android.p261d.p263b;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.android.d.b.b */
/* compiled from: PG */
final class C5043b {

    /* renamed from: a */
    public final C5051j[] f15918a = new C5051j[5];

    /* renamed from: b */
    public byte[] f15919b;

    /* renamed from: c */
    public final ArrayList f15920c = new ArrayList();

    /* renamed from: d */
    private final ByteOrder f15921d;

    public C5043b(ByteOrder byteOrder) {
        this.f15921d = byteOrder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5051j mo9991a(int i) {
        if (C5050i.m13867d(i)) {
            return this.f15918a[i];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C5043b)) {
            C5043b bVar = (C5043b) obj;
            if (bVar.f15921d == this.f15921d && bVar.f15920c.size() == this.f15920c.size() && Arrays.equals(bVar.f15919b, this.f15919b)) {
                for (int i = 0; i < this.f15920c.size(); i++) {
                    if (!Arrays.equals((byte[]) bVar.f15920c.get(i), (byte[]) this.f15920c.get(i))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < 5; i2++) {
                    C5051j a = bVar.mo9991a(i2);
                    C5051j a2 = mo9991a(i2);
                    if (a != a2 && a != null && !a.equals(a2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
