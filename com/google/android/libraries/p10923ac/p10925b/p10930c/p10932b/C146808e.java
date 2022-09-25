package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.ac.b.c.b.e */
/* compiled from: PG */
public final class C146808e extends C146816m {

    /* renamed from: a */
    private final byte[] f396365a;

    /* renamed from: b */
    private final byte[] f396366b;

    /* renamed from: c */
    private final long f396367c;

    public C146808e(byte[] bArr, byte[] bArr2, long j) {
        if (bArr != null) {
            this.f396365a = bArr;
            this.f396366b = bArr2;
            this.f396367c = j;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final long mo123683a() {
        return this.f396367c;
    }

    /* renamed from: b */
    public final byte[] mo123684b() {
        return this.f396365a;
    }

    /* renamed from: c */
    public final byte[] mo123685c() {
        return this.f396366b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146816m) {
            C146816m mVar = (C146816m) obj;
            boolean z = mVar instanceof C146808e;
            if (Arrays.equals(this.f396365a, z ? ((C146808e) mVar).f396365a : mVar.mo123684b())) {
                return Arrays.equals(this.f396366b, z ? ((C146808e) mVar).f396366b : mVar.mo123685c()) && this.f396367c == mVar.mo123683a();
            }
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f396365a);
        int hashCode2 = Arrays.hashCode(this.f396366b);
        long j = this.f396367c;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f396365a);
        String arrays2 = Arrays.toString(this.f396366b);
        long j = this.f396367c;
        return "CoreMdhFootprint{data=" + arrays + ", secondaryId=" + arrays2 + ", serverEventIdTimestamp=" + j + "}";
    }
}
