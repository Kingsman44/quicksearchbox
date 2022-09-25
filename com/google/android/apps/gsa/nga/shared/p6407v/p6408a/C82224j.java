package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.j */
/* compiled from: PG */
final class C82224j extends C82219e {

    /* renamed from: a */
    public final boolean f224708a;

    /* renamed from: b */
    public final boolean f224709b;

    public C82224j(boolean z, boolean z2) {
        this.f224708a = z;
        this.f224709b = z2;
    }

    /* renamed from: a */
    public final C82218d mo75562a() {
        return new C82223i(this);
    }

    /* renamed from: b */
    public final boolean mo75563b() {
        return this.f224708a;
    }

    /* renamed from: c */
    public final boolean mo75564c() {
        return this.f224709b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82219e) {
            C82219e eVar = (C82219e) obj;
            return this.f224708a == eVar.mo75563b() && this.f224709b == eVar.mo75564c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f224708a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f224709b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f224708a;
        boolean z2 = this.f224709b;
        return "InputPlateVisibilityHolder{assistUiAttached=" + z + ", inputPlateRendered=" + z2 + "}";
    }
}
