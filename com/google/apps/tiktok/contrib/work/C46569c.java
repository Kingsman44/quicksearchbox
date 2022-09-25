package com.google.apps.tiktok.contrib.work;

import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.contrib.work.c */
/* compiled from: PG */
public final class C46569c extends C46580n {

    /* renamed from: a */
    private final C58833ax f121747a;

    /* renamed from: b */
    private final C58833ax f121748b;

    /* renamed from: c */
    private final C58833ax f121749c;

    /* renamed from: d */
    private final C58833ax f121750d;

    /* renamed from: e */
    private final C58833ax f121751e;

    public C46569c(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5) {
        this.f121747a = axVar;
        this.f121748b = axVar2;
        this.f121749c = axVar3;
        this.f121750d = axVar4;
        this.f121751e = axVar5;
    }

    /* renamed from: a */
    public final C58833ax mo50552a() {
        return this.f121750d;
    }

    /* renamed from: b */
    public final C58833ax mo50553b() {
        return this.f121749c;
    }

    /* renamed from: c */
    public final C58833ax mo50554c() {
        return this.f121747a;
    }

    /* renamed from: d */
    public final C58833ax mo50555d() {
        return this.f121751e;
    }

    /* renamed from: e */
    public final C58833ax mo50556e() {
        return this.f121748b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46580n) {
            C46580n nVar = (C46580n) obj;
            return this.f121747a.equals(nVar.mo50554c()) && this.f121748b.equals(nVar.mo50556e()) && this.f121749c.equals(nVar.mo50553b()) && this.f121750d.equals(nVar.mo50552a()) && !nVar.mo50558f() && this.f121751e.equals(nVar.mo50555d());
        }
    }

    /* renamed from: f */
    public final boolean mo50558f() {
        return false;
    }

    public final int hashCode() {
        return ((((this.f121750d.hashCode() ^ -2127709203) * 1000003) ^ 1237) * 1000003) ^ this.f121751e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f121750d);
        String valueOf2 = String.valueOf(this.f121751e);
        return "TikTokWorkManagerClientConfiguration{jobSchedulerJobIdRange=Optional.absent(), minimumLoggingLevel=Optional.absent(), initializationExceptionHandler=Optional.absent(), defaultProcessName=" + valueOf + ", useRemoteWorkManager=false, maxSchedulerLimit=" + valueOf2 + "}";
    }
}
