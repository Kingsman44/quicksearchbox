package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.p3670c.C47343f;
import com.google.apps.tiktok.p3663j.p3670c.C47344g;
import com.google.apps.tiktok.p3663j.p3670c.C47345h;
import java.util.Arrays;

/* renamed from: com.google.apps.tiktok.j.b.al */
/* compiled from: PG */
public final class C47304al {

    /* renamed from: a */
    public final C47345h f122965a;

    /* renamed from: b */
    public final C47351i f122966b;

    /* renamed from: c */
    public final AccountId f122967c;

    public C47304al(C47345h hVar) {
        this.f122965a = hVar;
        C47343f fVar = hVar.f123062b;
        this.f122966b = new C47351i(fVar == null ? C47343f.f123055c : fVar);
        this.f122967c = (hVar.f123061a & 2) != 0 ? AccountId.m82057b(hVar.f123063c) : null;
    }

    /* renamed from: a */
    public static C47304al m84122a(C47351i iVar) {
        C47344g gVar = (C47344g) C47345h.f123059d.createBuilder();
        C47343f fVar = iVar.f123074a;
        gVar.copyOnWrite();
        C47345h hVar = (C47345h) gVar.instance;
        fVar.getClass();
        hVar.f123062b = fVar;
        hVar.f123061a |= 1;
        return new C47304al((C47345h) gVar.build());
    }

    /* renamed from: b */
    static C47304al m84123b(int i, C47351i iVar) {
        C47344g gVar = (C47344g) C47345h.f123059d.createBuilder();
        C47343f fVar = iVar.f123074a;
        gVar.copyOnWrite();
        C47345h hVar = (C47345h) gVar.instance;
        fVar.getClass();
        hVar.f123062b = fVar;
        hVar.f123061a |= 1;
        gVar.copyOnWrite();
        C47345h hVar2 = (C47345h) gVar.instance;
        hVar2.f123061a |= 2;
        hVar2.f123063c = i;
        return new C47304al((C47345h) gVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo51188c() {
        return this.f122967c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C47304al) {
            C47304al alVar = (C47304al) obj;
            if (this.f122966b.equals(alVar.f122966b)) {
                AccountId accountId = this.f122967c;
                AccountId accountId2 = alVar.f122967c;
                if (accountId == null) {
                    if (accountId2 == null) {
                        return true;
                    }
                } else if (!accountId.equals(accountId2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f122966b, this.f122967c});
    }
}
