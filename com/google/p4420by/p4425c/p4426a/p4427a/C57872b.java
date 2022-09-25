package com.google.p4420by.p4425c.p4426a.p4427a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58710pc;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: com.google.by.c.a.a.b */
/* compiled from: PG */
public final class C57872b {

    /* renamed from: a */
    public static final C57872b f154595a = new C57872b(BuildConfig.FLAVOR, 0, 1, (BitSet) null);

    /* renamed from: b */
    public static final C58710pc f154596b = new C57871a();

    /* renamed from: c */
    public final String f154597c;

    /* renamed from: d */
    public final int f154598d;

    /* renamed from: e */
    public final BitSet f154599e;

    /* renamed from: f */
    public final int f154600f;

    public C57872b(String str, int i, int i2, BitSet bitSet) {
        C58838bb.m90866a(str, "Token value cannot be null");
        this.f154597c = str;
        this.f154598d = i;
        this.f154600f = i2;
        this.f154599e = bitSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57872b)) {
            return false;
        }
        C57872b bVar = (C57872b) obj;
        return this.f154598d == bVar.f154598d && this.f154597c.equals(bVar.f154597c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f154598d), this.f154597c});
    }

    public final String toString() {
        String str = this.f154597c;
        int i = this.f154598d;
        return "{Value:" + str + ",StartIndex:" + i + "}";
    }
}
