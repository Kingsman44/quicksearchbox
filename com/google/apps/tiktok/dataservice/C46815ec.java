package com.google.apps.tiktok.dataservice;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46424ak;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.dataservice.ec */
/* compiled from: PG */
public final class C46815ec {

    /* renamed from: a */
    public final C21370a f122190a;

    /* renamed from: b */
    public final C46785db f122191b;

    /* renamed from: c */
    public final C46427an f122192c;

    /* renamed from: d */
    public final Executor f122193d;

    /* renamed from: e */
    public C46784da f122194e;

    /* renamed from: f */
    public final AtomicReference f122195f = new AtomicReference((Object) null);

    /* renamed from: g */
    public C46790dg f122196g;

    /* renamed from: h */
    public C46789df f122197h;

    /* renamed from: i */
    public C46794dj f122198i;

    /* renamed from: j */
    public final C46424ak f122199j;

    /* renamed from: k */
    public final C46424ak f122200k;

    public C46815ec(C46689ag agVar, C21370a aVar, C46785db dbVar, C46427an anVar, Executor executor) {
        C46792di diVar = C46794dj.f122160a;
        C58836b bVar = C58836b.f156633a;
        this.f122198i = new C46684ab(0, diVar, false, bVar, bVar);
        this.f122199j = new C46424ak(2, C46808dw.f122182a);
        this.f122200k = new C46424ak(1, C46809dx.f122183a);
        this.f122190a = aVar;
        this.f122191b = dbVar;
        this.f122192c = anVar;
        C46689ag agVar2 = agVar;
        C46886z zVar = new C46886z(agVar2, C46693ak.f121980a, 0, 1, new C46683aa(agVar, Long.MIN_VALUE, C46763cg.m83309b(), C46769cm.m83317b(), 0, Long.MIN_VALUE));
        this.f122197h = zVar;
        C46886z zVar2 = zVar;
        this.f122196g = zVar.f122331d;
        this.f122193d = executor;
    }

