package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.common.util.concurrent.C60845bz;
import com.google.p4184bj.p4193c.p4197c.C55951ay;

/* renamed from: com.google.android.libraries.j.a.b.q */
/* compiled from: PG */
final class C23967q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C23971u f65533a;

    public C23967q(C23971u uVar) {
        this.f65533a = uVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f65533a.mo29380a(C23968r.CONSENT_DATA_LOADING_FAILED);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C55951ay ayVar = (C55951ay) obj;
        this.f65533a.f65549d = ayVar;
        C23950ah ahVar = C23950ah.ALREADY_CONSENTED;
        C23968r rVar = C23968r.CONSENT_DATA_LOADING;
        int ordinal = C23951ai.m44540a(ayVar).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.f65533a.mo29380a(C23968r.WAITING_FOR_USER_DECISION);
                    return;
                } else if (ordinal != 3) {
                    return;
                }
            }
            this.f65533a.mo29380a(C23968r.CONSENT_NOT_POSSIBLE);
            return;
        }
        this.f65533a.mo29380a(C23968r.ALREADY_CONSENTED);
    }
}
