package com.google.android.libraries.p10923ac.p10925b.p10944k;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146792e;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147089l;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147095r;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147096s;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.ac.b.k.e */
/* compiled from: PG */
public final class C147145e implements C147132ag {

    /* renamed from: a */
    private static final C147096s f397257a;

    /* renamed from: b */
    private final C147089l f397258b;

    /* renamed from: c */
    private final Map f397259c;

    static {
        HashSet hashSet = new HashSet();
        C147095r.m239832a(':', hashSet);
        f397257a = new C147096s('\\', hashSet);
    }

    public C147145e(C147089l lVar, Map map) {
        this.f397258b = lVar;
        this.f397259c = map;
    }

    /* renamed from: a */
    public final C147133ah mo123956a(Account account, C64098p pVar) {
        C147089l lVar = this.f397258b;
        C147096s sVar = f397257a;
        String a = sVar.mo123916a(account.type);
        String a2 = sVar.mo123916a(account.name);
        String a3 = sVar.mo123916a(((C146792e) this.f397259c.get(C64097o.m96355a(pVar.f173294a))).mo123637a(pVar));
        return new C147146f(lVar.mo123881a(a + ":" + a2 + ":" + a3));
    }
}
