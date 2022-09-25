package com.google.apps.tiktok.dataservice;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60815aw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.apps.tiktok.dataservice.cl */
/* compiled from: PG */
final class C46768cl {

    /* renamed from: a */
    public final Object f122120a = new Object();

    /* renamed from: b */
    public C60815aw f122121b;

    /* renamed from: c */
    private C46463o f122122c;

    public C46768cl(C46463o oVar) {
        C19559g.m37304c();
        this.f122122c = oVar;
    }

    /* renamed from: d */
    private final void m83313d() {
        synchronized (this.f122120a) {
            C58838bb.m90883r(this.f122122c.f121591a.mo57276h().isDone());
            this.f122122c.f121591a.mo57280m(new C46767ck(this), C60826bg.f164896a);
            this.f122122c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C46688af mo50778a() {
        C46688af afVar;
        synchronized (this.f122120a) {
            if (this.f122122c != null) {
                m83313d();
            }
            try {
                afVar = (C46688af) this.f122121b.mo57270a();
            } catch (ExecutionException e) {
                throw new C46796dk(e.getCause());
            }
        }
        return afVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo50779b() {
        synchronized (this.f122120a) {
            C46463o oVar = this.f122122c;
            if (oVar != null) {
                C60870cx h = oVar.f121591a.mo57276h();
                return h;
            }
            C60870cx cxVar = C60866ct.f164955a;
            return cxVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50780c() {
        synchronized (this.f122120a) {
            C46463o oVar = this.f122122c;
            if (oVar != null) {
                oVar.f121591a.mo57281n(false);
                m83313d();
            }
            this.f122121b.f164882a.mo57279k();
        }
    }
}
