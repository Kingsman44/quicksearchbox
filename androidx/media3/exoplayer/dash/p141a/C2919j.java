package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.p136b.C2610ai;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.media3.exoplayer.dash.a.j */
/* compiled from: PG */
public final class C2919j {

    /* renamed from: a */
    public final long f8359a;

    /* renamed from: b */
    public final long f8360b;

    /* renamed from: c */
    public final String f8361c;

    /* renamed from: d */
    private int f8362d;

    public C2919j(String str, long j, long j2) {
        this.f8361c = str == null ? BuildConfig.FLAVOR : str;
        this.f8359a = j;
        this.f8360b = j2;
    }

    /* renamed from: a */
    public final C2919j mo6775a(C2919j jVar, String str) {
        String a = C2610ai.m6915a(str, this.f8361c);
        C2919j jVar2 = null;
        if (jVar != null && a.equals(C2610ai.m6915a(str, jVar.f8361c))) {
            long j = this.f8360b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f8359a;
                if (j3 + j == jVar.f8359a) {
                    long j4 = jVar.f8360b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C2919j(a, j3, j2);
                }
            }
            long j5 = jVar.f8360b;
            if (j5 != -1) {
                long j6 = jVar.f8359a;
                if (j6 + j5 == this.f8359a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    jVar2 = new C2919j(a, j6, j2);
                }
            }
        }
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2919j jVar = (C2919j) obj;
            return this.f8359a == jVar.f8359a && this.f8360b == jVar.f8360b && this.f8361c.equals(jVar.f8361c);
        }
    }

    public final int hashCode() {
        int i = this.f8362d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.f8359a) + 527) * 31) + ((int) this.f8360b)) * 31) + this.f8361c.hashCode();
        this.f8362d = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.f8361c;
        long j = this.f8359a;
        long j2 = this.f8360b;
        return "RangedUri(referenceUri=" + str + ", start=" + j + ", length=" + j2 + ")";
    }
}
