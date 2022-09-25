package android.support.p031v4.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2046bl;
import androidx.p060c.C0977g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v4.app.q */
/* compiled from: PG */
final class C0254q extends C0239dd {
    public C0254q(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: d */
    static final void m576d(C0238dc dcVar) {
        C0237db.m554d(dcVar.f876e, dcVar.f872a.mView);
    }

    /* renamed from: e */
    static final void m577e(C0977g gVar, Collection collection) {
        Iterator it = gVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C2043bi.m5511E((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo769a(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C2046bl.m5604c(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo769a(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v52, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0503, code lost:
        if (r10 == r11) goto L_0x0508;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x054c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo746b(java.util.List r35, boolean r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            java.util.Iterator r2 = r35.iterator()
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000b:
            boolean r6 = r2.hasNext()
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r2.next()
            android.support.v4.app.dc r6 = (android.support.p031v4.app.C0238dc) r6
            android.support.v4.app.Fragment r10 = r6.f872a
            android.view.View r10 = r10.mView
            int r10 = android.support.p031v4.app.C0237db.m553c(r10)
            int r11 = r6.f876e
            int r12 = r11 + -1
            if (r11 == 0) goto L_0x003c
            if (r12 == 0) goto L_0x0036
            if (r12 == r9) goto L_0x0031
            if (r12 == r8) goto L_0x0036
            if (r12 == r7) goto L_0x0036
            goto L_0x000b
        L_0x0031:
            if (r10 != r8) goto L_0x0034
            goto L_0x000b
        L_0x0034:
            r5 = r6
            goto L_0x000b
        L_0x0036:
            if (r10 != r8) goto L_0x000b
            if (r4 != 0) goto L_0x000b
            r4 = r6
            goto L_0x000b
        L_0x003c:
            throw r3
        L_0x003d:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r8)
            java.lang.String r6 = " to "
            java.lang.String r10 = "FragmentManager"
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r11 = "Executing operations from "
            r2.<init>(r11)
            r2.append(r4)
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r10, r2)
        L_0x005e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = r35
            r12.<init>(r13)
            java.util.Iterator r13 = r35.iterator()
        L_0x0073:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00b4
            java.lang.Object r14 = r13.next()
            android.support.v4.app.dc r14 = (android.support.p031v4.app.C0238dc) r14
            androidx.core.f.f r7 = new androidx.core.f.f
            r7.<init>()
            r14.mo743e(r7)
            android.support.v4.app.n r9 = new android.support.v4.app.n
            r9.<init>(r14, r7, r1)
            r2.add(r9)
            androidx.core.f.f r7 = new androidx.core.f.f
            r7.<init>()
            r14.mo743e(r7)
            android.support.v4.app.p r9 = new android.support.v4.app.p
            if (r1 == 0) goto L_0x009e
            if (r14 != r4) goto L_0x00a2
            goto L_0x00a0
        L_0x009e:
            if (r14 != r5) goto L_0x00a2
        L_0x00a0:
            r15 = 1
            goto L_0x00a3
        L_0x00a2:
            r15 = 0
        L_0x00a3:
            r9.<init>(r14, r7, r1, r15)
            r11.add(r9)
            android.support.v4.app.d r7 = new android.support.v4.app.d
            r7.<init>(r12, r14)
            r14.mo741c(r7)
            r7 = 3
            r9 = 1
            goto L_0x0073
        L_0x00b4:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r9 = r11.iterator()
            r13 = r3
        L_0x00be:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x0148
            java.lang.Object r14 = r9.next()
            android.support.v4.app.p r14 = (android.support.p031v4.app.C0253p) r14
            boolean r17 = r14.mo767c()
            if (r17 != 0) goto L_0x0140
            java.lang.Object r3 = r14.f915c
            android.support.v4.app.cn r3 = r14.mo768a(r3)
            java.lang.Object r8 = r14.f917e
            android.support.v4.app.cn r8 = r14.mo768a(r8)
            java.lang.String r15 = " returned Transition "
            r17 = r9
            java.lang.String r9 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r3 == 0) goto L_0x0111
            if (r8 == 0) goto L_0x0111
            if (r3 != r8) goto L_0x00e9
            goto L_0x0111
        L_0x00e9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            android.support.v4.app.dc r3 = r14.f913a
            android.support.v4.app.Fragment r3 = r3.f872a
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r14.f915c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r3 = r14.f917e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0111:
            if (r3 != 0) goto L_0x0114
            r3 = r8
        L_0x0114:
            if (r13 != 0) goto L_0x0118
            r13 = r3
            goto L_0x0142
        L_0x0118:
            if (r3 == 0) goto L_0x0142
            if (r13 != r3) goto L_0x011d
            goto L_0x0142
        L_0x011d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            android.support.v4.app.dc r3 = r14.f913a
            android.support.v4.app.Fragment r3 = r3.f872a
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r14.f915c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than other Fragments."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0140:
            r17 = r9
        L_0x0142:
            r9 = r17
            r3 = 0
            r8 = 2
            goto L_0x00be
        L_0x0148:
            if (r13 != 0) goto L_0x0178
            java.util.Iterator r1 = r11.iterator()
        L_0x014e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0168
            java.lang.Object r3 = r1.next()
            android.support.v4.app.p r3 = (android.support.p031v4.app.C0253p) r3
            android.support.v4.app.dc r8 = r3.f913a
            r9 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            r7.put(r8, r11)
            r3.mo766b()
            goto L_0x014e
        L_0x0168:
            r26 = r2
            r24 = r4
            r31 = r5
            r25 = r6
            r30 = r10
            r28 = r12
            r1 = 1
            r2 = 0
            goto L_0x0692
        L_0x0178:
            android.view.View r3 = new android.view.View
            android.view.ViewGroup r8 = r0.f879a
            android.content.Context r8 = r8.getContext()
            r3.<init>(r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            androidx.c.g r15 = new androidx.c.g
            r15.<init>()
            java.util.Iterator r23 = r11.iterator()
            r26 = r2
            r25 = r6
            r2 = 0
            r6 = 0
            r24 = 0
        L_0x01a3:
            boolean r17 = r23.hasNext()
            if (r17 == 0) goto L_0x03c4
            java.lang.Object r17 = r23.next()
            r27 = r6
            r6 = r17
            android.support.v4.app.p r6 = (android.support.p031v4.app.C0253p) r6
            java.lang.Object r6 = r6.f917e
            if (r6 == 0) goto L_0x03b6
            if (r4 == 0) goto L_0x03b6
            if (r5 == 0) goto L_0x03b6
            java.lang.Object r2 = r13.mo709a(r6)
            java.lang.Object r2 = r13.mo711c(r2)
            android.support.v4.app.Fragment r6 = r5.f872a
            java.util.ArrayList r6 = r6.getSharedElementSourceNames()
            r28 = r12
            android.support.v4.app.Fragment r12 = r4.f872a
            java.util.ArrayList r12 = r12.getSharedElementSourceNames()
            r29 = r11
            android.support.v4.app.Fragment r11 = r4.f872a
            java.util.ArrayList r11 = r11.getSharedElementTargetNames()
            r31 = r3
            r30 = r7
            r7 = 0
        L_0x01de:
            int r3 = r11.size()
            if (r7 >= r3) goto L_0x01ff
            java.lang.Object r3 = r11.get(r7)
            int r3 = r6.indexOf(r3)
            r17 = r11
            r11 = -1
            if (r3 == r11) goto L_0x01fa
            java.lang.Object r11 = r12.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            r6.set(r3, r11)
        L_0x01fa:
            int r7 = r7 + 1
            r11 = r17
            goto L_0x01de
        L_0x01ff:
            android.support.v4.app.Fragment r3 = r5.f872a
            java.util.ArrayList r3 = r3.getSharedElementTargetNames()
            if (r1 != 0) goto L_0x0214
            android.support.v4.app.Fragment r7 = r4.f872a
            androidx.core.app.bb r7 = r7.getExitTransitionCallback()
            android.support.v4.app.Fragment r11 = r5.f872a
            androidx.core.app.bb r11 = r11.getEnterTransitionCallback()
            goto L_0x0220
        L_0x0214:
            android.support.v4.app.Fragment r7 = r4.f872a
            androidx.core.app.bb r7 = r7.getEnterTransitionCallback()
            android.support.v4.app.Fragment r11 = r5.f872a
            androidx.core.app.bb r11 = r11.getExitTransitionCallback()
        L_0x0220:
            int r12 = r6.size()
            r32 = r8
            r8 = 0
        L_0x0227:
            if (r8 >= r12) goto L_0x0247
            java.lang.Object r17 = r6.get(r8)
            r18 = r12
            r12 = r17
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r17 = r3.get(r8)
            r33 = r2
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2
            r15.put(r12, r2)
            int r8 = r8 + 1
            r12 = r18
            r2 = r33
            goto L_0x0227
        L_0x0247:
            r33 = r2
            r2 = 2
            boolean r8 = android.support.p031v4.app.FragmentManager.m246Z(r2)
            if (r8 == 0) goto L_0x029a
            java.lang.String r2 = ">>> entering view names <<<"
            android.util.Log.v(r10, r2)
            int r2 = r3.size()
            r8 = 0
        L_0x025a:
            java.lang.String r12 = "Name: "
            if (r8 >= r2) goto L_0x0276
            java.lang.Object r17 = r3.get(r8)
            java.lang.String r17 = (java.lang.String) r17
            r18 = r2
            java.lang.String r2 = java.lang.String.valueOf(r17)
            java.lang.String r2 = r12.concat(r2)
            android.util.Log.v(r10, r2)
            int r8 = r8 + 1
            r2 = r18
            goto L_0x025a
        L_0x0276:
            java.lang.String r2 = ">>> exiting view names <<<"
            android.util.Log.v(r10, r2)
            int r2 = r6.size()
            r8 = 0
        L_0x0280:
            if (r8 >= r2) goto L_0x029a
            java.lang.Object r17 = r6.get(r8)
            java.lang.String r17 = (java.lang.String) r17
            r18 = r2
            java.lang.String r2 = java.lang.String.valueOf(r17)
            java.lang.String r2 = r12.concat(r2)
            android.util.Log.v(r10, r2)
            int r8 = r8 + 1
            r2 = r18
            goto L_0x0280
        L_0x029a:
            androidx.c.g r2 = new androidx.c.g
            r2.<init>()
            android.support.v4.app.Fragment r8 = r4.f872a
            android.view.View r8 = r8.mView
            r0.mo770c(r2, r8)
            r2.mo3643b(r6)
            if (r7 == 0) goto L_0x02c9
            r7 = 2
            boolean r1 = android.support.p031v4.app.FragmentManager.m246Z(r7)
            if (r1 == 0) goto L_0x02c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Executing exit callback for operation "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r4.toString()
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.v(r10, r1)
        L_0x02c7:
            r1 = 0
            throw r1
        L_0x02c9:
            java.util.Set r7 = r2.keySet()
            r15.mo3643b(r7)
            androidx.c.g r7 = new androidx.c.g
            r7.<init>()
            android.support.v4.app.Fragment r8 = r5.f872a
            android.view.View r8 = r8.mView
            r0.mo770c(r7, r8)
            r7.mo3643b(r3)
            java.util.Collection r8 = r15.values()
            r7.mo3643b(r8)
            if (r11 == 0) goto L_0x0306
            r8 = 2
            boolean r1 = android.support.p031v4.app.FragmentManager.m246Z(r8)
            if (r1 == 0) goto L_0x0304
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Executing enter callback for operation "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.v(r10, r1)
        L_0x0304:
            r1 = 0
            throw r1
        L_0x0306:
            android.support.p031v4.app.C0214cf.m503b(r15, r7)
            java.util.Set r8 = r15.keySet()
            m577e(r2, r8)
            java.util.Collection r8 = r15.values()
            m577e(r7, r8)
            boolean r8 = r15.isEmpty()
            if (r8 == 0) goto L_0x032e
            r9.clear()
            r14.clear()
            r6 = r27
            r7 = r30
            r3 = r31
            r11 = r32
            r2 = 0
            goto L_0x03bd
        L_0x032e:
            android.support.v4.app.Fragment r8 = r5.f872a
            android.support.v4.app.Fragment r11 = r4.f872a
            r12 = 1
            android.support.p031v4.app.C0214cf.m502a(r8, r11, r1, r2, r12)
            android.view.ViewGroup r8 = r0.f879a
            android.support.v4.app.j r11 = new android.support.v4.app.j
            r11.<init>(r5, r4, r1, r7)
            androidx.core.p098j.C2013ag.m5361b(r8, r11)
            java.util.Collection r8 = r2.values()
            r9.addAll(r8)
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x0361
            r8 = 0
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.get(r6)
            r6 = r2
            android.view.View r6 = (android.view.View) r6
            r2 = r33
            r13.mo718j(r2, r6)
            goto L_0x0366
        L_0x0361:
            r2 = r33
            r8 = 0
            r6 = r27
        L_0x0366:
            java.util.Collection r11 = r7.values()
            r14.addAll(r11)
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x0392
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r7.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0392
            android.view.ViewGroup r7 = r0.f879a
            android.support.v4.app.k r8 = new android.support.v4.app.k
            r11 = r32
            r8.<init>(r3, r11)
            androidx.core.p098j.C2013ag.m5361b(r7, r8)
            r3 = r31
            r24 = 1
            goto L_0x0396
        L_0x0392:
            r11 = r32
            r3 = r31
        L_0x0396:
            r13.mo719k(r2, r3, r9)
            r19 = 0
            r20 = 0
            r17 = r13
            r18 = r2
            r21 = r2
            r22 = r14
            r17.mo723o(r18, r19, r20, r21, r22)
            r7 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r7 = r30
            r7.put(r4, r8)
            r7.put(r5, r8)
            goto L_0x03bd
        L_0x03b6:
            r29 = r11
            r28 = r12
            r11 = r8
            r6 = r27
        L_0x03bd:
            r8 = r11
            r12 = r28
            r11 = r29
            goto L_0x01a3
        L_0x03c4:
            r27 = r6
            r29 = r11
            r28 = r12
            r11 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r29.iterator()
            r8 = 0
            r12 = 0
        L_0x03d6:
            boolean r17 = r6.hasNext()
            if (r17 == 0) goto L_0x04d6
            java.lang.Object r17 = r6.next()
            r36 = r6
            r6 = r17
            android.support.v4.app.p r6 = (android.support.p031v4.app.C0253p) r6
            boolean r17 = r6.mo767c()
            if (r17 == 0) goto L_0x0405
            r23 = r15
            android.support.v4.app.dc r15 = r6.f913a
            r30 = r10
            r17 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)
            r7.put(r15, r10)
            r6.mo766b()
            r6 = r36
            r15 = r23
            r10 = r30
            goto L_0x03d6
        L_0x0405:
            r30 = r10
            r23 = r15
            java.lang.Object r10 = r6.f915c
            java.lang.Object r10 = r13.mo709a(r10)
            android.support.v4.app.dc r15 = r6.f913a
            if (r2 == 0) goto L_0x041a
            if (r15 == r4) goto L_0x0417
            if (r15 != r5) goto L_0x041a
        L_0x0417:
            r17 = 1
            goto L_0x041c
        L_0x041a:
            r17 = 0
        L_0x041c:
            if (r10 != 0) goto L_0x0438
            if (r17 != 0) goto L_0x042e
            r31 = r5
            r10 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r7.put(r15, r5)
            r6.mo766b()
            goto L_0x0430
        L_0x042e:
            r31 = r5
        L_0x0430:
            r32 = r2
            r17 = r3
            r2 = r27
            goto L_0x04c6
        L_0x0438:
            r31 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r32 = r2
            android.support.v4.app.Fragment r2 = r15.f872a
            android.view.View r2 = r2.mView
            r0.mo769a(r5, r2)
            if (r17 == 0) goto L_0x0453
            if (r15 != r4) goto L_0x0450
            r5.removeAll(r9)
            goto L_0x0453
        L_0x0450:
            r5.removeAll(r14)
        L_0x0453:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x045f
            r13.mo712d(r10, r3)
            r17 = r3
            goto L_0x049a
        L_0x045f:
            r13.mo713e(r10, r5)
            r21 = 0
            r22 = 0
            r17 = r13
            r18 = r10
            r19 = r10
            r20 = r5
            r17.mo723o(r18, r19, r20, r21, r22)
            int r2 = r15.f876e
            r17 = r3
            r3 = 3
            if (r2 != r3) goto L_0x049a
            r2 = r28
            r2.remove(r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            android.support.v4.app.Fragment r2 = r15.f872a
            android.view.View r2 = r2.mView
            r3.remove(r2)
            android.support.v4.app.Fragment r2 = r15.f872a
            android.view.View r2 = r2.mView
            r13.mo716h(r10, r2, r3)
            android.view.ViewGroup r2 = r0.f879a
            android.support.v4.app.l r3 = new android.support.v4.app.l
            r3.<init>(r5)
            androidx.core.p098j.C2013ag.m5361b(r2, r3)
        L_0x049a:
            int r2 = r15.f876e
            r3 = 2
            if (r2 != r3) goto L_0x04aa
            r1.addAll(r5)
            if (r24 == 0) goto L_0x04a7
            r13.mo717i(r10, r11)
        L_0x04a7:
            r2 = r27
            goto L_0x04af
        L_0x04aa:
            r2 = r27
            r13.mo718j(r10, r2)
        L_0x04af:
            r3 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r7.put(r15, r5)
            boolean r3 = r6.f916d
            if (r3 == 0) goto L_0x04c1
            java.lang.Object r3 = r13.mo722n(r8, r10)
            r8 = r3
            goto L_0x04c6
        L_0x04c1:
            java.lang.Object r3 = r13.mo722n(r12, r10)
            r12 = r3
        L_0x04c6:
            r6 = r36
            r27 = r2
            r3 = r17
            r15 = r23
            r10 = r30
            r5 = r31
            r2 = r32
            goto L_0x03d6
        L_0x04d6:
            r3 = r2
            r31 = r5
            r30 = r10
            r23 = r15
            java.lang.Object r2 = r13.mo710b(r8, r12, r3)
            if (r2 == 0) goto L_0x068e
            java.util.Iterator r5 = r29.iterator()
        L_0x04e7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x055d
            java.lang.Object r6 = r5.next()
            android.support.v4.app.p r6 = (android.support.p031v4.app.C0253p) r6
            boolean r8 = r6.mo767c()
            if (r8 != 0) goto L_0x04e7
            java.lang.Object r8 = r6.f915c
            android.support.v4.app.dc r10 = r6.f913a
            if (r3 == 0) goto L_0x050a
            if (r10 == r4) goto L_0x0506
            r11 = r31
            if (r10 != r11) goto L_0x050c
            goto L_0x0508
        L_0x0506:
            r11 = r31
        L_0x0508:
            r12 = 1
            goto L_0x050d
        L_0x050a:
            r11 = r31
        L_0x050c:
            r12 = 0
        L_0x050d:
            if (r8 != 0) goto L_0x0515
            if (r12 == 0) goto L_0x0512
            goto L_0x0515
        L_0x0512:
            r31 = r11
            goto L_0x04e7
        L_0x0515:
            android.view.ViewGroup r8 = r0.f879a
            boolean r8 = androidx.core.p098j.C2043bi.m5570ax(r8)
            if (r8 != 0) goto L_0x054c
            r8 = 2
            boolean r12 = android.support.p031v4.app.FragmentManager.m246Z(r8)
            if (r12 == 0) goto L_0x0542
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "SpecialEffectsController: Container "
            r8.<init>(r12)
            android.view.ViewGroup r12 = r0.f879a
            r8.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            r8.append(r12)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r12 = r30
            android.util.Log.v(r12, r8)
            goto L_0x0544
        L_0x0542:
            r12 = r30
        L_0x0544:
            r6.mo766b()
            r31 = r11
            r30 = r12
            goto L_0x04e7
        L_0x054c:
            r12 = r30
            android.support.v4.app.dc r8 = r6.f913a
            android.support.v4.app.Fragment r8 = r8.f872a
            androidx.core.f.f r8 = r6.f914b
            android.support.v4.app.m r15 = new android.support.v4.app.m
            r15.<init>(r6, r10)
            r13.mo724p(r2, r8, r15)
            goto L_0x0512
        L_0x055d:
            r12 = r30
            r11 = r31
            android.view.ViewGroup r5 = r0.f879a
            boolean r5 = androidx.core.p098j.C2043bi.m5570ax(r5)
            if (r5 == 0) goto L_0x0687
            r5 = 4
            android.support.p031v4.app.C0214cf.m504c(r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r14.size()
            r8 = 0
        L_0x0577:
            if (r8 >= r6) goto L_0x058d
            java.lang.Object r10 = r14.get(r8)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r15 = androidx.core.p098j.C2043bi.m5511E(r10)
            r5.add(r15)
            r15 = 0
            androidx.core.p098j.C2043bi.m5561ao(r10, r15)
            int r8 = r8 + 1
            goto L_0x0577
        L_0x058d:
            r8 = 2
            boolean r6 = android.support.p031v4.app.FragmentManager.m246Z(r8)
            if (r6 == 0) goto L_0x0609
            java.lang.String r6 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r12, r6)
            java.lang.String r6 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r12, r6)
            int r6 = r9.size()
            r8 = 0
        L_0x05a3:
            java.lang.String r10 = " Name: "
            java.lang.String r15 = "View: "
            if (r8 >= r6) goto L_0x05d5
            java.lang.Object r17 = r9.get(r8)
            r36 = r6
            r6 = r17
            android.view.View r6 = (android.view.View) r6
            r31 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r15)
            r11.append(r6)
            r11.append(r10)
            java.lang.String r6 = androidx.core.p098j.C2043bi.m5511E(r6)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            android.util.Log.v(r12, r6)
            int r8 = r8 + 1
            r6 = r36
            r11 = r31
            goto L_0x05a3
        L_0x05d5:
            r31 = r11
            java.lang.String r6 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r12, r6)
            int r6 = r14.size()
            r8 = 0
        L_0x05e1:
            if (r8 >= r6) goto L_0x060b
            java.lang.Object r11 = r14.get(r8)
            android.view.View r11 = (android.view.View) r11
            r36 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r15)
            r6.append(r11)
            r6.append(r10)
            java.lang.String r11 = androidx.core.p098j.C2043bi.m5511E(r11)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r12, r6)
            int r8 = r8 + 1
            r6 = r36
            goto L_0x05e1
        L_0x0609:
            r31 = r11
        L_0x060b:
            android.view.ViewGroup r6 = r0.f879a
            r13.mo714f(r6, r2)
            android.view.ViewGroup r2 = r0.f879a
            int r6 = r14.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = 0
        L_0x061c:
            if (r10 >= r6) goto L_0x0667
            java.lang.Object r11 = r9.get(r10)
            android.view.View r11 = (android.view.View) r11
            java.lang.String r15 = androidx.core.p098j.C2043bi.m5511E(r11)
            r8.add(r15)
            if (r15 != 0) goto L_0x0632
            r24 = r4
            r30 = r12
            goto L_0x0660
        L_0x0632:
            r24 = r4
            r4 = 0
            androidx.core.p098j.C2043bi.m5561ao(r11, r4)
            r11 = r23
            java.lang.Object r17 = r11.get(r15)
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4
            r11 = 0
        L_0x0643:
            r30 = r12
            if (r11 >= r6) goto L_0x0660
            java.lang.Object r12 = r5.get(r11)
            boolean r12 = r4.equals(r12)
            if (r12 == 0) goto L_0x065b
            java.lang.Object r4 = r14.get(r11)
            android.view.View r4 = (android.view.View) r4
            androidx.core.p098j.C2043bi.m5561ao(r4, r15)
            goto L_0x0660
        L_0x065b:
            int r11 = r11 + 1
            r12 = r30
            goto L_0x0643
        L_0x0660:
            int r10 = r10 + 1
            r4 = r24
            r12 = r30
            goto L_0x061c
        L_0x0667:
            r24 = r4
            r30 = r12
            android.support.v4.app.cm r4 = new android.support.v4.app.cm
            r17 = r4
            r18 = r6
            r19 = r14
            r20 = r5
            r21 = r9
            r22 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            androidx.core.p098j.C2013ag.m5361b(r2, r4)
            r2 = 0
            android.support.p031v4.app.C0214cf.m504c(r1, r2)
            r13.mo720l(r3, r9, r14)
            goto L_0x0691
        L_0x0687:
            r24 = r4
            r31 = r11
            r30 = r12
            goto L_0x0690
        L_0x068e:
            r24 = r4
        L_0x0690:
            r2 = 0
        L_0x0691:
            r1 = 1
        L_0x0692:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r7.containsValue(r3)
            android.view.ViewGroup r3 = r0.f879a
            android.content.Context r4 = r3.getContext()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r26.iterator()
            r9 = 0
        L_0x06aa:
            boolean r8 = r6.hasNext()
            java.lang.String r14 = " has started."
            if (r8 == 0) goto L_0x077e
            java.lang.Object r8 = r6.next()
            r15 = r8
            android.support.v4.app.n r15 = (android.support.p031v4.app.C0251n) r15
            boolean r8 = r15.mo767c()
            if (r8 == 0) goto L_0x06c5
            r15.mo766b()
        L_0x06c2:
            r11 = r30
            goto L_0x070c
        L_0x06c5:
            android.support.v4.app.an r8 = r15.mo765a(r4)
            if (r8 != 0) goto L_0x06cf
            r15.mo766b()
            goto L_0x06c2
        L_0x06cf:
            android.animation.Animator r13 = r8.f733b
            if (r13 != 0) goto L_0x06d7
            r5.add(r15)
            goto L_0x06c2
        L_0x06d7:
            android.support.v4.app.dc r12 = r15.f913a
            android.support.v4.app.Fragment r8 = r12.f872a
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r7.get(r12)
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x070f
            r10 = 2
            boolean r11 = android.support.p031v4.app.FragmentManager.m246Z(r10)
            if (r11 == 0) goto L_0x0707
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Ignoring Animator set on "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = " as this Fragment was involved in a Transition."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r11 = r30
            android.util.Log.v(r11, r8)
            goto L_0x0709
        L_0x0707:
            r11 = r30
        L_0x0709:
            r15.mo766b()
        L_0x070c:
            r30 = r11
            goto L_0x06aa
        L_0x070f:
            r11 = r30
            int r9 = r12.f876e
            r10 = 3
            if (r9 != r10) goto L_0x0719
            r16 = 1
            goto L_0x071b
        L_0x0719:
            r16 = 0
        L_0x071b:
            r9 = r28
            if (r16 == 0) goto L_0x0722
            r9.remove(r12)
        L_0x0722:
            android.view.View r8 = r8.mView
            r3.startViewTransition(r8)
            android.support.v4.app.e r2 = new android.support.v4.app.e
            r36 = r8
            r8 = r2
            r28 = r9
            r9 = r3
            r17 = 3
            r10 = r36
            r0 = r11
            r11 = r16
            r16 = r12
            r18 = r6
            r6 = r13
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r6.addListener(r2)
            r2 = r36
            r6.setTarget(r2)
            r6.start()
            r2 = 2
            boolean r8 = android.support.p031v4.app.FragmentManager.m246Z(r2)
            if (r8 == 0) goto L_0x0768
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Animator from operation "
            r2.<init>(r8)
            r8 = r16
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r0, r2)
            goto L_0x076a
        L_0x0768:
            r8 = r16
        L_0x076a:
            androidx.core.f.f r2 = r15.f914b
            android.support.v4.app.f r9 = new android.support.v4.app.f
            r9.<init>(r6, r8)
            r2.mo5046a(r9)
            r30 = r0
            r6 = r18
            r2 = 0
            r9 = 1
            r0 = r34
            goto L_0x06aa
        L_0x077e:
            r0 = r30
            int r2 = r5.size()
            r6 = 0
        L_0x0785:
            if (r6 >= r2) goto L_0x082c
            java.lang.Object r7 = r5.get(r6)
            android.support.v4.app.n r7 = (android.support.p031v4.app.C0251n) r7
            android.support.v4.app.dc r8 = r7.f913a
            android.support.v4.app.Fragment r10 = r8.f872a
            java.lang.String r11 = "Ignoring Animation set on "
            if (r1 == 0) goto L_0x07b5
            r12 = 2
            boolean r8 = android.support.p031v4.app.FragmentManager.m246Z(r12)
            if (r8 == 0) goto L_0x07b0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r11)
            r8.append(r10)
            java.lang.String r10 = " as Animations cannot run alongside Transitions."
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r0, r8)
        L_0x07b0:
            r7.mo766b()
        L_0x07b3:
            r13 = 1
            goto L_0x0828
        L_0x07b5:
            if (r9 == 0) goto L_0x07d6
            r12 = 2
            boolean r8 = android.support.p031v4.app.FragmentManager.m246Z(r12)
            if (r8 == 0) goto L_0x07d2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r11)
            r8.append(r10)
            java.lang.String r10 = " as Animations cannot run alongside Animators."
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r0, r8)
        L_0x07d2:
            r7.mo766b()
            goto L_0x07b3
        L_0x07d6:
            android.view.View r10 = r10.mView
            android.support.v4.app.an r11 = r7.mo765a(r4)
            r11.getClass()
            android.view.animation.Animation r11 = r11.f732a
            r11.getClass()
            int r12 = r8.f876e
            r13 = 1
            if (r12 == r13) goto L_0x07f0
            r10.startAnimation(r11)
            r7.mo766b()
            goto L_0x081e
        L_0x07f0:
            r3.startViewTransition(r10)
            android.support.v4.app.ao r12 = new android.support.v4.app.ao
            r12.<init>(r11, r3, r10)
            android.support.v4.app.h r11 = new android.support.v4.app.h
            r11.<init>(r8, r3, r10, r7)
            r12.setAnimationListener(r11)
            r10.startAnimation(r12)
            r11 = 2
            boolean r12 = android.support.p031v4.app.FragmentManager.m246Z(r11)
            if (r12 == 0) goto L_0x081e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Animation from operation "
            r11.<init>(r12)
            r11.append(r8)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r0, r11)
        L_0x081e:
            androidx.core.f.f r11 = r7.f914b
            android.support.v4.app.i r12 = new android.support.v4.app.i
            r12.<init>(r10, r3, r7, r8)
            r11.mo5046a(r12)
        L_0x0828:
            int r6 = r6 + 1
            goto L_0x0785
        L_0x082c:
            int r1 = r28.size()
            r15 = 0
        L_0x0831:
            if (r15 >= r1) goto L_0x0841
            r2 = r28
            java.lang.Object r3 = r2.get(r15)
            android.support.v4.app.dc r3 = (android.support.p031v4.app.C0238dc) r3
            m576d(r3)
            int r15 = r15 + 1
            goto L_0x0831
        L_0x0841:
            r2 = r28
            r2.clear()
            r1 = 2
            boolean r1 = android.support.p031v4.app.FragmentManager.m246Z(r1)
            if (r1 == 0) goto L_0x086a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Completed executing operations from "
            r1.<init>(r2)
            r3 = r24
            r1.append(r3)
            r2 = r25
            r1.append(r2)
            r3 = r31
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x086a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.C0254q.mo746b(java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo770c(Map map, View view) {
        String E = C2043bi.m5511E(view);
        if (E != null) {
            map.put(E, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo770c(map, childAt);
                }
            }
        }
    }
}
