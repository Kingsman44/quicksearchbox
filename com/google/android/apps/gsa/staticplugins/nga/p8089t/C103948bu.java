package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bu */
/* compiled from: PG */
public final class C103948bu implements C103384h {

    /* renamed from: a */
    public final C89037bh f289305a;

    /* renamed from: b */
    public final C86124t f289306b;

    /* renamed from: c */
    public final C22871g f289307c;

    /* renamed from: d */
    public final C58881cr f289308d;

    /* renamed from: e */
    private final C68214a f289309e;

    /* renamed from: f */
    private final Object f289310f = new Object();

    /* renamed from: g */
    private Boolean f289311g = null;

    public C103948bu(C89037bh bhVar, C86124t tVar, C22871g gVar, C68214a aVar) {
        this.f289305a = bhVar;
        this.f289306b = tVar;
        this.f289307c = gVar;
        this.f289309e = aVar;
        this.f289308d = C58886cw.m90973a(new C103945br(aVar));
    }

    /* renamed from: b */
    private final void m171889b() {
        synchronized (this.f289310f) {
            if (this.f289311g == null) {
                this.f289311g = Boolean.valueOf(((SharedPreferences) this.f289309e.mo27525b()).getBoolean("nga_setting_first_run", true));
                ((SharedPreferences) this.f289309e.mo27525b()).edit().putBoolean("nga_setting_first_run", false).apply();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r2.f289311g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001b, code lost:
        r0 = r0.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        m171889b();
        r1 = r2.f289310f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93893a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f289310f
            monitor-enter(r0)
            java.lang.Boolean r1 = r2.f289311g     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x000d
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r2.m171889b()
            java.lang.Object r1 = r2.f289310f
            monitor-enter(r1)
            java.lang.Boolean r0 = r2.f289311g     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            r0 = 0
            return r0
        L_0x001b:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8089t.C103948bu.mo93893a():boolean");
    }

    /* renamed from: i */
    public final void mo93533i() {
        m171889b();
    }
}
