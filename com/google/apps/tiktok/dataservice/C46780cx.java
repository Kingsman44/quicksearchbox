package com.google.apps.tiktok.dataservice;

import androidx.p060c.C0977g;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58514hw;
import com.google.common.p4522b.C58517hz;
import com.google.common.p4522b.C58692ol;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.cx */
/* compiled from: PG */
public final class C46780cx extends C46778cv implements C46785db {

    /* renamed from: a */
    public final Object f122136a = new Object();

    /* renamed from: b */
    public final Map f122137b = new C0977g();

    /* renamed from: c */
    private final C58692ol f122138c = new C58461fx();

    /* renamed from: f */
    private final void m83336f(Object obj, C46784da daVar) {
        C58514hw hwVar = new C58514hw(4);
        C58517hz hzVar = (C58517hz) this.f122137b.get(obj);
        if (hzVar != null) {
            hwVar.mo55468b(hzVar);
        }
        hwVar.mo55469f(daVar, 1);
        this.f122137b.put(obj, hwVar.mo55467a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83337g(java.lang.Object r7, com.google.apps.tiktok.dataservice.C46784da r8) {
        /*
            r6 = this;
            java.util.Map r0 = r6.f122137b
            java.lang.Object r0 = r0.get(r7)
            com.google.common.b.hz r0 = (com.google.common.p4522b.C58517hz) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            r3 = 1
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.String r4 = "Failed to remove a subscription key. State is corrupted."
            com.google.common.base.C58838bb.m90884s(r3, r4)
            java.util.Map r3 = r6.f122137b
            com.google.common.b.hw r4 = new com.google.common.b.hw
            r5 = 4
            r4.<init>(r5)
            r4.mo55468b(r0)
            int r0 = r0.mo54932lv(r8)
            int r0 = r0 + -1
            com.google.common.b.oz r5 = r4.f156157a
            p3186j$.util.Objects.requireNonNull(r5)
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.f156159c
            if (r0 != 0) goto L_0x003d
            com.google.common.b.pa r0 = new com.google.common.b.pa
            com.google.common.b.oz r5 = r4.f156157a
            r0.<init>((com.google.common.p4522b.C58706oz) r5)
            r4.f156157a = r0
            r4.f156159c = r1
            r0 = 0
            goto L_0x004d
        L_0x003d:
            r0 = 0
        L_0x003e:
            boolean r1 = r4.f156158b
            if (r1 == 0) goto L_0x004d
            com.google.common.b.oz r1 = new com.google.common.b.oz
            com.google.common.b.oz r5 = r4.f156157a
            r1.<init>((com.google.common.p4522b.C58706oz) r5)
            r4.f156157a = r1
            r4.f156159c = r2
        L_0x004d:
            r4.f156158b = r2
            r8.getClass()
            if (r0 != 0) goto L_0x005e
            com.google.common.b.oz r0 = r4.f156157a
            int r1 = com.google.common.p4522b.C58462fy.m89758b(r8)
            r0.mo55799h(r8, r1)
            goto L_0x0063
        L_0x005e:
            com.google.common.b.oz r1 = r4.f156157a
            r1.mo55798g(r8, r0)
        L_0x0063:
            com.google.common.b.hz r8 = r4.mo55467a()
            r3.put(r7, r8)
            java.util.Map r8 = r6.f122137b
            java.lang.Object r8 = r8.get(r7)
            com.google.common.b.hz r8 = (com.google.common.p4522b.C58517hz) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x007d
            java.util.Map r8 = r6.f122137b
            r8.remove(r7)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.dataservice.C46780cx.m83337g(java.lang.Object, com.google.apps.tiktok.dataservice.da):void");
    }

    /* renamed from: h */
    private final boolean m83338h(C46876p pVar) {
        return this.f122138c.mo54931lF(pVar, 1) == 0;
    }

    /* renamed from: i */
    private final boolean m83339i(C46876p pVar) {
        int d = this.f122138c.mo54924d(pVar, 1);
        C58838bb.m90883r(d > 0);
        return d == 1;
    }

    /* renamed from: a */
    public final void mo50787a(C60870cx cxVar, Object obj) {
        mo50789c(cxVar, obj, C46782cz.f122142a, C58836b.f156633a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo50788b(C60870cx cxVar, Object obj) {
        mo50789c(cxVar, obj, C46782cz.f122143b, C58836b.f156633a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo50789c(C60870cx cxVar, Object obj, C46782cz czVar, C58833ax axVar, Executor executor) {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C46779cw(this, obj, czVar, axVar)), executor);
    }

    /* renamed from: d */
    public final void mo50790d(Object obj, C46784da daVar) {
        C19559g.m37304c();
        C58838bb.m90866a(obj, "Cannot subscribe with a null key");
        C0979i iVar = new C0979i(0);
        synchronized (this.f122136a) {
            if (obj instanceof C46691ai) {
                C58800sl lA = ((C46691ai) obj).mo50742b().iterator();
                while (lA.hasNext()) {
                    Object next = lA.next();
                    m83336f(next, daVar);
                    if (next instanceof C46876p) {
                        C46876p pVar = (C46876p) next;
                        if (m83338h(pVar)) {
                            iVar.add(pVar);
                        }
                    }
                }
            } else {
                m83336f(obj, daVar);
                if (obj instanceof C46876p) {
                    C46876p pVar2 = (C46876p) obj;
                    if (m83338h(pVar2)) {
                        iVar.add(pVar2);
                    }
                }
            }
        }
        C0978h hVar = new C0978h(iVar);
        while (hVar.hasNext()) {
            C46876p pVar3 = (C46876p) hVar.next();
            pVar3.f122309b.f122311b.getContentResolver().registerContentObserver(pVar3.f122308a, false, pVar3);
        }
    }

    /* renamed from: e */
    public final void mo50791e(Object obj, C46784da daVar) {
        C19559g.m37304c();
        C58838bb.m90866a(obj, "Cannot unsubscribe from a null key");
        C0979i iVar = new C0979i(0);
        synchronized (this.f122136a) {
            if (obj instanceof C46691ai) {
                C58800sl lA = ((C46691ai) obj).mo50742b().iterator();
                while (lA.hasNext()) {
                    Object next = lA.next();
                    m83337g(next, daVar);
                    if (next instanceof C46876p) {
                        C46876p pVar = (C46876p) next;
                        if (m83339i(pVar)) {
                            iVar.add(pVar);
                        }
                    }
                }
            } else {
                m83337g(obj, daVar);
                if (obj instanceof C46876p) {
                    C46876p pVar2 = (C46876p) obj;
                    if (m83339i(pVar2)) {
                        iVar.add(pVar2);
                    }
                }
            }
        }
        C0978h hVar = new C0978h(iVar);
        while (hVar.hasNext()) {
            C46876p pVar3 = (C46876p) hVar.next();
            pVar3.f122309b.f122311b.getContentResolver().unregisterContentObserver(pVar3);
        }
    }
}
