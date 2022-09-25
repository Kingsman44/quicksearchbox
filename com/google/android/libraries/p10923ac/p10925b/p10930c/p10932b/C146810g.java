package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.ac.b.c.b.g */
/* compiled from: PG */
final class C146810g extends C146819p {

    /* renamed from: a */
    private final byte[] f396370a;

    /* renamed from: b */
    private final int f396371b;

    public C146810g(byte[] bArr, int i) {
        if (bArr != null) {
            this.f396370a = bArr;
            this.f396371b = i;
            return;
        }
        throw new NullPointerException("Null secondaryId");
    }

    /* renamed from: a */
    public final int mo123694a() {
        return this.f396371b;
    }

    /* renamed from: b */
    public final byte[] mo123695b() {
        return this.f396370a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146819p) {
            C146819p pVar = (C146819p) obj;
            return Arrays.equals(this.f396370a, pVar instanceof C146810g ? ((C146810g) pVar).f396370a : pVar.mo123695b()) && this.f396371b == pVar.mo123694a();
        }
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f396370a) ^ 1000003) * 1000003) ^ this.f396371b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f396370a);
        int i = this.f396371b;
        return "CoreSecondaryIdMatcher{secondaryId=" + arrays + ", matchingType=" + i + "}";
    }
}
