package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138130l;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.f */
/* compiled from: PG */
public final /* synthetic */ class C137988f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375409a;

    /* renamed from: b */
    public final /* synthetic */ C138130l f375410b;

    /* renamed from: c */
    public final /* synthetic */ C138134p f375411c;

    /* renamed from: d */
    public final /* synthetic */ C138133o f375412d;

    public /* synthetic */ C137988f(C138001s sVar, C138130l lVar, C138134p pVar, C138133o oVar) {
        this.f375409a = sVar;
        this.f375410b = lVar;
        this.f375411c = pVar;
        this.f375412d = oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.android.apps.search.googleapp.search.suggest.ax} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if (com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r0) == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        if (r1.f375438j != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        if (r1.f375445q == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r4.f375825b.isEmpty() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h.createBuilder();
        r8 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER;
        r0.copyOnWrite();
        r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r0.instance;
        r7.f375482b = r8.f375478o;
        r7.f375481a |= 1;
        r0.copyOnWrite();
        r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r0.instance;
        r7.f375485e = 2;
        r7.f375481a |= 4;
        r2.mo114162a(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03bb A[LOOP:3: B:135:0x03b9->B:136:0x03bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03b2 A[EDGE_INSN: B:171:0x03b2->B:134:0x03b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0246  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.apps.search.googleapp.search.suggest.a.s r1 = r0.f375409a
            com.google.android.apps.search.googleapp.search.suggest.l r2 = r0.f375410b
            com.google.android.apps.search.googleapp.search.suggest.p r3 = r0.f375411c
            com.google.android.apps.search.googleapp.search.suggest.o r4 = r0.f375412d
            r5 = r20
            java.util.List r5 = (java.util.List) r5
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.search.googleapp.search.suggest.m r6 = (com.google.android.apps.search.googleapp.search.suggest.C138131m) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.search.googleapp.search.suggest.t r3 = (com.google.android.apps.search.googleapp.search.suggest.C138542t) r3
            com.google.android.apps.search.googleapp.search.suggest.m r7 = com.google.android.apps.search.googleapp.search.suggest.C138131m.f375814f
            r3.getClass()
            r6.f375819d = r3
            int r3 = r6.f375816a
            r7 = 2
            r3 = r3 | r7
            r6.f375816a = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0031:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005b
            java.lang.Object r6 = r5.next()
            com.google.android.apps.search.googleapp.search.suggest.av r6 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r6
            int r8 = r6.f375547k
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.m224334a(r8)
            if (r8 != 0) goto L_0x0047
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.INVALID
        L_0x0047:
            java.lang.Object r9 = r3.get(r8)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0057
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r3.put(r8, r9)
        L_0x0057:
            r9.add(r6)
            goto L_0x0031
        L_0x005b:
            com.google.android.apps.search.googleapp.search.suggest.ax r5 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.INVALID
            java.util.Set r6 = r3.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r8 = 1
            r9 = 1
        L_0x0067:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0470
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            if (r9 != r8) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0077:
            r12 = 0
        L_0x0078:
            int r13 = r3.size()
            java.lang.Object r14 = r10.getKey()
            com.google.android.apps.search.googleapp.search.suggest.ax r14 = (com.google.android.apps.search.googleapp.search.suggest.C138032ax) r14
            java.lang.Object r15 = r10.getValue()
            java.util.List r15 = (java.util.List) r15
            com.google.protobuf.bv r11 = r2.instance
            com.google.android.apps.search.googleapp.search.suggest.m r11 = (com.google.android.apps.search.googleapp.search.suggest.C138131m) r11
            com.google.android.apps.search.googleapp.search.suggest.t r11 = r11.f375819d
            if (r11 != 0) goto L_0x0092
            com.google.android.apps.search.googleapp.search.suggest.t r11 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
        L_0x0092:
            com.google.at.h.d.a.at r11 = r11.f376814b
            if (r11 != 0) goto L_0x0098
            com.google.at.h.d.a.at r11 = com.google.p4017at.p4060h.p4073d.p4074a.C54231at.f142359r
        L_0x0098:
            com.google.at.h.d.a.am r11 = r11.f142371k
            if (r11 != 0) goto L_0x009e
            com.google.at.h.d.a.am r11 = com.google.p4017at.p4060h.p4073d.p4074a.C54224am.f142322b
        L_0x009e:
            com.google.protobuf.dn r11 = r11.f142324a
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r11)
            int r7 = r14.f375579B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r11.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.apps.search.googleapp.search.suggest.ab r11 = com.google.android.apps.search.googleapp.search.suggest.C138010ab.f375456d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.aa r11 = (com.google.android.apps.search.googleapp.search.suggest.C138009aa) r11
            if (r7 == 0) goto L_0x00cb
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r8 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r8
            int r0 = r8.f375458a
            r16 = 1
            r0 = r0 | 1
            r8.f375458a = r0
            r8.f375459b = r7
        L_0x00cb:
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.APP_STRIP
            if (r5 != r0) goto L_0x0125
            boolean r0 = r1.f375437i
            if (r0 == 0) goto L_0x00e3
            int r0 = r4.f375830g
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r0 != 0) goto L_0x00dd
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x00dd:
            boolean r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r0)
            if (r0 != 0) goto L_0x00e7
        L_0x00e3:
            boolean r0 = r1.f375438j
            if (r0 == 0) goto L_0x0125
        L_0x00e7:
            boolean r0 = r1.f375445q
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = r4.f375825b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0125
        L_0x00f3:
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            com.google.android.apps.search.googleapp.search.suggest.af r8 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r7
            int r8 = r8.f375478o
            r7.f375482b = r8
            int r8 = r7.f375481a
            r16 = 1
            r8 = r8 | 1
            r7.f375481a = r8
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r7
            r8 = 2
            r7.f375485e = r8
            int r8 = r7.f375481a
            r17 = 4
            r8 = r8 | 4
            r7.f375481a = r8
            r2.mo114162a(r0)
        L_0x0125:
            int r0 = r4.f375830g
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r0 != 0) goto L_0x012f
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x012f:
            boolean r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r0)
            if (r0 == 0) goto L_0x0184
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.APP_STRIP
            if (r14 != r0) goto L_0x0184
            if (r12 != 0) goto L_0x0184
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r7
            int r5 = r5.f375478o
            r7.f375482b = r5
            int r5 = r7.f375481a
            r8 = 1
            r5 = r5 | r8
            r7.f375481a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r5 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r5
            r7 = 2
            r5.f375485e = r7
            int r7 = r5.f375481a
            r8 = 4
            r7 = r7 | r8
            r5.f375481a = r7
            r2.mo114162a(r0)
            boolean r0 = r4.f375833j
            if (r0 == 0) goto L_0x0180
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r0 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r0
            r5 = 3
            r0.f375460c = r5
            int r5 = r0.f375458a
            r7 = 2
            r5 = r5 | r7
            r0.f375458a = r5
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
        L_0x0180:
            r0 = 0
        L_0x0181:
            r12 = 2
            goto L_0x02c3
        L_0x0184:
            int r0 = r4.f375830g
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r0 != 0) goto L_0x018e
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x018e:
            com.google.android.apps.search.googleapp.t.e.d r7 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.WIDGET
            if (r0 != r7) goto L_0x01ec
            boolean r0 = r1.f375445q
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r4.f375825b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ec
        L_0x019e:
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.APP_STRIP
            if (r14 == r0) goto L_0x01a6
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.SECONDARY
            if (r14 != r0) goto L_0x01ec
        L_0x01a6:
            if (r12 != 0) goto L_0x01d5
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            com.google.android.apps.search.googleapp.search.suggest.af r5 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r7
            int r5 = r5.f375478o
            r7.f375482b = r5
            int r5 = r7.f375481a
            r8 = 1
            r5 = r5 | r8
            r7.f375481a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r5 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r5
            r5.f375485e = r8
            int r7 = r5.f375481a
            r8 = 4
            r7 = r7 | r8
            r5.f375481a = r7
            r2.mo114162a(r0)
        L_0x01d5:
            boolean r0 = r1.f375446r
            if (r0 != 0) goto L_0x0180
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r0 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r0
            r5 = 2
            r0.f375460c = r5
            int r7 = r0.f375458a
            r7 = r7 | r5
            r0.f375458a = r7
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
            goto L_0x0180
        L_0x01ec:
            boolean r0 = r1.f375444p
            if (r0 == 0) goto L_0x022c
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.PRIMARY
            if (r14 != r0) goto L_0x022c
            int r0 = r4.f375830g
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r0 != 0) goto L_0x01fe
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x01fe:
            com.google.android.apps.search.googleapp.t.e.d r7 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.WIDGET
            if (r0 != r7) goto L_0x022c
            java.lang.String r0 = r4.f375825b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x022c
            r0 = 0
            java.lang.Object r7 = r15.get(r0)
            com.google.android.apps.search.googleapp.search.suggest.av r7 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r7
            boolean r7 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224320d(r7)
            if (r7 == 0) goto L_0x022d
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r5 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r5
            r7 = 6
            r5.f375460c = r7
            int r7 = r5.f375458a
            r8 = 2
            r7 = r7 | r8
            r5.f375458a = r7
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
            goto L_0x0181
        L_0x022c:
            r0 = 0
        L_0x022d:
            com.google.android.apps.search.googleapp.search.suggest.ax r7 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.SECONDARY
            if (r14 != r7) goto L_0x0246
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r5 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r5
            r7 = 1
            r5.f375460c = r7
            int r7 = r5.f375458a
            r8 = 2
            r7 = r7 | r8
            r5.f375458a = r7
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
            goto L_0x0181
        L_0x0246:
            com.google.common.b.ij r7 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.f375430b
            boolean r7 = r7.contains(r14)
            if (r7 == 0) goto L_0x026b
            com.google.common.b.ij r7 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.f375430b
            boolean r5 = r7.contains(r5)
            if (r5 != 0) goto L_0x026b
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r5 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r5
            r7 = 4
            r5.f375460c = r7
            int r7 = r5.f375458a
            r8 = 2
            r7 = r7 | r8
            r5.f375458a = r7
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
            goto L_0x0181
        L_0x026b:
            com.google.android.apps.search.googleapp.search.suggest.ax r5 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.IN_CONTEXT_CONTROL_GROUP
            if (r14 != r5) goto L_0x02b5
            com.google.android.apps.search.googleapp.search.suggest.ag r5 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r5 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r5
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r7 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r7
            r8 = 5
            r7.f375460c = r8
            int r8 = r7.f375458a
            r12 = 2
            r8 = r8 | r12
            r7.f375458a = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r7 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r7
            com.google.protobuf.bv r8 = r11.build()
            com.google.android.apps.search.googleapp.search.suggest.ab r8 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r8
            r8.getClass()
            r7.f375484d = r8
            int r8 = r7.f375481a
            r8 = r8 | r12
            r7.f375481a = r8
            com.google.android.apps.search.googleapp.search.suggest.af r7 = com.google.android.apps.search.googleapp.search.suggest.C138014af.SPYW_IN_CONTEXT_CONTROL_HEADER
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r8 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r8
            int r7 = r7.f375478o
            r8.f375482b = r7
            int r7 = r8.f375481a
            r14 = 1
            r7 = r7 | r14
            r8.f375481a = r7
            r2.mo114162a(r5)
            goto L_0x02c3
        L_0x02b5:
            r12 = 2
            r14 = 1
            com.google.protobuf.bv r5 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.ab r5 = (com.google.android.apps.search.googleapp.search.suggest.C138010ab) r5
            int r5 = r5.f375458a
            r5 = r5 & r14
            if (r5 == 0) goto L_0x02c3
            com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.m224318b(r4, r2, r11)
        L_0x02c3:
            java.lang.Object r5 = r10.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.EnumMap r8 = new java.util.EnumMap
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.af> r11 = com.google.android.apps.search.googleapp.search.suggest.C138014af.class
            r8.<init>(r11)
            r11 = 0
        L_0x02d6:
            int r14 = r5.size()
            if (r11 >= r14) goto L_0x03b2
            java.lang.Object r14 = r5.get(r11)
            com.google.android.apps.search.googleapp.search.suggest.av r14 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r14
            java.util.Map r15 = r1.f375432d
            int r0 = r14.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r0 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r0)
            if (r0 != 0) goto L_0x02ee
            com.google.android.apps.search.googleapp.search.suggest.az r0 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x02ee:
            java.lang.Object r0 = r15.get(r0)
            com.google.android.apps.search.googleapp.search.suggest.sources.b r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.C138497b) r0
            if (r0 != 0) goto L_0x031c
            com.google.common.f.a.d r0 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C138001s.f375429a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r5 = 41070(0xa06e, float:5.7551E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            int r5 = r14.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r5 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r5)
            if (r5 != 0) goto L_0x0311
            com.google.android.apps.search.googleapp.search.suggest.az r5 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x0311:
            java.lang.String r8 = "SuggestionContainerTypeProvider missing for source: %s"
            java.lang.String r5 = r5.name()
            r0.mo56389s(r8, r5)
            goto L_0x03b2
        L_0x031c:
            com.google.android.apps.search.googleapp.search.suggest.af r15 = r0.mo114268a(r14)
            boolean r0 = r0.mo114269b()
            if (r0 == 0) goto L_0x0359
            java.lang.Object r0 = r8.get(r15)
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            if (r0 != 0) goto L_0x0352
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r12 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r12
            r18 = r3
            int r3 = r15.f375478o
            r12.f375482b = r3
            int r3 = r12.f375481a
            r16 = 1
            r3 = r3 | 1
            r12.f375481a = r3
            r7.add(r0)
            r8.put(r15, r0)
            goto L_0x0354
        L_0x0352:
            r18 = r3
        L_0x0354:
            r0.mo114466a(r14)
            r12 = 1
            goto L_0x03ab
        L_0x0359:
            r18 = r3
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            r0.mo114466a(r14)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
            int r12 = r15.f375478o
            r3.f375482b = r12
            int r12 = r3.f375481a
            r14 = 1
            r12 = r12 | r14
            r3.f375481a = r12
            boolean r3 = r1.f375443o
            if (r3 == 0) goto L_0x03a7
            if (r11 != 0) goto L_0x038e
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
            int r11 = r3.f375481a
            r11 = r11 | 8
            r3.f375481a = r11
            r11 = 1
            r3.f375486f = r11
            r11 = 0
        L_0x038e:
            int r3 = r5.size()
            int r3 = r3 + -1
            if (r11 != r3) goto L_0x03a7
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
            int r12 = r3.f375481a
            r12 = r12 | 16
            r3.f375481a = r12
            r12 = 1
            r3.f375487g = r12
            goto L_0x03a8
        L_0x03a7:
            r12 = 1
        L_0x03a8:
            r7.add(r0)
        L_0x03ab:
            int r11 = r11 + r12
            r3 = r18
            r0 = 0
            r12 = 2
            goto L_0x02d6
        L_0x03b2:
            r18 = r3
            int r0 = r7.size()
            r11 = 0
        L_0x03b9:
            if (r11 >= r0) goto L_0x03c7
            java.lang.Object r3 = r7.get(r11)
            com.google.android.apps.search.googleapp.search.suggest.y r3 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r3
            r2.mo114162a(r3)
            int r11 = r11 + 1
            goto L_0x03b9
        L_0x03c7:
            java.lang.Object r0 = r10.getKey()
            com.google.android.apps.search.googleapp.search.suggest.ax r0 = (com.google.android.apps.search.googleapp.search.suggest.C138032ax) r0
            java.lang.Object r3 = r10.getValue()
            java.util.List r3 = (java.util.List) r3
            boolean r5 = r1.f375436h
            if (r5 == 0) goto L_0x045e
            java.lang.String r5 = r4.f375825b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x045e
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x045e
            com.google.android.apps.search.googleapp.search.suggest.ax r5 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.PRIMARY
            if (r0 != r5) goto L_0x045e
            int r0 = r4.f375830g
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r5 != 0) goto L_0x03f3
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x03f3:
            com.google.android.apps.search.googleapp.t.e.d r7 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.PIXEL_LAUNCHER
            if (r5 == r7) goto L_0x045e
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r0)
            if (r0 != 0) goto L_0x03ff
            com.google.android.apps.search.googleapp.t.e.d r0 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x03ff:
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.PIXEL_LAUNCHER_ALL_APPS
            if (r0 != r5) goto L_0x0404
            goto L_0x045e
        L_0x0404:
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.search.googleapp.search.suggest.a.i r3 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137991i.f375417a
            boolean r0 = r0.allMatch(r3)
            if (r0 == 0) goto L_0x045e
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            com.google.android.apps.search.googleapp.search.suggest.af r3 = com.google.android.apps.search.googleapp.search.suggest.C138014af.MANAGE_ACTIVITY
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r5 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r5
            int r3 = r3.f375478o
            r5.f375482b = r3
            int r3 = r5.f375481a
            r7 = 1
            r3 = r3 | r7
            r5.f375481a = r3
            r2.mo114162a(r0)
            if (r9 == r13) goto L_0x045e
            com.google.android.apps.search.googleapp.search.suggest.ag r0 = com.google.android.apps.search.googleapp.search.suggest.C138015ag.f375479h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.y r0 = (com.google.android.apps.search.googleapp.search.suggest.C138681y) r0
            com.google.android.apps.search.googleapp.search.suggest.af r3 = com.google.android.apps.search.googleapp.search.suggest.C138014af.DIVIDER
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r5 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r5
            int r3 = r3.f375478o
            r5.f375482b = r3
            int r3 = r5.f375481a
            r7 = 1
            r3 = r3 | r7
            r5.f375481a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.ag r3 = (com.google.android.apps.search.googleapp.search.suggest.C138015ag) r3
            r3.f375485e = r7
            int r5 = r3.f375481a
            r8 = 4
            r5 = r5 | r8
            r3.f375481a = r5
            r2.mo114162a(r0)
            goto L_0x045f
        L_0x045e:
            r7 = 1
        L_0x045f:
            int r9 = r9 + 1
            java.lang.Object r0 = r10.getKey()
            r5 = r0
            com.google.android.apps.search.googleapp.search.suggest.ax r5 = (com.google.android.apps.search.googleapp.search.suggest.C138032ax) r5
            r0 = r19
            r3 = r18
            r7 = 2
            r8 = 1
            goto L_0x0067
        L_0x0470:
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.googleapp.search.suggest.m r0 = (com.google.android.apps.search.googleapp.search.suggest.C138131m) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.C137988f.apply(java.lang.Object):java.lang.Object");
    }
}
