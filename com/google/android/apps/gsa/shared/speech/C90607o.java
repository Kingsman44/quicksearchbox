package com.google.android.apps.gsa.shared.speech;

import com.google.android.apps.gsa.shared.speech.p7140b.C90531a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.speech.o */
/* compiled from: PG */
public final class C90607o implements C90531a {

    /* renamed from: a */
    public final int f253280a;

    /* renamed from: b */
    public final long f253281b;

    /* renamed from: c */
    private final byte[] f253282c;

    public C90607o(int i, byte[] bArr, long j) {
        this.f253280a = i;
        this.f253282c = bArr;
        this.f253281b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C90607o oVar = (C90607o) obj;
            return this.f253280a == oVar.f253280a && this.f253282c == oVar.f253282c && this.f253281b == oVar.f253281b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f253280a), Integer.valueOf(Arrays.hashCode(this.f253282c)), Long.valueOf(this.f253281b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("speechResult: [recognitionEngine: ");
        sb.append(this.f253280a);
        sb.append(", hasAudio: ");
        sb.append(this.f253282c != null);
        sb.append(", endpointerEventTimeMs: ");
        sb.append(this.f253281b);
        sb.append("]");
        return sb.toString();
    }
}
