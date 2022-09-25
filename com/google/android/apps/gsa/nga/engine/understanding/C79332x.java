package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.x */
/* compiled from: PG */
final class C79332x implements C79162t {

    /* renamed from: a */
    public final C89849ae f217842a;

    /* renamed from: b */
    public final C89849ae f217843b;

    /* renamed from: c */
    public final C89849ae f217844c;

    /* renamed from: d */
    public final C79863k f217845d;

    /* renamed from: e */
    private final C22871g f217846e;

    /* renamed from: f */
    private final C79162t f217847f;

    /* renamed from: g */
    private final C89849ae f217848g;

    /* renamed from: h */
    private final C21370a f217849h;

    public C79332x(C79162t tVar, C89849ae aeVar, C89849ae aeVar2, C89849ae aeVar3, C89849ae aeVar4, C22871g gVar, C79863k kVar, C21370a aVar) {
        this.f217847f = tVar;
        this.f217848g = aeVar;
        this.f217842a = aeVar2;
        this.f217843b = aeVar3;
        this.f217844c = aeVar4;
        this.f217846e = gVar;
        this.f217845d = kVar;
        this.f217849h = aVar;
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return this.f217847f.mo73713a();
    }

    /* renamed from: b */
    public final C60870cx mo73714b(String str, List list, C74965n nVar, C74945h hVar) {
        C90762bf bfVar = new C90762bf(this.f217849h);
        String str2 = nVar.mo71336k().f227135b;
        this.f217845d.mo74237c(this.f217848g, nVar.mo71336k());
        C60870cx b = this.f217847f.mo73714b(str, list, nVar, hVar);
        this.f217846e.mo28211k(b, "[NGA] LoggingIntentGenerator.generate", new C79331w(this, nVar, bfVar));
        return b;
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        return this.f217847f.mo73715c();
    }
}
