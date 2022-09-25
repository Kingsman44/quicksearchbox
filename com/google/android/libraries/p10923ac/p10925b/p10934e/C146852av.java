package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146791d;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147104a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147115l;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.e.av */
/* compiled from: PG */
public final class C146852av implements C147115l, C146791d {

    /* renamed from: a */
    private final C146843am f396424a;

    /* renamed from: b */
    private final C58839bc f396425b;

    /* renamed from: c */
    private final Map f396426c = new HashMap();

    public C146852av(C146843am amVar, C58839bc bcVar) {
        this.f396424a = amVar;
        this.f396425b = bcVar;
    }

    /* renamed from: a */
    public final void mo123635a(String str, C64098p pVar, Account account) {
    }

    /* renamed from: b */
    public final void mo123636b(C64098p pVar, Account account) {
        if (this.f396425b.mo5941a(pVar)) {
            mo123764c(pVar, account).mo123763a();
        }
    }

    /* renamed from: c */
    public final C146851au mo123764c(C64098p pVar, Account account) {
        C146851au auVar;
        C58838bb.m90868c(this.f396425b.mo5941a(pVar));
        C146772b bVar = new C146772b(account, pVar);
        synchronized (this.f396426c) {
            auVar = (C146851au) this.f396426c.get(bVar);
            if (auVar == null) {
                auVar = this.f396424a.mo123743a(bVar.f396302a, bVar.f396303b);
                this.f396426c.put(bVar, auVar);
            }
        }
        return auVar;
    }

    /* renamed from: d */
    public final void mo123765d(C147112i iVar, C147112i iVar2) {
        if (iVar != null) {
            C147104a aVar = (C147104a) iVar;
            C147104a aVar2 = (C147104a) iVar2;
            if (aVar.f397169e.equals(aVar2.f397169e) && aVar.f397168d.equals(aVar2.f397168d)) {
                return;
            }
        }
        C147104a aVar3 = (C147104a) iVar2;
        if (this.f396425b.mo5941a(aVar3.f397167c)) {
            mo123764c(aVar3.f397167c, aVar3.f397166b).mo123763a();
        }
    }

    /* renamed from: e */
    public final void mo123766e(C147112i iVar) {
        C147104a aVar = (C147104a) iVar;
        String str = aVar.f397165a;
        Account account = aVar.f397166b;
        C64098p pVar = aVar.f397167c;
        if (this.f396425b.mo5941a(pVar)) {
            mo123764c(pVar, account).mo123763a();
        }
    }
}
