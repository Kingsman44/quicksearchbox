package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Intent;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136433ae;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136439ak;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136442an;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136533k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136521x;
import java.io.PrintWriter;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bo */
/* compiled from: PG */
final class C83481bo implements C83480bn {

    /* renamed from: a */
    private final C136442an f227621a;

    public C83481bo(C136442an anVar) {
        this.f227621a = anVar;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo76770f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder mo76818n(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            com.google.android.apps.search.googleapp.launcher.b.an r2 = r1.f227621a
            android.net.Uri r3 = r22.getData()
            r4 = -1
            if (r3 != 0) goto L_0x001e
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "No data found in intent"
            r6 = 40772(0x9f44, float:5.7134E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
        L_0x001b:
            r10 = -1
            goto L_0x009d
        L_0x001e:
            int r5 = r3.getPort()
            if (r5 != r4) goto L_0x0033
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "No UID found in intent"
            r6 = 40771(0x9f43, float:5.7132E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            goto L_0x001b
        L_0x0033:
            android.app.Service r6 = r2.f371473c
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String[] r6 = r6.getPackagesForUid(r5)
            java.lang.String r3 = r3.getHost()
            if (r6 == 0) goto L_0x008d
            if (r3 == 0) goto L_0x008d
            java.util.List r6 = java.util.Arrays.asList(r6)
            boolean r6 = r6.contains(r3)
            if (r6 != 0) goto L_0x0050
            goto L_0x008d
        L_0x0050:
            android.app.Service r6 = r2.f371473c     // Catch:{ NameNotFoundException -> 0x007e }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007e }
            r7 = 0
            android.content.pm.ApplicationInfo r3 = r6.getApplicationInfo(r3, r7)     // Catch:{ NameNotFoundException -> 0x007e }
            int r3 = r3.flags     // Catch:{ NameNotFoundException -> 0x007e }
            r6 = r3 & 1
            if (r6 != 0) goto L_0x007c
            r3 = r3 & 2
            if (r3 != 0) goto L_0x007c
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a     // Catch:{ NameNotFoundException -> 0x007e }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ NameNotFoundException -> 0x007e }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ NameNotFoundException -> 0x007e }
            r5 = 40769(0x9f41, float:5.713E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ NameNotFoundException -> 0x007e }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ NameNotFoundException -> 0x007e }
            java.lang.String r5 = "Only system and debuggable apps are allowed to connect"
            r3.mo56386p(r5)     // Catch:{ NameNotFoundException -> 0x007e }
            goto L_0x001b
        L_0x007c:
            r10 = r5
            goto L_0x009d
        L_0x007e:
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "Invalid caller package"
            r6 = 40770(0x9f42, float:5.7131E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            goto L_0x001b
        L_0x008d:
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "Invalid uid or package"
            r6 = 40768(0x9f40, float:5.7128E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            goto L_0x001b
        L_0x009d:
            r3 = 0
            if (r10 != r4) goto L_0x00b0
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.f371471a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Unable to bind to service"
            r4 = 40775(0x9f47, float:5.7138E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)
            goto L_0x0166
        L_0x00b0:
            java.lang.String r4 = "v"
            java.lang.String r5 = "Server version not available"
            int r8 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.m221736a(r0, r4, r5)
            java.lang.String r4 = "cv"
            java.lang.String r5 = "Client version not available"
            int r9 = com.google.android.apps.search.googleapp.launcher.p10341b.C136442an.m221736a(r0, r4, r5)
            monitor-enter(r2)
            com.google.android.apps.search.googleapp.launcher.b.ae r0 = r2.f371472b     // Catch:{ all -> 0x0167 }
            if (r0 == 0) goto L_0x00d2
            com.google.android.apps.search.googleapp.launcher.b.ae r0 = r2.f371472b     // Catch:{ all -> 0x0167 }
            int r0 = r0.f371417d     // Catch:{ all -> 0x0167 }
            if (r0 == r8) goto L_0x00d2
            com.google.android.apps.search.googleapp.launcher.b.ae r0 = r2.f371472b     // Catch:{ all -> 0x0167 }
            r0.close()     // Catch:{ all -> 0x0167 }
            r2.f371472b = r3     // Catch:{ all -> 0x0167 }
        L_0x00d2:
            com.google.android.apps.search.googleapp.launcher.b.ae r0 = r2.f371472b     // Catch:{ all -> 0x0167 }
            if (r0 != 0) goto L_0x0161
            com.google.android.apps.search.googleapp.launcher.b.am r0 = r2.f371474d     // Catch:{ all -> 0x0167 }
            com.google.android.apps.search.googleapp.launcher.b.ae r3 = new com.google.android.apps.search.googleapp.launcher.b.ae     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371461a     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r11 = r4
            android.content.Context r11 = (android.content.Context) r11     // Catch:{ all -> 0x0167 }
            r11.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371462b     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r12 = r4
            com.google.apps.tiktok.tracing.m r12 = (com.google.apps.tiktok.tracing.C47853m) r12     // Catch:{ all -> 0x0167 }
            r12.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371463c     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r13 = r4
            java.util.concurrent.Executor r13 = (java.util.concurrent.Executor) r13     // Catch:{ all -> 0x0167 }
            r13.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371464d     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r14 = r4
            java.util.concurrent.ScheduledExecutorService r14 = (java.util.concurrent.ScheduledExecutorService) r14     // Catch:{ all -> 0x0167 }
            r14.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371465e     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r15 = r4
            com.google.android.apps.search.googleapp.launcher.b.ak r15 = (com.google.android.apps.search.googleapp.launcher.p10341b.C136439ak) r15     // Catch:{ all -> 0x0167 }
            r15.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371466f     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r16 = r4
            com.google.android.apps.search.googleapp.launcher.b.a.b r16 = (com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136425b) r16     // Catch:{ all -> 0x0167 }
            r16.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371467g     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r17 = r4
            com.google.android.apps.search.googleapp.launcher.b.b.b r17 = (com.google.android.apps.search.googleapp.launcher.p10341b.p10343b.C136445b) r17     // Catch:{ all -> 0x0167 }
            r17.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371468h     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0167 }
            r4.getClass()     // Catch:{ all -> 0x0167 }
            boolean r18 = r4.booleanValue()     // Catch:{ all -> 0x0167 }
            g.a.a r4 = r0.f371469i     // Catch:{ all -> 0x0167 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0167 }
            r19 = r4
            com.google.android.libraries.f.a r19 = (com.google.android.libraries.p1730f.C21370a) r19     // Catch:{ all -> 0x0167 }
            r19.getClass()     // Catch:{ all -> 0x0167 }
            g.a.a r0 = r0.f371470j     // Catch:{ all -> 0x0167 }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x0167 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0167 }
            r0.getClass()     // Catch:{ all -> 0x0167 }
            boolean r20 = r0.booleanValue()     // Catch:{ all -> 0x0167 }
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0167 }
            r2.f371472b = r3     // Catch:{ all -> 0x0167 }
        L_0x0161:
            com.google.android.apps.search.googleapp.launcher.b.ae r0 = r2.f371472b     // Catch:{ all -> 0x0167 }
            com.google.android.apps.search.googleapp.launcher.b.ae r3 = r2.f371472b     // Catch:{ all -> 0x0167 }
            monitor-exit(r2)     // Catch:{ all -> 0x0167 }
        L_0x0166:
            return r3
        L_0x0167:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x016a:
            throw r0
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.C83481bo.mo76818n(android.content.Intent):android.os.IBinder");
    }

    /* renamed from: o */
    public final void mo76819o() {
        C136442an anVar = this.f227621a;
        synchronized (anVar) {
            if (anVar.f371472b != null) {
                anVar.f371472b.close();
            }
        }
    }

    /* renamed from: p */
    public final void mo76820p(Intent intent) {
        C136442an anVar = this.f227621a;
        if (intent.getData().getPort() != -1) {
            synchronized (anVar) {
                if (anVar.f371472b != null) {
                    anVar.f371472b.close();
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo76821q(PrintWriter printWriter) {
        C136442an anVar = this.f227621a;
        printWriter.println("Variant: TNG:Acetone");
        printWriter.println("Binder: ".concat(String.valueOf(String.valueOf(anVar.f371472b))));
        if (anVar.f371472b != null) {
            C136433ae aeVar = anVar.f371472b;
            int i = aeVar.f371417d;
            printWriter.println("  Server version: " + i);
            boolean d = aeVar.f371420g.mo113043d();
            printWriter.println("  IsGoogleActive: " + d);
            printWriter.println("  BinderCompat: ".concat(String.valueOf(String.valueOf(aeVar.f371418e))));
            C136439ak akVar = aeVar.f371418e;
            printWriter.println("    Fragment host: ".concat(String.valueOf(String.valueOf(akVar.f371452g))));
            printWriter.println("    Acetone options: ".concat(String.valueOf(String.valueOf(akVar.f371454i))));
            C136531i iVar = akVar.f371452g;
            if (iVar != null) {
                C136508k j = iVar.mo113158j();
                String valueOf = String.valueOf(j);
                printWriter.println("      Sliding fragment: " + valueOf);
                if (j != null) {
                    boolean z = j.mo113103a() != null;
                    printWriter.println("        isAcetoneFragmentAdded: " + z);
                    boolean z2 = j.f371632i;
                    printWriter.println("        isOverlayShown: " + z2);
                    boolean z3 = j.f371633j;
                    printWriter.println("        acceptScrollEvents: " + z3);
                    j.f371628e.mo113058b("        ", printWriter);
                    C136512o c = j.mo113104c();
                    if (c != null) {
                        String obj = c.toString();
                        printWriter.println("        Sliding panel layout: " + obj);
                        C136521x a = c.mo17754z();
                        float f = a.f371671h;
                        printWriter.println("          mPanelPositionRatio: " + f);
                        float f2 = a.f371674k;
                        printWriter.println("          mDownX: " + f2);
                        float f3 = a.f371675l;
                        printWriter.println("          mDownY: " + f3);
                        int i2 = a.f371680q;
                        printWriter.println("          mActivePointerId: " + i2);
                        int i3 = a.f371681r;
                        printWriter.println("          touchState: " + i3);
                        boolean z4 = a.f371687x;
                        printWriter.println("          isPanelOpen: " + z4);
                        boolean z5 = a.f371688y;
                        printWriter.println("          isPageMoving: " + z5);
                        boolean z6 = a.f371662G;
                        printWriter.println("          settling: " + z6);
                        boolean z7 = a.f371689z;
                        printWriter.println("          mForceDrag: " + z7);
                        boolean isEmpty = a.f371683t.f371649b.isEmpty();
                        printWriter.println("          scroller.isFinished: " + isEmpty);
                        a.f371685v.mo113058b("          ", printWriter);
                        a.f371686w.mo113058b("          ", printWriter);
                    }
                }
                iVar.f371716m.mo113058b("      ", printWriter);
                C136533k i4 = iVar.mo22017i();
                String valueOf2 = String.valueOf(i4);
                printWriter.println("      Acetone fragment: " + valueOf2);
                if (i4 != null) {
                    boolean k = i4.mo113172k();
                    printWriter.println("        Feed shown: " + k);
                    C136470f b = i4.mo113163b();
                    String valueOf3 = String.valueOf(b);
                    printWriter.println("        GoogleAppMinusOneFragment: " + valueOf3);
                    if (b != null) {
                        b.mo113067e(printWriter, "         ");
                    }
                }
            }
            akVar.f371455j.mo113058b("    ", printWriter);
        }
    }
}
