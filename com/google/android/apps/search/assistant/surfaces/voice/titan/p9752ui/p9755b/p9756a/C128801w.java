package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.w */
/* compiled from: PG */
final class C128801w {

    /* renamed from: a */
    public final boolean f354058a;

    /* renamed from: b */
    public final boolean f354059b;

    public C128801w(boolean z, boolean z2) {
        this.f354058a = z;
        this.f354059b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128801w)) {
            return false;
        }
        C128801w wVar = (C128801w) obj;
        return this.f354058a == wVar.f354058a && this.f354059b == wVar.f354059b;
    }

    public final int hashCode() {
        return ((this.f354058a ? 1 : 0) * true) + (this.f354059b ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f354058a;
        boolean z2 = this.f354059b;
        return "HotwordInvocationState(wasInvokedByHotword=" + z + ", wasInvokedByHotwordLastFewSeconds=" + z2 + ")";
    }
}
