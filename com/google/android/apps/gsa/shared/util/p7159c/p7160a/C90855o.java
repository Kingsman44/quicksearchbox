package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59826gs;
import com.google.common.p4552o.C59827gt;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.o */
/* compiled from: PG */
public final class C90855o implements C90991b {

    /* renamed from: a */
    public final C21370a f254046a;

    /* renamed from: b */
    public final String f254047b;

    /* renamed from: c */
    public final C90818bj f254048c;

    /* renamed from: d */
    public final C90476a f254049d;

    /* renamed from: e */
    public final C90800as f254050e;

    /* renamed from: f */
    public final Set f254051f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g */
    private final ThreadPoolExecutor f254052g;

    public C90855o(C21370a aVar, C90476a aVar2, C90800as asVar) {
        this.f254046a = aVar;
        this.f254047b = "UserFacingBlocking";
        this.f254049d = aVar2;
        this.f254050e = asVar;
        C90476a aVar3 = C91018d.f254254a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue(), new C90853m("UserFacingBlocking", 0));
        this.f254052g = threadPoolExecutor;
        this.f254048c = new C90818bj(threadPoolExecutor, 25);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59826gs gsVar = (C59826gs) C59827gt.f161660l.createBuilder();
        String str = this.f254047b;
        gsVar.copyOnWrite();
        C59827gt gtVar = (C59827gt) gsVar.instance;
        gtVar.f161662a |= 1;
        gtVar.f161663b = str;
        gsVar.copyOnWrite();
        C59827gt gtVar2 = (C59827gt) gsVar.instance;
        gtVar2.f161662a |= 64;
        gtVar2.f161672k = true;
        gsVar.copyOnWrite();
        C59827gt gtVar3 = (C59827gt) gsVar.instance;
        gtVar3.f161662a |= 16;
        gtVar3.f161670i = false;
        gsVar.copyOnWrite();
        C59827gt gtVar4 = (C59827gt) gsVar.instance;
        gtVar4.f161662a |= 4;
        gtVar4.f161665d = 25;
        int poolSize = this.f254052g.getPoolSize();
        gsVar.copyOnWrite();
        C59827gt gtVar5 = (C59827gt) gsVar.instance;
        gtVar5.f161662a |= 2;
        gtVar5.f161664c = poolSize;
        C59827gt gtVar6 = (C59827gt) gsVar.build();
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = (C59796fx) fwVar.instance;
        C59796fx fxVar2 = C59796fx.f161580r;
        gtVar6.getClass();
        fxVar.mo57059a();
        fxVar.f161587f.add(gtVar6);
        synchronized (this.f254051f) {
            for (C90815bg gS : this.f254051f) {
                gS.mo17602gS(fVar);
            }
        }
    }
}
