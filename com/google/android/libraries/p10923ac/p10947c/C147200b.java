package com.google.android.libraries.p10923ac.p10947c;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.ac.c.b */
/* compiled from: PG */
final class C147200b extends C147207i {

    /* renamed from: a */
    private final byte[] f397415a;

    /* renamed from: b */
    private final int f397416b;

    public C147200b(byte[] bArr, int i) {
        this.f397415a = bArr;
        this.f397416b = i;
    }

    /* renamed from: a */
    public final int mo124018a() {
        return this.f397416b;
    }

    /* renamed from: b */
    public final byte[] mo124019b() {
        return this.f397415a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147207i) {
            C147207i iVar = (C147207i) obj;
            return Arrays.equals(this.f397415a, iVar instanceof C147200b ? ((C147200b) iVar).f397415a : iVar.mo124019b()) && this.f397416b == iVar.mo124018a();
        }
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f397415a) ^ 1000003) * 1000003) ^ this.f397416b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f397415a);
        int i = this.f397416b;
        return "SecondaryIdMatcher{secondaryId=" + arrays + ", matchingType=" + i + "}";
    }
}
