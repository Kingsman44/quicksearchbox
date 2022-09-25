package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.C1885k;
import com.google.android.libraries.phenotype.client.p2421b.C31660a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.phenotype.client.aj */
/* compiled from: PG */
public abstract class C31654aj {

    /* renamed from: a */
    private static final Object f85146a = new Object();

    /* renamed from: b */
    public static final AtomicInteger f85147b = new AtomicInteger();

    /* renamed from: e */
    private static volatile C31653ai f85148e = null;

    /* renamed from: f */
    private static volatile boolean f85149f = false;

    /* renamed from: g */
    private static final C31660a f85150g = new C31660a(C31767z.f85377a);

    /* renamed from: c */
    final C31652ah f85151c;

    /* renamed from: d */
    final String f85152d;

    /* renamed from: h */
    private final Object f85153h;

    /* renamed from: i */
    private volatile int f85154i = -1;

    /* renamed from: j */
    private volatile Object f85155j;

    /* renamed from: k */
    private final boolean f85156k;

    static {
        new AtomicReference();
    }

    public C31654aj(C31652ah ahVar, String str, Object obj, boolean z) {
        String str2 = ahVar.f85137a;
        if (str2 == null && ahVar.f85138b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || ahVar.f85138b == null) {
            this.f85151c = ahVar;
            this.f85152d = str;
            this.f85153h = obj;
            this.f85156k = z;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static void m58985d(android.content.Context r3) {
        /*
            com.google.android.libraries.phenotype.client.ai r0 = f85148e
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f85146a
            monitor-enter(r0)
            com.google.android.libraries.phenotype.client.ai r1 = f85148e     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.libraries.phenotype.client.ai r1 = f85148e     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            com.google.android.libraries.phenotype.client.a r1 = (com.google.android.libraries.phenotype.client.C31632a) r1     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r1.f85105a     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.libraries.phenotype.client.C31665d.m59006d()     // Catch:{ all -> 0x003d }
            com.google.android.libraries.phenotype.client.C31658an.m58997a()     // Catch:{ all -> 0x003d }
            com.google.android.libraries.phenotype.client.C31673l.m59015c()     // Catch:{ all -> 0x003d }
            com.google.android.libraries.phenotype.client.y r1 = new com.google.android.libraries.phenotype.client.y     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.common.base.cr r1 = com.google.common.base.C58886cw.m90973a(r1)     // Catch:{ all -> 0x003d }
            com.google.android.libraries.phenotype.client.a r2 = new com.google.android.libraries.phenotype.client.a     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f85148e = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f85147b     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.C31654aj.m58985d(android.content.Context):void");
    }

    /* renamed from: e */
    private final Object m58986e(C31653ai aiVar) {
        C31673l lVar;
        C31652ah ahVar = this.f85151c;
        if (!ahVar.f85141e) {
            C58817ah ahVar2 = ahVar.f85145i;
            Context context = ((C31632a) aiVar).f85105a;
            synchronized (C31673l.class) {
                if (C31673l.f85182a == null) {
                    C31673l.f85182a = C1885k.m5142a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C31673l(context) : new C31673l();
                }
                lVar = C31673l.f85182a;
            }
            C31652ah ahVar3 = this.f85151c;
            String a = lVar.mo37306b(ahVar3.f85141e ? null : m58988g(ahVar3.f85139c));
            if (a != null) {
                return mo37295a(a);
            }
        }
        return null;
    }

    /* renamed from: f */
    private final Object m58987f(C31653ai aiVar) {
        C31670i iVar;
        Object b;
        boolean z;
        C31652ah ahVar = this.f85151c;
        Uri uri = ahVar.f85138b;
        if (uri != null) {
            C31632a aVar = (C31632a) aiVar;
            Context context = aVar.f85105a;
            String authority = uri.getAuthority();
            if (!"com.google.android.gms.phenotype".equals(authority)) {
                Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            } else {
                if (C31675n.f85186a.mo56113h()) {
                    z = ((Boolean) C31675n.f85186a.mo56107c()).booleanValue();
                } else {
                    synchronized (C31675n.f85187b) {
                        if (C31675n.f85186a.mo56113h()) {
                            z = ((Boolean) C31675n.f85186a.mo56107c()).booleanValue();
                        } else {
                            boolean z2 = false;
                            if (!"com.google.android.gms".equals(context.getPackageName())) {
                                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456);
                                if (resolveContentProvider != null) {
                                    if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                                    }
                                }
                                C31675n.f85186a = C58833ax.m90834k(Boolean.valueOf(z2));
                                z = ((Boolean) C31675n.f85186a.mo56107c()).booleanValue();
                            }
                            try {
                                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                    z2 = true;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            C31675n.f85186a = C58833ax.m90834k(Boolean.valueOf(z2));
                            z = ((Boolean) C31675n.f85186a.mo56107c()).booleanValue();
                        }
                    }
                }
                if (z) {
                    if (this.f85151c.f85144h) {
                        iVar = C31665d.m59005a(aVar.f85105a.getContentResolver(), C31676o.m59019a(C31676o.m59022d(aVar.f85105a, this.f85151c.f85138b.getLastPathSegment())), C31765x.f85375a);
                    } else {
                        iVar = C31665d.m59005a(aVar.f85105a.getContentResolver(), this.f85151c.f85138b, C31765x.f85375a);
                    }
                }
            }
            iVar = null;
        } else {
            iVar = C31658an.m58999e(((C31632a) aiVar).f85105a, ahVar.f85137a);
        }
        if (iVar == null || (b = iVar.mo37306b(mo37304c())) == null) {
            return null;
        }
        return mo37295a(b);
    }

    /* renamed from: g */
    private final String m58988g(String str) {
        return str.isEmpty() ? this.f85152d : str.concat(String.valueOf(this.f85152d));
    }

    /* renamed from: a */
    public abstract Object mo37295a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo37303b() {
        /*
            r6 = this;
            boolean r0 = r6.f85156k
            r1 = 1
            if (r0 != 0) goto L_0x0025
            com.google.android.libraries.phenotype.client.b.a r0 = f85150g
            java.lang.String r2 = r6.f85152d
            java.lang.String r3 = "flagName must not be null"
            com.google.common.base.C58838bb.m90866a(r2, r3)
            boolean r0 = r0.f85166a
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0020
        L_0x0014:
            com.google.common.base.cr r0 = com.google.android.libraries.phenotype.client.p2421b.p2423b.C31663b.f85168a
            java.lang.Object r0 = r0.mo6453a()
            com.google.common.b.hu r0 = (com.google.common.p4522b.C58512hu) r0
            boolean r0 = r0.mo54953F(r2)
        L_0x0020:
            java.lang.String r2 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.common.base.C58838bb.m90884s(r0, r2)
        L_0x0025:
            java.util.concurrent.atomic.AtomicInteger r0 = f85147b
            int r0 = r0.get()
            int r2 = r6.f85154i
            if (r2 >= r0) goto L_0x0097
            monitor-enter(r6)
            int r2 = r6.f85154i     // Catch:{ all -> 0x0094 }
            if (r2 >= r0) goto L_0x0092
            com.google.android.libraries.phenotype.client.ai r2 = f85148e     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            java.lang.String r3 = "Must call PhenotypeFlag.init() first"
            com.google.common.base.C58838bb.m90884s(r1, r3)     // Catch:{ all -> 0x0094 }
            com.google.android.libraries.phenotype.client.ah r1 = r6.f85151c     // Catch:{ all -> 0x0094 }
            boolean r1 = r1.f85142f     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r6.m58986e(r2)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x004c
            goto L_0x0061
        L_0x004c:
            java.lang.Object r1 = r6.m58987f(r2)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0061
            goto L_0x005f
        L_0x0053:
            java.lang.Object r1 = r6.m58987f(r2)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0061
            java.lang.Object r1 = r6.m58986e(r2)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0061
        L_0x005f:
            java.lang.Object r1 = r6.f85153h     // Catch:{ all -> 0x0094 }
        L_0x0061:
            com.google.android.libraries.phenotype.client.a r2 = (com.google.android.libraries.phenotype.client.C31632a) r2     // Catch:{ all -> 0x0094 }
            com.google.common.base.cr r2 = r2.f85106b     // Catch:{ all -> 0x0094 }
            java.lang.Object r2 = r2.mo6453a()     // Catch:{ all -> 0x0094 }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ all -> 0x0094 }
            boolean r3 = r2.mo56113h()     // Catch:{ all -> 0x0094 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r1 = r2.mo56107c()     // Catch:{ all -> 0x0094 }
            com.google.android.libraries.phenotype.client.f r1 = (com.google.android.libraries.phenotype.client.C31667f) r1     // Catch:{ all -> 0x0094 }
            com.google.android.libraries.phenotype.client.ah r2 = r6.f85151c     // Catch:{ all -> 0x0094 }
            android.net.Uri r3 = r2.f85138b     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = r2.f85137a     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r2.f85140d     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r6.f85152d     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r1.mo37313a(r3, r4, r2, r5)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x008a
            java.lang.Object r1 = r6.f85153h     // Catch:{ all -> 0x0094 }
            goto L_0x008e
        L_0x008a:
            java.lang.Object r1 = r6.mo37295a(r1)     // Catch:{ all -> 0x0094 }
        L_0x008e:
            r6.f85155j = r1     // Catch:{ all -> 0x0094 }
            r6.f85154i = r0     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0094:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            throw r0
        L_0x0097:
            java.lang.Object r0 = r6.f85155j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.C31654aj.mo37303b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo37304c() {
        return m58988g(this.f85151c.f85140d);
    }
}
