package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ds */
/* compiled from: PG */
public final class C82398ds extends C82628mf {

    /* renamed from: a */
    private final String f225123a = "NGA_OPA_EVENT_ENQUEUE_DELAY_TIME";

    /* renamed from: b */
    private final Double f225124b;

    public C82398ds(String str, Double d) {
        this.f225124b = d;
    }

    /* renamed from: b */
    public final Double mo76032b() {
        return this.f225124b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225123a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82628mf) {
            C82628mf mfVar = (C82628mf) obj;
            return this.f225123a.equals(mfVar.mo75583d()) && this.f225124b.equals(mfVar.mo76032b());
        }
    }

    public final int hashCode() {
        return ((this.f225123a.hashCode() ^ 1000003) * 1000003) ^ this.f225124b.hashCode();
    }

    public final String toString() {
        String str = this.f225123a;
        Double d = this.f225124b;
        return "NgaOpaEventEnqueueDelayTimeEvent{token=" + str + ", value=" + d + "}";
    }
}
