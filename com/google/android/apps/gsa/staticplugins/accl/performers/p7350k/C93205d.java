package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import com.google.android.apps.gsa.n.g.g;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.d */
/* compiled from: PG */
public final class C93205d {

    /* renamed from: a */
    public static final C59071e f259922a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.k.d");

    /* renamed from: c */
    private static final long f259923c = TimeUnit.MINUTES.toMicros(5);

    /* renamed from: b */
    public final u f259924b;

    /* renamed from: d */
    private final C86054o f259925d;

    /* renamed from: e */
    private final i f259926e;

    /* renamed from: f */
    private final C22871g f259927f;

    /* renamed from: g */
    private final C22871g f259928g;

    /* renamed from: h */
    private final C21370a f259929h;

    public C93205d(C86054o oVar, i iVar, u uVar, C22871g gVar, C22871g gVar2, C21370a aVar) {
        this.f259925d = oVar;
        this.f259926e = iVar;
        this.f259924b = uVar;
        this.f259927f = gVar;
        this.f259928g = gVar2;
        this.f259929h = aVar;
    }

    /* renamed from: a */
    public final void mo87565a() {
        String F = this.f259925d.mo79659F();
        if (F == null) {
            ((C59052c) ((C59052c) f259922a.mo56226d()).mo56372aa(13444)).mo56386p("Failed to get account name.");
            return;
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(this.f259929h.mo26870b());
        i iVar = this.f259926e;
        C65753ak akVar = C65753ak.ACTION_HISTORY;
        long j = f259923c;
        String str = F;
        C60870cx h = C60922j.m93045h((C60870cx) iVar.a.mo6453a(), new g(str, akVar, micros - j, micros, C63662ac.f172144a), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        new C90873ag(this.f259927f.mo28210j(h, "gellerReadResultFuture", new C93202a(this, F)), this.f259928g, "gellerDeleteFuture", C93203b.f259920a).mo85223a(C93204c.f259921a);
    }
}
