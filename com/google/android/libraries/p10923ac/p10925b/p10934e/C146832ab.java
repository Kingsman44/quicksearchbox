package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147138am;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147141ap;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147167a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.b.e.ab */
/* compiled from: PG */
public final class C146832ab implements C147141ap {

    /* renamed from: a */
    public final C146833ac f396400a;

    /* renamed from: b */
    public final C68214a f396401b;

    public C146832ab(C146833ac acVar) {
        this.f396400a = acVar;
        Objects.requireNonNull(acVar);
        this.f396401b = new C146995z(acVar);
    }

    /* renamed from: a */
    public final C60870cx mo123727a(C64098p pVar, Account account, boolean z, boolean z2) {
        C146833ac acVar = this.f396400a;
        acVar.getClass();
        return C60846c.m92879h(new C146986q(new C147167a(account, pVar), new C147138am(z, z2), acVar).f396859c.mo60297gq(), Exception.class, new C146831aa(this), C60826bg.f164896a);
    }
}
