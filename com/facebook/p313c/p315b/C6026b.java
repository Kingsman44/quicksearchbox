package com.facebook.p313c.p315b;

import android.graphics.Rect;
import com.facebook.litho.C6187dg;
import com.facebook.litho.C6201du;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6058q;
import com.facebook.p313c.C6060s;
import com.facebook.p313c.C6063v;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import com.facebook.p313c.p314a.C6023c;
import com.facebook.p313c.p317d.C6039b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.c.b.b */
/* compiled from: PG */
public final class C6026b extends C6022b {

    /* renamed from: a */
    public static final C6026b f17750a = new C6026b(false);

    /* renamed from: b */
    public static final C6026b f17751b = new C6026b(true);

    /* renamed from: c */
    private final boolean f17752c;

    private C6026b(boolean z) {
        this.f17752c = z;
    }

    /* renamed from: h */
    public static void m15489h(Rect rect, C6021a aVar, C6028d dVar, boolean z) {
        if (((C6025a) aVar.f17741b).f17746d) {
            aVar.mo12570b(dVar.f17756d, z);
        } else {
            m15494m(rect, aVar, dVar, z, false, (List) null);
        }
    }

    /* renamed from: i */
    public static void m15490i(C6021a aVar, Rect rect, C6028d dVar, boolean z) {
        C6025a aVar2 = (C6025a) aVar.f17741b;
        long j = dVar.f17756d;
        Object b = aVar.f17740a.mo12612b(j);
        boolean z2 = true;
        if ((!(b instanceof C6040e) || ((C6040e) b).mo12601a() <= 0) && !Rect.intersects(rect, dVar.f17755c)) {
            if (j == 0) {
                j = 0;
            } else {
                z2 = false;
            }
        }
        boolean e = aVar.mo12573e(j);
        if (z2 && !e) {
            m15489h(rect, aVar, dVar, z);
        } else if (!z2 && e) {
            aVar.mo12572d(j, z);
        } else if (z2 && z) {
            m15491j(aVar2.f17747e, j, b);
        }
    }

    /* renamed from: j */
    public static void m15491j(C6027c cVar, long j, Object obj) {
        C6039b.m15532a();
        if (cVar != null && cVar.mo12589r(j)) {
            C6058q.m15623a();
            C6023c.m15487a(obj);
            C6057p pVar = C6058q.f17821a;
        }
    }

    /* renamed from: k */
    public static void m15492k(C6025a aVar, Rect rect) {
        if (rect != null) {
            aVar.f17743a.set(rect);
        }
    }

