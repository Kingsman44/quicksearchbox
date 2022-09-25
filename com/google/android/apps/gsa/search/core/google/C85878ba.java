package com.google.android.apps.gsa.search.core.google;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.p10905k.C146604c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.google.ba */
/* compiled from: PG */
public final class C85878ba implements C85881bd {

    /* renamed from: f */
    private static final C59071e f232196f = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.ba");

    /* renamed from: a */
    final Context f232197a;

    /* renamed from: b */
    public final C90929bz f232198b;

    /* renamed from: c */
    final LocationManager f232199c;

    /* renamed from: d */
    volatile C85868az f232200d;

    /* renamed from: e */
    public final C90908be f232201e;

    /* renamed from: g */
    private final C91077d f232202g;

    /* renamed from: h */
    private final Object f232203h = new Object();

    /* renamed from: i */
    private Boolean f232204i;

    /* renamed from: j */
    private final Set f232205j = new HashSet();

    /* renamed from: k */
    private final BroadcastReceiver f232206k;

    /* renamed from: l */
    private final ContentObserver f232207l;

    public C85878ba(Context context, C90929bz bzVar, C91077d dVar) {
        C85864av avVar = new C85864av(this);
        this.f232201e = avVar;
        C85865aw awVar = new C85865aw(this);
        this.f232206k = awVar;
        C85866ax axVar = new C85866ax(this, new Handler(Looper.getMainLooper()));
        this.f232207l = axVar;
        this.f232197a = context;
        this.f232198b = bzVar;
        this.f232202g = dVar;
        this.f232199c = (LocationManager) context.getSystemService("location");
        context.registerReceiver(awVar, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        context.getContentResolver().registerContentObserver(Uri.withAppendedPath(C146604c.f395965a, "use_location_for_services"), false, axVar);
        bzVar.mo85139d(avVar);
    }

    /* renamed from: i */
    private final void m137982i(boolean z) {
        if (z) {
            synchronized (this.f232203h) {
                C85868az azVar = this.f232200d;
                if (azVar == null || azVar.f232173a != mo79515f()) {
                    mo79512c();
                }
            }
            return;
        }
        C85868az azVar2 = this.f232200d;
        if (azVar2 != null && azVar2.f232173a != mo79515f()) {
            this.f232198b.mo85139d(this.f232201e);
        }
    }

    /* renamed from: j */
    private static int m137983j(C85868az azVar) {
        if (azVar == null) {
            return 3;
        }
        if (!azVar.f232173a) {
            return 2;
        }
        if (!azVar.f232174b) {
            return 4;
        }
        return azVar.f232176d != 1 ? 5 : 1;
    }

    /* renamed from: a */
    public final void mo79510a(C85880bc bcVar) {
        synchronized (this.f232205j) {
            this.f232205j.add(bcVar);
        }
    }

    /* renamed from: b */
    public final void mo79511b(C85880bc bcVar) {
        synchronized (this.f232205j) {
            this.f232205j.remove(bcVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r1 == 0) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093 A[Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b A[Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0 A[Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79512c() {
        /*
            r8 = this;
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            java.lang.Object r0 = r8.f232203h     // Catch:{ all -> 0x00be }
            monitor-enter(r0)     // Catch:{ all -> 0x00be }
            android.location.LocationManager r1 = r8.f232199c     // Catch:{ all -> 0x00bb }
            r2 = 1
            java.util.List r1 = r1.getProviders(r2)     // Catch:{ all -> 0x00bb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00bb }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0013:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "passive"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00bb }
            if (r7 != 0) goto L_0x0013
            java.lang.String r4 = "network"
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0032
            r4 = 1
            r5 = 1
            goto L_0x0013
        L_0x0032:
            java.lang.String r4 = "gps"
            r4.equals(r6)     // Catch:{ all -> 0x00bb }
            r4 = 1
            goto L_0x0013
        L_0x0039:
            android.content.Context r1 = r8.f232197a     // Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }
            java.lang.String r6 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r6)     // Catch:{ SettingNotFoundException -> 0x005a, SecurityException -> 0x004a }
            if (r4 != 0) goto L_0x0058
            if (r1 == 0) goto L_0x0056
            goto L_0x0058
        L_0x004a:
            if (r4 != 0) goto L_0x0058
            android.location.LocationManager r1 = r8.f232199c     // Catch:{ all -> 0x00bb }
            boolean r1 = r1.isLocationEnabled()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r4 = 0
            goto L_0x0076
        L_0x0058:
            r4 = 1
            goto L_0x0076
        L_0x005a:
            r1 = move-exception
            com.google.common.f.e r6 = f232196f     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00bb }
            com.google.common.f.x r1 = r6.mo56382g(r1)     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00bb }
            r6 = 7867(0x1ebb, float:1.1024E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r6)     // Catch:{ all -> 0x00bb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "Failed to resolve location mode"
            r1.mo56386p(r6)     // Catch:{ all -> 0x00bb }
        L_0x0076:
            android.content.Context r1 = r8.f232197a     // Catch:{ all -> 0x00bb }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00bb }
            int r1 = com.google.android.p10905k.C146604c.m238838b(r1)     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.search.core.google.az r6 = new com.google.android.apps.gsa.search.core.google.az     // Catch:{ all -> 0x00bb }
            boolean r7 = r8.mo79515f()     // Catch:{ all -> 0x00bb }
            r6.<init>(r7, r4, r5, r1)     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.search.core.google.az r1 = r8.f232200d     // Catch:{ all -> 0x00bb }
            int r1 = m137983j(r1)     // Catch:{ all -> 0x00bb }
            if (r1 == r2) goto L_0x0093
            r1 = 0
            goto L_0x0094
        L_0x0093:
            r1 = 1
        L_0x0094:
            int r4 = m137983j(r6)     // Catch:{ all -> 0x00bb }
            if (r4 != r2) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            r8.f232200d = r6     // Catch:{ all -> 0x00bb }
            if (r1 == r2) goto L_0x00b9
            java.util.Set r1 = r8.f232205j     // Catch:{ all -> 0x00bb }
            monitor-enter(r1)     // Catch:{ all -> 0x00bb }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x00b6 }
            java.util.Set r4 = r8.f232205j     // Catch:{ all -> 0x00b6 }
            r3.<init>(r4)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            com.google.android.apps.gsa.shared.util.c.bz r1 = r8.f232198b     // Catch:{ all -> 0x00bb }
            com.google.android.apps.gsa.search.core.google.ay r4 = new com.google.android.apps.gsa.search.core.google.ay     // Catch:{ all -> 0x00bb }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x00bb }
            r1.mo85151p(r4)     // Catch:{ all -> 0x00bb }
            goto L_0x00b9
        L_0x00b6:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            throw r2     // Catch:{ all -> 0x00bb }
        L_0x00b9:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x00bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            goto L_0x00c1
        L_0x00c0:
            throw r0
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.C85878ba.mo79512c():void");
    }

    /* renamed from: d */
    public final boolean mo79513d(boolean z) {
        boolean z2 = false;
        if (!mo79515f()) {
            return false;
        }
        if (this.f232204i == null) {
            if (this.f232197a.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
                z2 = true;
            }
            this.f232204i = Boolean.valueOf(z2);
        }
        if (!this.f232204i.booleanValue()) {
            return true;
        }
        return mo79514e(z);
    }

    /* renamed from: e */
    public final boolean mo79514e(boolean z) {
        return mo79517h(z) == 1;
    }

    /* renamed from: f */
    public final boolean mo79515f() {
        return this.f232202g.f254356c.mo85346a("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: g */
    public final boolean mo79516g() {
        C85868az azVar;
        m137982i(true);
        if (mo79515f() && (azVar = this.f232200d) != null && azVar.f232173a && azVar.f232175c && azVar.f232174b && azVar.f232176d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo79517h(boolean z) {
        m137982i(z);
        if (!mo79515f()) {
            return 2;
        }
        return m137983j(this.f232200d);
    }
}
