package com.google.android.libraries.p1672c.p1673a;

import android.content.Context;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.C143339x;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.c.a.r */
/* compiled from: PG */
public final class C19701r implements C19684a {

    /* renamed from: a */
    public static final C58974d f54720a = C58974d.m91134h("CallClientAdapterImpl");

    /* renamed from: b */
    public final List f54721b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Object f54722c = new Object();

    /* renamed from: d */
    public C19700q f54723d = new C19700q(this);

    /* renamed from: e */
    public C143339x f54724e;

    /* renamed from: f */
    public Context f54725f;

    /* renamed from: g */
    public final C19699p f54726g = new C19699p(this);

    public C19701r(List list) {
        if (!(list instanceof C58485gu)) {
            C58485gu.m89842j(list);
        }
    }

    /* renamed from: b */
    public static List m37512b(CarCall carCall, C19700q qVar) {
        ArrayList arrayList = new ArrayList();
        for (CarCall carCall2 : qVar.f54714c) {
            CarCall carCall3 = carCall2.f387932b;
            if (carCall3 != null && carCall3.equals(carCall)) {
                arrayList.add(carCall2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m37513d(Object obj, Object obj2) {
        return !Objects.equals(obj, obj2);
    }

    /* renamed from: e */
    public static final void m37514e(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            CarCall carCall = (CarCall) it.next();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((C143100al) it2.next()).mo21807b(carCall);
            }
            C58976aa aaVar = C58975e.f156826a;
            int i = carCall.f387935e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25080a(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f54722c
            monitor-enter(r0)
            com.google.android.gms.car.x r1 = r4.f54724e     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0073
            com.google.android.libraries.c.a.q r1 = r4.f54723d     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0073
            java.util.Set r1 = r1.f54714c     // Catch:{ all -> 0x0075 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0075 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0075 }
            com.google.android.gms.car.CarCall r2 = (com.google.android.gms.car.CarCall) r2     // Catch:{ all -> 0x0075 }
            int r3 = r2.f387931a     // Catch:{ all -> 0x0075 }
            if (r3 != r5) goto L_0x0011
            int r5 = r2.f387935e     // Catch:{ all -> 0x0075 }
            r1 = 2
            if (r5 != r1) goto L_0x0049
            com.google.android.gms.car.x r5 = r4.f54724e     // Catch:{ all -> 0x0075 }
            r5.getClass()
            com.google.android.gms.tasks.ab r5 = r5.mo118365l(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.c.a.j r1 = new com.google.android.libraries.c.a.j     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.C146013ai.f394700a     // Catch:{ all -> 0x0075 }
            r3 = r5
            com.google.android.gms.tasks.aj r3 = (com.google.android.gms.tasks.C146014aj) r3     // Catch:{ all -> 0x0075 }
            r3.mo122495n(r2, r1)     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.c.a.k r1 = new com.google.android.libraries.c.a.k     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.C146013ai.f394700a     // Catch:{ all -> 0x0075 }
            com.google.android.gms.tasks.aj r5 = (com.google.android.gms.tasks.C146014aj) r5     // Catch:{ all -> 0x0075 }
            r5.mo122494m(r2, r1)     // Catch:{ all -> 0x0075 }
            goto L_0x006b
        L_0x0049:
            com.google.android.gms.car.x r5 = r4.f54724e     // Catch:{ all -> 0x0075 }
            r5.getClass()
            com.google.android.gms.tasks.ab r5 = r5.mo118355b(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.c.a.l r1 = new com.google.android.libraries.c.a.l     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.C146013ai.f394700a     // Catch:{ all -> 0x0075 }
            r3 = r5
            com.google.android.gms.tasks.aj r3 = (com.google.android.gms.tasks.C146014aj) r3     // Catch:{ all -> 0x0075 }
            r3.mo122495n(r2, r1)     // Catch:{ all -> 0x0075 }
            com.google.android.libraries.c.a.m r1 = new com.google.android.libraries.c.a.m     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.C146013ai.f394700a     // Catch:{ all -> 0x0075 }
            com.google.android.gms.tasks.aj r5 = (com.google.android.gms.tasks.C146014aj) r5     // Catch:{ all -> 0x0075 }
            r5.mo122494m(r2, r1)     // Catch:{ all -> 0x0075 }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            r5 = 5
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.C14911j.m31372a(r5)
            return
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0078:
            throw r5
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1672c.p1673a.C19701r.mo25080a(int):void");
    }

    /* renamed from: c */
    public final void mo25083c(CarCall carCall, List list) {
        C19700q qVar = new C19700q(this);
        qVar.f54712a = list;
        qVar.f54713b = carCall;
        C143339x xVar = this.f54724e;
        if (xVar != null) {
            C146006ab d = xVar.mo118357d();
            C146014aj ajVar = (C146014aj) d;
            ajVar.mo122495n(C146013ai.f394700a, new C19686c(qVar));
            C143339x xVar2 = this.f54724e;
            xVar2.getClass();
            C146006ab e = xVar2.mo118358e();
            C146014aj ajVar2 = (C146014aj) e;
            ajVar2.mo122495n(C146013ai.f394700a, new C19687d(qVar));
            C143339x xVar3 = this.f54724e;
            xVar3.getClass();
            C146006ab c = xVar3.mo118356c();
            C146014aj ajVar3 = (C146014aj) c;
            ajVar3.mo122495n(C146013ai.f394700a, new C19688e(qVar));
            C143339x xVar4 = this.f54724e;
            xVar4.getClass();
            C146006ab f = xVar4.mo118359f();
            C146014aj ajVar4 = (C146014aj) f;
            ajVar4.mo122495n(C146013ai.f394700a, new C19689f(qVar));
        }
    }
}
