package com.google.p4449cd;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60916ec;
import dagger.p5295b.C68282c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.cd.c */
/* compiled from: PG */
public final class C57940c {
    /* renamed from: a */
    public static C58833ax m88574a(C68282c cVar) {
        return m88582i(cVar) ? C58833ax.m90834k(m88577d(cVar)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58833ax m88575b(C68282c cVar) {
        try {
            cVar.mo60292a();
            return C58836b.f156633a;
        } catch (ExecutionException e) {
            return C57937b.m88572b(e, ExecutionException.class).mo56105a(C58833ax.m90834k(e));
        }
    }

    /* renamed from: c */
    public static Object m88576c(C68282c cVar) {
        try {
            return cVar.mo60292a();
        } catch (ExecutionException e) {
            C58833ax b = C57937b.m88572b(e, ExecutionException.class);
            if (b.mo56113h()) {
                Throwable th = (Throwable) b.mo56107c();
                C58887cx.m90980g(th);
                C58887cx.m90979f(th, Exception.class);
                throw c$$ExternalSyntheticBackport0.m88584m("Unknown throwable type.", th);
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static Object m88577d(C68282c cVar) {
        try {
            return cVar.mo60292a();
        } catch (ExecutionException e) {
            throw new C60916ec((Throwable) C57937b.m88572b(e, ExecutionException.class).mo56109e(e));
        }
    }

    /* renamed from: e */
    public static Object m88578e(C68282c cVar, Object obj) {
        return m88583j(cVar) ? ((C58833ax) m88577d(cVar)).mo56107c() : obj;
    }

    /* renamed from: f */
    public static RuntimeException m88579f(C68282c cVar) {
        cVar.mo60292a();
        throw new IllegalArgumentException("Called rethrowException() on a Produced which did not throw an exception.");
    }

    /* renamed from: g */
    public static boolean m88580g(C68282c cVar) {
        return !m88582i(cVar);
    }

    /* renamed from: h */
    public static boolean m88581h(C68282c cVar) {
        try {
            cVar.mo60292a();
            return false;
        } catch (ExecutionException e) {
            C58833ax b = C57937b.m88572b(e, ExecutionException.class);
            if (!b.mo56113h() || !(b.mo56107c() instanceof CancellationException)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m88582i(C68282c cVar) {
        try {
            cVar.mo60292a();
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m88583j(C68282c cVar) {
        try {
            C58833ax axVar = (C58833ax) cVar.mo60292a();
            return axVar != null && axVar.mo56113h();
        } catch (ExecutionException unused) {
        }
    }
}
