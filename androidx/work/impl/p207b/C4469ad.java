package androidx.work.impl.p207b;

import androidx.work.C4394ar;
import androidx.work.C4632m;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.ad */
/* compiled from: PG */
public final class C4469ad {

    /* renamed from: a */
    public final String f14209a;

    /* renamed from: b */
    public final C4394ar f14210b;

    /* renamed from: c */
    public final C4632m f14211c;

    /* renamed from: d */
    public final int f14212d;

    /* renamed from: e */
    public final int f14213e;

    /* renamed from: f */
    public final List f14214f;

    /* renamed from: g */
    public final List f14215g;

    public C4469ad(String str, C4394ar arVar, C4632m mVar, int i, int i2, List list, List list2) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(arVar, "state");
        C69664n.m101061g(mVar, "output");
        this.f14209a = str;
        this.f14210b = arVar;
        this.f14211c = mVar;
        this.f14212d = i;
        this.f14213e = i2;
        this.f14214f = list;
        this.f14215g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4469ad)) {
            return false;
        }
        C4469ad adVar = (C4469ad) obj;
        return C69664n.m101066l(this.f14209a, adVar.f14209a) && this.f14210b == adVar.f14210b && C69664n.m101066l(this.f14211c, adVar.f14211c) && this.f14212d == adVar.f14212d && this.f14213e == adVar.f14213e && C69664n.m101066l(this.f14214f, adVar.f14214f) && C69664n.m101066l(this.f14215g, adVar.f14215g);
    }

    public final int hashCode() {
        return (((((((((((this.f14209a.hashCode() * 31) + this.f14210b.hashCode()) * 31) + this.f14211c.hashCode()) * 31) + this.f14212d) * 31) + this.f14213e) * 31) + this.f14214f.hashCode()) * 31) + this.f14215g.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f14209a + ", state=" + this.f14210b + ", output=" + this.f14211c + ", runAttemptCount=" + this.f14212d + ", generation=" + this.f14213e + ", tags=" + this.f14214f + ", progress=" + this.f14215g + ')';
    }
}
