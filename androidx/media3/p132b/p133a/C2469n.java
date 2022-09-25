package androidx.media3.p132b.p133a;

import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: androidx.media3.b.a.n */
/* compiled from: PG */
final class C2469n {

    /* renamed from: a */
    public final int f6790a;

    /* renamed from: b */
    public final String f6791b;

    /* renamed from: c */
    public final TreeSet f6792c = new TreeSet();

    /* renamed from: d */
    public final ArrayList f6793d = new ArrayList();

    /* renamed from: e */
    public C2476u f6794e;

    public C2469n(int i, String str, C2476u uVar) {
        this.f6790a = i;
        this.f6791b = str;
        this.f6794e = uVar;
    }

    /* renamed from: a */
    public final boolean mo5894a(long j, long j2) {
        for (int i = 0; i < this.f6793d.size(); i++) {
            C2468m mVar = (C2468m) this.f6793d.get(i);
            long j3 = mVar.f6789b;
            if (j3 == -1) {
                if (j >= mVar.f6788a) {
                    return true;
                }
            } else if (j2 != -1) {
                long j4 = mVar.f6788a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2469n nVar = (C2469n) obj;
            return this.f6790a == nVar.f6790a && this.f6791b.equals(nVar.f6791b) && this.f6792c.equals(nVar.f6792c) && this.f6794e.equals(nVar.f6794e);
        }
    }

    public final int hashCode() {
        return (((this.f6790a * 31) + this.f6791b.hashCode()) * 31) + this.f6794e.hashCode();
    }
}
