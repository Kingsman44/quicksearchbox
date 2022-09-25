package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.af */
/* compiled from: PG */
public final class C46688af {

    /* renamed from: a */
    public static final C46688af f121976a = new C46688af((Object) null, 0, false);

    /* renamed from: b */
    public final C46687ae f121977b;

    /* renamed from: c */
    private final Object f121978c;

    private C46688af(Object obj, long j, boolean z) {
        this.f121978c = obj;
        this.f121977b = new C46687ae(j, obj != null, z);
    }

    /* renamed from: b */
    public static C46688af m83205b(Object obj, long j) {
        obj.getClass();
        return new C46688af(obj, j, true);
    }

    /* renamed from: c */
    public static C46688af m83206c(Object obj) {
        obj.getClass();
        return new C46688af(obj, 0, false);
    }

    /* renamed from: a */
    public final long mo50736a() {
        C58838bb.m90884s(this.f121977b.f121974b, "Cannot get timestamp for a CacheResult that does not have content");
        C58838bb.m90884s(mo50740g(), "Cannot get timestamp for an invalid CacheResult");
        return this.f121977b.f121973a;
    }

    /* renamed from: d */
    public final C46688af mo50737d(C58817ah ahVar) {
        C46688af afVar = f121976a;
        if (this == afVar) {
            return afVar;
        }
        if (mo50740g()) {
            return m83205b(ahVar.apply(mo50739f()), mo50736a());
        }
        return m83206c(ahVar.apply(mo50739f()));
    }

    /* renamed from: e */
    public final C60870cx mo50738e(C60931s sVar, Executor executor) {
        C46688af afVar = f121976a;
        if (this == afVar) {
            return C60856cj.m92900i(afVar);
        }
        return C60922j.m93044g(sVar.apply(mo50739f()), new C46686ad(this), executor);
    }

    /* renamed from: f */
    public final Object mo50739f() {
        C58838bb.m90884s(this.f121977b.f121974b, "Cannot get data for a CacheResult that does not have content");
        return this.f121978c;
    }

    /* renamed from: g */
    public final boolean mo50740g() {
        C58838bb.m90884s(this.f121977b.f121974b, "Cannot call isValid() for a CacheResult that does not have content");
        return this.f121977b.f121975c;
    }

    public final String toString() {
        C46687ae aeVar = this.f121977b;
        if (!aeVar.f121974b) {
            return "CacheResult.cacheMiss";
        }
        if (!aeVar.f121975c) {
            String valueOf = String.valueOf(this.f121978c);
            return "CacheResult.cacheInvalid{data=" + valueOf + "}";
        }
        String valueOf2 = String.valueOf(this.f121978c);
        long j = this.f121977b.f121973a;
        return "CacheResult.cacheHit{data=" + valueOf2 + ", timestamp=" + j + "}";
    }
}
