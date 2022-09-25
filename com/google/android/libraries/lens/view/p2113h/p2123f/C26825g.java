package com.google.android.libraries.lens.view.p2113h.p2123f;

import com.google.android.libraries.lens.view.vision.C28169k;

/* renamed from: com.google.android.libraries.lens.view.h.f.g */
/* compiled from: PG */
final class C26825g implements C28169k {

    /* renamed from: a */
    final /* synthetic */ C26827i f73104a;

    public C26825g(C26827i iVar) {
        this.f73104a = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04d7, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32199a(com.google.android.libraries.lens.view.p2173u.C28097c r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            com.google.android.libraries.lens.view.h.f.i r2 = r1.f73104a
            com.google.common.util.concurrent.cx r2 = r2.mo32200m()
            boolean r3 = r2.isDone()
            if (r3 == 0) goto L_0x04e6
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ ExecutionException -> 0x04db }
            com.google.android.libraries.lens.ImagingSession r2 = (com.google.android.libraries.lens.ImagingSession) r2     // Catch:{ ExecutionException -> 0x04db }
            com.google.android.libraries.lens.view.h.f.i r3 = r1.f73104a
            com.google.common.base.ax r4 = r0.f76497o
            boolean r4 = r4.mo56113h()
            java.lang.String r5 = "%s-updateGlobalTranslation: fs signal is not present in frame"
            java.lang.String r6 = "FSNI"
            com.google.common.base.C58838bb.m90887v(r4, r5, r6)
            com.google.common.base.ax r4 = r0.f76497o
            java.lang.Object r4 = r4.mo56107c()
            com.google.lens.j.fm r4 = (com.google.lens.p4707j.C62544fm) r4
            com.google.lens.d.f r4 = r4.f168856a
            if (r4 != 0) goto L_0x0033
            com.google.lens.d.f r4 = com.google.lens.p4698d.C62167f.f167824h
        L_0x0033:
            com.google.cj.a.a.a.d r4 = r4.f167830e
            if (r4 != 0) goto L_0x0039
            com.google.cj.a.a.a.d r4 = com.google.p4488cj.p4489a.p4490a.p4491a.C58124d.f155385b
        L_0x0039:
            com.google.protobuf.cq r5 = r4.f155387a
            boolean r5 = r5.isEmpty()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0044
            goto L_0x008f
        L_0x0044:
            com.google.protobuf.cq r4 = r4.f155387a
            java.lang.Object r4 = r4.get(r6)
            com.google.cj.a.a.a.b r4 = (com.google.p4488cj.p4489a.p4490a.p4491a.C58122b) r4
            float r5 = r4.f155371c
            float r8 = r4.f155373e
            float r5 = r5 + r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r8
            android.graphics.PointF r9 = com.google.android.libraries.lens.view.p2113h.p2123f.C26820b.f73098a
            float r9 = r9.x
            float r5 = r5 - r9
            float r9 = r4.f155370b
            float r4 = r4.f155372d
            float r9 = r9 + r4
            float r9 = r9 * r8
            android.graphics.PointF r4 = com.google.android.libraries.lens.view.p2113h.p2123f.C26820b.f73098a
            float r4 = r4.y
            float r9 = r9 - r4
            com.google.android.libraries.lens.view.h.e.ab r4 = r3.f73129w
            r4.getClass()
            android.util.Size r8 = r3.f73125s
            r8.getClass()
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r5 = r5 * r8
            double r10 = (double) r5
            android.util.Size r3 = r3.f73125s
            r3.getClass()
            int r3 = r3.getHeight()
            com.google.android.libraries.lens.view.h.e.ai r4 = r4.f72960a
            com.google.android.libraries.lens.view.h.e.ao r4 = r4.f72977E
            r4.f73049f = r7
            r4.f73050g = r10
            float r3 = (float) r3
            float r9 = r9 * r3
            double r8 = (double) r9
            r4.f73051h = r8
        L_0x008f:
            com.google.android.libraries.lens.view.h.f.i r3 = r1.f73104a
            java.lang.Object r3 = r3.f73108b
            monitor-enter(r3)
            com.google.android.libraries.lens.view.h.f.i r4 = r1.f73104a     // Catch:{ all -> 0x04d8 }
            boolean r4 = r4.f73112f     // Catch:{ all -> 0x04d8 }
            if (r4 != 0) goto L_0x00a1
            com.google.android.libraries.lens.view.u.a r2 = com.google.android.libraries.lens.view.p2173u.C28095a.SKIPPED     // Catch:{ all -> 0x04d8 }
            r0.mo33560c(r2)     // Catch:{ all -> 0x04d8 }
            monitor-exit(r3)     // Catch:{ all -> 0x04d8 }
            return
        L_0x00a1:
            com.google.android.libraries.lens.view.h.f.i r4 = r1.f73104a     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r4 = r4.f73124r     // Catch:{ all -> 0x04d8 }
            boolean r4 = r4.mo56113h()     // Catch:{ all -> 0x04d8 }
            if (r4 == 0) goto L_0x00c6
            long r4 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.f.i r8 = r1.f73104a     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r8 = r8.f73124r     // Catch:{ all -> 0x04d8 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.f.h r8 = (com.google.android.libraries.lens.view.p2113h.p2123f.C26826h) r8     // Catch:{ all -> 0x04d8 }
            long r8 = r8.f73106b     // Catch:{ all -> 0x04d8 }
            long r4 = r4 - r8
            r8 = 10000000(0x989680, double:4.9406565E-317)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00c6
            com.google.android.libraries.lens.view.h.f.i r4 = r1.f73104a     // Catch:{ all -> 0x04d8 }
            r4.mo32202q()     // Catch:{ all -> 0x04d8 }
        L_0x00c6:
            com.google.android.libraries.lens.view.h.f.i r4 = r1.f73104a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.f.a r5 = r4.f73111e     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.d.ab r8 = r0.f76485c     // Catch:{ all -> 0x04d8 }
            boolean r5 = r5.mo32180c(r8)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.a r8 = r0.f76489g     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.a r9 = com.google.android.libraries.lens.view.p2173u.C28095a.NOT_SELECTABLE_WAITING_FOR_USER_VISIBLE_REGION     // Catch:{ all -> 0x04d8 }
            if (r8 != r9) goto L_0x00da
            long r4 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            goto L_0x04d6
        L_0x00da:
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r8 = r0.f76497o     // Catch:{ all -> 0x04d8 }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x04d8 }
            com.google.common.base.C58838bb.m90883r(r8)     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r8 = r0.f76497o     // Catch:{ all -> 0x04d8 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.fm r8 = (com.google.lens.p4707j.C62544fm) r8     // Catch:{ all -> 0x04d8 }
            r8.getClass()
            com.google.android.libraries.lens.view.h.d.ab r9 = r0.f76485c     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r9 = r9.mo32054h()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.f r8 = r8.f168856a     // Catch:{ all -> 0x04d8 }
            if (r8 != 0) goto L_0x00fc
            com.google.lens.d.f r8 = com.google.lens.p4698d.C62167f.f167824h     // Catch:{ all -> 0x04d8 }
        L_0x00fc:
            com.google.lens.d.q r10 = com.google.lens.p4698d.C62178q.f167872m     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.p r10 = (com.google.lens.p4698d.C62177p) r10     // Catch:{ all -> 0x04d8 }
            int r11 = r8.f167829d     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r12 = (com.google.lens.p4698d.C62178q) r12     // Catch:{ all -> 0x04d8 }
            int r13 = r12.f167874a     // Catch:{ all -> 0x04d8 }
            r14 = 4
            r13 = r13 | r14
            r12.f167874a = r13     // Catch:{ all -> 0x04d8 }
            r12.f167877d = r11     // Catch:{ all -> 0x04d8 }
            com.google.cj.a.a.a.d r11 = r8.f167830e     // Catch:{ all -> 0x04d8 }
            if (r11 != 0) goto L_0x011b
            com.google.cj.a.a.a.d r11 = com.google.p4488cj.p4489a.p4490a.p4491a.C58124d.f155385b     // Catch:{ all -> 0x04d8 }
        L_0x011b:
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r12 = (com.google.lens.p4698d.C62178q) r12     // Catch:{ all -> 0x04d8 }
            r11.getClass()     // Catch:{ all -> 0x04d8 }
            r12.f167878e = r11     // Catch:{ all -> 0x04d8 }
            int r11 = r12.f167874a     // Catch:{ all -> 0x04d8 }
            r11 = r11 | 8
            r12.f167874a = r11     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.ch r11 = r8.f167831f     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r12 = (com.google.lens.p4698d.C62178q) r12     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.ch r13 = r12.f167879f     // Catch:{ all -> 0x04d8 }
            boolean r15 = r13.mo58948c()     // Catch:{ all -> 0x04d8 }
            if (r15 != 0) goto L_0x0144
            com.google.protobuf.ch r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r13)     // Catch:{ all -> 0x04d8 }
            r12.f167879f = r13     // Catch:{ all -> 0x04d8 }
        L_0x0144:
            com.google.protobuf.ch r12 = r12.f167879f     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r12)     // Catch:{ all -> 0x04d8 }
            float r11 = r8.f167832g     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r12 = (com.google.lens.p4698d.C62178q) r12     // Catch:{ all -> 0x04d8 }
            int r13 = r12.f167874a     // Catch:{ all -> 0x04d8 }
            r13 = r13 | 256(0x100, float:3.59E-43)
            r12.f167874a = r13     // Catch:{ all -> 0x04d8 }
            r12.f167883j = r11     // Catch:{ all -> 0x04d8 }
            int r11 = r8.f167826a     // Catch:{ all -> 0x04d8 }
            r12 = 2
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0170
            float r8 = r8.f167828c     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r11 = (com.google.lens.p4698d.C62178q) r11     // Catch:{ all -> 0x04d8 }
            int r13 = r11.f167874a     // Catch:{ all -> 0x04d8 }
            r13 = r13 | r12
            r11.f167874a = r13     // Catch:{ all -> 0x04d8 }
            r11.f167876c = r8     // Catch:{ all -> 0x04d8 }
        L_0x0170:
            boolean r8 = r9.mo56113h()     // Catch:{ all -> 0x04d8 }
            if (r8 == 0) goto L_0x018f
            java.lang.Object r8 = r9.mo56107c()     // Catch:{ all -> 0x04d8 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x04d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r9 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r9 = (com.google.lens.p4698d.C62178q) r9     // Catch:{ all -> 0x04d8 }
            int r11 = r9.f167874a     // Catch:{ all -> 0x04d8 }
            r11 = r11 | 16
            r9.f167874a = r11     // Catch:{ all -> 0x04d8 }
            r9.f167880g = r8     // Catch:{ all -> 0x04d8 }
        L_0x018f:
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r8 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r8 = (com.google.lens.p4698d.C62178q) r8     // Catch:{ all -> 0x04d8 }
            int r9 = r8.f167874a     // Catch:{ all -> 0x04d8 }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.f167874a = r9     // Catch:{ all -> 0x04d8 }
            r8.f167885l = r5     // Catch:{ all -> 0x04d8 }
            boolean r5 = r4.f73116j     // Catch:{ all -> 0x04d8 }
            if (r5 == 0) goto L_0x01b2
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r5 = (com.google.lens.p4698d.C62178q) r5     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167874a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | r7
            r5.f167874a = r8     // Catch:{ all -> 0x04d8 }
            r5.f167875b = r7     // Catch:{ all -> 0x04d8 }
            r4.f73116j = r6     // Catch:{ all -> 0x04d8 }
        L_0x01b2:
            boolean r5 = r4.f73117k     // Catch:{ all -> 0x04d8 }
            if (r5 == 0) goto L_0x01c7
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r5 = (com.google.lens.p4698d.C62178q) r5     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167874a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | 512(0x200, float:7.175E-43)
            r5.f167874a = r8     // Catch:{ all -> 0x04d8 }
            r5.f167884k = r7     // Catch:{ all -> 0x04d8 }
            r4.f73117k = r6     // Catch:{ all -> 0x04d8 }
        L_0x01c7:
            boolean r5 = r4.f73119m     // Catch:{ all -> 0x04d8 }
            if (r5 == 0) goto L_0x01f1
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r5 = (com.google.lens.p4698d.C62178q) r5     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167874a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | 128(0x80, float:1.794E-43)
            r5.f167874a = r8     // Catch:{ all -> 0x04d8 }
            r5.f167882i = r7     // Catch:{ all -> 0x04d8 }
            r4.f73119m = r6     // Catch:{ all -> 0x04d8 }
            boolean r5 = r4.f73118l     // Catch:{ all -> 0x04d8 }
            if (r5 == 0) goto L_0x01f1
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r5 = (com.google.lens.p4698d.C62178q) r5     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167874a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | 64
            r5.f167874a = r8     // Catch:{ all -> 0x04d8 }
            r5.f167881h = r7     // Catch:{ all -> 0x04d8 }
            r4.f73118l = r6     // Catch:{ all -> 0x04d8 }
        L_0x01f1:
            com.google.bp.f.b.a.df r5 = r4.f73126t     // Catch:{ all -> 0x04d8 }
            com.google.bp.f.b.a.df r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE     // Catch:{ all -> 0x04d8 }
            if (r5 != r8) goto L_0x01fe
            boolean r5 = r4.f73110d     // Catch:{ all -> 0x04d8 }
            if (r5 != 0) goto L_0x01fc
            goto L_0x01fe
        L_0x01fc:
            r5 = 0
            goto L_0x01ff
        L_0x01fe:
            r5 = 1
        L_0x01ff:
            boolean r8 = r4.f73113g     // Catch:{ all -> 0x04d8 }
            if (r8 == 0) goto L_0x0209
            if (r5 == 0) goto L_0x0209
            r4.f73113g = r6     // Catch:{ all -> 0x04d8 }
            r8 = 2
            goto L_0x020a
        L_0x0209:
            r8 = 1
        L_0x020a:
            boolean r9 = r4.f73114h     // Catch:{ all -> 0x04d8 }
            if (r9 == 0) goto L_0x0213
            if (r5 == 0) goto L_0x0213
            r4.f73114h = r6     // Catch:{ all -> 0x04d8 }
            r8 = 3
        L_0x0213:
            boolean r5 = r4.f73115i     // Catch:{ all -> 0x04d8 }
            if (r5 == 0) goto L_0x021a
            r4.f73115i = r6     // Catch:{ all -> 0x04d8 }
            r8 = 4
        L_0x021a:
            long r11 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.q r10 = (com.google.lens.p4698d.C62178q) r10     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r13 = com.google.lens.p4698d.C62176o.f167863g     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.n r13 = (com.google.lens.p4698d.C62175n) r13     // Catch:{ all -> 0x04d8 }
            r13.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r15 = (com.google.lens.p4698d.C62176o) r15     // Catch:{ all -> 0x04d8 }
            int r5 = r15.f167865a     // Catch:{ all -> 0x04d8 }
            r5 = r5 | r7
            r15.f167865a = r5     // Catch:{ all -> 0x04d8 }
            r15.f167866b = r11     // Catch:{ all -> 0x04d8 }
            r13.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r5 = (com.google.lens.p4698d.C62176o) r5     // Catch:{ all -> 0x04d8 }
            int r8 = r8 + -1
            r5.f167868d = r8     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167865a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | r14
            r5.f167865a = r8     // Catch:{ all -> 0x04d8 }
            r13.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r5 = (com.google.lens.p4698d.C62176o) r5     // Catch:{ all -> 0x04d8 }
            r10.getClass()     // Catch:{ all -> 0x04d8 }
            r5.f167870f = r10     // Catch:{ all -> 0x04d8 }
            int r8 = r5.f167865a     // Catch:{ all -> 0x04d8 }
            r8 = r8 | 16
            r5.f167865a = r8     // Catch:{ all -> 0x04d8 }
            r13.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r13.instance     // Catch:{ all -> 0x04d8 }
            r8 = r5
            com.google.lens.d.o r8 = (com.google.lens.p4698d.C62176o) r8     // Catch:{ all -> 0x04d8 }
            r8.f167867c = r6     // Catch:{ all -> 0x04d8 }
            int r5 = r8.f167865a     // Catch:{ all -> 0x04d8 }
            r10 = 2
            r11 = r5 | 2
            r8.f167865a = r11     // Catch:{ all -> 0x04d8 }
            r13.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r8 = r13.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r8 = (com.google.lens.p4698d.C62176o) r8     // Catch:{ all -> 0x04d8 }
            r8.f167869e = r6     // Catch:{ all -> 0x04d8 }
            int r10 = r8.f167865a     // Catch:{ all -> 0x04d8 }
            r10 = r10 | 8
            r8.f167865a = r10     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r8 = r13.build()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.o r8 = (com.google.lens.p4698d.C62176o) r8     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.ba r10 = com.google.android.libraries.lens.view.p2113h.p2123f.C26832n.m49675b()     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.ad r11 = com.google.lens.p4707j.C62400ad.f168445c     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.ac r11 = (com.google.lens.p4707j.C62399ac) r11     // Catch:{ all -> 0x04d8 }
            r11.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.ad r12 = (com.google.lens.p4707j.C62400ad) r12     // Catch:{ all -> 0x04d8 }
            r8.getClass()     // Catch:{ all -> 0x04d8 }
            r12.f168448b = r8     // Catch:{ all -> 0x04d8 }
            r5 = 2
            r12.f168447a = r5     // Catch:{ all -> 0x04d8 }
            r10.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r8 = r10.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.bb r8 = (com.google.lens.p4707j.C62425bb) r8     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.ad r11 = (com.google.lens.p4707j.C62400ad) r11     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.bb r12 = com.google.lens.p4707j.C62425bb.f168506e     // Catch:{ all -> 0x04d8 }
            r11.getClass()     // Catch:{ all -> 0x04d8 }
            r8.f168510c = r11     // Catch:{ all -> 0x04d8 }
            r9 = 3
            r8.f168509b = r9     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r8 = r10.build()     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.bb r8 = (com.google.lens.p4707j.C62425bb) r8     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.bd r2 = com.google.android.libraries.lens.view.p2113h.p2123f.C26827i.m49637r(r2, r8)     // Catch:{ all -> 0x04d8 }
            int r8 = r2.f168516b     // Catch:{ all -> 0x04d8 }
            if (r8 != r14) goto L_0x02c5
            java.lang.Object r2 = r2.f168517c     // Catch:{ all -> 0x04d8 }
            com.google.lens.j.af r2 = (com.google.lens.p4707j.C62402af) r2     // Catch:{ all -> 0x04d8 }
            goto L_0x02c7
        L_0x02c5:
            com.google.lens.j.af r2 = com.google.lens.p4707j.C62402af.f168450c     // Catch:{ all -> 0x04d8 }
        L_0x02c7:
            int r8 = r2.f168452a     // Catch:{ all -> 0x04d8 }
            if (r8 != r7) goto L_0x02d0
            java.lang.Object r2 = r2.f168453b     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.s r2 = (com.google.lens.p4698d.C62180s) r2     // Catch:{ all -> 0x04d8 }
            goto L_0x02d2
        L_0x02d0:
            com.google.lens.d.s r2 = com.google.lens.p4698d.C62180s.f167887d     // Catch:{ all -> 0x04d8 }
        L_0x02d2:
            com.google.lens.d.u r8 = r2.f167891c     // Catch:{ all -> 0x04d8 }
            if (r8 != 0) goto L_0x02d8
            com.google.lens.d.u r8 = com.google.lens.p4698d.C62182u.f167894e     // Catch:{ all -> 0x04d8 }
        L_0x02d8:
            com.google.lens.d.y r8 = r8.f167899d     // Catch:{ all -> 0x04d8 }
            if (r8 != 0) goto L_0x02de
            com.google.lens.d.y r8 = com.google.lens.p4698d.C62186y.f167909b     // Catch:{ all -> 0x04d8 }
        L_0x02de:
            boolean r9 = r8.f167911a     // Catch:{ all -> 0x04d8 }
            if (r9 == 0) goto L_0x0319
            com.google.common.base.ax r9 = r4.f73121o     // Catch:{ all -> 0x04d8 }
            boolean r9 = r9.mo56113h()     // Catch:{ all -> 0x04d8 }
            if (r9 == 0) goto L_0x0319
            com.google.common.base.ax r9 = r4.f73121o     // Catch:{ all -> 0x04d8 }
            java.lang.Object r9 = r9.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.y r9 = (com.google.lens.p4698d.C62186y) r9     // Catch:{ all -> 0x04d8 }
            boolean r9 = r9.f167911a     // Catch:{ all -> 0x04d8 }
            if (r9 != 0) goto L_0x0319
            com.google.android.libraries.lens.view.h.e.ab r9 = r4.f73129w     // Catch:{ all -> 0x04d8 }
            r9.getClass()
            com.google.common.f.a.d r10 = com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai.f72971a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r10 = r9.f72960a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ao r11 = r10.f72977E     // Catch:{ all -> 0x04d8 }
            r12 = 0
            r11.f73046c = r12     // Catch:{ all -> 0x04d8 }
            r11.f73049f = r6     // Catch:{ all -> 0x04d8 }
            java.util.concurrent.Executor r10 = r10.f73011c     // Catch:{ all -> 0x04d8 }
            r10.getClass()
            com.google.android.libraries.lens.view.h.e.z r11 = new com.google.android.libraries.lens.view.h.e.z     // Catch:{ all -> 0x04d8 }
            r11.<init>(r9)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai.m49585w(r10, r11)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.f.a r9 = r4.f73111e     // Catch:{ all -> 0x04d8 }
            r9.mo32179b()     // Catch:{ all -> 0x04d8 }
        L_0x0319:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)     // Catch:{ all -> 0x04d8 }
            r4.f73121o = r8     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.w r8 = r2.f167890b     // Catch:{ all -> 0x04d8 }
            if (r8 != 0) goto L_0x0325
            com.google.lens.d.w r8 = com.google.lens.p4698d.C62184w.f167902f     // Catch:{ all -> 0x04d8 }
        L_0x0325:
            int r9 = r8.f167904a     // Catch:{ all -> 0x04d8 }
            r9 = r9 & r14
            if (r9 == 0) goto L_0x0380
            long r8 = r8.f167907d     // Catch:{ all -> 0x04d8 }
            long r10 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x033a
            com.google.android.libraries.lens.view.u.a r8 = com.google.android.libraries.lens.view.p2173u.C28095a.SKIPPED     // Catch:{ all -> 0x04d8 }
            r0.mo33560c(r8)     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            goto L_0x039e
        L_0x033a:
            com.google.common.base.ax r10 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            boolean r10 = r10.mo56113h()     // Catch:{ all -> 0x04d8 }
            if (r10 == 0) goto L_0x0378
            com.google.common.base.ax r10 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r10 = (com.google.android.libraries.lens.view.p2173u.C28097c) r10     // Catch:{ all -> 0x04d8 }
            long r10 = r10.f76484b     // Catch:{ all -> 0x04d8 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0378
            com.google.common.base.ax r8 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r8 = (com.google.android.libraries.lens.view.p2173u.C28097c) r8     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.a r9 = com.google.android.libraries.lens.view.p2173u.C28095a.SKIPPED     // Catch:{ all -> 0x04d8 }
            r8.mo33560c(r9)     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r8 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r8 = (com.google.android.libraries.lens.view.p2173u.C28097c) r8     // Catch:{ all -> 0x04d8 }
            long r8 = r8.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r18)     // Catch:{ all -> 0x04d8 }
            r4.f73120n = r0     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r0 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r0 = (com.google.android.libraries.lens.view.p2173u.C28097c) r0     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            goto L_0x039e
        L_0x0378:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x04d8 }
            java.lang.String r2 = "Unlocked timestamp must be either current frame or locked frame."
            r0.<init>(r2)     // Catch:{ all -> 0x04d8 }
            throw r0     // Catch:{ all -> 0x04d8 }
        L_0x0380:
            com.google.common.base.ax r8 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x04d8 }
            r8 = r8 ^ r7
            java.lang.String r9 = "%s-maybeUpdateLockedFrame:lockedFrame not present"
            java.lang.String r10 = "FSNI"
            com.google.common.base.C58838bb.m90887v(r8, r9, r10)     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r18)     // Catch:{ all -> 0x04d8 }
            r4.f73120n = r0     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r0 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r0 = (com.google.android.libraries.lens.view.p2173u.C28097c) r0     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
        L_0x039e:
            com.google.lens.d.w r0 = r2.f167890b     // Catch:{ all -> 0x04d8 }
            if (r0 != 0) goto L_0x03a4
            com.google.lens.d.w r0 = com.google.lens.p4698d.C62184w.f167902f     // Catch:{ all -> 0x04d8 }
        L_0x03a4:
            boolean r8 = r0.f167905b     // Catch:{ all -> 0x04d8 }
            if (r8 != 0) goto L_0x03aa
            goto L_0x045e
        L_0x03aa:
            com.google.common.base.ax r8 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x04d8 }
            java.lang.String r9 = "%s-maybeSelectFrame:lockedFrame not present."
            java.lang.String r10 = "FSNI"
            com.google.common.base.C58838bb.m90887v(r8, r9, r10)     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f167906c     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r10 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r10 = r10.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r10 = (com.google.android.libraries.lens.view.p2173u.C28097c) r10     // Catch:{ all -> 0x04d8 }
            long r10 = r10.f76484b     // Catch:{ all -> 0x04d8 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x03c8
            r6 = 1
        L_0x03c8:
            java.lang.String r8 = "%s-maybeSelectFrame:tsp not match %s vs %s."
            java.lang.String r9 = "FSNI"
            long r10 = r0.f167906c     // Catch:{ all -> 0x04d8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r11 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r11 = r11.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r11 = (com.google.android.libraries.lens.view.p2173u.C28097c) r11     // Catch:{ all -> 0x04d8 }
            long r11 = r11.f76484b     // Catch:{ all -> 0x04d8 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x04d8 }
            com.google.common.base.C58838bb.m90891z(r6, r8, r9, r10, r11)     // Catch:{ all -> 0x04d8 }
            int r0 = r0.f167908e     // Catch:{ all -> 0x04d8 }
            int r16 = com.google.lens.p4698d.C62165d.m94756b(r0)     // Catch:{ all -> 0x04d8 }
            if (r16 != 0) goto L_0x03ed
            r0 = 2
            goto L_0x03ef
        L_0x03ed:
            r0 = r16
        L_0x03ef:
            r4.f73128v = r0     // Catch:{ all -> 0x04d8 }
            com.google.common.base.ax r0 = r4.f73120n     // Catch:{ all -> 0x04d8 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.u.c r0 = (com.google.android.libraries.lens.view.p2173u.C28097c) r0     // Catch:{ all -> 0x04d8 }
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x04d8 }
            r4.f73120n = r6     // Catch:{ all -> 0x04d8 }
            boolean r6 = r4.f73122p     // Catch:{ all -> 0x04d8 }
            if (r6 == 0) goto L_0x044a
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ab r6 = r4.f73129w     // Catch:{ all -> 0x04d8 }
            r6.getClass()
            com.google.common.f.a.d r8 = com.google.android.libraries.lens.view.p2113h.p2122e.C26784ai.f72971a     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r8 = r6.f72960a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.a.r r8 = r8.f73028t     // Catch:{ all -> 0x04d8 }
            r8.mo31953b()     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r8 = r6.f72960a     // Catch:{ all -> 0x04d8 }
            boolean r8 = r8.f72986N     // Catch:{ all -> 0x04d8 }
            java.lang.String r9 = "Must be in FSIQ mode."
            com.google.common.base.C58838bb.m90884s(r8, r9)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r8 = r6.f72960a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.f.c r8 = r8.f72976D     // Catch:{ all -> 0x04d8 }
            r8.mo32188c(r0)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r8 = r6.f72960a     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ao r9 = r8.f72977E     // Catch:{ all -> 0x04d8 }
            long r10 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            r9.f73046c = r10     // Catch:{ all -> 0x04d8 }
            java.lang.Object r8 = r8.f73016h     // Catch:{ all -> 0x04d8 }
            monitor-enter(r8)     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ai r6 = r6.f72960a     // Catch:{ all -> 0x0447 }
            com.google.android.libraries.lens.view.h.h.a.u r6 = r6.f73017i     // Catch:{ all -> 0x0447 }
            if (r6 == 0) goto L_0x0445
            long r9 = r0.f76484b     // Catch:{ all -> 0x0447 }
            com.google.android.libraries.lens.view.u.a r9 = com.google.android.libraries.lens.view.p2173u.C28095a.SELECTED     // Catch:{ all -> 0x0447 }
            r0.mo33560c(r9)     // Catch:{ all -> 0x0447 }
            java.util.concurrent.ExecutorService r9 = r6.f73252n     // Catch:{ all -> 0x0447 }
            com.google.android.libraries.lens.view.h.h.a.r r10 = new com.google.android.libraries.lens.view.h.h.a.r     // Catch:{ all -> 0x0447 }
            r10.<init>(r6, r0)     // Catch:{ all -> 0x0447 }
            r9.execute(r10)     // Catch:{ all -> 0x0447 }
        L_0x0445:
            monitor-exit(r8)     // Catch:{ all -> 0x0447 }
            goto L_0x0459
        L_0x0447:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0447 }
            throw r0     // Catch:{ all -> 0x04d8 }
        L_0x044a:
            com.google.android.libraries.lens.view.u.a r6 = com.google.android.libraries.lens.view.p2173u.C28095a.SKIPPED     // Catch:{ all -> 0x04d8 }
            r0.mo33560c(r6)     // Catch:{ all -> 0x04d8 }
            long r8 = r0.f76484b     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.h.e.ab r0 = r4.f73129w     // Catch:{ all -> 0x04d8 }
            r0.getClass()
            r0.mo32144a()     // Catch:{ all -> 0x04d8 }
        L_0x0459:
            com.google.android.libraries.lens.view.h.f.a r0 = r4.f73111e     // Catch:{ all -> 0x04d8 }
            r0.mo32179b()     // Catch:{ all -> 0x04d8 }
        L_0x045e:
            com.google.lens.d.u r0 = r2.f167891c     // Catch:{ all -> 0x04d8 }
            if (r0 != 0) goto L_0x0464
            com.google.lens.d.u r0 = com.google.lens.p4698d.C62182u.f167894e     // Catch:{ all -> 0x04d8 }
        L_0x0464:
            java.lang.String r0 = r0.f167896a     // Catch:{ all -> 0x04d8 }
            r4.f73123q = r0     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.h r0 = com.google.lens.p4698d.C62169h.f167834e     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.g r0 = (com.google.lens.p4698d.C62168g) r0     // Catch:{ all -> 0x04d8 }
            long r8 = r2.f167889a     // Catch:{ all -> 0x04d8 }
            r0.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r6 = r0.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.h r6 = (com.google.lens.p4698d.C62169h) r6     // Catch:{ all -> 0x04d8 }
            int r10 = r6.f167836a     // Catch:{ all -> 0x04d8 }
            r7 = r7 | r10
            r6.f167836a = r7     // Catch:{ all -> 0x04d8 }
            r6.f167837b = r8     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.u r6 = r2.f167891c     // Catch:{ all -> 0x04d8 }
            if (r6 != 0) goto L_0x0486
            com.google.lens.d.u r6 = com.google.lens.p4698d.C62182u.f167894e     // Catch:{ all -> 0x04d8 }
        L_0x0486:
            com.google.cj.a.a.a.d r6 = r6.f167897b     // Catch:{ all -> 0x04d8 }
            if (r6 != 0) goto L_0x048c
            com.google.cj.a.a.a.d r6 = com.google.p4488cj.p4489a.p4490a.p4491a.C58124d.f155385b     // Catch:{ all -> 0x04d8 }
        L_0x048c:
            r0.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.h r7 = (com.google.lens.p4698d.C62169h) r7     // Catch:{ all -> 0x04d8 }
            r6.getClass()     // Catch:{ all -> 0x04d8 }
            r7.f167838c = r6     // Catch:{ all -> 0x04d8 }
            int r6 = r7.f167836a     // Catch:{ all -> 0x04d8 }
            r5 = 2
            r5 = r5 | r6
            r7.f167836a = r5     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.u r2 = r2.f167891c     // Catch:{ all -> 0x04d8 }
            if (r2 != 0) goto L_0x04a4
            com.google.lens.d.u r2 = com.google.lens.p4698d.C62182u.f167894e     // Catch:{ all -> 0x04d8 }
        L_0x04a4:
            com.google.protobuf.ch r2 = r2.f167898c     // Catch:{ all -> 0x04d8 }
            r0.copyOnWrite()     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.h r5 = (com.google.lens.p4698d.C62169h) r5     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.ch r6 = r5.f167839d     // Catch:{ all -> 0x04d8 }
            boolean r7 = r6.mo58948c()     // Catch:{ all -> 0x04d8 }
            if (r7 != 0) goto L_0x04bb
            com.google.protobuf.ch r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r6)     // Catch:{ all -> 0x04d8 }
            r5.f167839d = r6     // Catch:{ all -> 0x04d8 }
        L_0x04bb:
            com.google.protobuf.ch r5 = r5.f167839d     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r5)     // Catch:{ all -> 0x04d8 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x04d8 }
            com.google.lens.d.h r0 = (com.google.lens.p4698d.C62169h) r0     // Catch:{ all -> 0x04d8 }
            com.google.android.libraries.lens.view.vision.n r2 = r4.f73107a     // Catch:{ all -> 0x04d8 }
            r2.getClass()
            r0.getClass()
            com.google.android.libraries.lens.view.h.f.a.a r4 = new com.google.android.libraries.lens.view.h.f.a.a     // Catch:{ all -> 0x04d8 }
            r4.<init>(r0)     // Catch:{ all -> 0x04d8 }
            r2.mo33586g(r4)     // Catch:{ all -> 0x04d8 }
        L_0x04d6:
            monitor-exit(r3)     // Catch:{ all -> 0x04d8 }
            return
        L_0x04d8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04d8 }
            throw r0
        L_0x04db:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.Throwable r0 = r0.getCause()
            r2.<init>(r0)
            throw r2
        L_0x04e6:
            long r2 = r0.f76484b
            com.google.android.libraries.lens.view.u.a r2 = com.google.android.libraries.lens.view.p2173u.C28095a.SKIPPED
            r0.mo33560c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2123f.C26825g.mo32199a(com.google.android.libraries.lens.view.u.c):void");
    }
}
