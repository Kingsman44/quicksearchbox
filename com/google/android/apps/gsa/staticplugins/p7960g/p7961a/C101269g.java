package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.g */
/* compiled from: PG */
final class C101269g extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f282631a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f282632b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f282633c;

    /* renamed from: d */
    final /* synthetic */ C101270h f282634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101269g(C101270h hVar, SettableFuture settableFuture, SettableFuture settableFuture2, SettableFuture settableFuture3) {
        super("AppPackageAndScreenshotFutureCallback", 1, 0);
        this.f282634d = hVar;
        this.f282631a = settableFuture;
        this.f282632b = settableFuture2;
        this.f282633c = settableFuture3;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m167528d() {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.g.a.h r0 = r9.f282634d
            com.google.android.apps.gsa.assist.a.i r1 = r0.f282635a
            com.google.common.util.concurrent.SettableFuture r2 = r9.f282631a
            java.lang.String r3 = "AppPackage"
            java.lang.Object r2 = r0.mo92211b(r2, r3)
            com.google.android.apps.gsa.assist.f r2 = (com.google.android.apps.gsa.assist.C9410f) r2
            com.google.android.apps.gsa.staticplugins.g.a.h r3 = r9.f282634d
            com.google.common.util.concurrent.SettableFuture r4 = r9.f282632b
            java.lang.String r5 = "Screenshot"
            java.lang.Object r3 = r3.mo92211b(r4, r5)
            com.google.android.apps.gsa.assist.ac r3 = (com.google.android.apps.gsa.assist.C9332ac) r3
            com.google.android.apps.gsa.staticplugins.g.a.h r4 = r9.f282634d
            com.google.common.util.concurrent.SettableFuture r5 = r9.f282633c
            java.lang.String r6 = "ScreenshotAvailability"
            java.lang.Object r4 = r4.mo92211b(r5, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r2 != 0) goto L_0x003b
            dagger.a r5 = r0.f282638d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSIST_DATA_PROCESSOR_APP_PACKAGE_TIMEOUT
            com.google.android.apps.gsa.assist.a.f r7 = r0.f282637c
            com.google.android.apps.gsa.shared.logger.b.g r6 = com.google.android.apps.gsa.assist.p501a.C9324l.m23779a(r6, r7)
            r5.mo74236a(r6)
        L_0x003b:
            if (r3 != 0) goto L_0x0050
            dagger.a r5 = r0.f282638d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSIST_DATA_PROCESSOR_SCREENSHOT_TIMEOUT
            com.google.android.apps.gsa.assist.a.f r7 = r0.f282637c
            com.google.android.apps.gsa.shared.logger.b.g r6 = com.google.android.apps.gsa.assist.p501a.C9324l.m23779a(r6, r7)
            r5.mo74236a(r6)
        L_0x0050:
            r5 = 0
            if (r2 != 0) goto L_0x0057
            if (r3 != 0) goto L_0x0057
            goto L_0x0134
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            goto L_0x0082
        L_0x005a:
            java.lang.String r6 = "com.google.android.googlequicksearchbox"
            java.lang.String r7 = r2.f32693b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            com.google.protobuf.cq r6 = r2.f32696e
            java.util.Iterator r6 = r6.iterator()
        L_0x006a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0082
            java.lang.Object r7 = r6.next()
            com.google.android.apps.gsa.assist.d r7 = (com.google.android.apps.gsa.assist.C9405d) r7
            java.lang.String r7 = r7.f32676b
            java.lang.String r8 = "com.google.android.googlequicksearchbox/com.google.android.apps.gsa.staticplugins.opa.OpaActivity"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x006a
            goto L_0x0134
        L_0x0082:
            com.google.android.apps.gsa.assist.h r5 = com.google.android.apps.gsa.assist.C9418h.f32714k
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.assist.g r5 = (com.google.android.apps.gsa.assist.C9417g) r5
            com.google.android.apps.gsa.assist.a.i r6 = r0.f282635a
            com.google.android.apps.gsa.assist.a.f r7 = r0.f282637c
            com.google.android.apps.gsa.assist.a.d r6 = r6.mo17525b(r7)
            boolean r6 = r6.mo17521i()
            if (r6 == 0) goto L_0x00bb
            if (r4 != 0) goto L_0x00a8
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7960g.p7961a.C101272j.f282651a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "Failed to get Screenshot availability"
            r7 = 13834(0x360a, float:1.9386E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r6)
            goto L_0x00bb
        L_0x00a8:
            boolean r4 = r4.booleanValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.assist.h r6 = (com.google.android.apps.gsa.assist.C9418h) r6
            int r7 = r6.f32716a
            r7 = r7 | 256(0x100, float:3.59E-43)
            r6.f32716a = r7
            r6.f32725j = r4
        L_0x00bb:
            r4 = 2
            if (r3 == 0) goto L_0x00cc
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.assist.h r6 = (com.google.android.apps.gsa.assist.C9418h) r6
            r6.f32719d = r3
            int r3 = r6.f32716a
            r3 = r3 | r4
            r6.f32716a = r3
        L_0x00cc:
            if (r2 == 0) goto L_0x00d9
            com.google.protobuf.cq r3 = r2.f32696e
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00d9
            r5.mo17672a(r2)
        L_0x00d9:
            com.google.android.apps.gsa.assist.a.a r2 = r0.f282636b
            long r2 = r2.f32327a
            java.lang.String r2 = java.lang.Long.toString(r2)
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.apps.gsa.assist.h r3 = (com.google.android.apps.gsa.assist.C9418h) r3
            r2.getClass()
            int r6 = r3.f32716a
            r6 = r6 | 64
            r3.f32716a = r6
            r3.f32723h = r2
            com.google.android.apps.gsa.assist.a.f r2 = r0.f282637c
            com.google.android.apps.gsa.assist.a.f r3 = com.google.android.apps.gsa.assist.p501a.C9318f.CONTEXTUAL
            int r2 = r2.ordinal()
            r3 = 11
            if (r2 == 0) goto L_0x0106
            if (r2 == r4) goto L_0x0104
            r2 = 11
            goto L_0x0107
        L_0x0104:
            r2 = 7
            goto L_0x0107
        L_0x0106:
            r2 = 1
        L_0x0107:
            if (r2 == r3) goto L_0x011a
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.apps.gsa.assist.h r3 = (com.google.android.apps.gsa.assist.C9418h) r3
            int r2 = r2 + -1
            r3.f32722g = r2
            int r2 = r3.f32716a
            r2 = r2 | 16
            r3.f32716a = r2
        L_0x011a:
            int r0 = r0.f282639e
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.gsa.assist.h r2 = (com.google.android.apps.gsa.assist.C9418h) r2
            int r3 = r2.f32716a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.f32716a = r3
            int r0 = r0 + -1
            r2.f32724i = r0
            com.google.protobuf.bv r0 = r5.build()
            r5 = r0
            com.google.android.apps.gsa.assist.h r5 = (com.google.android.apps.gsa.assist.C9418h) r5
        L_0x0134:
            com.google.android.apps.gsa.staticplugins.g.a.h r0 = r9.f282634d
            com.google.android.apps.gsa.assist.a.f r0 = r0.f282637c
            r1.mo17530g(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7960g.p7961a.C101269g.m167528d():void");
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m167528d();
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        m167528d();
    }
}