    /* renamed from: l */
    public static void m15493l(C6025a aVar, Rect rect) {
        if (!rect.isEmpty()) {
            C6027c cVar = aVar.f17747e;
            C6187dg dgVar = (C6187dg) cVar;
            ArrayList arrayList = dgVar.f18306k;
            ArrayList arrayList2 = dgVar.f18307l;
            int e = cVar.mo12586e();
            aVar.f17748f = e;
            int i = 0;
            while (true) {
                if (i >= e) {
                    break;
                } else if (rect.bottom <= ((C6028d) arrayList.get(i)).f17755c.top) {
                    aVar.f17748f = i;
                    break;
                } else {
                    i++;
                }
            }
            aVar.f17749g = e;
            for (int i2 = 0; i2 < e; i2++) {
                if (rect.top < ((C6028d) arrayList2.get(i2)).f17755c.bottom) {
                    aVar.f17749g = i2;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12574a() {
        return new C6025a(this.f17752c);
    }

    /* renamed from: b */
    public final void mo12575b(C6021a aVar, C6063v vVar, Object obj) {
        C6025a aVar2 = (C6025a) aVar.f17741b;
        long j = ((C6201du) vVar).f18345a.f18263m;
        if (!aVar2.f17745c.remove(Long.valueOf(j))) {
            m15491j(aVar2.f17747e, j, obj);
        }
    }

    /* renamed from: c */
    public final void mo12576c(C6021a aVar, C6063v vVar, Object obj) {
        ((C6025a) aVar.f17741b).f17745c.remove(Long.valueOf(((C6201du) vVar).f18345a.f18263m));
    }

    /* renamed from: d */
    public final void mo12577d(C6021a aVar) {
        C6058q.m15623a();
        C6025a aVar2 = (C6025a) aVar.f17741b;
        m15493l(aVar2, aVar2.f17743a);
        C6057p pVar = C6058q.f17821a;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, com.facebook.c.b.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12578e(com.facebook.p313c.p314a.C6021a r6, java.lang.Object r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            com.facebook.p313c.C6058q.m15623a()
            java.lang.Object r0 = r6.f17741b
            com.facebook.c.b.a r0 = (com.facebook.p313c.p315b.C6025a) r0
            com.facebook.c.b.c r1 = r0.f17747e
            if (r1 != 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.util.Collection r1 = r1.mo12588k()
            java.util.Iterator r1 = r1.iterator()
        L_0x0014:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()
            com.facebook.c.b.d r2 = (com.facebook.p313c.p315b.C6028d) r2
            long r2 = r2.f17756d
            com.facebook.c.b.d r4 = r7.mo12587i(r2)
            if (r4 != 0) goto L_0x0014
            boolean r4 = r6.mo12573e(r2)
            if (r4 == 0) goto L_0x0014
            r4 = 0
            r6.mo12572d(r2, r4)
            goto L_0x0014
        L_0x0033:
            r0.f17747e = r7
            android.graphics.Rect r6 = r0.f17743a
            r6.setEmpty()
            m15492k(r0, r8)
            com.facebook.c.p r6 = com.facebook.p313c.C6058q.f17821a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p315b.C6026b.mo12578e(com.facebook.c.a.a, java.lang.Object, android.graphics.Rect):void");
    }

    /* renamed from: f */
    public final void mo12579f(C6021a aVar) {
    }

    /* renamed from: g */
    public final void mo12580g(C6021a aVar) {
        aVar.mo12571c();
        C6025a aVar2 = (C6025a) aVar.f17741b;
        aVar2.f17743a.setEmpty();
        aVar2.f17744b.clear();
    }

    /* renamed from: n */
    public final void mo12581n(C6021a aVar, C6063v vVar, Object obj) {
        ((C6025a) aVar.f17741b).f17745c.add(Long.valueOf(((C6201du) vVar).f18345a.f18263m));
    }

    /* renamed from: q */
    public final boolean mo12583q() {
        return true;
    }

    /* renamed from: r */
    public final void mo12584r(C6021a aVar, C6060s sVar) {
        long j = ((C6201du) sVar.f17827b).f18345a.f18263m;
        C6058q.m15623a();
        long j2 = ((C6201du) sVar.f17827b).f18345a.f18263m;
        C6025a aVar2 = (C6025a) aVar.f17741b;
        C6028d i = aVar2.f17747e.mo12587i(j2);
        if (i != null) {
            m15490i(aVar, aVar2.f17743a, i, false);
            C6057p pVar = C6058q.f17821a;
            return;
        }
        throw new IllegalArgumentException("Output with id=" + j2 + " not found.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.facebook.c.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.facebook.c.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: com.facebook.c.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r10 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r5 == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r23 = r10;
        r16 = r5;
        r0 = "Forcing acquired host mount in " + r18.toString() + ", mounting " + r8 + ". Item:  id = " + r7.f17756d + ", bounds = " + r7.f17755c.toString() + ". Host: id = " + r9.f17756d + ", originalBounds = " + java.lang.String.valueOf(r9.f17754b) + ", bounds = " + r9.f17755c.toString();
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        r16 = r5;
        r17 = r9;
        r23 = r10;
        r10 = r17;
        r0 = "Forcing unaacquired host mount in " + r18.toString() + ", mounting " + r8 + " . Item:  id = " + r7.f17756d + ", bounds = " + r7.f17755c.toString() + ". Host: id = " + r10.f17756d + ", originalBounds = " + java.lang.String.valueOf(r10.f17754b) + ", bounds = " + r10.f17755c.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ea, code lost:
        if (r16 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ec, code lost:
        com.facebook.p313c.C6032c.m15511a().mo12566a(2, "IncrementalMount", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f6, code lost:
        r7 = r23;
        r7.add(r0);
        r1 = r18;
        m15494m(r1, r19, r10, true, r16, r7);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1 != 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r23 != null) goto L_0x0031;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0193  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m15494m(android.graphics.Rect r18, com.facebook.p313c.p314a.C6021a r19, com.facebook.p313c.p315b.C6028d r20, boolean r21, boolean r22, java.util.List r23) {
        /*
            r0 = r19
            r7 = r20
            r8 = r21
            com.facebook.c.b.d r9 = r7.f17757e
            if (r9 != 0) goto L_0x000d
            r1 = 1
            r5 = 1
            goto L_0x0014
        L_0x000d:
            long r1 = r9.f17756d
            boolean r1 = r0.mo12573e(r1)
            r5 = r1
        L_0x0014:
            if (r5 == 0) goto L_0x0028
            if (r9 != 0) goto L_0x0019
            goto L_0x0023
        L_0x0019:
            com.facebook.c.g r1 = r0.f17740a
            long r2 = r9.f17756d
            java.lang.Object r1 = r1.mo12612b(r2)
            if (r1 == 0) goto L_0x0028
        L_0x0023:
            r7 = r23
            r10 = r9
            goto L_0x0107
        L_0x0028:
            if (r23 != 0) goto L_0x0031
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10 = r1
            goto L_0x0033
        L_0x0031:
            r10 = r23
        L_0x0033:
            java.lang.String r1 = ", originalBounds = "
            java.lang.String r2 = ". Host: id = "
            java.lang.String r3 = ", mounting "
            java.lang.String r4 = ", bounds = "
            if (r5 == 0) goto L_0x0094
            java.lang.String r6 = r18.toString()
            long r11 = r7.f17756d
            android.graphics.Rect r13 = r7.f17755c
            java.lang.String r13 = r13.toString()
            long r14 = r9.f17756d
            android.graphics.Rect r0 = r9.f17754b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r23 = r10
            android.graphics.Rect r10 = r9.f17755c
            java.lang.String r10 = r10.toString()
            r16 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r17 = r9
            java.lang.String r9 = "Forcing acquired host mount in "
            r5.<init>(r9)
            r5.append(r6)
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = ". Item:  id = "
            r5.append(r3)
            r5.append(r11)
            r5.append(r4)
            r5.append(r13)
            r5.append(r2)
            r5.append(r14)
            r5.append(r1)
            r5.append(r0)
            r5.append(r4)
            r5.append(r10)
            java.lang.String r0 = r5.toString()
            r10 = r17
            goto L_0x00ea
        L_0x0094:
            r16 = r5
            r17 = r9
            r23 = r10
            java.lang.String r0 = r18.toString()
            long r5 = r7.f17756d
            android.graphics.Rect r9 = r7.f17755c
            java.lang.String r9 = r9.toString()
            r10 = r17
            long r11 = r10.f17756d
            android.graphics.Rect r13 = r10.f17754b
            java.lang.String r13 = java.lang.String.valueOf(r13)
            android.graphics.Rect r14 = r10.f17755c
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r7 = "Forcing unaacquired host mount in "
            r15.<init>(r7)
            r15.append(r0)
            r15.append(r3)
            r15.append(r8)
            java.lang.String r0 = " . Item:  id = "
            r15.append(r0)
            r15.append(r5)
            r15.append(r4)
            r15.append(r9)
            r15.append(r2)
            r15.append(r11)
            r15.append(r1)
            r15.append(r13)
            r15.append(r4)
            r15.append(r14)
            java.lang.String r0 = r15.toString()
        L_0x00ea:
            if (r16 == 0) goto L_0x00f6
            com.facebook.c.d r1 = com.facebook.p313c.C6032c.m15511a()
            r2 = 2
            java.lang.String r3 = "IncrementalMount"
            r1.mo12566a(r2, r3, r0)
        L_0x00f6:
            r7 = r23
            r7.add(r0)
            r4 = 1
            r1 = r18
            r2 = r19
            r3 = r10
            r5 = r16
            r6 = r7
            m15494m(r1, r2, r3, r4, r5, r6)
        L_0x0107:
            if (r22 == 0) goto L_0x011b
            r0 = r19
            com.facebook.c.g r0 = r0.f17740a     // Catch:{ f -> 0x0117 }
            com.facebook.c.i r0 = r0.f17798b     // Catch:{ f -> 0x0117 }
            r1 = r20
            long r2 = r1.f17756d     // Catch:{ f -> 0x0125 }
            r0.mo12637t(r2)     // Catch:{ f -> 0x0125 }
            return
        L_0x0117:
            r0 = move-exception
            r1 = r20
            goto L_0x0126
        L_0x011b:
            r0 = r19
            r1 = r20
            long r2 = r1.f17756d     // Catch:{ f -> 0x0125 }
            r0.mo12570b(r2, r8)     // Catch:{ f -> 0x0125 }
            return
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            long r1 = r1.f17756d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to mount item with id "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "\n"
            if (r10 != 0) goto L_0x0142
            java.lang.String r3 = " Host is null."
            goto L_0x0155
        L_0x0142:
            long r3 = r10.f17756d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " Host id is "
            r5.<init>(r6)
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
        L_0x0155:
            java.lang.String r1 = r1.concat(r3)
            if (r7 == 0) goto L_0x017e
            java.util.Iterator r3 = r7.iterator()
        L_0x015f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x017e
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            goto L_0x015f
        L_0x017e:
            java.lang.String r3 = "MountDelegateTarget mounting info: "
            java.lang.String r1 = r1.concat(r3)
            com.facebook.c.v r3 = r0.f17795a
            com.facebook.litho.du r3 = (com.facebook.litho.C6201du) r3
            com.facebook.litho.de r3 = r3.f18345a
            long r3 = r3.f18263m
            com.facebook.c.v r5 = r0.f17796b
            if (r5 != 0) goto L_0x0193
            java.lang.String r5 = " null "
            goto L_0x01a7
        L_0x0193:
            com.facebook.litho.du r5 = (com.facebook.litho.C6201du) r5
            com.facebook.litho.de r5 = r5.f18345a
            long r5 = r5.f18263m
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = " id "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x01a7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = " renderUnit id "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ", host "
            r6.append(r1)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = r0.getMessage()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            goto L_0x01d9
        L_0x01d8:
            throw r2
        L_0x01d9:
            goto L_0x01d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p315b.C6026b.m15494m(android.graphics.Rect, com.facebook.c.a.a, com.facebook.c.b.d, boolean, boolean, java.util.List):void");
    }
}
