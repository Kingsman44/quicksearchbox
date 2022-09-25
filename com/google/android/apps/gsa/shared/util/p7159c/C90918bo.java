package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bo */
/* compiled from: PG */
public final class C90918bo {

    /* renamed from: a */
    public static final C58839bc f254106a = new C90911bh();

    /* renamed from: a */
    public static C60870cx m148514a(C60870cx cxVar) {
        C60870cx g = C60922j.m93044g(cxVar, new C90912bi(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public static Object m148515b(Future future) {
        return ((C58833ax) C90877ak.m148474h(future)).mo56107c();
    }

    /* renamed from: c */
    public static Object m148516c(Future future, Object obj) {
        if (future.isDone()) {
            try {
                C58833ax axVar = (C58833ax) C60917ed.m93034a(future);
                if (axVar.mo56113h()) {
                    return axVar.mo56107c();
                }
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static boolean m148517d(Future future) {
        return C90877ak.m148480n(future) && ((C58833ax) C90877ak.m148474h(future)).mo56113h();
    }

    /* renamed from: e */
    public static C60870cx m148518e(Iterable iterable) {
        C60870cx cxVar;
        C58485gu i = C58485gu.m89841i(iterable);
        int size = i.size();
        if (size != 0) {
            if (size != 1) {
                cxVar = new C90869ac(i);
                AtomicReference atomicReference = new AtomicReference(cxVar);
                AtomicInteger atomicInteger = new AtomicInteger(i.size());
                AtomicReference atomicReference2 = new AtomicReference(C58836b.f156633a);
                int size2 = i.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C60870cx cxVar2 = (C60870cx) i.get(i2);
                    cxVar2.mo4106b(new C90960z(atomicReference, cxVar2, atomicReference2, atomicInteger), C60826bg.f164896a);
                }
            } else {
                cxVar = C60922j.m93044g((C60870cx) i.get(0), new C90959y(), C60826bg.f164896a);
            }
        } else {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx g = C60922j.m93044g(cxVar, new C90917bn(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
