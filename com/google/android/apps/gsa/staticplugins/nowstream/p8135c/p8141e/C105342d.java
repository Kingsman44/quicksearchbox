package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.d */
/* compiled from: PG */
final class C105342d extends C105364z {

    /* renamed from: a */
    private final C91396h f293920a;

    /* renamed from: b */
    private final long f293921b;

    /* renamed from: c */
    private final boolean f293922c;

    public C105342d(C91396h hVar, long j, boolean z) {
        this.f293920a = hVar;
        this.f293921b = j;
        this.f293922c = z;
    }

    /* renamed from: a */
    public final long mo94750a() {
        return this.f293921b;
    }

    /* renamed from: b */
    public final C91396h mo94751b() {
        return this.f293920a;
    }

    /* renamed from: c */
    public final boolean mo94752c() {
        return this.f293922c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105364z) {
            C105364z zVar = (C105364z) obj;
            C91396h hVar = this.f293920a;
            if (hVar != null ? hVar.equals(zVar.mo94751b()) : zVar.mo94751b() == null) {
                return this.f293921b == zVar.mo94750a() && this.f293922c == zVar.mo94752c();
            }
        }
    }

    public final int hashCode() {
        C91396h hVar = this.f293920a;
        int hashCode = hVar == null ? 0 : hVar.hashCode();
        long j = this.f293921b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.f293922c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f293920a);
        long j = this.f293921b;
        boolean z = this.f293922c;
        return "ReloadNowControllerTaskResult{entryTreeData=" + valueOf + ", lastChangeTimeMillis=" + j + ", showSignInError=" + z + "}";
    }
}
