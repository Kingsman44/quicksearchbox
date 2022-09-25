package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.af */
/* compiled from: PG */
public final class C82304af extends C82532ir {

    /* renamed from: a */
    private final String f224821a = "GDD_TASK_SCHEDULER_RESULT";

    /* renamed from: b */
    private final String f224822b;

    public C82304af(String str, String str2) {
        this.f224822b = str2;
    }

    /* renamed from: b */
    public final String mo75610b() {
        return this.f224822b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224821a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82532ir) {
            C82532ir irVar = (C82532ir) obj;
            return this.f224821a.equals(irVar.mo75583d()) && this.f224822b.equals(irVar.mo75610b());
        }
    }

    public final int hashCode() {
        return ((this.f224821a.hashCode() ^ 1000003) * 1000003) ^ this.f224822b.hashCode();
    }

    public final String toString() {
        String str = this.f224821a;
        String str2 = this.f224822b;
        return "GddTaskSchedulerResultEvent{token=" + str + ", result=" + str2 + "}";
    }
}
