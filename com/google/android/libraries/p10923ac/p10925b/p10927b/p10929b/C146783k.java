package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import android.accounts.Account;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21495d;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146823b;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146824c;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147248e;
import com.google.common.base.C58827ar;
import com.google.common.p4552o.p4566l.C60156bu;
import com.google.common.p4552o.p4566l.C60157bv;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4651h.p4652a.C61644a;
import com.google.p4651h.p4652a.C61647d;
import dagger.C68214a;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import p5488io.grpc.C70769g;
import p5488io.grpc.p5520a.C70136d;

/* renamed from: com.google.android.libraries.ac.b.b.b.k */
/* compiled from: PG */
public final class C146783k implements C146773a {

    /* renamed from: a */
    public final C68214a f396327a;

    /* renamed from: b */
    public final C68214a f396328b;

    /* renamed from: c */
    private final Executor f396329c;

    /* renamed from: d */
    private final C147248e f396330d;

    public C146783k(Executor executor, C147248e eVar, C68214a aVar, C68214a aVar2) {
        this.f396329c = executor;
        this.f396330d = eVar;
        this.f396327a = aVar;
        this.f396328b = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo123629a(Account account, List list) {
        C60870cx cxVar;
        C60156bu buVar = (C60156bu) C60157bv.f162741c.createBuilder();
        String concat = "oauth2:https://www.googleapis.com/auth/mdh ".concat(C58827ar.m90818c(' ').mo56097d(list));
        try {
            cxVar = C60856cj.m92900i(this.f396330d.f397488a.mo26966b(account.name, concat));
        } catch (C21495d e) {
            cxVar = C60856cj.m92899h(new C146824c(e));
        } catch (C21489a e2) {
            cxVar = C60856cj.m92899h(new C146823b(e2));
        } catch (IOException e3) {
            cxVar = C60856cj.m92899h(e3);
        }
        return C60846c.m92879h(C60922j.m93044g(cxVar, new C146781i(this, buVar), this.f396329c), Exception.class, new C146782j(this, buVar, concat), this.f396329c);
    }

    /* renamed from: b */
    public final C60870cx mo123630b(String str) {
        try {
            this.f396330d.f397488a.mo26969e(str);
            return C60866ct.f164955a;
        } catch (IOException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C70769g mo123631c(String str) {
        return new C70136d(new C61647d(new C61644a(str, (Date) null)), C70136d.f186958b);
    }
}
