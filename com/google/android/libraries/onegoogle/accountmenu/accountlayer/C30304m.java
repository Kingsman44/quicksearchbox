package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import android.content.Context;
import com.google.android.gms.p10815k.p10816a.C144376ar;
import com.google.android.libraries.logging.p2185ve.p2199f.C28420g;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.disc.C30225y;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.accountmessages.AccountMessagesFeatureImpl;
import com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.C30537m;
import com.google.android.libraries.onegoogle.accountmenu.features.p2373g.C30615i;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.common.C30933t;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30838d;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30869ab;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.m */
/* compiled from: PG */
public abstract class C30304m {

    /* renamed from: a */
    public Context f81932a;

    /* renamed from: b */
    public ScheduledExecutorService f81933b;

    /* renamed from: a */
    public abstract C28421h mo35827a();

    /* renamed from: b */
    public abstract C30158c mo35828b();

    /* renamed from: c */
    public abstract C30305n mo35829c();

    /* renamed from: d */
    public final C30305n mo35830d() {
        C30313v vVar;
        ThreadFactory a = C30933t.m57729a();
        if (!mo35837k().mo56113h()) {
            ExecutorService executorService = this.f81933b;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool(a);
            }
            mo35842p(executorService);
        }
        if (this.f81933b == null) {
            this.f81933b = Executors.newSingleThreadScheduledExecutor(a);
        }
        if (mo35836j().mo56113h() && !mo35839m().mo56113h()) {
            Context context = this.f81932a;
            C30158c b = mo35828b();
            mo35841o(new C30225y((ExecutorService) mo35837k().mo56107c(), C30225y.m56157b(context, b, (C30830g) mo35836j().mo56107c()), b));
        } else if (!mo35839m().mo56113h() || mo35836j().mo56113h()) {
            throw new IllegalStateException("Exactly one of setAvatarRetriever and setCustomAvatarImageLoader have to be called.");
        } else {
            mo35841o((C30213m) mo35839m().mo56107c());
        }
        if (!mo35838l().mo56113h()) {
            C30295d dVar = new C30295d(mo35828b());
            C30307p pVar = new C30307p();
            pVar.f81937c = new C30297f();
            pVar.f81936b = new C30298g();
            Objects.requireNonNull(dVar);
            pVar.f81935a = new C30299h(dVar);
            mo35843q(pVar.mo35816a());
        }
        mo35831e().f81934a.f81881b = mo35832f().mo36179l();
        if (mo35832f().mo36181n().mo56113h()) {
            vVar = (C30313v) mo35840n().mo56109e(new C30313v());
            mo35846t(vVar);
            mo35847u(new C30311t(mo35833g(), vVar));
        } else {
            vVar = null;
        }
        C30313v vVar2 = vVar;
        C28421h a2 = mo35827a();
        a2.getClass();
        if (!(a2 instanceof C28420g)) {
            mo35850x(new C30869ab(mo35828b(), mo35831e(), vVar2, a2, mo35835i()));
        }
        if (mo35834h() == null) {
            mo35848v(new C30838d(this.f81932a, this.f81933b));
        }
        C30495a b2 = mo35832f().mo36169b();
        if (!mo35832f().mo36177j().mo56113h() && C30305n.m56406t(this.f81932a, new C30300i(this))) {
            Context context2 = this.f81932a;
            b2.mo36132d(C58833ax.m90834k(new C30537m(new C144376ar(context2), mo35828b())));
        }
        if (!mo35832f().mo36175h().mo56113h() && C30305n.m56406t(this.f81932a, new C30301j(this))) {
            b2.mo36130b(C58833ax.m90834k(new AccountMessagesFeatureImpl(mo35828b(), this.f81932a)));
        }
        if (C30305n.m56406t(this.f81932a, new C30302k(this))) {
            b2.mo36136h(new C30615i());
        }
        if (C30305n.m56406t(this.f81932a, new C30303l(this))) {
            b2.mo36133e(true);
        }
        mo35845s(b2.mo36129a());
        return mo35829c();
    }

    /* renamed from: e */
    public abstract C30306o mo35831e();

    /* renamed from: f */
    public abstract C30518b mo35832f();

    /* renamed from: g */
    public abstract C30860b mo35833g();

    /* renamed from: h */
    public abstract C30847m mo35834h();

    /* renamed from: i */
    public abstract C58833ax mo35835i();

    /* renamed from: j */
    public abstract C58833ax mo35836j();

    /* renamed from: k */
    public abstract C58833ax mo35837k();

    /* renamed from: l */
    public abstract C58833ax mo35838l();

    /* renamed from: m */
    public abstract C58833ax mo35839m();

    /* renamed from: n */
    public abstract C58833ax mo35840n();

    /* renamed from: o */
    public abstract void mo35841o(C30213m mVar);

    /* renamed from: p */
    public abstract void mo35842p(ExecutorService executorService);

    /* renamed from: q */
    public abstract void mo35843q(C30294c cVar);

    /* renamed from: r */
    public abstract void mo35844r(C30474o oVar);

    /* renamed from: s */
    public abstract void mo35845s(C30518b bVar);

    /* renamed from: t */
    public abstract void mo35846t(C30313v vVar);

    /* renamed from: u */
    public abstract void mo35847u(C30860b bVar);

    /* renamed from: v */
    public abstract void mo35848v(C30847m mVar);

    /* renamed from: w */
    public abstract void mo35849w(C28421h hVar);

    /* renamed from: x */
    public abstract void mo35850x(C30897z zVar);
}
