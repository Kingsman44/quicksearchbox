package com.google.android.apps.gsa.search.core.service.p6852g;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90949o;
import com.google.common.base.C58830au;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.k */
/* compiled from: PG */
public abstract class C86731k extends C60873d implements C90964a, C60870cx {

    /* renamed from: a */
    public final AtomicReference f234285a = new AtomicReference(C90949o.f254151a);

    /* renamed from: b */
    public final C86730j f234286b;

    protected C86731k(String str, String str2, C86732l lVar, C86724d... dVarArr) {
        this.f234286b = new C86730j(str, str2, lVar, C58476gl.m89803b(EnumSet.of(C86724d.IDLE, dVarArr)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        C90949o oVar = (C90949o) this.f234285a.getAndSet(C90949o.f254152b);
        if (oVar != C90949o.f254152b && isCancelled() && mo57359q()) {
            oVar.mo85244b();
        }
    }

    /* renamed from: e */
    public final C86732l mo80344e() {
        return ((C86716b) this.f234286b.f234280a).f234243c;
    }

    /* renamed from: f */
    public final C58528ij mo80345f() {
        return ((C86716b) this.f234286b.f234280a).f234244d;
    }

    /* renamed from: g */
    public abstract C60870cx mo78371g(Object obj);

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkProxy");
        fVar.mo85279c("WorkProxyClass").mo85276a(C90752i.m148229c(mo80346h()));
        fVar.mo85279c("mWorkerId").mo85276a(C90752i.m148229c(mo80347i()));
        fVar.mo85279c("mType").mo85276a(C90752i.m148231e(mo80344e()));
        fVar.mo85279c("mTargetUserScenarios").mo85276a(C90752i.m148231e(mo80345f()));
    }

    /* renamed from: h */
    public final String mo80346h() {
        return ((C86716b) this.f234286b.f234280a).f234242b;
    }

    /* renamed from: i */
    public final String mo80347i() {
        return ((C86716b) this.f234286b.f234280a).f234241a;
    }

    public final String toString() {
        C58830au auVar = new C58830au("WorkProxy");
        auVar.mo56102b("Name", mo80346h());
        auVar.mo56102b("WorkerId", mo80347i());
        if (mo80344e() != C86732l.FIRE_AND_FORGET) {
            auVar.mo56102b("Type", mo80344e());
        }
        if (mo80345f().size() > 1) {
            auVar.mo56102b("UserScenarios", mo80345f());
        }
        auVar.mo56102b("id", Integer.toHexString(System.identityHashCode(this)));
        return auVar.toString();
    }
}
