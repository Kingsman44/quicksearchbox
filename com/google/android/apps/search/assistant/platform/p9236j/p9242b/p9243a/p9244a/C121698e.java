package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.gsa.binaries.satin.app.aqj;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p3186j$.time.Instant;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69497an;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.e */
/* compiled from: PG */
public final class C121698e {

    /* renamed from: a */
    public final C60950i f337644a;

    /* renamed from: b */
    public final C71422aw f337645b;

    /* renamed from: c */
    public final ReentrantLock f337646c = new ReentrantLock();

    /* renamed from: d */
    public C121671a f337647d;

    /* renamed from: e */
    public final C71643cp f337648e;

    /* renamed from: f */
    public final aqj f337649f;

    public C121698e(C121706m mVar, C60950i iVar, aqj aqj, C71422aw awVar) {
        C69664n.m101061g(mVar, "invocation");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(aqj, "resourceDebugDataTrackerFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f337644a = iVar;
        this.f337649f = aqj;
        this.f337645b = awVar;
        C34053bp bpVar = mVar.f337671a;
        C33729b bVar = mVar.f337676f;
        C33514d dVar = mVar.f337673c;
        Instant a = iVar.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C69496am amVar = C69496am.f185918a;
        this.f337647d = new C121671a(bpVar, bVar, dVar, a, false, amVar, C69497an.f185919a, amVar);
        this.f337648e = C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(C34743k.m63492c(mVar.f337675e, (Object) null), new C121696c(this, (C69577g) null)), new C121697d(this, (C69577g) null)), awVar);
    }

    /* renamed from: a */
    public final Instant mo105310a() {
        ReentrantLock reentrantLock = this.f337646c;
        reentrantLock.lock();
        try {
            return this.f337647d.f337559d;
        } finally {
            reentrantLock.unlock();
        }
    }
}