    /* renamed from: d */
    public static void m83391d(C46685ac acVar) {
        C47558bi a = C47831fm.m85006a("BackgroundCallbacks.onBackgroundFetch");
        try {
            acVar.mo50733d();
            a.close();
            return;
        } catch (Throwable th) {
            C46802dq.m83388a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public static void m83392e(C46685ac acVar) {
        C47558bi a = C47831fm.m85006a("BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            acVar.mo50735f();
            a.close();
            return;
        } catch (Throwable th) {
            C46802dq.m83388a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public static C46794dj m83393h(C46794dj djVar, C46768cl clVar) {
        C46794dj djVar2;
        C58833ax axVar;
        C58833ax axVar2;
        C46765ci a;
        if (djVar.mo50727c().mo56113h() && djVar.mo50727c().mo56107c() == clVar) {
            axVar2 = C58836b.f156633a;
            djVar2 = djVar.mo50807f(clVar);
            axVar = axVar2;
        } else if (!djVar.mo50727c().mo56113h() && djVar.mo50728d().mo56113h() && djVar.mo50728d().mo56107c() == clVar) {
            axVar2 = C58833ax.m90834k(((C46768cl) djVar.mo50728d().mo56107c()).mo50778a().mo50739f());
            axVar = C58836b.f156633a;
            djVar2 = djVar.mo50807f((C46768cl) djVar.mo50728d().mo56107c());
        } else if (!djVar.mo50727c().mo56113h() || !((C46768cl) djVar.mo50727c().mo56107c()).mo50778a().mo50739f().equals(clVar.mo50778a().mo50739f())) {
            axVar2 = C58833ax.m90834k(clVar.mo50778a().mo50739f());
            axVar = djVar.mo50728d();
            djVar2 = djVar.mo50807f(clVar);
        } else {
            axVar2 = C58836b.f156633a;
            axVar = C58833ax.m90834k(clVar);
            djVar2 = djVar;
        }
        if (axVar2.mo56113h()) {
            C47558bi a2 = C47831fm.m85006a("SubscriptionCallbacks.onNewData");
            try {
                a = C46766cj.m83311a();
                djVar.mo50726b().mo18078b(clVar.mo50778a().mo50739f());
                a.close();
                a2.close();
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    C46802dq.m83388a(th, th2);
                }
                throw th;
            }
        }
        if (axVar.mo56113h()) {
            ((C46768cl) axVar.mo56107c()).mo50780c();
        }
        return djVar2;
        throw th;
    }

    /* renamed from: a */
    public final void mo50819a(C46790dg dgVar, C46768cl clVar) {
        C58838bb.m90883r(clVar.mo50778a().f121977b.f121974b);
        this.f122198i = m83393h(this.f122198i, clVar);
        this.f122196g = dgVar;
    }

    /* renamed from: b */
    public final void mo50820b(C46790dg dgVar) {
        C46765ci a;
        C19559g.m37304c();
        if (!this.f122198i.mo50728d().mo56113h()) {
            C46792di b = this.f122198i.mo50726b();
            C47558bi a2 = C47831fm.m85006a("SubscriptionCallbacks.onPending");
            try {
                a = C46766cj.m83311a();
                b.mo18079c();
                a.close();
                a2.close();
            } catch (Throwable th) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    C46802dq.m83388a(th, th2);
                }
                throw th;
            }
        } else if ((this.f122198i.mo50726b() instanceof C46685ac) && this.f122199j.mo50398b() && !this.f122198i.mo50729e()) {
            C46794dj g = this.f122198i.mo50808g(true);
            this.f122198i = g;
            m83391d((C46685ac) g.mo50726b());
        }
        C46683aa aaVar = (C46683aa) dgVar;
        C46689ag agVar = aaVar.f121961a;
        long j = aaVar.f121962b;
        C46879s sVar = (C46879s) aaVar.f121963c;
        C58838bb.m90884s(sVar.f122317a != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        C46683aa aaVar2 = new C46683aa(agVar, j, new C46879s(sVar.f122317a + 1), aaVar.f121964d, aaVar.f121965e, aaVar.f121966f);
        C46689ag agVar2 = aaVar2.f121961a;
        C47558bi a3 = C47831fm.m85006a("DataSource fetchAndStoreData()");
        try {
            C60870cx b2 = agVar2.mo18087b();
            a3.mo51417a(b2);
            C46762cf cfVar = new C46762cf(b2);
            a3.close();
            this.f122199j.mo50400d(cfVar);
            cfVar.f122116a.mo4106b(C47810es.m84977q(new C46810dy(this, aaVar2, cfVar)), C60826bg.f164896a);
            return;
        } catch (Throwable th3) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th3});
            } catch (Exception unused) {
            }
        }
        throw th;
        throw th;
    }

    /* renamed from: c */
    public final void mo50821c(C46790dg dgVar) {
        C19559g.m37304c();
        C46683aa aaVar = (C46683aa) dgVar;
        C46689ag agVar = aaVar.f121961a;
        long j = aaVar.f121962b;
        C46763cg cgVar = aaVar.f121963c;
        C46880t tVar = (C46880t) aaVar.f121964d;
        C58838bb.m90884s(tVar.f122318a != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        C46683aa aaVar2 = new C46683aa(agVar, j, cgVar, new C46880t(tVar.f122318a + 1), aaVar.f121965e + 1, aaVar.f121966f);
        C46689ag agVar2 = aaVar2.f121961a;
        C47558bi a = C47831fm.m85006a("DataSource loadData()");
        try {
            C60817ay ayVar = agVar2.mo18086a().f121591a;
            a.mo51417a(ayVar.mo57276h());
            C46768cl clVar = new C46768cl(new C46463o(ayVar));
            a.close();
            this.f122200k.mo50400d(clVar);
            clVar.mo50779b().mo4106b(C47810es.m84977q(new C46803dr(this, aaVar2, clVar)), C60826bg.f164896a);
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo50822f(Throwable th) {
        C46765ci a;
        if (!this.f122198i.mo50728d().mo56113h()) {
            C46792di b = this.f122198i.mo50726b();
            C47558bi a2 = C47831fm.m85006a("SubscriptionCallbacks.onError");
            try {
                a = C46766cj.m83311a();
                b.mo18077a(th);
                a.close();
                a2.close();
            } catch (Throwable th2) {
                try {
                    a2.close();
                } catch (Throwable th3) {
                    C46802dq.m83388a(th2, th3);
                }
                throw th2;
            }
        } else if (this.f122198i.mo50726b() instanceof C46791dh) {
            C46791dh dhVar = (C46791dh) this.f122198i.mo50726b();
            C47558bi a3 = C47831fm.m85006a("RefreshCallbacks.onRefreshError");
            try {
                dhVar.mo50806a();
                a3.close();
            } catch (Throwable th4) {
                C46802dq.m83388a(th, th4);
            }
        }
        if (this.f122198i.mo50729e() && mo50823g()) {
            C46685ac acVar = (C46685ac) this.f122198i.mo50726b();
            C47558bi a4 = C47831fm.m85006a("BackgroundCallbacks.onBackgroundFetchError");
            try {
                acVar.mo50734e(th);
                a4.close();
                this.f122198i = this.f122198i.mo50808g(false);
                return;
            } catch (Throwable th5) {
                C46802dq.m83388a(th, th5);
            }
        } else {
            return;
        }
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: g */
    public final boolean mo50823g() {
        if (!(this.f122198i.mo50726b() instanceof C46685ac) || !this.f122199j.mo50398b() || !this.f122200k.mo50398b()) {
            return false;
        }
        C58838bb.m90883r(this.f122198i.mo50729e());
        return true;
    }
}
