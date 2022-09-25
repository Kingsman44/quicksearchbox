package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.apps.search.googleapp.compliance.p10147d.C133626b;
import com.google.android.apps.search.googleapp.compliance.p10147d.C133627c;
import com.google.android.apps.search.googleapp.compliance.p10147d.C133628d;
import com.google.android.apps.search.googleapp.compliance.p10147d.C133629e;
import com.google.android.apps.search.googleapp.compliance.p10147d.C133637m;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p395al.p417d.p418a.C8538ar;
import com.google.p395al.p417d.p418a.C8539as;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.h */
/* compiled from: PG */
public final /* synthetic */ class C133557h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133567r f363879a;

    /* renamed from: b */
    public final /* synthetic */ C133569t f363880b;

    /* renamed from: c */
    public final /* synthetic */ C8539as f363881c;

    public /* synthetic */ C133557h(C133567r rVar, C133569t tVar, C8539as asVar) {
        this.f363879a = rVar;
        this.f363880b = tVar;
        this.f363881c = asVar;
    }

    public final C60870cx apply(Object obj) {
        C133567r rVar = this.f363879a;
        C133569t tVar = this.f363880b;
        C8539as asVar = this.f363881c;
        C133546ao aoVar = (C133546ao) obj;
        if (asVar.f29628c == aoVar.f363863c && asVar.f29629d == aoVar.f363864d) {
            rVar.f363906k.mo19974a(C37182a.f98087gA.mo40805c(C62722b.OK));
            return C60866ct.f164955a;
        }
        C8538ar arVar = (C8538ar) asVar.toBuilder();
        boolean z = aoVar.f363864d;
        arVar.copyOnWrite();
        C8539as asVar2 = (C8539as) arVar.instance;
        asVar2.f29626a |= 32;
        asVar2.f29629d = z;
        boolean z2 = aoVar.f363863c;
        arVar.copyOnWrite();
        C8539as asVar3 = (C8539as) arVar.instance;
        asVar3.f29626a |= 16;
        asVar3.f29628c = z2;
        C8539as asVar4 = (C8539as) arVar.build();
        C133637m mVar = rVar.f363898c;
        if (asVar4 == null || asVar4.f29627b.isEmpty()) {
            return C47633f.m84733g(C60856cj.m92899h(new C133626b("Prefs are null or contain no sig property")));
        }
        C47633f c = mVar.mo111303c();
        C44065d dVar = mVar.f364031c;
        Objects.requireNonNull(dVar);
        return c.mo51515h(new C133627c(dVar), mVar.f364030b).mo51516i(new C133628d(mVar, asVar4, tVar), mVar.f364030b).mo51516i(C133629e.f364016a, mVar.f364030b);
    }
}
