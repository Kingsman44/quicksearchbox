package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.c */
/* compiled from: PG */
public final class C98327c extends C98322ad {

    /* renamed from: a */
    private final String f274482a;

    /* renamed from: b */
    private final byte[] f274483b;

    /* renamed from: c */
    private final long f274484c;

    public C98327c(String str, byte[] bArr, long j) {
        this.f274482a = str;
        if (bArr != null) {
            this.f274483b = bArr;
            this.f274484c = j;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final long mo91050a() {
        return this.f274484c;
    }

    /* renamed from: b */
    public final String mo91051b() {
        return this.f274482a;
    }

    /* renamed from: c */
    public final byte[] mo91052c() {
        return this.f274483b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98322ad) {
            C98322ad adVar = (C98322ad) obj;
            if (this.f274482a.equals(adVar.mo91051b())) {
                return Arrays.equals(this.f274483b, adVar instanceof C98327c ? ((C98327c) adVar).f274483b : adVar.mo91052c()) && this.f274484c == adVar.mo91050a();
            }
        }
    }

    public final int hashCode() {
        return ((((this.f274482a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f274483b)) * 1000003) ^ ((int) this.f274484c);
    }

    public final String toString() {
        String str = this.f274482a;
        String arrays = Arrays.toString(this.f274483b);
        long j = this.f274484c;
        return "StoreObject{key=" + str + ", value=" + arrays + ", blobType=" + j + "}";
    }
}
