package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.api.controller.ba */
/* compiled from: PG */
public final class C45990ba {

    /* renamed from: a */
    public final Set f120818a;

    /* renamed from: b */
    public final ArrayList f120819b;

    /* renamed from: c */
    public final Random f120820c = new Random();

    public C45990ba(Set set) {
        this.f120818a = set;
        this.f120819b = new ArrayList(2);
    }

    /* renamed from: a */
    public final void mo50129a(AccountId accountId, C46215j jVar) {
        boolean z = true;
        C58838bb.m90883r(jVar != null);
        C58838bb.m90883r(!jVar.equals(C46215j.f121154k));
        if ((jVar.f121156a & 256) == 0) {
            z = false;
        }
        C58838bb.m90883r(z);
        C45986ax axVar = new C45986ax(accountId, jVar.f121165j);
        for (C45987ay d : this.f120818a) {
            d.mo19985d(axVar);
        }
        ArrayList arrayList = this.f120819b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C45987ay) arrayList.get(i)).mo19985d(axVar);
        }
    }

    /* renamed from: b */
    public final void mo50130b(C46215j jVar) {
        C47558bi a = C47831fm.m85006a("onBeforeActivityAccountReady");
        try {
            String str = jVar.f121165j;
            for (C45987ay ayVar : this.f120818a) {
                if (ayVar instanceof C45991bb) {
                    ((C45991bb) ayVar).mo50135g();
                }
            }
            Iterator it = this.f120819b.iterator();
            while (it.hasNext()) {
                C45987ay ayVar2 = (C45987ay) it.next();
                if (ayVar2 instanceof C45991bb) {
                    ((C45991bb) ayVar2).mo50135g();
                }
            }
            a.close();
            return;
        } catch (Throwable th) {
            C45988az.m82167a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo50131c() {
        C47558bi a = C47831fm.m85006a("onBeforeAccountError");
        try {
            for (C45987ay ayVar : this.f120818a) {
                if (ayVar instanceof C45991bb) {
                    ((C45991bb) ayVar).mo50133e();
                }
            }
            Iterator it = this.f120819b.iterator();
            while (it.hasNext()) {
                C45987ay ayVar2 = (C45987ay) it.next();
                if (ayVar2 instanceof C45991bb) {
                    ((C45991bb) ayVar2).mo50133e();
                }
            }
            a.close();
            return;
        } catch (Throwable th) {
            C45988az.m82167a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo50132d() {
        C47558bi a = C47831fm.m85006a("onBeforeAccountLoading");
        try {
            for (C45987ay ayVar : this.f120818a) {
                if (ayVar instanceof C45991bb) {
                    ((C45991bb) ayVar).mo50134f();
                }
            }
            Iterator it = this.f120819b.iterator();
            while (it.hasNext()) {
                C45987ay ayVar2 = (C45987ay) it.next();
                if (ayVar2 instanceof C45991bb) {
                    ((C45991bb) ayVar2).mo50134f();
                }
            }
            a.close();
            return;
        } catch (Throwable th) {
            C45988az.m82167a(th, th);
        }
        throw th;
    }
}
