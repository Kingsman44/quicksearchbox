package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import com.google.android.apps.search.googleapp.googleappbrowser.p10269f.C135587c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44074i;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.ae */
/* compiled from: PG */
public final class C135531ae implements C135543c {

    /* renamed from: a */
    public static final C46690ah f369206a = new C46885y("googleapp_browser_firstrun_datasource_key");

    /* renamed from: b */
    public final C42876ab f369207b;

    /* renamed from: c */
    public final C71422aw f369208c;

    /* renamed from: d */
    public final C69585o f369209d;

    /* renamed from: e */
    public final C44074i f369210e;

    /* renamed from: f */
    public final C44070e f369211f;

    /* renamed from: g */
    public final C46778cv f369212g;

    /* renamed from: h */
    public final C135587c f369213h;

    /* renamed from: i */
    private final Optional f369214i;

    /* renamed from: j */
    private final C46180e f369215j;

    public C135531ae(C42876ab abVar, C71422aw awVar, C69585o oVar, Optional optional, C46180e eVar, C44074i iVar, C44070e eVar2, C46778cv cvVar, C135587c cVar) {
        C69664n.m101061g(abVar, "firstRunDataStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(optional, "firstRunDataInitializerOptional");
        C69664n.m101061g(eVar2, "profileManagerFactory");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f369207b = abVar;
        this.f369208c = awVar;
        this.f369209d = oVar;
        this.f369214i = optional;
        this.f369215j = eVar;
        this.f369210e = iVar;
        this.f369211f = eVar2;
        this.f369212g = cvVar;
        this.f369213h = cVar;
        optional.ifPresent(new C135548h(this));
    }

    /* renamed from: a */
    public final C46851e mo112384a() {
        return new C135555o(this);
    }

    /* renamed from: b */
    public final C60870cx mo112385b() {
        return mo112387d(C135554n.f369248a);
    }

    /* renamed from: c */
    public final C60870cx mo112386c() {
        return mo112387d(C135556p.f369250a);
    }

    /* renamed from: d */
    public final C60870cx mo112387d(Predicate predicate) {
        C60870cx a = this.f369215j.mo50251a();
        C135558r rVar = new C135558r(this, predicate);
        return C60922j.m93045h(a, C47810es.m84966f(rVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final Object mo112388e(C69577g gVar) {
        return C71423ax.m104196a(new C135530ad(this, (C69577g) null), gVar);
    }
}
