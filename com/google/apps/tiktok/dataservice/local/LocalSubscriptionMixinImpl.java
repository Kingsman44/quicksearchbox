package com.google.apps.tiktok.dataservice.local;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.apps.tiktok.lifecycle.C47439h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58458fu;
import com.google.common.p4522b.C58468gd;
import java.util.concurrent.Executor;

/* compiled from: PG */
final class LocalSubscriptionMixinImpl extends C46865s implements C2376g {

    /* renamed from: a */
    public final C2384o f122221a;

    /* renamed from: b */
    public C46838am f122222b;

    /* renamed from: c */
    private final C58334be f122223c = new C58458fu(16);

    /* renamed from: d */
    private boolean f122224d = true;

    /* renamed from: e */
    private final C46861o f122225e;

    /* renamed from: f */
    private final Executor f122226f;

    /* renamed from: g */
    private final C46427an f122227g;

    /* renamed from: h */
    private final C46427an f122228h;

    /* renamed from: i */
    private final C47439h f122229i;

    public LocalSubscriptionMixinImpl(C2384o oVar, C47439h hVar, Executor executor) {
        this.f122221a = oVar;
        this.f122229i = hVar;
        try {
            this.f122225e = (C46861o) hVar.mo51269b(R.id.first_lifecycle_owner_instance, C46859m.f122287a);
            this.f122226f = executor;
            C46427an anVar = new C46427an(executor, true);
            this.f122227g = anVar;
            anVar.mo50406b();
            this.f122228h = new C46427an(executor, false);
            oVar.mo5790b(this);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C19559g.m37304c();
        C46838am amVar = this.f122222b;
        if (amVar != null) {
            C19559g.m37304c();
            amVar.f122259c.execute(C47810es.m84977q(new C46834ai(amVar)));
        }
        this.f122225e.f122290a = false;
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C19559g.m37304c();
        if (this.f122224d) {
            C58838bb.m90883r(this.f122222b == null);
            this.f122222b = new C46838am(C58468gd.m89779a(this.f122223c), this.f122226f, this.f122227g, this.f122228h);
            if (!this.f122225e.f122290a || !this.f122224d) {
                C46838am amVar = this.f122222b;
                C19559g.m37304c();
                amVar.f122259c.execute(C47810es.m84977q(new C46830ae(amVar)));
            } else {
                C46838am amVar2 = this.f122222b;
                C19559g.m37304c();
                amVar2.f122259c.execute(C47810es.m84977q(new C46828ac(amVar2)));
            }
            this.f122223c.clear();
            this.f122224d = false;
        }
        C46838am amVar3 = this.f122222b;
        C19559g.m37304c();
        amVar3.f122260d.mo50406b();
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C19559g.m37304c();
        C46838am amVar = this.f122222b;
        C19559g.m37304c();
        amVar.f122260d.mo50407c();
    }

    /* renamed from: j */
    public final C46854h mo50826j(int i, C46852f fVar, C58833ax axVar) {
        C19559g.m37304c();
        boolean z = true;
        C58838bb.m90883r(this.f122222b == null);
        C47439h hVar = this.f122229i;
        if (((C58458fu) this.f122223c).mo55338d(fVar, (C46841ap) hVar.f123205a.mo51257g(i, new C46857k(axVar), C46858l.f122286a), false) != null) {
            z = false;
        }
        C58838bb.m90883r(z);
        return new C46860n(this, fVar);
    }
}
