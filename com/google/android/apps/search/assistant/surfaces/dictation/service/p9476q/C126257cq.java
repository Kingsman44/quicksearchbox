package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126300ai;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126316ay;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126340q;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126289b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cq */
/* compiled from: PG */
public final class C126257cq {

    /* renamed from: a */
    public static final C59071e f347882a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.q.cq");

    /* renamed from: b */
    public final Locale f347883b;

    /* renamed from: c */
    public final C126181j f347884c;

    /* renamed from: d */
    public final Duration f347885d;

    /* renamed from: e */
    public final C60888db f347886e;

    /* renamed from: f */
    public final C126222bi f347887f;

    /* renamed from: g */
    public final Object f347888g;

    /* renamed from: h */
    public final C61301b f347889h;

    /* renamed from: i */
    public C126250cj f347890i;

    /* renamed from: j */
    public final C47632e f347891j;

    /* renamed from: k */
    public C126223bj f347892k;

    /* renamed from: l */
    public C70862aj f347893l;

    /* renamed from: m */
    public bj f347894m;

    /* renamed from: n */
    public C126258cr f347895n;

    /* renamed from: o */
    public final AtomicReference f347896o;

    /* renamed from: p */
    public final C125422z f347897p;

    /* renamed from: q */
    public final C126204ar f347898q;

    /* renamed from: r */
    private final Deque f347899r = new ConcurrentLinkedDeque();

    /* renamed from: s */
    private final long f347900s;

    public C126257cq(long j, C126316ay ayVar, C126181j jVar, C126204ar arVar, C62910ar arVar2, C60888db dbVar, C126222bi biVar) {
        Object obj = new Object();
        this.f347888g = obj;
        this.f347891j = new C47632e();
        this.f347896o = new AtomicReference();
        this.f347900s = j;
        this.f347883b = ayVar.mo107526b();
        this.f347884c = jVar;
        this.f347898q = arVar;
        this.f347897p = ayVar.mo107527c();
        this.f347885d = C62950b.m95473d(arVar2);
        this.f347886e = dbVar;
        this.f347887f = biVar;
        synchronized (obj) {
            this.f347890i = C126250cj.PRISTINE;
        }
        this.f347889h = C126290c.m206496a("ProcessingQueue@Oration#" + j);
    }

    /* renamed from: j */
    private static Optional m206438j(Object obj, String str) {
        return obj == null ? Optional.m71637of(str) : Optional.empty();
    }

    /* renamed from: a */
    public final C126256cp mo107481a() {
        this.f347899r.size();
        C126256cp cpVar = (C126256cp) this.f347899r.pollFirst();
        while (cpVar != null && !this.f347899r.isEmpty() && cpVar.f347881b) {
            cpVar = (C126256cp) this.f347899r.pollFirst();
        }
        this.f347899r.size();
        return cpVar;
    }

    /* renamed from: b */
    public final C60870cx mo107482b(C60870cx cxVar) {
        C126247cg cgVar = new C126247cg(this);
        return C60922j.m93044g(cxVar, C47810es.m84963c(cgVar), this.f347886e);
    }

    /* renamed from: c */
    public final C60870cx mo107483c(C126256cp cpVar) {
        synchronized (this.f347888g) {
            C126250cj cjVar = C126250cj.PRISTINE;
            int ordinal = this.f347890i.ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal == 3) {
                    C60870cx cxVar = C60866ct.f164955a;
                    return cxVar;
                } else if (ordinal != 4) {
                    Objects.requireNonNull(this.f347892k);
                    try {
                        return cpVar.f347880a.apply(this.f347892k);
                    } catch (Exception e) {
                        return C60856cj.m92899h(new IllegalStateException("Task.work failed synchronously", e));
                    }
                }
            }
            String valueOf = String.valueOf(this.f347890i);
            throw new IllegalStateException("Attempt to process a task while " + valueOf);
        }
    }

    /* renamed from: d */
    public final String mo107484d() {
        String str;
        String obj = toString();
        C126223bj bjVar = this.f347892k;
        if (bjVar != null) {
            str = "processor set: ".concat(String.valueOf(String.valueOf((C126220bg) bjVar.f347814n.get())));
        } else {
            str = "processor not set, missing: ".concat(String.valueOf((String) Stream.CC.m71936of((T[]) new Optional[]{m206438j(this.f347893l, "orationRequests"), m206438j(this.f347894m, "orationContext"), m206438j(this.f347895n, "textSetter")}).filter(C126242cb.f347859a).map(C126243cc.f347860a).collect(Collectors.joining(", "))));
        }
        int size = this.f347899r.size();
        return obj + "; " + str + "; queue_size=" + size;
    }

    /* renamed from: e */
    public final void mo107485e() {
        C58838bb.m90883r(this.f347890i.equals(C126250cj.INITIALIZING));
        C60870cx cxVar = (C60870cx) this.f347896o.get();
        cxVar.getClass();
        cxVar.cancel(false);
    }

    /* renamed from: f */
    public final void mo107486f(C60870cx cxVar) {
        C126308aq aqVar = new C126308aq(C126300ai.f347959a, new C126246cf(this));
        C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar), this.f347886e);
    }

    /* renamed from: g */
    public final void mo107487g(Runnable runnable) {
        mo107486f(this.f347891j.mo51512b(new C126249ci(this, runnable), this.f347886e));
    }

    /* renamed from: h */
    public final void mo107488h(C126256cp cpVar) {
        boolean z;
        synchronized (this.f347888g) {
            C126250cj cjVar = C126250cj.PRISTINE;
            int ordinal = this.f347890i.ordinal();
            if (ordinal != 0) {
                z = true;
                if (!(ordinal == 1 || ordinal == 2)) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new AssertionError();
                        }
                    }
                }
                C58838bb.m90887v(z, "ProcessingQueue handed a task while: %s", this.f347890i);
            }
            z = false;
            C58838bb.m90887v(z, "ProcessingQueue handed a task while: %s", this.f347890i);
        }
        this.f347899r.addLast(cpVar);
        if (this.f347899r.size() > 10) {
            ((C59052c) ((C59052c) f347882a.mo56226d()).mo56372aa(36993)).mo56389s("Bloated task queue: %s [SD]", new C126289b(new C126239bz(this)));
        }
        mo107486f(this.f347891j.mo51512b(new C126245ce(this), this.f347886e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo107489i(C125065at atVar) {
        mo107488h(new C126256cp(new C126252cl(atVar), Collection.EL.stream(atVar.f345042a).noneMatch(C126340q.f348029a)));
    }

    public final String toString() {
        long j = this.f347900s;
        return "ProcessingQueue@Oration#" + j;
    }
}
