package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import android.accounts.Account;
import android.app.KeyguardManager;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2804a.p2806b.C36635i;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.m */
/* compiled from: PG */
public final class C36670m implements C36657a {

    /* renamed from: a */
    public static final C46690ah f95550a = new C46885y("OnboardingTriggerManager.OobeFragmentsInfo");

    /* renamed from: b */
    public final C36635i f95551b;

    /* renamed from: c */
    public final C36624a f95552c;

    /* renamed from: d */
    private final C69464a f95553d;

    /* renamed from: e */
    private final C46175b f95554e;

    /* renamed from: f */
    private final C46128f f95555f;

    /* renamed from: g */
    private final KeyguardManager f95556g;

    public C36670m(C69464a aVar, C46175b bVar, C46128f fVar, C36624a aVar2, C36635i iVar, KeyguardManager keyguardManager) {
        this.f95553d = aVar;
        this.f95554e = bVar;
        this.f95555f = fVar;
        this.f95552c = aVar2;
        this.f95551b = iVar;
        this.f95556g = keyguardManager;
    }

    /* renamed from: j */
    private final C60870cx m65254j() {
        C60870cx c = this.f95554e.mo50246c((AccountId) this.f95553d.mo17428b());
        C36666i iVar = C36666i.f95543a;
        return C60922j.m93044g(c, C47810es.m84963c(iVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo40298a(Account account) {
        C60870cx b = this.f95551b.mo40294b("consent_disclosures_screen_interaction_count_key");
        C60870cx h = this.f95552c.mo40244h(account);
        return C47638k.m84751b(h, b).mo51520a(new C36664g(h, b), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo40299b(Account account) {
        C60870cx b = this.f95551b.mo40294b("udc_consent_screen_interaction_count_key");
        C60870cx j = this.f95552c.mo40246j(account);
        C60870cx i = this.f95552c.mo40245i(account);
        return C47638k.m84751b(j, i, b).mo51520a(new C36667j(j, i, b), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C46851e mo40300c(int i) {
        return new C36669l(this, i);
    }

    /* renamed from: d */
    public final C60870cx mo40301d(int i) {
        C60870cx i2 = mo40313i(i);
        C36660c cVar = C36660c.f95531a;
        return C60922j.m93044g(i2, C47810es.m84963c(cVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo40302e() {
        if (this.f95556g.isDeviceLocked()) {
            return C60856cj.m92900i(Boolean.FALSE);
        }
        C60870cx j = m65254j();
        C36668k kVar = new C36668k(this);
        return C60922j.m93045h(j, C47810es.m84966f(kVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo40310f() {
        C60870cx b = this.f95551b.mo40294b("get_more_screen_interaction_count_key");
        C60870cx c = this.f95552c.mo40239c();
        C60870cx f = this.f95552c.mo40242f();
        C60870cx g = this.f95552c.mo40243g();
        C60870cx a = C47638k.m84751b(f, g).mo51520a(new C36658a(f, g), C60826bg.f164896a);
        return C47638k.m84751b(b, c, a).mo51520a(new C36662e(b, c, a), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo40311g() {
        C60870cx a = this.f95555f.mo50214a((AccountId) this.f95553d.mo17428b());
        C36661d dVar = new C36661d(this);
        return C60922j.m93045h(a, C47810es.m84966f(dVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final C60870cx mo40312h() {
        return this.f95552c.mo40241e();
    }

    /* renamed from: i */
    public final C60870cx mo40313i(int i) {
        C60870cx j = m65254j();
        C60870cx g = mo40311g();
        C60870cx h = mo40312h();
        C60870cx f = mo40310f();
        return C47638k.m84751b(j, g, h, f).mo51520a(new C36659b(j, g, h, f, i), C60826bg.f164896a);
    }
}
