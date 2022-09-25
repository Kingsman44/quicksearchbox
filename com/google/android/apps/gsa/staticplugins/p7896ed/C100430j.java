package com.google.android.apps.gsa.staticplugins.p7896ed;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6707dj.C85376a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.search.googleapp.discover.p10173aa.C134019al;
import com.google.android.apps.search.googleapp.discover.p10173aa.C134020am;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.ed.j */
/* compiled from: PG */
public final class C100430j extends C86734a implements C85376a {

    /* renamed from: b */
    private static final C59071e f280765b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ed.j");

    /* renamed from: a */
    public final Context f280766a;

    /* renamed from: c */
    private final C86034c f280767c;

    /* renamed from: f */
    private final Executor f280768f;

    /* renamed from: g */
    private final C84486a f280769g;

    /* renamed from: com.google.android.apps.gsa.staticplugins.ed.j$a */
    /* compiled from: PG */
    public interface C100431a {
        /* renamed from: cb */
        C134019al mo91912cb();

        /* renamed from: cc */
        C134020am mo91913cc();
    }

    public C100430j(Context context, C86034c cVar, Executor executor, C84486a aVar) {
        super(C118575h.WORKER_TNG_DISCOVER_CLEANUP, "tng_discover_cleanup");
        this.f280766a = context;
        this.f280767c = cVar;
        this.f280768f = executor;
        this.f280769g = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78899a() {
        C59071e eVar = f280765b;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TngDiscoverClean");
        ((C59052c) ((C59052c) b).mo56372aa(33397)).mo56386p("Trying to cleanup TNG:Discover flag change");
        if (this.f280769g.mo78205l()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TngDiscoverClean");
            ((C59052c) ((C59052c) b2).mo56372aa(33398)).mo56386p("Starting FeedSync in TNG:Discover");
            return C47633f.m84733g(this.f280767c.mo79697b()).mo51516i(new C100426f(this), this.f280768f).mo51515h(C100427g.f280762a, C60826bg.f164896a);
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "TngDiscoverClean");
        ((C59052c) ((C59052c) b3).mo56372aa(33399)).mo56386p("Cleaning up TNG:Discover");
        return C47633f.m84733g(this.f280767c.mo79697b()).mo51516i(new C100428h(this), this.f280768f).mo51515h(C100429i.f280764a, C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TngDiscoverCleanupWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
