package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.c */
/* compiled from: PG */
final class C105341c extends C105361w {

    /* renamed from: a */
    private final C91396h f293917a;

    /* renamed from: b */
    private final long f293918b;

    /* renamed from: c */
    private final int f293919c;

    public C105341c(C91396h hVar, long j, int i) {
        this.f293917a = hVar;
        this.f293918b = j;
        this.f293919c = i;
    }

    /* renamed from: a */
    public final long mo94744a() {
        return this.f293918b;
    }

    /* renamed from: b */
    public final C91396h mo94745b() {
        return this.f293917a;
    }

    /* renamed from: c */
    public final int mo94746c() {
        return this.f293919c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105361w) {
            C105361w wVar = (C105361w) obj;
            C91396h hVar = this.f293917a;
            if (hVar != null ? hVar.equals(wVar.mo94745b()) : wVar.mo94745b() == null) {
                return this.f293918b == wVar.mo94744a() && this.f293919c == wVar.mo94746c();
            }
        }
    }

    public final int hashCode() {
        C91396h hVar = this.f293917a;
        int hashCode = hVar == null ? 0 : hVar.hashCode();
        long j = this.f293918b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f293919c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f293917a);
        long j = this.f293918b;
        int i = this.f293919c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "THROTTLED_OR_BLOCKED" : "GENERAL_ERROR" : "ACCOUNT_RESETTING" : "SIGN_IN_ERROR" : "NOT_OPTED_IN" : "SUCCESS";
        return "RefreshNowControllerTaskResult{entryTreeData=" + valueOf + ", lastChangeTimeMillis=" + j + ", response=" + str + "}";
    }
}
