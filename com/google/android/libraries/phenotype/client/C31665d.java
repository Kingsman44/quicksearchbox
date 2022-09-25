package com.google.android.libraries.phenotype.client;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.p060c.C0977g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.d */
/* compiled from: PG */
public final class C31665d implements C31670i {

    /* renamed from: a */
    public static final String[] f85170a = {"key", "value"};

    /* renamed from: h */
    private static final Map f85171h = new C0977g();

    /* renamed from: b */
    public final ContentResolver f85172b;

    /* renamed from: c */
    public final Uri f85173c;

    /* renamed from: d */
    public final Runnable f85174d;

    /* renamed from: e */
    public final Object f85175e = new Object();

    /* renamed from: f */
    public volatile Map f85176f;

    /* renamed from: g */
    public final List f85177g = new ArrayList();

    /* renamed from: i */
    private final ContentObserver f85178i;

    private C31665d(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C31664c cVar = new C31664c(this);
        this.f85178i = cVar;
        contentResolver.getClass();
        uri.getClass();
        this.f85172b = contentResolver;
        this.f85173c = uri;
        this.f85174d = runnable;
        contentResolver.registerContentObserver(uri, false, cVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.phenotype.client.C31665d m59005a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.libraries.phenotype.client.d> r0 = com.google.android.libraries.phenotype.client.C31665d.class
            monitor-enter(r0)
            java.util.Map r1 = f85171h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.libraries.phenotype.client.d r2 = (com.google.android.libraries.phenotype.client.C31665d) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.libraries.phenotype.client.d r3 = new com.google.android.libraries.phenotype.client.d     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.C31665d.m59005a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.libraries.phenotype.client.d");
    }

    /* renamed from: d */
    static synchronized void m59006d() {
        synchronized (C31665d.class) {
            for (C31665d dVar : f85171h.values()) {
                dVar.f85172b.unregisterContentObserver(dVar.f85178i);
            }
            f85171h.clear();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo37306b(String str) {
        return (String) mo37311c().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Map mo37311c() {
        Map map;
        Map map2 = this.f85176f;
        if (map2 == null) {
            synchronized (this.f85175e) {
                map2 = this.f85176f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C31668g.m59011a(new C31659b(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f85176f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }
}
