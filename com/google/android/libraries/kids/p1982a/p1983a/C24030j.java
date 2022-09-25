package com.google.android.libraries.kids.p1982a.p1983a;

import com.google.android.gms.auth.C142915o;
import com.google.android.libraries.kids.p1982a.p1984b.C24032a;
import com.google.android.p10905k.C146602a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

@Deprecated
/* renamed from: com.google.android.libraries.kids.a.a.j */
/* compiled from: PG */
public final class C24030j {

    /* renamed from: a */
    public static final C59071e f65665a = C59071e.m91332i("com.google.android.libraries.kids.a.a.j");

    /* renamed from: b */
    public static final String f65666b = C146602a.m238836a("usm");

    /* renamed from: c */
    public static final String f65667c = C146602a.m238836a("uca");

    /* renamed from: d */
    public static final String f65668d = C146602a.m238836a("hgp");

    /* renamed from: e */
    public final C47117b f65669e;

    /* renamed from: f */
    public final C142915o f65670f;

    /* renamed from: g */
    private final C46128f f65671g;

    /* renamed from: h */
    private final C60887da f65672h;

    /* renamed from: i */
    private final C58833ax f65673i;

    public C24030j(C46128f fVar, C47117b bVar, C142915o oVar, C60887da daVar, C58833ax axVar) {
        this.f65671g = fVar;
        this.f65669e = bVar;
        this.f65670f = oVar;
        this.f65672h = daVar;
        this.f65673i = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo29426a(AccountId accountId, boolean z) {
        C60870cx b = this.f65671g.mo50215b(accountId);
        C24028h hVar = new C24028h(this, z, accountId);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), C60826bg.f164896a);
        if (!this.f65673i.mo56113h()) {
            return h;
        }
        int i = C24032a.f65678a;
        return ((C24032a) this.f65673i.mo56107c()).mo29428a();
    }

    /* renamed from: b */
    public final C60870cx mo29427b(String str, String str2) {
        C24022b bVar = new C24022b(this, str2);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bVar), this.f65672h)).mo51515h(new C24023c(str), C60826bg.f164896a);
    }
}
