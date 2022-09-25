package com.google.p4215bk.p4219b;

import com.evernote.android.state.BuildConfig;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.bk.b.h */
/* compiled from: PG */
public final class C56048h {

    /* renamed from: a */
    public final String f149352a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public final Map f149353b;

    /* renamed from: c */
    public final Map f149354c;

    public C56048h() {
        EnumMap enumMap = new EnumMap(C56045e.class);
        this.f149353b = enumMap;
        this.f149354c = new EnumMap(C56045e.class);
    }

    /* renamed from: a */
    public final void mo54318a(C56045e eVar) {
        Map map = this.f149353b;
        Map map2 = this.f149354c;
        if (map2.containsKey(eVar)) {
            Object obj = ((C56049i) map2.get(eVar)).f149355a;
        } else {
            map.containsKey(eVar);
        }
        Map map3 = this.f149353b;
        Map map4 = this.f149354c;
        if (map4.containsKey(eVar)) {
            if (((C56049i) map4.get(eVar)).f149355a != null) {
                boolean z = ((C56049i) map4.get(eVar)).f149356b;
            }
        } else if (map3.containsKey(eVar)) {
            boolean z2 = ((C56046f) map3.get(eVar)).f149350c;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (((java.lang.Long) r10).longValue() >= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (((java.lang.Integer) r10).intValue() >= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0.isInfinite() == false) goto L_0x0043;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54319b(com.google.p4215bk.p4219b.C56045e r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r0 = r9.f149347aT
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x006e
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L_0x0063;
                case 1: goto L_0x004f;
                case 2: goto L_0x0045;
                case 3: goto L_0x003a;
                case 4: goto L_0x002c;
                case 5: goto L_0x001c;
                case 6: goto L_0x0063;
                case 7: goto L_0x0063;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Unexpected option type: "
            java.lang.String r0 = com.google.p4215bk.p4219b.C56044d.m87887a(r0)
            java.lang.String r10 = r10.concat(r0)
            r9.<init>(r10)
            throw r9
        L_0x001c:
            r0 = r10
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r1 = r0.isNaN()
            if (r1 != 0) goto L_0x0056
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L_0x0056
            goto L_0x0043
        L_0x002c:
            r0 = r10
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0056
            goto L_0x0043
        L_0x003a:
            r0 = r10
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x0056
        L_0x0043:
            r3 = 1
            goto L_0x0056
        L_0x0045:
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            goto L_0x0056
        L_0x004f:
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L_0x0056:
            if (r3 != 0) goto L_0x0063
            com.google.bk.b.i r10 = new com.google.bk.b.i
            r10.<init>(r2)
            java.util.Map r0 = r8.f149354c
            r0.put(r9, r10)
            return
        L_0x0063:
            com.google.bk.b.i r0 = new com.google.bk.b.i
            r0.<init>(r10)
            java.util.Map r10 = r8.f149354c
            r10.put(r9, r0)
            return
        L_0x006e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4215bk.p4219b.C56048h.mo54319b(com.google.bk.b.e, java.lang.Object):void");
    }
}
