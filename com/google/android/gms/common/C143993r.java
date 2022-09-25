package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C143907aw;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.r */
/* compiled from: PG */
final class C143993r {

    /* renamed from: a */
    static final C143991p f390230a = new C143958l(C143989n.m234166d("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b */
    static final C143991p f390231b = new C143959m(C143989n.m234166d("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c */
    public static final /* synthetic */ int f390232c = 0;

    /* renamed from: d */
    private static final Object f390233d = new Object();

    /* renamed from: e */
    private static Context f390234e;

    /* renamed from: f */
    private static volatile C143907aw f390235f;

    static {
        new C143956j(C143989n.m234166d("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new C143957k(C143989n.m234166d("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    /* renamed from: a */
    static C144020w m234173a(String str, C143989n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m234174b(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C144020w m234174b(String str, C143989n nVar, boolean z, boolean z2) {
        try {
            m234178f();
            C143919bh.m233958a(f390234e);
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, nVar, z, z2);
            try {
                C143907aw awVar = f390235f;
                C144166k kVar = new C144166k(f390234e.getPackageManager());
                Parcel gA = awVar.mo17260gA();
                C8850c.m23497f(gA, googleCertificatesQuery);
                C8850c.m23499h(gA, kVar);
                Parcel gT = awVar.mo17261gT(5, gA);
                boolean i = C8850c.m23500i(gT);
                gT.recycle();
                return i ? C144020w.f390257a : new C144019v(new C143877i(z, str, nVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C144020w.m234201c("module call", e);
            }
        } catch (C144149k e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return C144020w.m234201c("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* renamed from: c */
    static synchronized void m234175c(Context context) {
        synchronized (C143993r.class) {
            if (f390234e != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f390234e = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    static boolean m234176d() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m234178f();
            C143907aw awVar = f390235f;
            Parcel gT = awVar.mo17261gT(7, awVar.mo17260gA());
            boolean i = C8850c.m23500i(gT);
            gT.recycle();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return i;
        } catch (RemoteException | C144149k e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: e */
    static C144020w m234177e(String str, boolean z) {
        C144020w wVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C143919bh.m233958a(f390234e);
            try {
                m234178f();
                GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new GoogleCertificatesLookupQuery(str, z, false, new C144166k(f390234e), false);
                C143907aw awVar = f390235f;
                Parcel gA = awVar.mo17260gA();
                C8850c.m23497f(gA, googleCertificatesLookupQuery);
                Parcel gT = awVar.mo17261gT(6, gA);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) C8850c.m23492a(gT, GoogleCertificatesLookupResponse.CREATOR);
                gT.recycle();
                PackageManager.NameNotFoundException nameNotFoundException = null;
                if (googleCertificatesLookupResponse.f389585a) {
                    C143870e.m233879a(googleCertificatesLookupResponse.f389588d);
                    wVar = new C144020w(true, (String) null, (Throwable) null);
                } else {
                    String str2 = googleCertificatesLookupResponse.f389586b;
                    if (C144021x.m234205a(googleCertificatesLookupResponse.f389587c) == 4) {
                        nameNotFoundException = new PackageManager.NameNotFoundException();
                    }
                    if (str2 == null) {
                        str2 = "error checking package certificate";
                    }
                    C143870e.m233879a(googleCertificatesLookupResponse.f389588d);
                    C144021x.m234205a(googleCertificatesLookupResponse.f389587c);
                    wVar = new C144020w(false, str2, nameNotFoundException);
                }
            } catch (C144149k e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                wVar = C144020w.m234201c("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            wVar = C144020w.m234201c("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return wVar;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m234178f() {
        /*
            com.google.android.gms.common.internal.aw r0 = f390235f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = f390234e
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)
            java.lang.Object r0 = f390233d
            monitor-enter(r0)
            com.google.android.gms.common.internal.aw r1 = f390235f     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x003b
            android.content.Context r1 = f390234e     // Catch:{ all -> 0x003d }
            com.google.android.gms.dynamite.n r2 = com.google.android.gms.dynamite.DynamiteModule.f390447c     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m234354d(r1, r2, r3)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.mo119687c(r2)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0025
            r1 = 0
            goto L_0x0039
        L_0x0025:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ all -> 0x003d }
            boolean r3 = r2 instanceof com.google.android.gms.common.internal.C143907aw     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x0033
            r1 = r2
            com.google.android.gms.common.internal.aw r1 = (com.google.android.gms.common.internal.C143907aw) r1     // Catch:{ all -> 0x003d }
            goto L_0x0039
        L_0x0033:
            com.google.android.gms.common.internal.aw r2 = new com.google.android.gms.common.internal.aw     // Catch:{ all -> 0x003d }
            r2.<init>(r1)     // Catch:{ all -> 0x003d }
            r1 = r2
        L_0x0039:
            f390235f = r1     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C143993r.m234178f():void");
    }
}
