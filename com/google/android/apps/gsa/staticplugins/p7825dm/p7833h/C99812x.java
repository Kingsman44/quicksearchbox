package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6519al.p6684cz.C85271b;
import com.google.android.apps.gsa.search.core.p6519al.p6684cz.C85272c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90079ed;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.search.googleapp.compliance.p10146c.C133623a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.android.libraries.search.location.p3029a.C38628bt;
import com.google.android.libraries.search.location.p3029a.C38631bw;
import com.google.android.libraries.search.location.p3029a.C38632bx;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.x */
/* compiled from: PG */
public final class C99812x extends C86734a implements C85272c {

    /* renamed from: a */
    public static final C59071e f279225a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.h.x");

    /* renamed from: b */
    public final ProxyIntentStarter f279226b;

    /* renamed from: c */
    public final C22871g f279227c;

    /* renamed from: f */
    public final C22871g f279228f;

    /* renamed from: g */
    public final Context f279229g;

    /* renamed from: h */
    public final C133623a f279230h;

    /* renamed from: i */
    public final C90021c f279231i;

    /* renamed from: j */
    private final C85881bd f279232j;

    /* renamed from: k */
    private final C74637ae f279233k;

    /* renamed from: l */
    private final C86034c f279234l;

    public C99812x(C85881bd bdVar, C74637ae aeVar, ProxyIntentStarter proxyIntentStarter, C22871g gVar, C22871g gVar2, Context context, C86034c cVar, C133623a aVar, C90021c cVar2) {
        super(C118575h.SILK_GEOLOCATION_API, "silkgeolocation");
        this.f279232j = bdVar;
        this.f279233k = aeVar;
        this.f279226b = proxyIntentStarter;
        this.f279227c = gVar;
        this.f279229g = context;
        this.f279230h = aVar;
        this.f279234l = cVar;
        this.f279228f = gVar2;
        this.f279231i = cVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78832a() {
        if (!this.f279231i.mo79746e(C90079ed.f249800a)) {
            return mo91598f();
        }
        return this.f279228f.mo28206f(this.f279228f.mo28210j(this.f279234l.mo79697b(), "Get TikTok account", new C99802n(this)), "Get location catch all", Throwable.class, C99803o.f279212a);
    }

    /* renamed from: b */
    public final C60870cx mo78833b() {
        return this.f279228f.mo28210j(this.f279234l.mo79697b(), "Get TikTok account", new C99807s(this));
    }

    /* renamed from: c */
    public final C60870cx mo78834c(int i) {
        return this.f279228f.mo28206f(this.f279228f.mo28210j(this.f279234l.mo79697b(), "Get TikTok account", new C99798j(this, i)), "Get location catch all", Throwable.class, C99799k.f279206a);
    }

    /* renamed from: e */
    public final C60870cx mo91597e(AccountId accountId) {
        Optional ia = ((C38628bt) C47245e.m84045a(this.f279229g, C38628bt.class, accountId)).mo41526ia();
        if (!ia.isEmpty()) {
            return this.f279228f.mo28210j(((C38627bs) ia.get()).mo41509e(), "Check if user consented to share geolocation data.", new C99809u(this));
        }
        ((C59052c) ((C59052c) f279225a.mo56226d()).mo56372aa(32890)).mo56386p("Couldn't get user consent data, automatically set as declined.");
        return C60856cj.m92899h(new C85271b());
    }

    /* renamed from: f */
    public final C60870cx mo91598f() {
        if (!this.f279232j.mo79514e(false) || !this.f279232j.mo79513d(false)) {
            return C60856cj.m92899h(new C85271b());
        }
        return C60922j.m93045h(this.f279233k.mo71022f(Duration.ofDays(7).toMillis(), C39226b.TAG_CLASSIC_SERVICES_SILK_LO), C99797i.f279203a, C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo91599g(AccountId accountId) {
        return C2169h.m6027a(new C99808t(this, accountId));
    }

    /* renamed from: h */
    public final C60870cx mo91600h(AccountId accountId, int i) {
        Optional ia = ((C38628bt) C47245e.m84045a(this.f279229g, C38628bt.class, accountId)).mo41526ia();
        C38631bw bwVar = (C38631bw) C38632bx.f102079c.createBuilder();
        bwVar.copyOnWrite();
        C38632bx bxVar = (C38632bx) bwVar.instance;
        bxVar.f102082b = i - 1;
        bxVar.f102081a |= 1;
        C38632bx bxVar2 = (C38632bx) bwVar.build();
        if (ia.isPresent()) {
            return ((C38627bs) ia.get()).mo41514j(bxVar2);
        }
        return C60856cj.m92900i(false);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
