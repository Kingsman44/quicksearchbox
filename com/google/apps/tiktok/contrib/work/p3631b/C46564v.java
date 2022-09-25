package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.C4389am;
import androidx.work.C4390an;
import androidx.work.C4391ao;
import androidx.work.C4397au;
import androidx.work.C4399aw;
import androidx.work.C4634o;
import androidx.work.impl.p207b.C4470ae;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46584r;
import com.google.apps.tiktok.contrib.work.C46585s;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.contrib.work.C46588v;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.apps.tiktok.contrib.work.p3630a.C46510d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.contrib.work.b.v */
/* compiled from: PG */
public final class C46564v implements C46578l {

    /* renamed from: a */
    public final C46510d f121739a;

    /* renamed from: b */
    public final Executor f121740b;

    /* renamed from: c */
    private final Map f121741c;

    /* renamed from: d */
    private final C46588v f121742d;

    public C46564v(C46510d dVar, Map map, Executor executor, C46588v vVar) {
        this.f121739a = dVar;
        this.f121741c = map;
        this.f121740b = executor;
        this.f121742d = vVar;
    }

    /* renamed from: h */
    private static final void m82993h(C46586t tVar, C4399aw awVar) {
        C58800sl lA = tVar.mo50572h().iterator();
        while (lA.hasNext()) {
            awVar.mo9338c((String) lA.next());
        }
        if (tVar.mo50568e().mo56113h()) {
            C4389am amVar = (C4389am) tVar.mo50568e().mo56107c();
            C69664n.m101061g(amVar, "policy");
            C4470ae aeVar = awVar.f14042c;
            aeVar.f14233r = true;
            aeVar.f14234s = amVar;
        }
    }

    /* renamed from: i */
    private static final C4383ag m82994i(C46586t tVar) {
        C58838bb.m90883r(!tVar.mo50570f().mo56113h());
        C4382af afVar = new C4382af(TikTokListenableWorker.class);
        afVar.mo9339d(tVar.mo50564a());
        afVar.mo9340e(tVar.mo50567d().mo50581a(), tVar.mo50567d().mo50582b());
        afVar.mo9341f(tVar.mo50565b());
        m82993h(tVar, afVar);
        return (C4383ag) afVar.mo9337b();
    }

    /* renamed from: j */
    private static final C4391ao m82995j(C46586t tVar, C46584r rVar, C58833ax axVar) {
        C58838bb.m90883r(tVar.mo50570f().mo56113h());
        if (axVar.mo56113h()) {
            C4390an anVar = new C4390an(TikTokListenableWorker.class, rVar.mo50581a(), rVar.mo50582b(), ((C46584r) axVar.mo56107c()).mo50581a(), ((C46584r) axVar.mo56107c()).mo50582b());
            anVar.mo9339d(tVar.mo50564a());
            anVar.mo9340e(tVar.mo50567d().mo50581a(), tVar.mo50567d().mo50582b());
            anVar.mo9341f(tVar.mo50565b());
            m82993h(tVar, anVar);
            return (C4391ao) anVar.mo9337b();
        }
        C4390an anVar2 = new C4390an(TikTokListenableWorker.class, rVar.mo50581a(), rVar.mo50582b());
        m82993h(tVar, anVar2);
        anVar2.mo9339d(tVar.mo50564a());
        anVar2.mo9340e(tVar.mo50567d().mo50581a(), tVar.mo50567d().mo50582b());
        anVar2.mo9341f(tVar.mo50565b());
        return (C4391ao) anVar2.mo9337b();
    }

    /* renamed from: a */
    public final C60870cx mo50545a(String str) {
        return this.f121742d.mo50536b(this.f121739a.mo50521b(str), str);
    }

    /* renamed from: b */
    public final C60870cx mo50546b(C46586t tVar) {
        C46542ba.m82979e(tVar);
        C46586t f = mo50550f(tVar);
        return this.f121742d.mo50535a(f, mo50551g(f));
    }

    /* renamed from: c */
    public final C60870cx mo50547c(String str) {
        return C60922j.m93044g(this.f121739a.mo50525f(C4397au.m12584a(C58485gu.m89846n(str)).mo9336b()), C46557o.f121732a, this.f121740b);
    }

