package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.base.C58844bh;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.shared.util.c.ak */
/* compiled from: PG */
public final class C90877ak {

    /* renamed from: a */
    public static final C59071e f254089a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.ak");

    /* renamed from: a */
    public static C60870cx m148467a(Iterable iterable) {
        C58485gu i = C58485gu.m89841i(iterable);
        int size = i.size();
        if (size != 0) {
            if (size == 1) {
                return new C90868ab((C60870cx) i.get(0));
            }
            C90869ac acVar = new C90869ac(i);
            AtomicReference atomicReference = new AtomicReference(acVar);
            int size2 = i.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C60870cx cxVar = (C60870cx) i.get(i2);
                cxVar.mo4106b(new C90956v(atomicReference, cxVar), C60826bg.f164896a);
            }
            return acVar;
        }
        throw new IllegalArgumentException("Expected at least one future, got 0.");
    }

    /* renamed from: b */
    public static C60870cx m148468b(Iterable iterable) {
        C58485gu i = C58485gu.m89841i(iterable);
        int size = i.size();
        if (size != 0) {
            if (size == 1) {
                return new C90868ab((C60870cx) i.get(0));
            }
            C90869ac acVar = new C90869ac(i);
            AtomicReference atomicReference = new AtomicReference(acVar);
            AtomicInteger atomicInteger = new AtomicInteger(i.size());
            int size2 = i.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C60870cx cxVar = (C60870cx) i.get(i2);
                cxVar.mo4106b(new C90954t(atomicReference, cxVar, atomicInteger), C60826bg.f164896a);
            }
            return acVar;
        }
        throw new IllegalArgumentException("Expected at least one future, got 0.");
    }

    /* renamed from: c */
    public static C60870cx m148469c(C22871g gVar, String str, C22862b bVar, C59407o oVar) {
        C90923bt btVar = new C90923bt(str, oVar, bVar, C58844bh.ALWAYS_FALSE, gVar);
        btVar.mo85232d();
        return btVar;
    }

    /* renamed from: d */
    public static C60870cx m148470d(C22871g gVar, String str, C22862b bVar, C58839bc bcVar, C59407o oVar) {
        C90923bt btVar = new C90923bt(str, oVar, bVar, bcVar, gVar);
        btVar.mo85232d();
        return btVar;
    }

    /* renamed from: e */
    public static C60870cx m148471e(C60870cx cxVar, long j, TimeUnit timeUnit, C22871g gVar) {
        C90876aj ajVar = new C90876aj(cxVar);
        gVar.mo28213m("Timeout", timeUnit.toMillis(j), new C90957w(ajVar));
        Objects.requireNonNull(ajVar);
        cxVar.mo4106b(new C90958x(ajVar), C60826bg.f164896a);
        return ajVar;
    }

    /* renamed from: f */
    public static Object m148472f(Future future) {
        if (!future.isDone()) {
            C90476a aVar = C91018d.f254254a;
        }
        return future.get();
    }

    /* renamed from: g */
    public static Object m148473g(Future future, long j, TimeUnit timeUnit) {
        if (j > 0 && !future.isDone()) {
            C90476a aVar = C91018d.f254254a;
        }
        return future.get(j, timeUnit);
    }

    /* renamed from: h */
    public static Object m148474h(Future future) {
        C58838bb.m90887v(future.isDone(), "Future was expected to be done: %s", future);
        return C60856cj.m92910s(future);
    }

    /* renamed from: i */
    public static Object m148475i(Future future, Object obj) {
        if (future.isDone()) {
            try {
                return C60917ed.m93034a(future);
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return obj;
    }

    /* renamed from: j */
    public static String m148476j(Future future) {
        if (future == null) {
            return "null";
        }
        if (!future.isDone()) {
            return "pending";
        }
        try {
            String valueOf = String.valueOf(C60917ed.m93034a(future));
            return "value(" + valueOf + ")";
        } catch (CancellationException unused) {
            return "cancelled";
        } catch (ExecutionException e) {
            String obj = e.toString();
            return "failed(" + obj + ")";
        }
    }

    /* renamed from: k */
    public static Throwable m148477k(C60870cx cxVar, Class cls) {
        try {
            throw new IllegalStateException(String.format("Future unexpectedly succeeded with <%s> rather than failing with a %s", new Object[]{C60856cj.m92909r(cxVar), cls}));
        } catch (ExecutionException e) {
            return C58887cx.m90976c(e, cls);
        }
    }

    /* renamed from: l */
    public static boolean m148478l(Future future) {
        if (!future.isDone()) {
            return false;
        }
        try {
            C60917ed.m93034a(future);
            return false;
        } catch (CancellationException | ExecutionException unused) {
            return true;
        }
    }

    /* renamed from: m */
    public static boolean m148479m(Future future, Class cls) {
        if (!future.isDone()) {
            return false;
        }
        try {
            C60917ed.m93034a(future);
            return false;
        } catch (CancellationException unused) {
            return false;
        } catch (ExecutionException e) {
            return cls.isInstance(e.getCause());
        }
    }

    /* renamed from: n */
    public static boolean m148480n(Future future) {
        if (future.isDone() && !future.isCancelled()) {
            try {
                C60917ed.m93034a(future);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static void m148481o(C60870cx cxVar, String str, String str2, String str3) {
        C60856cj.m92911t(cxVar, new C90867aa(str, str3), C60826bg.f164896a);
    }
}
