package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97928r;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.g.ai */
/* compiled from: PG */
public final class C140133ai {

    /* renamed from: a */
    public static final C59071e f380785a = C59071e.m91332i("com.google.android.apps.search.podcasts.b.g.ai");

    /* renamed from: b */
    public final C46778cv f380786b;

    /* renamed from: c */
    public final C139997j f380787c;

    /* renamed from: d */
    public final C140129ae f380788d;

    /* renamed from: e */
    public final C46423aj f380789e = new C46423aj(new C140146j(this), C60826bg.f164896a);

    /* renamed from: f */
    public final C140385d f380790f;

    /* renamed from: g */
    public final C58833ax f380791g;

    /* renamed from: h */
    private final Executor f380792h;

    public C140133ai(Executor executor, C46778cv cvVar, C140962c cVar, C140055e eVar, C21370a aVar, C140385d dVar, C139997j jVar, C58833ax axVar) {
        this.f380790f = dVar;
        this.f380786b = cvVar;
        this.f380792h = new C60904dr(executor);
        this.f380787c = jVar;
        this.f380791g = axVar;
        this.f380788d = new C140129ae(eVar, cVar.mo116046b(), aVar);
    }

    /* renamed from: a */
    public static C97929s m227789a(C140646b bVar) {
        C97928r rVar = (C97928r) C97929s.f273451r.createBuilder();
        String str = bVar.f381996b;
        rVar.copyOnWrite();
        C97929s sVar = (C97929s) rVar.instance;
        str.getClass();
        int i = 1;
        sVar.f273453a |= 1;
        sVar.f273454b = str;
        String str2 = bVar.f382001g;
        rVar.copyOnWrite();
        C97929s sVar2 = (C97929s) rVar.instance;
        str2.getClass();
        sVar2.f273453a |= 2;
        sVar2.f273455c = str2;
        String str3 = bVar.f381995a;
        rVar.copyOnWrite();
        C97929s sVar3 = (C97929s) rVar.instance;
        str3.getClass();
        sVar3.f273453a |= 4;
        sVar3.f273456d = str3;
        String str4 = bVar.f381998d;
        rVar.copyOnWrite();
        C97929s sVar4 = (C97929s) rVar.instance;
        str4.getClass();
        sVar4.f273453a |= 8;
        sVar4.f273457e = str4;
        String str5 = bVar.f381997c;
        rVar.copyOnWrite();
        C97929s sVar5 = (C97929s) rVar.instance;
        str5.getClass();
        sVar5.f273453a |= 16;
        sVar5.f273458f = str5;
        String str6 = bVar.f382006l;
        rVar.copyOnWrite();
        C97929s sVar6 = (C97929s) rVar.instance;
        str6.getClass();
        sVar6.f273453a |= 32;
        sVar6.f273459g = str6;
        String str7 = bVar.f382000f;
        rVar.copyOnWrite();
        C97929s sVar7 = (C97929s) rVar.instance;
        str7.getClass();
        sVar7.f273453a |= 128;
        sVar7.f273460h = str7;
        if (true == bVar.f382005k) {
            i = 2;
        }
        rVar.copyOnWrite();
        C97929s sVar8 = (C97929s) rVar.instance;
        sVar8.f273461i = i - 1;
        sVar8.f273453a |= 256;
        return (C97929s) rVar.build();
    }

    /* renamed from: b */
    public final C60870cx mo115471b(C140646b bVar) {
        return mo115474e(new C140124a(this, bVar));
    }

    /* renamed from: c */
    public final C60870cx mo115472c() {
        return C47633f.m84733g(this.f380789e.mo50395b()).mo51515h(C140140d.f380798a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo115473d() {
        return C47633f.m84733g(this.f380789e.mo50395b()).mo51516i(new C140141e(this), this.f380792h).mo51516i(new C140142f(this), this.f380792h).mo51516i(new C140143g(this), this.f380792h);
    }

    /* renamed from: e */
    public final C60870cx mo115474e(Consumer consumer) {
        C60870cx b = this.f380789e.mo50395b();
        C140153q qVar = new C140153q(consumer);
        return C60922j.m93045h(b, C47810es.m84966f(qVar), this.f380792h);
    }

    /* renamed from: f */
    public final void mo115475f() {
        C46459k.m82829b(mo115473d(), "Failed background favorites sync.", new Object[0]);
    }

    /* renamed from: g */
    public final void mo115476g() {
        if (this.f380791g.mo56113h()) {
            C60870cx b = this.f380789e.mo50395b();
            C140159w wVar = new C140159w(this);
            C60856cj.m92911t(b, C47810es.m84974n(wVar), this.f380792h);
        }
    }

    /* renamed from: h */
    public final void mo115477h(C140641b bVar) {
        C46459k.m82829b(mo115474e(new C140147k(this, bVar)), "Failed to update last viewed episode publication time.", new Object[0]);
    }
}
