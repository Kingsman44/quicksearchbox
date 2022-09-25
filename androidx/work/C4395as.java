package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.as */
/* compiled from: PG */
public final class C4395as {

    /* renamed from: a */
    public final UUID f14026a;

    /* renamed from: b */
    public final C4394ar f14027b;

    /* renamed from: c */
    public final Set f14028c;

    /* renamed from: d */
    private final C4632m f14029d;

    /* renamed from: e */
    private final C4632m f14030e;

    /* renamed from: f */
    private final int f14031f;

    public C4395as(UUID uuid, C4394ar arVar, C4632m mVar, List list, C4632m mVar2, int i) {
        this.f14026a = uuid;
        this.f14027b = arVar;
        this.f14029d = mVar;
        this.f14028c = new HashSet(list);
        this.f14030e = mVar2;
        this.f14031f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4395as asVar = (C4395as) obj;
        if (this.f14031f == asVar.f14031f && this.f14026a.equals(asVar.f14026a) && this.f14027b == asVar.f14027b && this.f14029d.equals(asVar.f14029d) && this.f14028c.equals(asVar.f14028c)) {
            return this.f14030e.equals(asVar.f14030e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.f14026a.hashCode() * 31) + this.f14027b.hashCode()) * 31) + this.f14029d.hashCode()) * 31) + this.f14028c.hashCode()) * 31) + this.f14030e.hashCode()) * 31) + this.f14031f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f14026a + "', mState=" + this.f14027b + ", mOutputData=" + this.f14029d + ", mTags=" + this.f14028c + ", mProgress=" + this.f14030e + '}';
    }
}
