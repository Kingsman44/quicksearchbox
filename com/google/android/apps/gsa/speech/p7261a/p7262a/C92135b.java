package com.google.android.apps.gsa.speech.p7261a.p7262a;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.speech.a.a.b */
/* compiled from: PG */
final class C92135b extends C92137d {

    /* renamed from: a */
    private final boolean f256872a;

    /* renamed from: b */
    private final byte[] f256873b;

    /* renamed from: c */
    private final byte[] f256874c;

    /* renamed from: d */
    private final boolean f256875d;

    /* renamed from: e */
    private final boolean f256876e;

    /* renamed from: f */
    private final boolean f256877f;

    public C92135b(boolean z, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, boolean z4) {
        this.f256872a = z;
        this.f256873b = bArr;
        this.f256874c = bArr2;
        this.f256875d = z2;
        this.f256876e = z3;
        this.f256877f = z4;
    }

    /* renamed from: a */
    public final boolean mo86785a() {
        return this.f256872a;
    }

    /* renamed from: b */
    public final boolean mo86786b() {
        return this.f256875d;
    }

    /* renamed from: c */
    public final boolean mo86787c() {
        return this.f256876e;
    }

    /* renamed from: d */
    public final boolean mo86788d() {
        return this.f256877f;
    }

    /* renamed from: e */
    public final byte[] mo86789e() {
        return this.f256874c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92137d) {
            C92137d dVar = (C92137d) obj;
            if (this.f256872a == dVar.mo86785a()) {
                boolean z = dVar instanceof C92135b;
                if (Arrays.equals(this.f256873b, z ? ((C92135b) dVar).f256873b : dVar.mo86791f())) {
                    return Arrays.equals(this.f256874c, z ? ((C92135b) dVar).f256874c : dVar.mo86789e()) && this.f256875d == dVar.mo86786b() && this.f256876e == dVar.mo86787c() && this.f256877f == dVar.mo86788d();
                }
            }
        }
    }

    /* renamed from: f */
    public final byte[] mo86791f() {
        return this.f256873b;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((true != this.f256872a ? 1237 : 1231) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f256873b)) * 1000003) ^ Arrays.hashCode(this.f256874c)) * 1000003) ^ (true != this.f256875d ? 1237 : 1231)) * 1000003) ^ (true != this.f256876e ? 1237 : 1231)) * 1000003;
        if (true == this.f256877f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f256872a;
        String arrays = Arrays.toString(this.f256873b);
        String arrays2 = Arrays.toString(this.f256874c);
        boolean z2 = this.f256875d;
        boolean z3 = this.f256876e;
        boolean z4 = this.f256877f;
        return "BargeInParams{isBargeInEnabled=" + z + ", encodedTtsAudio=" + arrays + ", echoCancellerConfig=" + arrays2 + ", isBargeInRefactorEnabled=" + z2 + ", isGearheadSession=" + z3 + ", isTtsNullingEnabled=" + z4 + "}";
    }
}
