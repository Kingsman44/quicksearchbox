package com.facebook.p313c.p318e;

import android.graphics.Rect;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6187dg;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6058q;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.facebook.c.e.d */
/* compiled from: PG */
public final class C6044d extends C6022b {

    /* renamed from: a */
    public static final C6044d f17773a = new C6044d();

    private C6044d() {
    }

    /* renamed from: h */
    public static void m15543h(C6021a aVar) {
        C6043c cVar = (C6043c) aVar.f17741b;
        C6058q.m15623a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.f17767a.entrySet()) {
            C6042b bVar = (C6042b) entry.getValue();
            if (bVar.f17761a) {
                bVar.f17761a = false;
            } else {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            C6042b bVar2 = (C6042b) cVar.f17767a.get(str);
            if (bVar2 != null) {
                C6154cb cbVar = bVar2.f17765e;
                C6154cb cbVar2 = bVar2.f17766f;
                C6154cb cbVar3 = bVar2.f17764d;
                if (cbVar != null) {
                    C6046f.m15557a(cbVar, cVar.f17772f);
                }
                if (bVar2.mo12608b()) {
                    bVar2.mo12607a(false);
                    if (cbVar2 != null) {
                        C6046f.m15558b(cbVar2);
                    }
                }
                if (cbVar3 != null) {
                    C6046f.m15559c(cbVar3, 0, 0, 0, 0, 0.0f, 0.0f);
                }
                bVar2.f17762b = false;
            }
            cVar.f17767a.remove(str);
        }
        C6057p pVar = C6058q.f17821a;
        cVar.f17768b.setEmpty();
    }

    @Deprecated
    /* renamed from: j */
    public static void m15544j(C6021a aVar, C6040e eVar) {
        ((C6043c) aVar.f17741b).f17772f = eVar;
    }

    /* renamed from: k */
    public static final void m15545k(C6021a aVar, C6041a aVar2, Rect rect) {
        C6058q.m15623a();
        C6043c cVar = (C6043c) aVar.f17741b;
        C6187dg dgVar = (C6187dg) aVar2;
        cVar.f17769c = dgVar.f18304i;
        cVar.f17770d = dgVar.f18308m;
        cVar.f17768b.setEmpty();
        cVar.f17771e = rect;
        C6057p pVar = C6058q.f17821a;
    }

