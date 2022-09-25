package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.p6968aa.C89011ai;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.c.a.ay */
/* compiled from: PG */
final class C22226ay implements C22244bp {

    /* renamed from: a */
    public String f61362a;

    /* renamed from: b */
    private final C89020ar f61363b;

    /* renamed from: c */
    private final C68214a f61364c;

    /* renamed from: d */
    private final C22245bq f61365d;

    /* renamed from: e */
    private C89068x f61366e;

    /* renamed from: f */
    private boolean f61367f = false;

    /* renamed from: g */
    private String f61368g;

    public C22226ay(C89020ar arVar, C89068x xVar, C68214a aVar, C22245bq bqVar) {
        this.f61363b = arVar;
        this.f61366e = xVar;
        this.f61364c = aVar;
        this.f61365d = bqVar;
    }

    /* renamed from: c */
    private static void m41578c(C89021as asVar) {
        try {
            asVar.mo82997b().mo27475d();
        } catch (C89013ak | C90457d unused) {
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx apply(C89021as asVar) {
        String a;
        try {
            if (!this.f61363b.f241264m || this.f61367f || (a = asVar.mo82999g().mo83000a("X-Hallmonitor-Challenge", (String) null)) == null) {
                return C60856cj.m92900i(asVar);
            }
            this.f61367f = true;
            this.f61368g = a;
            C60870cx a2 = ((C89011ai) this.f61364c.mo27525b()).mo82983a(a);
            this.f61366e.mo27475d();
            this.f61366e = this.f61366e.mo27476e();
            m41578c(asVar);
            return C60922j.m93045h(a2, new C22225ax(this), C60826bg.f164896a);
        } catch (C90457d e) {
            m41578c(asVar);
            return C60856cj.m92900i(new C89057m(e));
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27489b() {
        C89020ar arVar;
        arVar = this.f61363b;
        String str = this.f61368g;
        String str2 = this.f61362a;
        if (!(str == null || str2 == null)) {
            C89019aq aqVar = new C89019aq(arVar, arVar.f241260i);
            aqVar.mo82993e("X-Hallmonitor-Challenge", str);
            aqVar.mo82993e("X-Hallmonitor-Response", str2);
            this.f61368g = null;
            this.f61362a = null;
            arVar = aqVar.mo82989a();
        }
        return C60922j.m93045h(this.f61365d.mo27491a(arVar, this.f61366e).mo27489b(), this, C60826bg.f164896a);
    }
}
