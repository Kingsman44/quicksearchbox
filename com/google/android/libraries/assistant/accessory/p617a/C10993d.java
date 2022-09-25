package com.google.android.libraries.assistant.accessory.p617a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.assistant.accessory.a.d */
/* compiled from: PG */
public final class C10993d {

    /* renamed from: a */
    private final short f36144a;

    public C10993d() {
        this.f36144a = 256;
    }

    public C10993d(byte b) {
        this.f36144a = (short) (b & 255);
    }

    public C10993d(int i, int i2, boolean z) {
        boolean z2 = true;
        C58838bb.m90869d(i >= 0 && i <= 3, "Invalid recordNumber");
        C58838bb.m90869d((i2 < 0 || i2 >= 32) ? false : z2, "Invalid frameNumber");
        this.f36144a = (((i << 6) & true) | ((i2 + i2) & true)) | z ? (short) 1 : 0;
    }

    /* renamed from: a */
    public final byte mo19362a() {
        return (byte) this.f36144a;
    }

    /* renamed from: b */
    public final int mo19363b() {
        C58838bb.m90884s(!mo19366e(), "Header undefined");
        return (this.f36144a & 62) >> 1;
    }

    /* renamed from: c */
    public final int mo19364c() {
        C58838bb.m90884s(!mo19366e(), "Header undefined");
        return (this.f36144a & 192) >> 6;
    }

    /* renamed from: d */
    public final boolean mo19365d() {
        if (!mo19366e()) {
            return (this.f36144a & 1) == 1;
        }
        throw new IllegalStateException("Header undefined");
    }

    /* renamed from: e */
    public final boolean mo19366e() {
        return this.f36144a == 256;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10993d) {
            C10993d dVar = (C10993d) obj;
            if (mo19366e() == dVar.mo19366e() || mo19362a() == dVar.mo19362a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return mo19362a();
    }

    public final String toString() {
        if (mo19366e()) {
            return "{Invalid Header}";
        }
        return String.format("{ recordNumber: %d frameNumber: %d isLast: %b raw = 0x%02X}", new Object[]{Integer.valueOf(mo19364c()), Integer.valueOf(mo19363b()), Boolean.valueOf(mo19365d()), Byte.valueOf(mo19362a())});
    }
}
