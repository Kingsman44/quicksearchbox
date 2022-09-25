package com.google.apps.tiktok.dataservice.local;

import androidx.p060c.C0979i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.apps.tiktok.dataservice.C46765ci;
import com.google.apps.tiktok.dataservice.C46766cj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58468gd;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.local.am */
/* compiled from: PG */
final class C46838am {

    /* renamed from: a */
    public final C58468gd f122257a;

    /* renamed from: b */
    public final Executor f122258b;

    /* renamed from: c */
    public final Executor f122259c;

    /* renamed from: d */
    public final C46427an f122260d;

    /* renamed from: e */
    public final Set f122261e = new C0979i(0);

    /* renamed from: f */
    public Set f122262f = new C0979i(0);

    /* renamed from: g */
    public int f122263g = 2;

    public C46838am(C58468gd gdVar, Executor executor, Executor executor2, C46427an anVar) {
        this.f122257a = gdVar;
        this.f122258b = executor;
        this.f122259c = executor2;
        this.f122260d = anVar;
    }

    /* renamed from: b */
    public static void m83441b(C46852f fVar, C46844as asVar) {
        C46765ci a;
        C46765ci a2;
        C19559g.m37304c();
        if (asVar.mo50852c()) {
            C47558bi a3 = C47831fm.m85006a("LocalSubscription onLoaded()");
            try {
                a2 = C46766cj.m83311a();
                fVar.mo20961j(asVar.mo50851b());
                a2.close();
                a3.close();
                return;
            } catch (Throwable th) {
                try {
                    a3.close();
                } catch (Throwable th2) {
                    C46871y.m83496a(th, th2);
                }
                throw th;
            }
        } else {
            C47558bi a4 = C47831fm.m85006a("LocalSubscription onLoadError()");
            try {
                a = C46766cj.m83311a();
                fVar.mo20960h(asVar.mo50850a());
                a.close();
                a4.close();
                return;
            } catch (Throwable th3) {
                try {
                    a4.close();
                } catch (Throwable th4) {
                    C46871y.m83496a(th3, th4);
                }
                throw th3;
            }
        }
        throw th;
        throw th;
    }

    /* renamed from: e */
    private final void m83442e(C60870cx cxVar) {
        C19559g.m37304c();
        this.f122262f.add(cxVar);
        cxVar.mo4106b(C47810es.m84977q(new C46872z(this, cxVar)), this.f122259c);
    }

    /* renamed from: a */
    public final void mo50841a(C46841ap apVar, C60870cx cxVar) {
        C60870cx j = C60856cj.m92901j(cxVar);
        C46826aa aaVar = new C46826aa(this, apVar);
        C60870cx g = C60922j.m93044g(j, C47810es.m84963c(aaVar), this.f122259c);
        C46827ab abVar = new C46827ab(this, apVar);
        m83442e(C60846c.m92878g(g, Throwable.class, C47810es.m84963c(abVar), this.f122259c));
    }

    /* renamed from: c */
    public final void mo50842c(C46841ap apVar) {
        C19559g.m37304c();
        this.f122261e.add(apVar);
        if (this.f122263g == 2) {
            this.f122263g = 1;
            C46833ah ahVar = new C46833ah(this);
            m83442e(C60856cj.m92903l(C47810es.m84977q(ahVar), this.f122260d));
        }
    }

    /* renamed from: d */
    public final void mo50843d(C46841ap apVar) {
        C46836ak akVar = new C46836ak(this, apVar);
        C19559g.m37304c();
        C58838bb.m90866a(apVar.f122265a, "LocalSubscriptionStateReference used after free.");
        C46839an anVar = apVar.f122265a;
        C46840ao aoVar = new C46840ao(apVar);
        if (anVar.mo50844a().mo56113h()) {
            ((C60870cx) anVar.mo50844a().mo56107c()).cancel(false);
        }
        if (anVar.mo50845b().mo56113h()) {
            C47558bi a = C47831fm.m85006a("LocalSubscription newLoad");
            try {
                C60870cx b = ((C46851e) anVar.mo50845b().mo56107c()).mo20331b();
                a.mo51417a(b);
                aoVar.mo40846a(new C46848b(anVar.mo50845b(), C58833ax.m90834k(b), anVar.mo50846c(), anVar.mo50847d()));
                akVar.mo40846a(b);
                a.close();
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
