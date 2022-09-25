package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.libraries.gsa.p1859d.p1861b.p1862a.C22750a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.gsa.d.b.v */
/* compiled from: PG */
public abstract class C22776v {

    /* renamed from: a */
    public static final C59071e f62706a = C59071e.m91332i("com.google.android.libraries.gsa.d.b.v");

    /* renamed from: b */
    public final Handler f62707b;

    /* renamed from: c */
    public final C22750a f62708c;

    /* renamed from: d */
    private final SparseArray f62709d = new SparseArray();

    /* renamed from: e */
    private final Context f62710e;

    protected C22776v(Context context, C22750a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f62707b = new Handler();
        this.f62710e = context;
        this.f62708c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo28094a() {
        throw null;
    }

    /* renamed from: b */
    public Configuration mo28095b(Configuration configuration, Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C22756b mo28096c() {
        throw null;
    }

    /* renamed from: d */
    public abstract C22768n mo28097d(Configuration configuration, int i, int i2, boolean z, Bundle bundle, String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C22755ae mo28098e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo28099g() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo28100h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo28101i(Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo28102j(Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo28103k() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28104l(Configuration configuration) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo28105m() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r8 = f62706a.mo56225c();
        r8.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "OverlaySController");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(48601)).mo56386p("Invalid caller package");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c6 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.os.IBinder mo28106n(android.content.Intent r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f6 }
            android.net.Uri r8 = r8.getData()     // Catch:{ all -> 0x00f6 }
            int r6 = r8.getPort()     // Catch:{ all -> 0x00f6 }
            r0 = -1
            r1 = 0
            if (r6 == r0) goto L_0x00f4
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r2 = "v"
            java.lang.String r2 = r8.getQueryParameter(r2)     // Catch:{ Exception -> 0x001e }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x001e }
            r4 = r2
            goto L_0x0037
        L_0x001e:
            r2 = move-exception
            com.google.common.f.e r3 = f62706a     // Catch:{ all -> 0x00f6 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x00f6 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f6 }
            java.lang.String r5 = "OverlaySController"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = "Failed parsing server version"
            r5 = 48603(0xbddb, float:6.8107E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x00f6 }
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0037:
            java.lang.String r2 = "cv"
            java.lang.String r2 = r8.getQueryParameter(r2)     // Catch:{ Exception -> 0x0043 }
            int r0 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0043 }
            r5 = r0
            goto L_0x0046
        L_0x0043:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0046:
            android.content.Context r0 = r7.f62710e     // Catch:{ all -> 0x00f6 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00f6 }
            java.lang.String[] r0 = r0.getPackagesForUid(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = r8.getHost()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00dd
            java.util.List r8 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x00f6 }
            boolean r8 = r8.contains(r3)     // Catch:{ all -> 0x00f6 }
            if (r8 != 0) goto L_0x0062
            goto L_0x00dd
        L_0x0062:
            android.content.Context r8 = r7.f62710e     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c6 }
            r0 = 0
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            int r8 = r8.flags     // Catch:{ NameNotFoundException -> 0x00c6 }
            r0 = r8 & 1
            if (r0 != 0) goto L_0x00a0
            r8 = r8 & 2
            if (r8 != 0) goto L_0x00a0
            java.lang.String r8 = "robolectric"
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ NameNotFoundException -> 0x00c6 }
            boolean r8 = r8.equals(r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            if (r8 != 0) goto L_0x00a0
            com.google.common.f.e r8 = f62706a     // Catch:{ NameNotFoundException -> 0x00c6 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ NameNotFoundException -> 0x00c6 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.String r2 = "OverlaySController"
            r8.mo56378ag(r0, r2)     // Catch:{ NameNotFoundException -> 0x00c6 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ NameNotFoundException -> 0x00c6 }
            r0 = 48600(0xbdd8, float:6.8103E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.String r0 = "Only system apps are allowed to connect"
            r8.mo56386p(r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            monitor-exit(r7)
            return r1
        L_0x00a0:
            android.util.SparseArray r8 = r7.f62709d     // Catch:{ all -> 0x00f6 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ all -> 0x00f6 }
            com.google.android.libraries.gsa.d.b.t r8 = (com.google.android.libraries.gsa.p1859d.p1861b.C22774t) r8     // Catch:{ all -> 0x00f6 }
            if (r8 == 0) goto L_0x00b2
            int r0 = r8.f62696b     // Catch:{ all -> 0x00f6 }
            if (r0 == r4) goto L_0x00b2
            r8.mo28079a()     // Catch:{ all -> 0x00f6 }
            goto L_0x00b3
        L_0x00b2:
            r1 = r8
        L_0x00b3:
            if (r1 != 0) goto L_0x00c4
            com.google.android.libraries.gsa.d.b.t r8 = new com.google.android.libraries.gsa.d.b.t     // Catch:{ all -> 0x00f6 }
            r0 = r8
            r1 = r7
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f6 }
            android.util.SparseArray r0 = r7.f62709d     // Catch:{ all -> 0x00f6 }
            r0.put(r6, r8)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r7)
            return r8
        L_0x00c4:
            monitor-exit(r7)
            return r1
        L_0x00c6:
            com.google.common.f.e r8 = f62706a     // Catch:{ all -> 0x00f6 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x00f6 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "OverlaySController"
            r8.mo56378ag(r0, r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "Invalid caller package"
            r2 = 48601(0xbdd9, float:6.8105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r7)
            return r1
        L_0x00dd:
            com.google.common.f.e r8 = f62706a     // Catch:{ all -> 0x00f6 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x00f6 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "OverlaySController"
            r8.mo56378ag(r0, r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "Invalid uid or package"
            r2 = 48599(0xbdd7, float:6.8102E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r7)
            return r1
        L_0x00f4:
            monitor-exit(r7)
            return r1
        L_0x00f6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1859d.p1861b.C22776v.mo28106n(android.content.Intent):android.os.IBinder");
    }

    /* renamed from: o */
    public final synchronized void mo28107o() {
        C58976aa aaVar = C58975e.f156826a;
        int size = this.f62709d.size();
        while (true) {
            size--;
            if (size >= 0) {
                C22774t tVar = (C22774t) this.f62709d.valueAt(size);
                if (tVar != null) {
                    tVar.mo28079a();
                }
            } else {
                this.f62709d.clear();
            }
        }
    }

    /* renamed from: p */
    public final synchronized void mo28108p(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        int port = intent.getData().getPort();
        if (port != -1) {
            C22774t tVar = (C22774t) this.f62709d.get(port);
            if (tVar != null) {
                tVar.mo28079a();
            }
            this.f62709d.remove(port);
        }
    }

    /* renamed from: q */
    public final synchronized void mo28109q(PrintWriter printWriter) {
        printWriter.println("OverlayServiceController, num clients : " + this.f62709d.size());
        int size = this.f62709d.size();
        while (true) {
            size--;
            if (size >= 0) {
                C22774t tVar = (C22774t) this.f62709d.valueAt(size);
                if (tVar != null) {
                    printWriter.println("  dump of client " + size);
                    printWriter.println("    mCallerUid: " + tVar.f62695a);
                    printWriter.println("    mServerVersion: " + tVar.f62696b);
                    printWriter.println("    mClientVersion: " + tVar.f62697c);
                    printWriter.println("    mPackageName: ".concat(String.valueOf(tVar.f62698d)));
                    printWriter.println("    mOptions: " + tVar.f62700f);
                    printWriter.println("    mLastAttachWasLandscape: " + tVar.f62701g);
                    C22771q qVar = tVar.f62699e;
                    if (qVar != null) {
                        qVar.mo28069a(printWriter);
                    }
                } else {
                    printWriter.println("  null client: " + size);
                }
            }
        }
    }
}
