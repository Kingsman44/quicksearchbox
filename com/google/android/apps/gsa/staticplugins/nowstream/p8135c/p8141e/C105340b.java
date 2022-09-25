package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.b */
/* compiled from: PG */
final class C105340b extends C105352n {

    /* renamed from: a */
    private final C91396h f293912a;

    /* renamed from: b */
    private final long f293913b;

    /* renamed from: c */
    private final boolean f293914c;

    /* renamed from: d */
    private final boolean f293915d;

    /* renamed from: e */
    private final C58833ax f293916e;

    public C105340b(C91396h hVar, long j, boolean z, boolean z2, C58833ax axVar) {
        this.f293912a = hVar;
        this.f293913b = j;
        this.f293914c = z;
        this.f293915d = z2;
        this.f293916e = axVar;
    }

    /* renamed from: a */
    public final long mo94736a() {
        return this.f293913b;
    }

    /* renamed from: b */
    public final C91396h mo94737b() {
        return this.f293912a;
    }

    /* renamed from: c */
    public final C58833ax mo94738c() {
        return this.f293916e;
    }

    /* renamed from: d */
    public final boolean mo94739d() {
        return this.f293914c;
    }

    /* renamed from: e */
    public final boolean mo94740e() {
        return this.f293915d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105352n) {
            C105352n nVar = (C105352n) obj;
            C91396h hVar = this.f293912a;
            if (hVar != null ? hVar.equals(nVar.mo94737b()) : nVar.mo94737b() == null) {
                return this.f293913b == nVar.mo94736a() && this.f293914c == nVar.mo94739d() && this.f293915d == nVar.mo94740e() && this.f293916e.equals(nVar.mo94738c());
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f293912a);
        long j = this.f293913b;
        boolean z = this.f293914c;
        boolean z2 = this.f293915d;
        String obj = this.f293916e.toString();
        return "CreateNowCardsStreamTaskResult{entryTreeData=" + valueOf + ", lastChangeTimeMillis=" + j + ", isOfflineAndStale=" + z + ", showSignInError=" + z2 + ", isSuccessfulFulfillment=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        C91396h hVar = this.f293912a;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.hashCode();
        }
        long j = this.f293913b;
        int i2 = 1237;
        int i3 = (((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.f293914c ? 1237 : 1231)) * 1000003;
        if (true == this.f293915d) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ this.f293916e.hashCode();
    }
}
