package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.apps.gsa.shared.util.p7159c.C90905bb;
import com.google.android.apps.gsa.shared.util.p7159c.C90906bc;
import com.google.android.apps.gsa.shared.util.p7159c.C90907bd;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90935ce;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.apps.gsa.shared.util.p7159c.C90946l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bd */
/* compiled from: PG */
public final class C90812bd implements C90929bz {

    /* renamed from: a */
    public final C90814bf f253940a;

    /* renamed from: b */
    private final C58817ah f253941b;

    public C90812bd(MessageQueue messageQueue, C60888db dbVar) {
        this.f253940a = new C90814bf(new Handler(Looper.getMainLooper()), messageQueue);
        this.f253941b = new C90806ay(new C90785ad(dbVar));
    }

    public C90812bd(C90814bf bfVar, C58817ah ahVar) {
        this.f253940a = bfVar;
        this.f253941b = ahVar;
    }

    /* renamed from: r */
    private static C58881cr m148373r(Object obj) {
        if (obj instanceof C90946l) {
            return ((C90946l) obj).mo85105fL();
        }
        return new C58885cv(obj.toString());
    }

    /* renamed from: a */
    public final C60870cx mo85136a(C90906bc bcVar, long j) {
        C58881cr r = m148373r(bcVar);
        C90805ax axVar = new C90805ax(bcVar);
        ((C90783ab) this.f253941b.apply(bcVar)).mo85114b(r, axVar, j);
        C90476a aVar = C91018d.f254254a;
        return axVar;
    }

    /* renamed from: b */
    public final C60870cx mo85137b(C90908be beVar, long j) {
        C58881cr r = m148373r(beVar);
        C90805ax axVar = new C90805ax(beVar, (Object) null);
        ((C90783ab) this.f253941b.apply(beVar)).mo85114b(r, axVar, j);
        C90476a aVar = C91018d.f254254a;
        return axVar;
    }

    /* renamed from: c */
    public final C60870cx mo85138c(C90906bc bcVar) {
        C58881cr r = m148373r(bcVar);
        C90805ax axVar = new C90805ax(bcVar);
        ((C90783ab) this.f253941b.apply(bcVar)).mo85115a(r, axVar);
        C90476a aVar = C91018d.f254254a;
        return axVar;
    }

    /* renamed from: d */
    public final C60870cx mo85139d(C90908be beVar) {
        C58881cr r = m148373r(beVar);
        C90805ax axVar = new C90805ax(beVar, (Object) null);
        ((C90783ab) this.f253941b.apply(beVar)).mo85115a(r, axVar);
        C90476a aVar = C91018d.f254254a;
        return axVar;
    }

    /* renamed from: e */
    public final C60870cx mo85140e(C60870cx cxVar, C90905bb bbVar) {
        C60870cx h = C60922j.m93045h(cxVar, bbVar, new C90807az((C90783ab) this.f253941b.apply(bbVar), m148373r(bbVar)));
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: f */
    public final C60870cx mo85141f(C60870cx cxVar, C90907bd bdVar) {
        C60870cx g = C60922j.m93044g(cxVar, bdVar, new C90807az((C90783ab) this.f253941b.apply(bdVar), m148373r(bdVar)));
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: g */
    public final void mo85142g(C60870cx cxVar, C90883aq aqVar) {
        C60856cj.m92911t(cxVar, aqVar, new C90807az((C90783ab) this.f253941b.apply(aqVar), m148373r(aqVar)));
    }

    /* renamed from: h */
    public final void mo85143h(C60870cx cxVar, C90908be beVar) {
        cxVar.mo4106b(beVar, new C90807az((C90783ab) this.f253941b.apply(beVar), m148373r(beVar)));
    }

    /* renamed from: i */
    public final C60870cx mo85144i(C90935ce ceVar, long j) {
        C90811bc bcVar = new C90811bc(this, ceVar);
        this.f253940a.f253944a.postDelayed(bcVar, j);
        C90476a aVar = C91018d.f254254a;
        return bcVar;
    }

    /* renamed from: j */
    public final C60870cx mo85145j(C90935ce ceVar) {
        C90811bc bcVar = new C90811bc(this, ceVar);
        this.f253940a.f253944a.post(bcVar);
        C90476a aVar = C91018d.f254254a;
        return bcVar;
    }

    /* renamed from: k */
    public final C60870cx mo85146k(C90936cf cfVar) {
        C90811bc bcVar = new C90811bc(this, cfVar);
        this.f253940a.f253944a.post(bcVar);
        C90476a aVar = C91018d.f254254a;
        return bcVar;
    }

    /* renamed from: l */
    public final void mo85147l(C60870cx cxVar, C90891ay ayVar) {
        C60856cj.m92911t(cxVar, ayVar, new C90810bb(this.f253940a, ayVar));
    }

    /* renamed from: m */
    public final void mo85148m(C60870cx cxVar, C90936cf cfVar) {
        cxVar.mo4106b(cfVar, new C90810bb(this.f253940a, cfVar));
    }

    /* renamed from: n */
    public final void mo85149n(C90936cf cfVar) {
        this.f253940a.mo85155b(cfVar);
    }

    /* renamed from: o */
    public final void mo85150o(C90936cf cfVar, long j) {
        this.f253940a.f253944a.postDelayed(cfVar, j);
    }

    /* renamed from: p */
    public final void mo85151p(C90936cf cfVar) {
        this.f253940a.f253944a.post(cfVar);
    }

    /* renamed from: q */
    public final void mo85152q(C90936cf cfVar) {
        C90814bf bfVar = this.f253940a;
        C90813be beVar = new C90813be(bfVar, cfVar);
        synchronized (bfVar.f253946c) {
            bfVar.f253946c.put(cfVar, beVar);
            bfVar.f253945b.addIdleHandler(beVar);
        }
    }
}
