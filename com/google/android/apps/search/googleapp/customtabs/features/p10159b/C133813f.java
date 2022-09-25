package com.google.android.apps.search.googleapp.customtabs.features.p10159b;

import android.net.Uri;
import com.google.android.apps.search.googleapp.customtabs.p10149a.C133672e;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133709aa;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133712ad;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.apps.search.googleapp.recents.C137177k;
import com.google.android.libraries.p1703d.C20642af;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.b.f */
/* compiled from: PG */
final class C133813f implements C133734t, C133709aa {

    /* renamed from: a */
    public final AccountId f364472a;

    /* renamed from: b */
    public final C46128f f364473b;

    /* renamed from: c */
    public final C137177k f364474c;

    /* renamed from: d */
    public final C60888db f364475d;

    /* renamed from: e */
    public final C133672e f364476e;

    /* renamed from: f */
    public final C133731q f364477f;

    /* renamed from: g */
    private final C46423aj f364478g = new C46423aj(new C133808a(this), C60826bg.f164896a);

    public C133813f(AccountId accountId, C46128f fVar, C137177k kVar, C60888db dbVar, C133672e eVar, C133731q qVar) {
        this.f364472a = accountId;
        this.f364473b = fVar;
        this.f364474c = kVar;
        this.f364475d = dbVar;
        this.f364476e = eVar;
        this.f364477f = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo111366a(int i) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo111367b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo111368c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo111369d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111370e() {
    }

    /* renamed from: f */
    public final void mo111351f(C20642af afVar) {
        C133712ad adVar = this.f364477f.mo111359b().f364211c;
        if (adVar == null) {
            adVar = C133712ad.f364202d;
        }
        C133771b bVar = adVar.f364206c;
        if (bVar == null) {
            bVar = C133771b.f364368e;
        }
        C60494rz a = C60494rz.m92598a(bVar.f364371b);
        if (a == null) {
            a = C60494rz.UNKNOWN;
        }
        C60870cx b = this.f364478g.mo50395b();
        C133809b bVar2 = new C133809b(this, afVar, a);
        C46459k.m82829b(C60922j.m93045h(b, C47810es.m84966f(bVar2), this.f364475d), "Unable to save page to Recents", new Object[0]);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo111352g(int i, Uri uri, Uri uri2) {
    }
}
