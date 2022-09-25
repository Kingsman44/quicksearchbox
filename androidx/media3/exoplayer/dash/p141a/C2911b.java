package androidx.media3.exoplayer.dash.p141a;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.dash.a.b */
/* compiled from: PG */
public final class C2911b {

    /* renamed from: a */
    public final String f8312a;

    /* renamed from: b */
    public final String f8313b;

    /* renamed from: c */
    public final int f8314c;

    /* renamed from: d */
    public final int f8315d;

    public C2911b(String str, String str2, int i, int i2) {
        this.f8312a = str;
        this.f8313b = str2;
        this.f8314c = i;
        this.f8315d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2911b)) {
            return false;
        }
        C2911b bVar = (C2911b) obj;
        return this.f8314c == bVar.f8314c && this.f8315d == bVar.f8315d && C58832aw.m90831a(this.f8312a, bVar.f8312a) && C58832aw.m90831a(this.f8313b, bVar.f8313b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8312a, this.f8313b, Integer.valueOf(this.f8314c), Integer.valueOf(this.f8315d)});
    }
}
