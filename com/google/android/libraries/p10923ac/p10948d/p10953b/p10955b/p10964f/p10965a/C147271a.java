package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146851au;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146852av;
import com.google.android.libraries.p10923ac.p10925b.p10940g.C147052a;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.a.a */
/* compiled from: PG */
public final class C147271a implements C147052a {

    /* renamed from: a */
    private final C146852av f397510a;

    /* renamed from: b */
    private final C64098p f397511b;

    /* renamed from: c */
    private final Account f397512c;

    /* renamed from: d */
    private final String f397513d;

    /* renamed from: e */
    private final C147294t f397514e;

    public C147271a(C146852av avVar, C64098p pVar, Account account, String str, C147294t tVar) {
        this.f397510a = avVar;
        this.f397511b = pVar;
        this.f397512c = account;
        this.f397513d = str;
        this.f397514e = tVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C146852av avVar = this.f397510a;
        C64098p pVar = this.f397511b;
        Account account = this.f397512c;
        String str = this.f397513d;
        C147294t tVar = this.f397514e;
        C146851au c = avVar.mo123764c(pVar, account);
        try {
            synchronized (c.f396416c) {
                Object b = c.f396414a.mo123759b(tVar);
                C146849as asVar = (C146849as) c.f396416c.get(b);
                if (asVar == null) {
                    c.f396416c.put(b, new C146849as(c, str, c.f396414a.mo123758a(tVar)));
                } else {
                    C58838bb.m90868c(str.equals(asVar.f396408a));
                    throw null;
                }
            }
            synchronized (c.f396416c) {
                c.f396417d = !c.f396416c.isEmpty();
            }
            c.mo123763a();
            return null;
        } catch (Throwable th) {
            synchronized (c.f396416c) {
                c.f396417d = !c.f396416c.isEmpty();
                throw th;
            }
        }
    }
}
