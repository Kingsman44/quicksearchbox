package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.p10939a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10937f.C147040d;
import com.google.android.libraries.p10923ac.p10925b.p10937f.C147041e;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4895aw.p4902b.C64007bq;
import com.google.protos.p4895aw.p4902b.C64008br;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.f.a.a.aa */
/* compiled from: PG */
public final class C146999aa extends C68247h {

    /* renamed from: a */
    private final C68283d f396905a;

    /* renamed from: c */
    private final C68283d f396906c;

    public C146999aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146999aa.class), aVar);
        this.f396905a = C68236af.m98549d(dVar);
        this.f396906c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        C147041e eVar = (C147041e) list.get(1);
        C147266a aVar = eVar.f397022g;
        if (!C147266a.m240143n()) {
            C64007bq bqVar = (C64007bq) C64008br.f173093c.createBuilder();
            String str = account.name;
            bqVar.copyOnWrite();
            C64008br brVar = (C64008br) bqVar.instance;
            str.getClass();
            brVar.f173095a = 1;
            brVar.f173096b = str;
            return C60856cj.m92900i((C64008br) bqVar.build());
        }
        synchronized (eVar.f397019d) {
            C64008br brVar2 = (C64008br) eVar.f397017b.get(account);
            if (brVar2 != null) {
                C60870cx i = C60856cj.m92900i(brVar2);
                return i;
            }
            C60870cx a = eVar.mo123841a();
            return C60922j.m93044g(a, new C147040d(eVar, account), eVar.f397018c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396905a.mo60297gq(), this.f396906c.mo60297gq());
    }
}
