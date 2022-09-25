package com.google.android.libraries.p10923ac.p10925b.p10944k;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146791d;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.k.i */
/* compiled from: PG */
public final class C147149i implements C146791d {

    /* renamed from: a */
    private final C68214a f397273a;

    /* renamed from: b */
    private final C147136ak f397274b;

    /* renamed from: c */
    private final C68214a f397275c;

    public C147149i(C68214a aVar, C147136ak akVar, C68214a aVar2) {
        this.f397273a = aVar;
        this.f397274b = akVar;
        this.f397275c = aVar2;
    }

    /* renamed from: a */
    public final void mo123635a(String str, C64098p pVar, Account account) {
        try {
            this.f397274b.mo123968d(str, pVar, account);
        } catch (C147075at e) {
            ((C147256m) this.f397273a.mo27525b()).mo124063f("Read notify failed", e, new Object[0]);
            C147244a aVar = (C147244a) this.f397275c.mo27525b();
        }
    }

    /* renamed from: b */
    public final void mo123636b(C64098p pVar, Account account) {
    }
}
