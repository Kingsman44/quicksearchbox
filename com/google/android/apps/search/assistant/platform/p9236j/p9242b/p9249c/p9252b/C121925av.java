package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.av */
/* compiled from: PG */
public final class C121925av extends C121932bb {

    /* renamed from: a */
    public static final C59071e f338328a = C59071e.m91331h();

    /* renamed from: b */
    public C121934bd f338329b;

    /* renamed from: c */
    public FrameLayout f338330c;

    /* renamed from: d */
    public Executor f338331d;

    /* renamed from: e */
    private boolean f338332e;

    /* renamed from: f */
    public final void mo51127f() {
        super.mo51127f();
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public final void mo51128g() {
        super.mo51128g();
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final C121934bd mo22017i() {
        C121934bd bdVar = this.f338329b;
        if (bdVar != null) {
            return bdVar;
        }
        C69664n.m101065k("assistLayerSession");
        return null;
    }

    /* renamed from: j */
    public final void mo105448j(String str) {
        if (!this.f338332e) {
            super.mo51126e();
            C58976aa aaVar = C58975e.f156826a;
            super.mo22016h();
            super.mo51129jQ();
            C121934bd i = mo22017i();
            if (i.f338347c != null) {
                i.f338347c = null;
                i.f338348d = null;
                i.f338346b.mo105431b(i.f338345a, str);
            }
            this.f338332e = true;
        }
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        super.mo19987jP((Bundle) null);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final void mo105449k(String str, C69626l lVar) {
        mo105450l(new C121917an(str, this, lVar));
    }

    /* renamed from: l */
    public final void mo105450l(C69615a aVar) {
        Executor executor = this.f338331d;
        if (executor == null) {
            C69664n.m101065k("uiExecutor");
            executor = null;
        }
        executor.execute(C47810es.m84977q(new C121918ao(aVar)));
    }
}