    /* renamed from: d */
    public final C60870cx mo50548d(String str) {
        C46510d dVar = this.f121739a;
        C58485gu n = C58485gu.m89846n(str);
        C4397au auVar = new C4397au();
        auVar.f14033b.addAll(n);
        return C60922j.m93044g(dVar.mo50525f(auVar.mo9336b()), C46561s.f121736a, this.f121740b);
    }

    /* renamed from: e */
    public final void mo50549e(UUID uuid) {
        C46588v vVar = this.f121742d;
        C60870cx c = this.f121739a.mo50522c(uuid);
        C46540az azVar = (C46540az) vVar;
        azVar.mo50538d(c, new C46537aw(c), (Set) azVar.f121696b.mo17428b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C46586t mo50550f(C46586t tVar) {
        Class i = tVar.mo50574i();
        String str = (String) this.f121741c.get(i);
        C58838bb.m90867b(str, "The input Worker wasn't annotated with @GenerateWorker. If it or any of its chained work is annotated with @GenerateAccountWorker, its work must be started with TikTokAccountWorkManager, instead. Worker class: %s", i.toString());
        return tVar.mo50591k(new C58759qy(C46542ba.m82976b(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C60870cx mo50551g(C46586t tVar) {
        C46542ba.m82978d(tVar);
        int i = 1;
        if (tVar.mo50570f().mo56113h()) {
            C58838bb.m90883r(tVar.mo50570f().mo56113h());
            if (tVar.mo50571g().mo56113h()) {
                C58838bb.m90883r(tVar.mo50570f().mo56113h());
                C58838bb.m90883r(tVar.mo50571g().mo56113h());
                C4391ao j = m82995j(tVar, ((C46583q) tVar.mo50570f().mo56107c()).mo50576a(), ((C46583q) tVar.mo50570f().mo56107c()).mo50577b());
                return C60922j.m93044g(this.f121739a.mo50524e(((C46585s) tVar.mo50571g().mo56107c()).mo50587b(), ((C46585s) tVar.mo50571g().mo56107c()).mo50586a(), j), new C46563u(j), C60826bg.f164896a);
            }
            C58838bb.m90883r(tVar.mo50570f().mo56113h());
            C58838bb.m90883r(!tVar.mo50571g().mo56113h());
            C4391ao j2 = m82995j(tVar, ((C46583q) tVar.mo50570f().mo56107c()).mo50576a(), ((C46583q) tVar.mo50570f().mo56107c()).mo50577b());
            return C60922j.m93044g(this.f121739a.mo50523d(j2), new C46556n(j2), C60826bg.f164896a);
        }
        C58838bb.m90883r(!tVar.mo50570f().mo56113h());
        if (tVar.mo50571g().mo56113h()) {
            C58838bb.m90883r(!tVar.mo50570f().mo56113h());
            C58838bb.m90883r(tVar.mo50571g().mo56113h());
            C4383ag i2 = m82994i(tVar);
            C46510d dVar = this.f121739a;
            String b = ((C46585s) tVar.mo50571g().mo56107c()).mo50587b();
            C4634o a = ((C46585s) tVar.mo50571g().mo56107c()).mo50586a();
            C4634o oVar = C4634o.REPLACE;
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 2;
                } else if (ordinal == 2) {
                    throw new IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. UseCANCEL_AND_REENQUEUE or KEEP instead");
                } else if (ordinal != 3) {
                    throw new IllegalArgumentException("Unknown mapping from ExistingPeriodicWorkPolicy to ExistingWorkPolicy.");
                }
            }
            return C60922j.m93044g(dVar.mo50527h(b, i, i2), new C46558p(i2), C60826bg.f164896a);
        }
        C58838bb.m90883r(!tVar.mo50570f().mo56113h());
        C58838bb.m90883r(!tVar.mo50571g().mo56113h());
        C4383ag i3 = m82994i(tVar);
        return C60922j.m93044g(this.f121739a.mo50523d(i3), new C46562t(i3), C60826bg.f164896a);
    }
}
