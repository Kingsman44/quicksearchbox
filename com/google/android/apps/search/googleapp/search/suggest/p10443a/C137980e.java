package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.e */
/* compiled from: PG */
public final /* synthetic */ class C137980e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375396a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f375397b;

    public /* synthetic */ C137980e(C138001s sVar, C138133o oVar) {
        this.f375396a = sVar;
        this.f375397b = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r0.f375285g == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.apps.search.googleapp.search.suggest.a.s r0 = r11.f375396a
            com.google.android.apps.search.googleapp.search.suggest.o r1 = r11.f375397b
            java.util.List r12 = (java.util.List) r12
            com.google.android.apps.search.googleapp.search.suggest.a.ax r0 = r0.f375434f
            java.lang.String r2 = r1.f375825b
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0011
            goto L_0x0037
        L_0x0011:
            int r2 = r1.f375830g
            com.google.android.apps.search.googleapp.t.e.d r2 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r2)
            if (r2 != 0) goto L_0x001b
            com.google.android.apps.search.googleapp.t.e.d r2 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x001b:
            boolean r2 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r2)
            if (r2 != 0) goto L_0x0037
            int r2 = r1.f375830g
            com.google.android.apps.search.googleapp.t.e.d r2 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r2)
            if (r2 != 0) goto L_0x002b
            com.google.android.apps.search.googleapp.t.e.d r2 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x002b:
            com.google.android.apps.search.googleapp.t.e.d r3 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.WIDGET
            if (r2 != r3) goto L_0x0187
            boolean r2 = r0.f375280b
            if (r2 == 0) goto L_0x0187
            boolean r2 = r0.f375285g
            if (r2 != 0) goto L_0x0187
        L_0x0037:
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.ax> r3 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.class
            r2.<init>(r3)
            java.util.Iterator r3 = r12.iterator()
        L_0x0042:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()
            com.google.android.apps.search.googleapp.search.suggest.av r4 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r4
            int r4 = r4.f375547k
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.m224334a(r4)
            if (r4 != 0) goto L_0x0059
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.INVALID
        L_0x0059:
            com.google.common.b.gu r6 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137938ax.f375279a
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0042
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = p3186j$.util.Map.EL.getOrDefault(r2, r4, r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r5)
            goto L_0x0042
        L_0x0079:
            int r3 = r12.size()
            java.util.ListIterator r3 = r12.listIterator(r3)
        L_0x0081:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x0187
            java.lang.Object r4 = r3.previous()
            com.google.android.apps.search.googleapp.search.suggest.av r4 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r4
            int r4 = r4.f375547k
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.m224334a(r4)
            if (r4 != 0) goto L_0x0097
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.INVALID
        L_0x0097:
            com.google.common.b.gu r6 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137938ax.f375279a
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0081
            int r6 = r1.f375830g
            com.google.android.apps.search.googleapp.t.e.d r6 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.m227141a(r6)
            if (r6 != 0) goto L_0x00a9
            com.google.android.apps.search.googleapp.t.e.d r6 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x00a9:
            boolean r6 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e.m227143a(r6)
            if (r6 == 0) goto L_0x00b2
            long r6 = r0.f375284f
            goto L_0x00b4
        L_0x00b2:
            long r6 = r0.f375282d
        L_0x00b4:
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.GEMINI_LIGHT
            boolean r8 = r2.containsKey(r8)
            if (r8 == 0) goto L_0x00c6
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.GEMINI_APP_STRIP
            boolean r8 = r2.containsKey(r8)
            if (r8 != 0) goto L_0x00c6
            long r6 = r0.f375283e
        L_0x00c6:
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.PRIMARY
            if (r4 != r8) goto L_0x00fb
            int r8 = r2.size()
            if (r8 <= r5) goto L_0x00fb
            com.google.android.apps.search.googleapp.search.suggest.ax r8 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.PRIMARY
            java.lang.Object r8 = r2.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            int r8 = r8.intValue()
            long r8 = (long) r8
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00fb
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.PRIMARY
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r6)
            goto L_0x0182
        L_0x00fb:
            com.google.android.apps.search.googleapp.search.suggest.ax r6 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.SECONDARY
            if (r4 != r6) goto L_0x0129
            java.lang.Object r6 = r2.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = r6.intValue()
            long r6 = (long) r6
            long r8 = r0.f375281c
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0129
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.SECONDARY
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r6)
            goto L_0x0182
        L_0x0129:
            com.google.android.apps.search.googleapp.search.suggest.ax r6 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.APP_STRIP
            r7 = 5
            if (r4 != r6) goto L_0x0157
            java.lang.Object r6 = r2.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = r6.intValue()
            long r9 = (long) r6
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0157
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.APP_STRIP
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r6)
            goto L_0x0182
        L_0x0157:
            com.google.android.apps.search.googleapp.search.suggest.ax r6 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.GEMINI_APP_STRIP
            if (r4 != r6) goto L_0x0081
            java.lang.Object r4 = r2.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r4.intValue()
            long r9 = (long) r4
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0081
            com.google.android.apps.search.googleapp.search.suggest.ax r4 = com.google.android.apps.search.googleapp.search.suggest.C138032ax.GEMINI_APP_STRIP
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r4, r6)
        L_0x0182:
            r3.remove()
            goto L_0x0081
        L_0x0187:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.C137980e.apply(java.lang.Object):java.lang.Object");
    }
}
