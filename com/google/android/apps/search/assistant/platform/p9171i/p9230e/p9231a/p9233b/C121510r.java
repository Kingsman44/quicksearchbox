package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60948g;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.r */
/* compiled from: PG */
public final class C121510r {

    /* renamed from: a */
    public static final C59071e f337203a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.e.a.b.r");

    /* renamed from: b */
    public static final ThreadLocal f337204b = new ThreadLocal();

    /* renamed from: c */
    private static final Instant f337205c = Instant.now();

    /* renamed from: d */
    private static final long f337206d = System.nanoTime();

    /* renamed from: e */
    private static Instant f337207e = m200804d();

    static {
        C60948g gVar = C60948g.f165068a;
    }

    /* renamed from: a */
    public static C121492b m200801a(C121501i iVar) {
        if (!C121499g.m200779e(C121500h.ASYNC_SPAN, iVar)) {
            return new C121508p();
        }
        return new C121507o(C58872ci.m90946c(), iVar, m200804d());
    }

    /* renamed from: b */
    public static List m200802b() {
        C121509q qVar = (C121509q) f337204b.get();
        return qVar == null ? C58485gu.m89845m() : qVar.f337200f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.i.e.a.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.apps.search.assistant.platform.i.e.a.b.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.assistant.platform.i.e.a.b.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.apps.search.assistant.platform.i.e.a.b.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q m200803c(com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121501i r7) {
        /*
            com.google.android.apps.search.assistant.platform.i.e.a.b.h r0 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h.SPAN
            boolean r0 = com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g.m200779e(r0, r7)
            if (r0 == 0) goto L_0x0025
            j$.time.Instant r6 = m200804d()
            com.google.common.base.ci r4 = com.google.common.base.C58872ci.m90946c()
            java.util.List r5 = m200802b()
            com.google.android.apps.search.assistant.platform.i.e.a.b.n r0 = new com.google.android.apps.search.assistant.platform.i.e.a.b.n
            java.lang.ThreadLocal r1 = f337204b
            java.lang.Object r1 = r1.get()
            r2 = r1
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r2 = (com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q) r2
            r1 = r0
            r3 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0032
        L_0x0025:
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r0 = new com.google.android.apps.search.assistant.platform.i.e.a.b.q
            java.lang.ThreadLocal r1 = f337204b
            java.lang.Object r1 = r1.get()
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r1 = (com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q) r1
            r0.<init>(r1, r7)
        L_0x0032:
            java.lang.ThreadLocal r7 = f337204b
            r7.set(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121510r.m200803c(com.google.android.apps.search.assistant.platform.i.e.a.b.i):com.google.android.apps.search.assistant.platform.i.e.a.b.q");
    }

    /* renamed from: d */
    private static synchronized Instant m200804d() {
        Instant ofEpochSecond;
        synchronized (C121510r.class) {
            Instant instant = f337205c;
            ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSecond(), (((long) instant.getNano()) + System.nanoTime()) - f337206d);
            Instant instant2 = f337207e;
            if (instant2 != null && !instant2.isBefore(ofEpochSecond)) {
                ofEpochSecond = f337207e.plusNanos(1);
            }
            f337207e = ofEpochSecond;
        }
        return ofEpochSecond;
    }
}
