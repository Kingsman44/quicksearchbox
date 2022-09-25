package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5978b.p5987f.C75242e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.av */
/* compiled from: PG */
public final class C76185av implements C76167ad {

    /* renamed from: a */
    public static final C59071e f211177a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.j.av");

    /* renamed from: b */
    public final C75242e f211178b;

    /* renamed from: c */
    public final ac f211179c;

    /* renamed from: d */
    public final AtomicReference f211180d = new AtomicReference(new C76182as(this));

    /* renamed from: e */
    private final Executor f211181e;

    public C76185av(ac acVar, C75242e eVar, Executor executor) {
        this.f211179c = acVar;
        this.f211178b = eVar;
        this.f211181e = new C60904dr(executor);
    }

    /* renamed from: a */
    public final void mo72109a() {
        C58976aa aaVar = C58975e.f156826a;
        String str = ((C76180aq) this.f211180d.get()).f211171a;
        mo72118b("onCancelled", new C76173aj(this));
    }

    /* renamed from: b */
    public final void mo72118b(String str, Runnable runnable) {
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(runnable), this.f211181e);
        C76179ap apVar = new C76179ap(str);
        C60856cj.m92911t(l, C47810es.m84974n(apVar), C60826bg.f164896a);
    }
}
