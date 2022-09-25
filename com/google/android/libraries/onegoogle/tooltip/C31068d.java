package com.google.android.libraries.onegoogle.tooltip;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.d */
/* compiled from: PG */
public final class C31068d extends C31074j {

    /* renamed from: a */
    public final C31080p f83694a;

    /* renamed from: b */
    public final C31067c f83695b;

    public C31068d(C31080p pVar, C31067c cVar) {
        this.f83694a = pVar;
        this.f83695b = cVar;
    }

    /* renamed from: a */
    public final C31067c mo36782a() {
        return this.f83695b;
    }

    /* renamed from: b */
    public final C31080p mo36783b() {
        return this.f83694a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31074j) {
            C31074j jVar = (C31074j) obj;
            return this.f83694a.equals(jVar.mo36783b()) && this.f83695b.equals(jVar.mo36782a());
        }
    }

    public final int hashCode() {
        return ((this.f83694a.hashCode() ^ 1000003) * 1000003) ^ this.f83695b.hashCode();
    }

    public final String toString() {
        String obj = this.f83694a.toString();
        String obj2 = this.f83695b.toString();
        return "Configuration{tooltipModel=" + obj + ", anchorViewProvider=" + obj2 + "}";
    }
}
