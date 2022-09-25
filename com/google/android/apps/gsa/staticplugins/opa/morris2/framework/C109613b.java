package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14729c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14656c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14658e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b */
/* compiled from: PG */
public final class C109613b implements C14985g {

    /* renamed from: a */
    public final C69464a f305247a;

    /* renamed from: b */
    public final Map f305248b;

    /* renamed from: c */
    public final C60888db f305249c;

    /* renamed from: d */
    public List f305250d;

    /* renamed from: e */
    private final C14729c f305251e;

    /* renamed from: f */
    private final C14729c f305252f;

    /* renamed from: g */
    private final C14729c f305253g;

    public C109613b(C14658e eVar, Map map, C69464a aVar, C60888db dbVar) {
        this.f305251e = new C14654a(eVar);
        this.f305252f = new C14655b(eVar);
        this.f305253g = new C14656c(eVar);
        this.f305247a = aVar;
        this.f305249c = dbVar;
        this.f305248b = map;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        List<C60870cx> list = this.f305250d;
        if (list != null) {
            for (C60870cx cancel : list) {
                cancel.cancel(true);
            }
            this.f305250d = null;
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        r1 = ((com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4).f44263a;
        r2 = new android.content.Intent();
        r2.setComponent(new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity"));
        r2.putExtra("INTENT_TRIGGERING_SOURCE_KEY", r1.f44276k.f134124v);
        r2.setFlags(268435456);
        com.google.apps.tiktok.concurrent.C46459k.m82829b(r1.f44272g.mo20101f(r2), "Failed to launch driving screen", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e9, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97911f(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf r17, com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r1.f43798a
            int r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14366go.m30613a(r2)
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x058b
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x0243
            r11 = 13
            if (r4 == r9) goto L_0x0040
            if (r4 == r8) goto L_0x003f
            if (r4 == r7) goto L_0x001f
            return r10
        L_0x001f:
            com.google.android.libraries.assistant.auto.tng.morris.framework.c r3 = r0.f305253g
            if (r2 != r11) goto L_0x0028
            java.lang.Object r1 = r1.f43799b
            com.google.android.libraries.assistant.auto.tng.morris.e.lc r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14489lc) r1
            goto L_0x002a
        L_0x0028:
            com.google.android.libraries.assistant.auto.tng.morris.e.lc r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14489lc.f43790b
        L_0x002a:
            int r1 = r1.f43792a
            com.google.android.libraries.assistant.auto.tng.morris.e.lb r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb.m30624a(r1)
            if (r1 != 0) goto L_0x0034
            com.google.android.libraries.assistant.auto.tng.morris.e.lb r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb.UNRECOGNIZED
        L_0x0034:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.c r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14656c) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44264a
            com.google.android.libraries.assistant.auto.tng.morris.e.lb r3 = r2.f44277l
            if (r1 != r3) goto L_0x003d
            return r10
        L_0x003d:
            r2.f44277l = r1
        L_0x003f:
            return r9
        L_0x0040:
            com.google.android.libraries.assistant.auto.tng.morris.framework.c r4 = r0.f305252f
            if (r2 != r8) goto L_0x0049
            java.lang.Object r1 = r1.f43799b
            com.google.android.libraries.assistant.auto.tng.morris.e.le r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14491le) r1
            goto L_0x004b
        L_0x0049:
            com.google.android.libraries.assistant.auto.tng.morris.e.le r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14491le.f43793b
        L_0x004b:
            int r1 = r1.f43795a
            r2 = 12
            r12 = 11
            r13 = 10
            r14 = 9
            r15 = 8
            r11 = 7
            r3 = 4
            switch(r1) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0087;
                case 2: goto L_0x0085;
                case 3: goto L_0x0083;
                case 4: goto L_0x0081;
                case 5: goto L_0x007f;
                case 6: goto L_0x007c;
                case 7: goto L_0x0079;
                case 8: goto L_0x0076;
                case 9: goto L_0x0073;
                case 10: goto L_0x0070;
                case 11: goto L_0x006d;
                case 12: goto L_0x006a;
                case 13: goto L_0x0067;
                case 14: goto L_0x0064;
                case 15: goto L_0x0061;
                case 16: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            r1 = 0
            goto L_0x008a
        L_0x005e:
            r1 = 18
            goto L_0x008a
        L_0x0061:
            r1 = 17
            goto L_0x008a
        L_0x0064:
            r1 = 16
            goto L_0x008a
        L_0x0067:
            r1 = 15
            goto L_0x008a
        L_0x006a:
            r1 = 14
            goto L_0x008a
        L_0x006d:
            r1 = 13
            goto L_0x008a
        L_0x0070:
            r1 = 12
            goto L_0x008a
        L_0x0073:
            r1 = 11
            goto L_0x008a
        L_0x0076:
            r1 = 10
            goto L_0x008a
        L_0x0079:
            r1 = 9
            goto L_0x008a
        L_0x007c:
            r1 = 8
            goto L_0x008a
        L_0x007f:
            r1 = 7
            goto L_0x008a
        L_0x0081:
            r1 = 6
            goto L_0x008a
        L_0x0083:
            r1 = 5
            goto L_0x008a
        L_0x0085:
            r1 = 4
            goto L_0x008a
        L_0x0087:
            r1 = 3
            goto L_0x008a
        L_0x0089:
            r1 = 2
        L_0x008a:
            if (r1 != 0) goto L_0x008d
            r1 = 1
        L_0x008d:
            int r1 = r1 + -2
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            switch(r1) {
                case 1: goto L_0x0236;
                case 2: goto L_0x0229;
                case 3: goto L_0x021c;
                case 4: goto L_0x020f;
                case 5: goto L_0x0206;
                case 6: goto L_0x01f9;
                case 7: goto L_0x0206;
                case 8: goto L_0x01a3;
                case 9: goto L_0x0196;
                case 10: goto L_0x017c;
                case 11: goto L_0x016f;
                case 12: goto L_0x0102;
                case 13: goto L_0x00f6;
                case 14: goto L_0x00ea;
                case 15: goto L_0x00bb;
                case 16: goto L_0x0097;
                default: goto L_0x0094;
            }
        L_0x0094:
            r9 = 0
            goto L_0x0242
        L_0x0097:
            r1 = r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r1 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r1
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r1.f44263a
            java.lang.String r2 = r2.f44275j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00bb
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r1.f44263a
            android.content.Context r2 = r2.f44267b
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r1.f44263a
            java.lang.String r1 = r1.f44275j
            android.content.Intent r1 = r3.getLaunchIntentForPackage(r1)
            r1.getClass()
            com.google.apps.tiktok.tracing.C47810es.m84979s(r2, r1)
            goto L_0x0094
        L_0x00bb:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity"
            r3.<init>(r4, r5)
            r2.setComponent(r3)
            com.google.assistant.e.i.a.ja r3 = r1.f44276k
            int r3 = r3.f134124v
            java.lang.String r4 = "INTENT_TRIGGERING_SOURCE_KEY"
            r2.putExtra(r4, r3)
            r2.setFlags(r8)
            com.google.android.libraries.assistant.auto.tng.n.a.a r1 = r1.f44272g
            com.google.common.util.concurrent.cx r1 = r1.mo20101f(r2)
            java.lang.String r2 = "Failed to launch driving screen"
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r1, r2, r3)
            return r10
        L_0x00ea:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r3 = r1.f44280o
            if (r3 != r2) goto L_0x00f3
            goto L_0x0094
        L_0x00f3:
            r1.f44280o = r2
            return r9
        L_0x00f6:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r12) goto L_0x00ff
            goto L_0x0094
        L_0x00ff:
            r1.f44280o = r12
            return r9
        L_0x0102:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            boolean r2 = r1.mo21630l()
            if (r2 == 0) goto L_0x010e
            goto L_0x0242
        L_0x010e:
            a.b.b.a.c r2 = r1.f44273h
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN
            if (r2 != r3) goto L_0x0125
            g.a.a r1 = r1.f44269d
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14737g.m31021a()
            r1.mo21875g(r2)
            goto L_0x0094
        L_0x0125:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40419b
            java.lang.String r3 = r1.f44275j
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0158
            com.google.android.libraries.assistant.auto.tng.morris.f.d r2 = r1.f44268c
            r2.mo21611y()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "google.maps:///?act=17&notts=1"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4, r3)
            r2.addFlags(r8)
            java.lang.String r3 = r1.f44275j
            r2.setPackage(r3)
            com.google.android.libraries.assistant.auto.tng.n.a.a r1 = r1.f44272g
            com.google.common.util.concurrent.cx r1 = r1.mo20101f(r2)
            java.lang.String r2 = "Failed to exit Gmm navigation"
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r1, r2, r3)
            goto L_0x0094
        L_0x0158:
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14658e.f44266a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "Morris.ModeCtrl"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Host app package name not among valid GMM packages, not sending GMM Go Back intent"
            r3 = 45335(0xb117, float:6.3528E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0094
        L_0x016f:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r13) goto L_0x0179
            goto L_0x0094
        L_0x0179:
            r1.f44280o = r13
            return r9
        L_0x017c:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            g.a.a r1 = r1.f44269d
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i.m31028a()
            r1.mo21875g(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            boolean r1 = r1.mo21630l()
            return r1
        L_0x0196:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r14) goto L_0x01a0
            goto L_0x0094
        L_0x01a0:
            r1.f44280o = r14
            return r9
        L_0x01a3:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            g.a.a r1 = r1.f44269d
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r1 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.gt r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt) r2
            com.google.android.libraries.assistant.auto.tng.morris.e.kr r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr.f43756c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.iy r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.kk r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14470kk.f43743a
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.kr r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr) r7
            r6.getClass()
            r7.f43759b = r6
            r6 = 22
            r7.f43758a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.kr r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr) r5
            r5.getClass()
            r6.f43801d = r5
            r6.f43800c = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r2
            r1.mo21875g(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r15) goto L_0x01f6
            goto L_0x0094
        L_0x01f6:
            r1.f44280o = r15
            return r9
        L_0x01f9:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r11) goto L_0x0203
            goto L_0x0094
        L_0x0203:
            r1.f44280o = r11
            return r9
        L_0x0206:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            boolean r1 = r1.mo21630l()
            return r1
        L_0x020f:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r5) goto L_0x0219
            goto L_0x0094
        L_0x0219:
            r1.f44280o = r5
            return r9
        L_0x021c:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r6) goto L_0x0226
            goto L_0x0094
        L_0x0226:
            r1.f44280o = r6
            return r9
        L_0x0229:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r3) goto L_0x0233
            goto L_0x0094
        L_0x0233:
            r1.f44280o = r3
            return r9
        L_0x0236:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.b r4 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14655b) r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r4.f44263a
            int r2 = r1.f44280o
            if (r2 != r7) goto L_0x0240
            goto L_0x0094
        L_0x0240:
            r1.f44280o = r7
        L_0x0242:
            return r9
        L_0x0243:
            com.google.android.libraries.assistant.auto.tng.morris.framework.c r3 = r0.f305251e
            if (r2 != r9) goto L_0x024c
            java.lang.Object r1 = r1.f43799b
            com.google.android.libraries.assistant.auto.tng.morris.e.kz r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz) r1
            goto L_0x024e
        L_0x024c:
            com.google.android.libraries.assistant.auto.tng.morris.e.kz r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz.f43772d
        L_0x024e:
            int r2 = r1.f43774a
            int r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14484ky.m30623a(r2)
            if (r2 != 0) goto L_0x0257
            r2 = 1
        L_0x0257:
            int r2 = r2 + -2
            r4 = -1
            if (r2 == r4) goto L_0x0589
            if (r2 == 0) goto L_0x0589
            if (r2 == r9) goto L_0x049e
            java.lang.String r4 = ""
            if (r2 == r7) goto L_0x044b
            switch(r2) {
                case 8: goto L_0x044b;
                case 9: goto L_0x03df;
                case 10: goto L_0x034d;
                case 11: goto L_0x02eb;
                case 12: goto L_0x044b;
                case 13: goto L_0x02b9;
                case 14: goto L_0x044b;
                case 15: goto L_0x044b;
                case 16: goto L_0x044b;
                case 17: goto L_0x044b;
                case 18: goto L_0x0290;
                case 19: goto L_0x0268;
                default: goto L_0x0267;
            }
        L_0x0267:
            return r10
        L_0x0268:
            r2 = r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r2 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r2
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r5 = r2.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r5.f44271f
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98146hG
            com.google.android.libraries.search.b.i.a r7 = r7.mo40813g()
            r5.mo21431e(r7)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r5 = r2.f44262a
            a.b.b.a.c r5 = r5.f44273h
            a.b.b.a.c r7 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN
            if (r5 != r7) goto L_0x044b
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "com.google.android.apps.gsa.INTENT_ACTION_CLOSE_DRIVING_SCREEN"
            r5.<init>(r7)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r2.f44262a
            android.content.Context r2 = r2.f44267b
            r2.sendBroadcast(r5)
            goto L_0x044b
        L_0x0290:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r1.f44268c
            boolean r1 = r1.mo21592B()
            if (r1 == 0) goto L_0x0589
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN
            if (r1 == r2) goto L_0x02a6
            goto L_0x0589
        L_0x02a6:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98150hK
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21425c(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21626h()
            return r9
        L_0x02b9:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21629k()
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.assistant.e.i.a.ja r2 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.UNKNOWN
            r1.f44276k = r2
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln.NAVIGATION_UNKNOWN
            r1.f44274i = r2
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.f44275j = r4
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r1 == r2) goto L_0x02d8
            goto L_0x0589
        L_0x02d8:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98074fo
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21431e(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21628j()
            return r9
        L_0x02eb:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln.RUNNING_IN_BACKGROUND
            r1.f44274i = r2
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r1.f44268c
            boolean r1 = r1.mo21592B()
            if (r1 == 0) goto L_0x031a
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.MICRO
            if (r1 != r2) goto L_0x0307
            goto L_0x0589
        L_0x0307:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98151hL
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21425c(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21626h()
            return r9
        L_0x031a:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.OFF
            if (r1 == r2) goto L_0x0329
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21628j()
            goto L_0x058a
        L_0x0329:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r1.f44268c
            boolean r1 = r1.mo21594D()
            if (r1 != 0) goto L_0x0335
            goto L_0x0589
        L_0x0335:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98065ff
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r2 = r2.mo40805c(r4)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r3 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r3 = r3.f44268c
            j$.time.Duration r3 = r3.mo21608v()
            r1.mo21428b(r2, r3)
            return r10
        L_0x034d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r1 != r2) goto L_0x0375
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            boolean r1 = r1.mo21631m()
            if (r1 == 0) goto L_0x0375
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.f44279n = r9
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98070fk
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21431e(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21628j()
            goto L_0x058a
        L_0x0375:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            android.content.Context r1 = r1.f44267b
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r8) goto L_0x03a2
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r2 = r1.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r2 == r4) goto L_0x038f
            goto L_0x0589
        L_0x038f:
            r1.f44279n = r8
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98069fj
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21431e(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21628j()
            return r9
        L_0x03a2:
            if (r1 != r9) goto L_0x0589
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r2 = r1.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.OFF
            if (r2 != r4) goto L_0x0589
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r1 = r1.f44274i
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln.GUIDED_NAV
            if (r1 != r2) goto L_0x0589
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            int r2 = r1.f44279n
            if (r2 == r8) goto L_0x03ca
            android.content.Context r1 = r1.f44267b
            android.view.WindowManager r1 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e.m30711b(r1)
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r1 != r8) goto L_0x03ca
            goto L_0x0589
        L_0x03ca:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.f44279n = r8
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97987eG
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21425c(r2)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21627i()
            return r9
        L_0x03df:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            a.b.b.a.c r2 = r2.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN
            if (r2 == r4) goto L_0x0589
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            a.b.b.a.c r4 = r2.f44273h
            a.b.b.a.c r6 = p001a.p007b.p011b.p012a.C0027c.OFF
            if (r4 == r6) goto L_0x03fc
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r2 = r2.f44271f
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98147hH
            com.google.android.libraries.search.b.i.a r4 = r4.mo40813g()
            r2.mo21431e(r4)
        L_0x03fc:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN
            r2.f44273h = r3
            r2.f44280o = r8
            int r1 = r1.f43776c
            com.google.assistant.e.i.a.ja r1 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.m86196a(r1)
            r1.getClass()
            r2.f44276k = r1
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc.f43036c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ba r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu.f43088d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.bs r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14235bs) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu) r3
            r3.f43090a = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu) r2
            r2.getClass()
            r3.f43039b = r2
            r2 = 17
            r3.f43038a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r1
            r2 = r18
            r2.mo21716c(r1)
            goto L_0x058a
        L_0x044b:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            r2.mo21629k()
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            com.google.assistant.e.i.a.ja r5 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.UNKNOWN
            r2.f44276k = r5
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            r2.f44275j = r4
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln.NAVIGATION_OFF
            r2.f44274i = r4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            a.b.b.a.c r2 = r2.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.OFF
            if (r2 == r4) goto L_0x046f
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21628j()
            goto L_0x058a
        L_0x046f:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r2 = r2.f44268c
            boolean r2 = r2.mo21594D()
            if (r2 == 0) goto L_0x0589
            int r1 = r1.f43774a
            int r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14484ky.m30623a(r1)
            if (r1 != 0) goto L_0x0482
            goto L_0x0486
        L_0x0482:
            if (r1 != r6) goto L_0x0486
            goto L_0x0589
        L_0x0486:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98065ff
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r2 = r2.mo40805c(r4)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r3 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r3 = r3.f44268c
            j$.time.Duration r3 = r3.mo21608v()
            r1.mo21428b(r2, r3)
            return r10
        L_0x049e:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.a r3 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14654a) r3
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r2 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r4 = r2.f44268c
            boolean r4 = r4.mo21594D()
            if (r4 != 0) goto L_0x04ab
            goto L_0x04c4
        L_0x04ab:
            android.content.BroadcastReceiver r4 = r2.f44278m
            if (r4 != 0) goto L_0x04c4
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.d r4 = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.d
            r4.<init>(r2)
            r2.f44278m = r4
            android.content.Context r4 = r2.f44267b
            android.content.BroadcastReceiver r2 = r2.f44278m
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r6 = "android.intent.action.CONFIGURATION_CHANGED"
            r5.<init>(r6)
            r4.registerReceiver(r2, r5)
        L_0x04c4:
            java.lang.String r2 = r1.f43775b
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r4 = r3.f44262a
            java.lang.String r4 = r4.f44275j
            boolean r2 = r2.equals(r4)
            r2 = r2 ^ r9
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r4 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.e.ln r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln.GUIDED_NAV
            r4.f44274i = r5
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r4 = r3.f44262a
            java.lang.String r1 = r1.f43775b
            r4.f44275j = r1
            com.google.common.b.gu r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40419b
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r4 = r3.f44262a
            java.lang.String r4 = r4.f44275j
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x04ee
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.assistant.e.i.a.ja r4 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.GOOGLE_MAP
            r1.f44276k = r4
            goto L_0x0500
        L_0x04ee:
            com.google.common.b.gu r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40420c
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r4 = r3.f44262a
            java.lang.String r4 = r4.f44275j
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x0500
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.assistant.e.i.a.ja r4 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.WAZE
            r1.f44276k = r4
        L_0x0500:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r4 = r1.f44268c
            boolean r4 = r4.mo21594D()
            if (r4 != 0) goto L_0x050b
            goto L_0x053d
        L_0x050b:
            android.content.Context r4 = r1.f44267b
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r1.f44279n = r4
            if (r4 != r8) goto L_0x0529
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98017ek
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r2 = r2.mo40805c(r3)
            r1.mo21423a(r2)
            goto L_0x0589
        L_0x0529:
            boolean r4 = r1.mo21631m()
            if (r4 == 0) goto L_0x053d
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98018el
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r2 = r2.mo40805c(r3)
            r1.mo21423a(r2)
            goto L_0x0589
        L_0x053d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r1 = r1.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r1 != r4) goto L_0x0562
            if (r2 != 0) goto L_0x0562
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r1.f44268c
            boolean r1 = r1.mo21594D()
            if (r1 != 0) goto L_0x0552
            goto L_0x0589
        L_0x0552:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.c.an r1 = r1.f44270e
            com.google.android.libraries.search.b.i.f r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97986eF
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.CANCELLED
            com.google.android.libraries.search.b.i.a r2 = r2.mo40805c(r3)
            r1.mo21423a(r2)
            return r10
        L_0x0562:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            com.google.android.libraries.assistant.auto.tng.morris.f.d r1 = r1.f44268c
            boolean r1 = r1.mo21592B()
            if (r1 == 0) goto L_0x0583
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            a.b.b.a.c r2 = r1.f44273h
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.OFF
            if (r2 == r4) goto L_0x0583
            a.b.b.a.c r4 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r2 == r4) goto L_0x0583
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r1 = r1.f44271f
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98149hJ
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()
            r1.mo21431e(r2)
        L_0x0583:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e r1 = r3.f44262a
            r1.mo21627i()
            goto L_0x058a
        L_0x0589:
            r9 = 0
        L_0x058a:
            return r9
        L_0x058b:
            r1 = 0
            goto L_0x058e
        L_0x058d:
            throw r1
        L_0x058e:
            goto L_0x058d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.C109613b.mo97911f(com.google.android.libraries.assistant.auto.tng.morris.e.lf, com.google.android.libraries.assistant.auto.tng.morris.framework.d):boolean");
    }
}
