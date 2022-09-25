package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10924a.C146762e;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146800g;
import com.google.android.libraries.p10923ac.p10925b.p10940g.C147052a;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147182p;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ac.b.j.g */
/* compiled from: PG */
public final class C147110g implements C147052a {

    /* renamed from: a */
    private final C146800g f397198a;

    /* renamed from: b */
    private final C147116m f397199b;

    /* renamed from: c */
    private final String f397200c;

    /* renamed from: d */
    private final Account f397201d;

    /* renamed from: e */
    private final C64098p f397202e;

    /* renamed from: f */
    private final C64095m f397203f;

    public C147110g(C146800g gVar, C147116m mVar, String str, Account account, C64098p pVar, C64095m mVar2) {
        this.f397198a = gVar;
        this.f397199b = mVar;
        this.f397200c = str;
        this.f397201d = account;
        this.f397202e = pVar;
        this.f397203f = mVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.f397199b.mo123940h(this.f397200c, this.f397201d, this.f397202e, C147182p.m240013a(this.f397198a), this.f397203f);
            return null;
        } catch (C147113j e) {
            throw new C146762e(String.format(Locale.ENGLISH, "Failed to set/update subscription for app=%s on %s", new Object[]{this.f397200c, this.f397202e}), e);
        }
    }
}
