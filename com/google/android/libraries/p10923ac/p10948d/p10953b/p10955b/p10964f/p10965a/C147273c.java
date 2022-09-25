package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146849as;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146851au;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146852av;
import com.google.android.libraries.p10923ac.p10925b.p10940g.C147052a;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.a.c */
/* compiled from: PG */
public final class C147273c implements C147052a {

    /* renamed from: a */
    private final C146852av f397516a;

    /* renamed from: b */
    private final C64098p f397517b;

    /* renamed from: c */
    private final Account f397518c;

    /* renamed from: d */
    private final C147294t f397519d;

    public C147273c(C146852av avVar, C64098p pVar, Account account, C147294t tVar) {
        this.f397516a = avVar;
        this.f397517b = pVar;
        this.f397518c = account;
        this.f397519d = tVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        C146852av avVar = this.f397516a;
        C64098p pVar = this.f397517b;
        Account account = this.f397518c;
        C147294t tVar = this.f397519d;
        C146851au c = avVar.mo123764c(pVar, account);
        try {
            synchronized (c.f396416c) {
                C146849as asVar = (C146849as) c.f396416c.remove(c.f396414a.mo123759b(tVar));
                if (asVar != null) {
                    asVar.mo123761a();
                }
                z = asVar != null;
            }
            synchronized (c.f396416c) {
                c.f396417d = true ^ c.f396416c.isEmpty();
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            synchronized (c.f396416c) {
                c.f396417d = true ^ c.f396416c.isEmpty();
                throw th;
            }
        }
    }
}
