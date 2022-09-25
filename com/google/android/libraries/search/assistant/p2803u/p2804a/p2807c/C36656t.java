package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36626b;
import com.google.android.libraries.search.assistant.p2803u.p2804a.p2805a.C36625a;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36769c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.experiments.phenotype.C46989db;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.t */
/* compiled from: PG */
public final class C36656t implements C36626b {

    /* renamed from: a */
    public static final C59071e f95515a = C59071e.m91332i("com.google.android.libraries.search.assistant.u.a.c.t");

    /* renamed from: b */
    public final C36625a f95516b;

    /* renamed from: c */
    public final C60888db f95517c;

    /* renamed from: d */
    public final C46128f f95518d;

    /* renamed from: e */
    public final C58833ax f95519e;

    /* renamed from: f */
    public final C58833ax f95520f;

    /* renamed from: g */
    public final C121011a f95521g;

    /* renamed from: h */
    public final C46989db f95522h;

    /* renamed from: i */
    private final C46723bg f95523i;

    public C36656t(C36625a aVar, C46723bg bgVar, C60888db dbVar, C46989db dbVar2, C46128f fVar, C58833ax axVar, C58833ax axVar2, C121011a aVar2) {
        this.f95516b = aVar;
        this.f95523i = bgVar;
        this.f95517c = dbVar;
        this.f95522h = dbVar2;
        this.f95518d = fVar;
        this.f95519e = axVar;
        this.f95520f = axVar2;
        this.f95521g = aVar2;
    }

    /* renamed from: a */
    public final C46689ag mo40288a(Bundle bundle, boolean z) {
        C60870cx f = this.f95516b.mo40267f();
        C60870cx b = this.f95516b.mo40263b(bundle, z);
        return new C46719bc(this.f95523i, new C36646j(C47638k.m84751b(f, b).mo51520a(new C36645i(f, b), C60826bg.f164896a)), "SUW_DATA_SOURCE_KEY");
    }

    /* renamed from: b */
    public final C46689ag mo40289b(AccountId accountId, C36769c cVar) {
        return new C46719bc(this.f95523i, new C36655s(this, accountId, cVar), "SUW_DATA_SOURCE_KEY");
    }

    /* renamed from: c */
    public final C60870cx mo40290c() {
        return this.f95516b.mo40268g();
    }

    /* renamed from: d */
    public final void mo40291d(int i) {
        this.f95516b.mo40260A(i);
    }

    /* renamed from: e */
    public final void mo40292e(boolean z) {
        this.f95516b.mo40261B(z);
    }
}
