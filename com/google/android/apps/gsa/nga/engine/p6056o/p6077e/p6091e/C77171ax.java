package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ax */
/* compiled from: PG */
public final /* synthetic */ class C77171ax implements C77195bu {

    /* renamed from: a */
    public static final /* synthetic */ C77171ax f212970a = new C77171ax();

    private /* synthetic */ C77171ax() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r2.equals("RUNNING") != false) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo72451a(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r8, com.google.common.p4522b.C58485gu r9) {
        /*
            r7 = this;
            j$.util.function.Predicate r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77258ec.m123986b(r8)
            j$.util.function.Predicate r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77258ec.m123985a(r8)
            j$.util.function.Predicate r0 = r0.and(r1)
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "timer_status"
            r4 = 0
            r2[r4] = r3
            com.google.android.apps.gsa.nga.engine.o.c.ah r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r8 = r8.mo72265g(r3, r2)
            boolean r2 = r8.isPresent()
            if (r2 != 0) goto L_0x0024
            com.google.android.apps.gsa.nga.engine.o.e.e.dz r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77254dz.f213104a
            goto L_0x009e
        L_0x0024:
            java.lang.Object r2 = r8.get()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r5 = 3
            r6 = 2
            switch(r3) {
                case -2026200673: goto L_0x0052;
                case -1941992146: goto L_0x0048;
                case 77866287: goto L_0x003e;
                case 1925008274: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005b
        L_0x0034:
            java.lang.String r3 = "RINGING"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005b
            r4 = 3
            goto L_0x005c
        L_0x003e:
            java.lang.String r3 = "RESET"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005b
            r4 = 2
            goto L_0x005c
        L_0x0048:
            java.lang.String r3 = "PAUSED"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r3 = "RUNNING"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r4 = -1
        L_0x005c:
            if (r4 == 0) goto L_0x0096
            if (r4 == r1) goto L_0x008e
            if (r4 == r6) goto L_0x0080
            if (r4 == r5) goto L_0x0078
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77258ec.f213108a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.Object r8 = r8.get()
            r2 = 3845(0xf05, float:5.388E-42)
            java.lang.String r3 = "TimerStatus %s could not be parsed as valid timer status."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r2)).mo56389s(r3, r8)
            com.google.android.apps.gsa.nga.engine.o.e.e.eb r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77257eb.f213107a
            goto L_0x009e
        L_0x0078:
            com.google.assistant.e.i.a.nj r8 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.FIRING
            com.google.android.apps.gsa.nga.engine.o.e.e.ds r1 = new com.google.android.apps.gsa.nga.engine.o.e.e.ds
            r1.<init>(r8)
            goto L_0x009d
        L_0x0080:
            com.google.assistant.e.i.a.nj r8 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.PAUSED
            com.google.android.apps.gsa.nga.engine.o.e.e.ds r1 = new com.google.android.apps.gsa.nga.engine.o.e.e.ds
            r1.<init>(r8)
            com.google.android.apps.gsa.nga.engine.o.e.e.ea r8 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77256ea.f213106a
            j$.util.function.Predicate r8 = p3186j$.util.function.Predicate.CC.$default$and(r1, r8)
            goto L_0x009e
        L_0x008e:
            com.google.assistant.e.i.a.nj r8 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.PAUSED
            com.google.android.apps.gsa.nga.engine.o.e.e.ds r1 = new com.google.android.apps.gsa.nga.engine.o.e.e.ds
            r1.<init>(r8)
            goto L_0x009d
        L_0x0096:
            com.google.assistant.e.i.a.nj r8 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.RUNNING
            com.google.android.apps.gsa.nga.engine.o.e.e.ds r1 = new com.google.android.apps.gsa.nga.engine.o.e.e.ds
            r1.<init>(r8)
        L_0x009d:
            r8 = r1
        L_0x009e:
            j$.util.function.Predicate r8 = r0.and(r8)
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            j$.util.stream.Stream r8 = r9.filter(r8)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r8 = r8.collect(r9)
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e.C77171ax.mo72451a(com.google.android.apps.gsa.nga.engine.o.c.bg, com.google.common.b.gu):com.google.common.b.gu");
    }
}
