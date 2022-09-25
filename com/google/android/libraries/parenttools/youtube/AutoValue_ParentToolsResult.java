package com.google.android.libraries.parenttools.youtube;

import java.util.Arrays;

/* compiled from: PG */
final class AutoValue_ParentToolsResult extends ParentToolsResult {

    /* renamed from: a */
    public final byte[] f83745a;

    /* renamed from: b */
    public final int f83746b;

    public AutoValue_ParentToolsResult(byte[] bArr, int i) {
        this.f83745a = bArr;
        this.f83746b = i;
    }

    /* renamed from: a */
    public final C31095ac mo36827a() {
        return new C31092a(this);
    }

    /* renamed from: b */
    public final byte[] mo36828b() {
        return this.f83745a;
    }

    /* renamed from: c */
    public final int mo36829c() {
        return this.f83746b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ParentToolsResult) {
            ParentToolsResult parentToolsResult = (ParentToolsResult) obj;
            return Arrays.equals(this.f83745a, parentToolsResult instanceof AutoValue_ParentToolsResult ? ((AutoValue_ParentToolsResult) parentToolsResult).f83745a : parentToolsResult.mo36828b()) && this.f83746b == parentToolsResult.mo36829c();
        }
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f83745a) ^ 1000003) * 1000003) ^ this.f83746b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f83745a);
        String num = Integer.toString(this.f83746b - 1);
        return "ParentToolsResult{hostClientData=" + arrays + ", exitStatus=" + num + "}";
    }
}
