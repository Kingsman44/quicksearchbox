package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2804a.p2805a.C36625a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.f */
/* compiled from: PG */
final class C36642f implements C36624a {

    /* renamed from: a */
    public static final C59071e f95492a = C59071e.m91332i("com.google.android.libraries.search.assistant.u.a.c.f");

    /* renamed from: b */
    public final C36625a f95493b;

    /* renamed from: c */
    private final C46723bg f95494c;

    /* renamed from: d */
    private final C46128f f95495d;

    /* renamed from: e */
    private final C60888db f95496e;

    public C36642f(C36625a aVar, C46723bg bgVar, C46128f fVar, C60888db dbVar) {
        this.f95493b = aVar;
        this.f95494c = bgVar;
        this.f95495d = fVar;
        this.f95496e = dbVar;
    }

    /* renamed from: a */
    public final C46689ag mo40237a() {
        return new C46719bc(this.f95494c, new C36641e(this), "ONBOARDING_OOBE_DATA_SOURCE_KEY");
    }

    /* renamed from: b */
    public final C60870cx mo40238b(Account account, acv acv) {
        return this.f95493b.mo40278q(account, acv);
    }

    /* renamed from: c */
    public final C60870cx mo40239c() {
        return this.f95493b.mo40262a();
    }

    /* renamed from: d */
    public final C60870cx mo40240d() {
        return this.f95493b.mo40265d();
    }

    /* renamed from: e */
    public final C60870cx mo40241e() {
        return this.f95493b.mo40266e();
    }

    /* renamed from: f */
    public final C60870cx mo40242f() {
        return this.f95493b.mo40269h();
    }

    /* renamed from: g */
    public final C60870cx mo40243g() {
        return this.f95493b.mo40270i();
    }

    /* renamed from: h */
    public final C60870cx mo40244h(Account account) {
        return this.f95493b.mo40271j(account);
    }

    /* renamed from: i */
    public final C60870cx mo40245i(Account account) {
        return this.f95493b.mo40272k(account);
    }

    /* renamed from: j */
    public final C60870cx mo40246j(Account account) {
        return this.f95493b.mo40273l(account);
    }

    /* renamed from: k */
    public final C60870cx mo40247k(e eVar) {
        return this.f95493b.mo40274m(eVar);
    }

    /* renamed from: l */
    public final C60870cx mo40248l(AccountId accountId) {
        C60870cx a = this.f95495d.mo50214a(accountId);
        C36625a aVar = this.f95493b;
        Objects.requireNonNull(aVar);
        C36637a aVar2 = new C36637a(aVar);
        return C60922j.m93045h(a, C47810es.m84966f(aVar2), C60826bg.f164896a);
    }

    /* renamed from: m */
    public final C60870cx mo40249m(Account account) {
        return this.f95493b.mo40276o(account);
    }

    /* renamed from: n */
    public final C60870cx mo40250n(Account account) {
        return this.f95493b.mo40277p(account);
    }

    /* renamed from: o */
    public final C60870cx mo40251o(C9855w wVar) {
        return this.f95493b.mo40281t(wVar);
    }

    /* renamed from: p */
    public final C60870cx mo40252p(int i) {
        return this.f95493b.mo40282u(i);
    }

    /* renamed from: q */
    public final C60870cx mo40253q(boolean z) {
        return this.f95493b.mo40283v(z);
    }

    /* renamed from: r */
    public final C60870cx mo40254r(Account account, acx acx) {
        return this.f95493b.mo40279r(account, acx);
    }

    /* renamed from: s */
    public final C60870cx mo40255s(AccountId accountId, acx acx) {
        C60870cx a = this.f95495d.mo50214a(accountId);
        C36638b bVar = new C36638b(this, acx);
        return C60922j.m93045h(a, C47810es.m84966f(bVar), C60826bg.f164896a);
    }

    /* renamed from: t */
    public final C60870cx mo40256t(C58817ah ahVar, Executor executor) {
        return this.f95493b.mo40285x(ahVar, executor);
    }

    /* renamed from: u */
    public final void mo40257u() {
        this.f95493b.mo40287z();
    }

    /* renamed from: v */
    public final C60870cx mo40258v() {
        return this.f95493b.mo40286y();
    }

    /* renamed from: w */
    public final C60870cx mo40259w() {
        C60870cx c = this.f95493b.mo40264c();
        C36639c cVar = new C36639c();
        return C60922j.m93044g(c, C47810es.m84963c(cVar), this.f95496e);
    }
}