    /* renamed from: l */
    private static int m15546l(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* renamed from: m */
    private static C6040e m15547m(C6021a aVar) {
        C6040e eVar = ((C6043c) aVar.f17741b).f17772f;
        return eVar == null ? aVar.mo12569a() : eVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0180, code lost:
        if (r10.equals(r6) != false) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c4 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d0 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01dc A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f4 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020e A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0240 A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0243 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014f A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015a A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b A[Catch:{ all -> 0x028c }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ad A[Catch:{ all -> 0x028c }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15548o(com.facebook.p313c.p314a.C6021a r28, android.graphics.Rect r29, boolean r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.Object r3 = r0.f17741b
            com.facebook.c.e.c r3 = (com.facebook.p313c.p318e.C6043c) r3
            com.facebook.p313c.C6058q.m15623a()     // Catch:{ all -> 0x028c }
            java.lang.Object r4 = r0.f17741b     // Catch:{ all -> 0x028c }
            com.facebook.c.e.c r4 = (com.facebook.p313c.p318e.C6043c) r4     // Catch:{ all -> 0x028c }
            android.graphics.Rect r4 = r4.f17768b     // Catch:{ all -> 0x028c }
            if (r1 == 0) goto L_0x0279
            if (r2 != 0) goto L_0x001f
            boolean r5 = r4.equals(r1)     // Catch:{ all -> 0x028c }
            if (r5 == 0) goto L_0x001f
            goto L_0x0279
        L_0x001f:
            r29.isEmpty()     // Catch:{ all -> 0x028c }
            java.lang.Object r4 = r0.f17741b     // Catch:{ all -> 0x028c }
            com.facebook.c.e.c r4 = (com.facebook.p313c.p318e.C6043c) r4     // Catch:{ all -> 0x028c }
            java.util.List r5 = r4.f17769c     // Catch:{ all -> 0x028c }
            int r5 = r5.size()     // Catch:{ all -> 0x028c }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ all -> 0x028c }
            r6.<init>()     // Catch:{ all -> 0x028c }
            r8 = 0
        L_0x0032:
            if (r8 >= r5) goto L_0x0250
            java.util.List r9 = r4.f17769c     // Catch:{ all -> 0x028c }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x028c }
            com.facebook.c.e.e r9 = (com.facebook.p313c.p318e.C6045e) r9     // Catch:{ all -> 0x028c }
            java.lang.String r10 = r9.f17775b     // Catch:{ all -> 0x028c }
            com.facebook.p313c.C6058q.m15623a()     // Catch:{ all -> 0x028c }
            android.graphics.Rect r10 = r9.f17776c     // Catch:{ all -> 0x028c }
            boolean r11 = r6.setIntersect(r10, r1)     // Catch:{ all -> 0x028c }
            if (r11 == 0) goto L_0x0051
            boolean r13 = r6.equals(r10)     // Catch:{ all -> 0x028c }
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            java.lang.String r14 = r9.f17774a     // Catch:{ all -> 0x028c }
            java.util.Map r15 = r4.f17767a     // Catch:{ all -> 0x028c }
            java.lang.Object r15 = r15.get(r14)     // Catch:{ all -> 0x028c }
            com.facebook.c.e.b r15 = (com.facebook.p313c.p318e.C6042b) r15     // Catch:{ all -> 0x028c }
            if (r15 == 0) goto L_0x0060
            r15.f17762b = r13     // Catch:{ all -> 0x028c }
        L_0x0060:
            com.facebook.litho.cb r12 = r9.f17781h     // Catch:{ all -> 0x028c }
            com.facebook.litho.cb r7 = r9.f17784k     // Catch:{ all -> 0x028c }
            r16 = r5
            com.facebook.litho.cb r5 = r9.f17785l     // Catch:{ all -> 0x028c }
            r17 = r3
            com.facebook.litho.cb r3 = r9.f17786m     // Catch:{ all -> 0x028c }
            com.facebook.litho.cb r1 = r9.f17783j     // Catch:{ all -> 0x028c }
            r25 = r8
            com.facebook.litho.cb r8 = r9.f17787n     // Catch:{ all -> 0x028c }
            if (r11 == 0) goto L_0x00a7
            float r11 = r9.f17779f     // Catch:{ all -> 0x028c }
            r26 = r3
            float r3 = r9.f17780g     // Catch:{ all -> 0x028c }
            r18 = 0
            int r19 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r19 != 0) goto L_0x0088
            int r18 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r18 != 0) goto L_0x0088
            r27 = r7
        L_0x0086:
            r0 = 1
            goto L_0x00ac
        L_0x0088:
            r27 = r7
            int r7 = r10.height()     // Catch:{ all -> 0x028c }
            int r0 = r6.height()     // Catch:{ all -> 0x028c }
            boolean r0 = m15550t(r11, r7, r0)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x00ab
            int r0 = r10.width()     // Catch:{ all -> 0x028c }
            int r7 = r6.width()     // Catch:{ all -> 0x028c }
            boolean r0 = m15550t(r3, r0, r7)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x00ab
            goto L_0x0086
        L_0x00a7:
            r26 = r3
            r27 = r7
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            r3 = 0
            if (r15 == 0) goto L_0x00eb
            r15.f17766f = r5     // Catch:{ all -> 0x028c }
            r15.f17765e = r1     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x00e9
            com.facebook.litho.cb r7 = r15.f17765e     // Catch:{ all -> 0x028c }
            if (r7 == 0) goto L_0x00be
            com.facebook.c.e r11 = r4.f17772f     // Catch:{ all -> 0x028c }
            com.facebook.p313c.p318e.C6046f.m15557a(r7, r11)     // Catch:{ all -> 0x028c }
        L_0x00be:
            if (r8 == 0) goto L_0x00d1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r18 = r8
            com.facebook.p313c.p318e.C6046f.m15559c(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x028c }
        L_0x00d1:
            boolean r7 = r15.mo12608b()     // Catch:{ all -> 0x028c }
            if (r7 == 0) goto L_0x00e2
            r7 = 0
            r15.mo12607a(r7)     // Catch:{ all -> 0x028c }
            com.facebook.litho.cb r7 = r15.f17766f     // Catch:{ all -> 0x028c }
            if (r7 == 0) goto L_0x00e2
            com.facebook.p313c.p318e.C6046f.m15558b(r7)     // Catch:{ all -> 0x028c }
        L_0x00e2:
            java.util.Map r7 = r4.f17767a     // Catch:{ all -> 0x028c }
            r7.remove(r14)     // Catch:{ all -> 0x028c }
            r15 = r3
            goto L_0x00eb
        L_0x00e9:
            r15.f17761a = r2     // Catch:{ all -> 0x028c }
        L_0x00eb:
            if (r0 == 0) goto L_0x0240
            if (r15 != 0) goto L_0x014b
            java.lang.String r0 = r9.f17774a     // Catch:{ all -> 0x028c }
            com.facebook.c.e.b r15 = new com.facebook.c.e.b     // Catch:{ all -> 0x028c }
            r15.<init>(r1, r5, r8)     // Catch:{ all -> 0x028c }
            r15.f17761a = r2     // Catch:{ all -> 0x028c }
            r15.f17762b = r13     // Catch:{ all -> 0x028c }
            java.util.Map r0 = r4.f17767a     // Catch:{ all -> 0x028c }
            r0.put(r14, r15)     // Catch:{ all -> 0x028c }
            if (r12 == 0) goto L_0x014b
            boolean r0 = r9.f17777d     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0110
            long r0 = r9.f17778e     // Catch:{ all -> 0x028c }
            r7 = r28
            com.facebook.c.g r9 = r7.f17740a     // Catch:{ all -> 0x028c }
            java.lang.Object r0 = r9.mo12612b(r0)     // Catch:{ all -> 0x028c }
            goto L_0x0113
        L_0x0110:
            r7 = r28
            r0 = r3
        L_0x0113:
            com.facebook.c.e r1 = r28.mo12569a()     // Catch:{ all -> 0x028c }
            com.facebook.p313c.C6058q.m15623a()     // Catch:{ all -> 0x028c }
            com.facebook.litho.hj r9 = com.facebook.p313c.p318e.C6046f.f17788a     // Catch:{ all -> 0x028c }
            if (r9 != 0) goto L_0x0125
            com.facebook.litho.hj r9 = new com.facebook.litho.hj     // Catch:{ all -> 0x028c }
            r9.<init>()     // Catch:{ all -> 0x028c }
            com.facebook.p313c.p318e.C6046f.f17788a = r9     // Catch:{ all -> 0x028c }
        L_0x0125:
            com.facebook.litho.hj r9 = com.facebook.p313c.p318e.C6046f.f17788a     // Catch:{ all -> 0x028c }
            r9.f18902a = r0     // Catch:{ all -> 0x028c }
            r9.f18903b = r1     // Catch:{ all -> 0x028c }
            boolean r1 = r0 instanceof android.view.View     // Catch:{ all -> 0x028c }
            if (r1 == 0) goto L_0x0132
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x028c }
            goto L_0x0133
        L_0x0132:
            r0 = r3
        L_0x0133:
            r9.f18904c = r0     // Catch:{ all -> 0x028c }
            r12.toString()     // Catch:{ all -> 0x028c }
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x028c }
            com.facebook.litho.hj r0 = com.facebook.p313c.p318e.C6046f.f17788a     // Catch:{ all -> 0x028c }
            r12.mo13111fD(r0)     // Catch:{ all -> 0x028c }
            com.facebook.litho.hj r0 = com.facebook.p313c.p318e.C6046f.f17788a     // Catch:{ all -> 0x028c }
            r0.f18902a = r3     // Catch:{ all -> 0x028c }
            r0.f18904c = r3     // Catch:{ all -> 0x028c }
            r0.f18903b = r3     // Catch:{ all -> 0x028c }
            com.facebook.c.p r0 = com.facebook.p313c.C6058q.f17821a     // Catch:{ all -> 0x028c }
            goto L_0x014d
        L_0x014b:
            r7 = r28
        L_0x014d:
            if (r27 != 0) goto L_0x0154
            if (r5 == 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r0 = 0
            goto L_0x01b6
        L_0x0154:
            com.facebook.c.e r0 = m15547m(r28)     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x015b
            goto L_0x01a7
        L_0x015b:
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x028c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x01a7
            int r1 = r0.getWidth()     // Catch:{ all -> 0x028c }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x028c }
            int r1 = r1 * r0
            int r1 = r1 / 2
            int r0 = m15546l(r10)     // Catch:{ all -> 0x028c }
            int r3 = m15546l(r6)     // Catch:{ all -> 0x028c }
            if (r0 < r1) goto L_0x017c
            if (r3 < r1) goto L_0x01a7
            goto L_0x0182
        L_0x017c:
            boolean r0 = r10.equals(r6)     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x01a7
        L_0x0182:
            boolean r0 = r15.mo12608b()     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x0152
            r0 = 1
            r15.mo12607a(r0)     // Catch:{ all -> 0x028c }
            if (r27 == 0) goto L_0x0152
            com.facebook.litho.ci r0 = com.facebook.p313c.p318e.C6046f.f17790c     // Catch:{ all -> 0x028c }
            if (r0 != 0) goto L_0x0199
            com.facebook.litho.ci r0 = new com.facebook.litho.ci     // Catch:{ all -> 0x028c }
            r0.<init>()     // Catch:{ all -> 0x028c }
            com.facebook.p313c.p318e.C6046f.f17790c = r0     // Catch:{ all -> 0x028c }
        L_0x0199:
            r27.toString()     // Catch:{ all -> 0x028c }
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x028c }
            com.facebook.litho.ci r0 = com.facebook.p313c.p318e.C6046f.f17790c     // Catch:{ all -> 0x028c }
            r1 = r27
            r1.mo13111fD(r0)     // Catch:{ all -> 0x028c }
            goto L_0x0152
        L_0x01a7:
            boolean r0 = r15.mo12608b()     // Catch:{ all -> 0x028c }
            if (r0 == 0) goto L_0x0152
            r0 = 0
            r15.mo12607a(r0)     // Catch:{ all -> 0x028c }
            if (r5 == 0) goto L_0x01b6
            com.facebook.p313c.p318e.C6046f.m15558b(r5)     // Catch:{ all -> 0x028c }
        L_0x01b6:
            if (r26 == 0) goto L_0x020c
            boolean r1 = r15.mo12609c()     // Catch:{ all -> 0x028c }
            if (r1 != 0) goto L_0x020c
            int r1 = r10.top     // Catch:{ all -> 0x028c }
            int r3 = r6.top     // Catch:{ all -> 0x028c }
            if (r1 != r3) goto L_0x01ca
            int r1 = r15.f17763c     // Catch:{ all -> 0x028c }
            r1 = r1 | 4
            r15.f17763c = r1     // Catch:{ all -> 0x028c }
        L_0x01ca:
            int r1 = r10.bottom     // Catch:{ all -> 0x028c }
            int r3 = r6.bottom     // Catch:{ all -> 0x028c }
            if (r1 != r3) goto L_0x01d6
            int r1 = r15.f17763c     // Catch:{ all -> 0x028c }
            r1 = r1 | 16
            r15.f17763c = r1     // Catch:{ all -> 0x028c }
        L_0x01d6:
            int r1 = r10.left     // Catch:{ all -> 0x028c }
            int r3 = r6.left     // Catch:{ all -> 0x028c }
            if (r1 != r3) goto L_0x01e2
            int r1 = r15.f17763c     // Catch:{ all -> 0x028c }
            r1 = r1 | 2
            r15.f17763c = r1     // Catch:{ all -> 0x028c }
        L_0x01e2:
            int r1 = r10.right     // Catch:{ all -> 0x028c }
            int r3 = r6.right     // Catch:{ all -> 0x028c }
            if (r1 != r3) goto L_0x01ee
            int r1 = r15.f17763c     // Catch:{ all -> 0x028c }
            r1 = r1 | 8
            r15.f17763c = r1     // Catch:{ all -> 0x028c }
        L_0x01ee:
            boolean r1 = r15.mo12609c()     // Catch:{ all -> 0x028c }
            if (r1 == 0) goto L_0x020c
            com.facebook.litho.cj r1 = com.facebook.p313c.p318e.C6046f.f17791d     // Catch:{ all -> 0x028c }
            if (r1 != 0) goto L_0x01ff
            com.facebook.litho.cj r1 = new com.facebook.litho.cj     // Catch:{ all -> 0x028c }
            r1.<init>()     // Catch:{ all -> 0x028c }
            com.facebook.p313c.p318e.C6046f.f17791d = r1     // Catch:{ all -> 0x028c }
        L_0x01ff:
            r26.toString()     // Catch:{ all -> 0x028c }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x028c }
            com.facebook.litho.cj r1 = com.facebook.p313c.p318e.C6046f.f17791d     // Catch:{ all -> 0x028c }
            r3 = r26
            r3.mo13111fD(r1)     // Catch:{ all -> 0x028c }
        L_0x020c:
            if (r8 == 0) goto L_0x0243
            int r1 = r6.right     // Catch:{ all -> 0x028c }
            int r3 = r6.left     // Catch:{ all -> 0x028c }
            int r1 = r1 - r3
            int r3 = r6.bottom     // Catch:{ all -> 0x028c }
            int r5 = r6.top     // Catch:{ all -> 0x028c }
            int r3 = r3 - r5
            int r5 = r6.top     // Catch:{ all -> 0x028c }
            int r9 = r6.left     // Catch:{ all -> 0x028c }
            float r11 = (float) r1     // Catch:{ all -> 0x028c }
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r12
            int r13 = r10.width()     // Catch:{ all -> 0x028c }
            float r13 = (float) r13     // Catch:{ all -> 0x028c }
            float r23 = r11 / r13
            float r11 = (float) r3     // Catch:{ all -> 0x028c }
            float r11 = r11 * r12
            int r10 = r10.height()     // Catch:{ all -> 0x028c }
            float r10 = (float) r10     // Catch:{ all -> 0x028c }
            float r24 = r11 / r10
            r18 = r8
            r19 = r5
            r20 = r9
            r21 = r1
            r22 = r3
            com.facebook.p313c.p318e.C6046f.m15559c(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x028c }
            goto L_0x0243
        L_0x0240:
            r0 = 0
            r7 = r28
        L_0x0243:
            com.facebook.c.p r1 = com.facebook.p313c.C6058q.f17821a     // Catch:{ all -> 0x028c }
            int r8 = r25 + 1
            r1 = r29
            r0 = r7
            r5 = r16
            r3 = r17
            goto L_0x0032
        L_0x0250:
            r7 = r0
            r17 = r3
            java.util.Set r0 = r4.f17770d     // Catch:{ all -> 0x028c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x028c }
        L_0x0259:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x028c }
            if (r1 == 0) goto L_0x0273
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x028c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x028c }
            long r3 = r1.longValue()     // Catch:{ all -> 0x028c }
            com.facebook.c.g r1 = r7.f17740a     // Catch:{ all -> 0x028c }
            java.lang.Object r1 = r1.mo12612b(r3)     // Catch:{ all -> 0x028c }
            com.facebook.p313c.p314a.C6023c.m15487a(r1)     // Catch:{ all -> 0x028c }
            goto L_0x0259
        L_0x0273:
            if (r2 == 0) goto L_0x027e
            m15543h(r28)     // Catch:{ all -> 0x028c }
            goto L_0x027e
        L_0x0279:
            r17 = r3
            r4.toString()     // Catch:{ all -> 0x028c }
        L_0x027e:
            com.facebook.c.p r0 = com.facebook.p313c.C6058q.f17821a
            r0 = r29
            if (r0 == 0) goto L_0x028b
            r3 = r17
            android.graphics.Rect r1 = r3.f17768b
            r1.set(r0)
        L_0x028b:
            return
        L_0x028c:
            r0 = move-exception
            com.facebook.c.p r1 = com.facebook.p313c.C6058q.f17821a
            goto L_0x0291
        L_0x0290:
            throw r0
        L_0x0291:
            goto L_0x0290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p318e.C6044d.m15548o(com.facebook.c.a.a, android.graphics.Rect, boolean):void");
    }

    /* renamed from: s */
    private static boolean m15549s(C6021a aVar) {
        C6040e m = m15547m(aVar);
        return m != null && m.hasTransientState();
    }

    /* renamed from: t */
    private static boolean m15550t(float f, int i, int i2) {
        return ((float) i2) >= f * ((float) i);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12574a() {
        return new C6043c();
    }

    /* renamed from: d */
    public final void mo12577d(C6021a aVar) {
        C6058q.m15623a();
        if (!m15549s(aVar)) {
            m15548o(aVar, ((C6043c) aVar.f17741b).f17771e, true);
        }
        C6057p pVar = C6058q.f17821a;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.c.e.a, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo12578e(com.facebook.p313c.p314a.C6021a r1, java.lang.Object r2, android.graphics.Rect r3) {
        /*
            r0 = this;
            m15545k(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p318e.C6044d.mo12578e(com.facebook.c.a.a, java.lang.Object, android.graphics.Rect):void");
    }

    /* renamed from: f */
    public final void mo12579f(C6021a aVar) {
        m15543h(aVar);
    }

    /* renamed from: g */
    public final void mo12580g(C6021a aVar) {
        ((C6043c) aVar.f17741b).f17768b.setEmpty();
    }

    /* renamed from: i */
    public final void mo12610i(C6021a aVar, Rect rect) {
        boolean s = m15549s(aVar);
        m15549s(aVar);
        C6058q.m15623a();
        if (!s) {
            m15548o(aVar, rect, false);
        }
        C6057p pVar = C6058q.f17821a;
    }
}
