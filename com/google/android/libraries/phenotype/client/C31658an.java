package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.p060c.C0977g;
import com.google.android.libraries.directboot.C20674d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.an */
/* compiled from: PG */
public final class C31658an implements C31670i {

    /* renamed from: a */
    private static final Map f85159a = new C0977g();

    /* renamed from: b */
    private final SharedPreferences f85160b;

    /* renamed from: c */
    private final SharedPreferences.OnSharedPreferenceChangeListener f85161c;

    /* renamed from: d */
    private final Object f85162d = new Object();

    /* renamed from: e */
    private volatile Map f85163e;

    /* renamed from: f */
    private final List f85164f = new ArrayList();

    private C31658an(SharedPreferences sharedPreferences) {
        C31657am amVar = new C31657am(this);
        this.f85161c = amVar;
        this.f85160b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(amVar);
    }

    /* renamed from: a */
    static synchronized void m58997a() {
        synchronized (C31658an.class) {
            for (C31658an anVar : f85159a.values()) {
                anVar.f85160b.unregisterOnSharedPreferenceChangeListener(anVar.f85161c);
            }
            f85159a.clear();
        }
    }

    /* renamed from: c */
    public static void m58998c() {
        synchronized (C31658an.class) {
            for (C31658an d : f85159a.values()) {
                d.mo37307d();
            }
        }
    }

    /* renamed from: e */
    static C31658an m58999e(Context context, String str) {
        C31658an anVar;
        SharedPreferences sharedPreferences;
        int i = C20674d.f57955a;
        if (!str.startsWith("direct_boot:") && !C20674d.m38856e(context)) {
            return null;
        }
        synchronized (C31658an.class) {
            Map map = f85159a;
            anVar = (C31658an) map.get(str);
            if (anVar == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    anVar = new C31658an(sharedPreferences);
                    map.put(str, anVar);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        return anVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo37306b(String str) {
        Map<String, ?> map = this.f85163e;
        if (map == null) {
            synchronized (this.f85162d) {
                map = this.f85163e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f85160b.getAll();
                        this.f85163e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo37307d() {
        synchronized (this.f85162d) {
            this.f85163e = null;
            C31654aj.f85147b.incrementAndGet();
        }
        synchronized (this) {
            for (C31666e a : this.f85164f) {
                a.mo37312a();
            }
        }
    }
}
