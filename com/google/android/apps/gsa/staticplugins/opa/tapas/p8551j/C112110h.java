package com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17001af;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j.h */
/* compiled from: PG */
public final class C112110h {

    /* renamed from: a */
    public static final C121537f f311331a = C121537f.m200840b("Tapas/OfflineSuggestions", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f311332b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.j.h");

    /* renamed from: c */
    private final C22871g f311333c;

    /* renamed from: d */
    private final C68214a f311334d;

    /* renamed from: e */
    private C60870cx f311335e = null;

    public C112110h(C22871g gVar, C68214a aVar) {
        this.f311333c = gVar;
        this.f311334d = aVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo99398a(String str) {
        String lowerCase;
        if (this.f311335e == null) {
            C112127m mVar = (C112127m) this.f311334d.mo27525b();
            C17001af afVar = mVar.f311365j;
            this.f311335e = this.f311333c.mo28209i(mVar.mo99408i("offline_tapas_suggestions"), "Build prefix map using data from MDD", C112109g.f311330a);
        }
        lowerCase = str.toLowerCase(Locale.getDefault());
        return this.f311333c.mo28209i(this.f311335e, "Suggest queries", new C112108f(lowerCase.substring(0, Math.min(lowerCase.length(), 4))));
    }
}
