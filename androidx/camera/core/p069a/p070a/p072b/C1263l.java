package androidx.camera.core.p069a.p070a.p072b;

import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.p054b.p055a.p058c.C0895a;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: androidx.camera.core.a.a.b.l */
/* compiled from: PG */
public final class C1263l {
    /* renamed from: a */
    public static C60870cx m3429a(Collection collection) {
        return new C1271t(new ArrayList(collection), true, C1238a.m3410a());
    }

    /* renamed from: b */
    public static C60870cx m3430b(Object obj) {
        return obj == null ? C1266o.f3667a : new C1266o(obj);
    }

    /* renamed from: d */
    public static C60870cx m3432d(Collection collection) {
        return new C1271t(new ArrayList(collection), false, C1238a.m3410a());
    }

    /* renamed from: f */
    public static C60870cx m3434f(C60870cx cxVar, C1252a aVar, Executor executor) {
        C1254c cVar = new C1254c(aVar, cxVar);
        cxVar.mo4106b(cVar, executor);
        return cVar;
    }

    /* renamed from: g */
    public static Object m3435g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: i */
    public static void m3437i(C60870cx cxVar, C2164c cVar) {
        m3438j(true, cxVar, cVar, C1238a.m3410a());
    }

    /* renamed from: e */
    public static C60870cx m3433e(C60870cx cxVar, C0895a aVar, Executor executor) {
        aVar.getClass();
        return m3434f(cxVar, new C1259h(aVar), executor);
    }

    /* renamed from: h */
    public static void m3436h(C60870cx cxVar, C1255d dVar, Executor executor) {
        dVar.getClass();
        cxVar.mo4106b(new C1262k(cxVar, dVar), executor);
    }

    /* renamed from: c */
    public static C60870cx m3431c(C60870cx cxVar) {
        cxVar.getClass();
        if (cxVar.isDone()) {
            return cxVar;
        }
        return C2169h.m6027a(new C1258g(cxVar));
    }

    /* renamed from: j */
    public static void m3438j(boolean z, C60870cx cxVar, C2164c cVar, Executor executor) {
        cxVar.getClass();
        cVar.getClass();
        executor.getClass();
        m3436h(cxVar, new C1260i(cVar), executor);
        if (z) {
            cVar.mo5436a(new C1261j(cxVar), C1238a.m3410a());
        }
    }
}
