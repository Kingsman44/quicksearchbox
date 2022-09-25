package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ag */
/* compiled from: PG */
public final class C82305ag extends C82533is {

    /* renamed from: a */
    private final String f224823a = "GDD_TASK_SCHEDULER_TASK_COUNT";

    /* renamed from: b */
    private final Double f224824b;

    public C82305ag(String str, Double d) {
        this.f224824b = d;
    }

    /* renamed from: b */
    public final Double mo75614b() {
        return this.f224824b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224823a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82533is) {
            C82533is isVar = (C82533is) obj;
            return this.f224823a.equals(isVar.mo75583d()) && this.f224824b.equals(isVar.mo75614b());
        }
    }

    public final int hashCode() {
        return ((this.f224823a.hashCode() ^ 1000003) * 1000003) ^ this.f224824b.hashCode();
    }

    public final String toString() {
        String str = this.f224823a;
        Double d = this.f224824b;
        return "GddTaskSchedulerTaskCountEvent{token=" + str + ", value=" + d + "}";
    }
}
