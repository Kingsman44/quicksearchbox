package com.google.android.libraries.mdi.download.p2247g;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28742bt;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2243e.C29349ac;
import com.google.android.libraries.mdi.download.p2243e.C29353c;
import com.google.android.libraries.mdi.download.p2243e.C29357g;
import com.google.android.libraries.p10983ae.p10984a.C147473r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.p3311e.C42775c;
import com.google.android.libraries.storage.p3304a.p3313g.C42801d;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.download.g.e */
/* compiled from: PG */
public final class C29441e implements C42803f, C147473r, C29349ac {

    /* renamed from: a */
    public final Executor f79820a;

    /* renamed from: b */
    public final HashMap f79821b = new HashMap();

    /* renamed from: c */
    public final HashMap f79822c = new HashMap();

    /* renamed from: d */
    private final C29662ie f79823d;

    /* renamed from: e */
    private final C29357g f79824e;

    public C29441e(C21370a aVar, Executor executor) {
        Objects.requireNonNull(aVar);
        C29438b bVar = new C29438b(aVar);
        this.f79823d = bVar;
        this.f79820a = new C60904dr(executor);
        this.f79824e = new C29357g(bVar, executor);
    }

    /* renamed from: a */
    public final C42802e mo34689a(Uri uri) {
        return mo34690b(uri);
    }

    /* renamed from: b */
    public final C42802e mo34690b(Uri uri) {
        synchronized (C29441e.class) {
            String str = (String) this.f79821b.get(uri);
            if (str == null) {
                C42802e b = this.f79824e.mo34690b(uri);
                return b;
            } else if (this.f79822c.get(str) == null) {
                C29045l.m53936h("%s: Can't find file group for uri: %s", "DownloadProgressMonitor", uri);
                return null;
            } else {
                C42802e eVar = (C42802e) this.f79822c.get(str);
                return eVar;
            }
        }
    }

    /* renamed from: c */
    public final void mo34667c(Uri uri, C29353c cVar) {
        this.f79824e.mo34667c(uri, cVar);
    }

    /* renamed from: d */
    public final void mo34691d() {
    }

    /* renamed from: e */
    public final void mo34692e() {
    }

    /* renamed from: f */
    public final void mo34693f() {
        synchronized (C29441e.class) {
            for (C42775c cVar : this.f79822c.values()) {
                ((C29440d) cVar.f112034a).f79816a.mo33127d();
            }
            this.f79824e.mo34693f();
        }
    }

    /* renamed from: g */
    public final void mo34668g(Uri uri) {
        this.f79824e.mo34668g(uri);
    }

    /* renamed from: h */
    public final C42801d mo34694h() {
        return null;
    }

    /* renamed from: i */
    public final void mo34739i(String str, C28742bt btVar) {
        synchronized (C29441e.class) {
            if (!this.f79822c.containsKey(str)) {
                HashMap hashMap = this.f79822c;
                C29440d dVar = new C29440d(this, str, btVar);
                C29662ie ieVar = this.f79823d;
                Objects.requireNonNull(ieVar);
                hashMap.put(str, new C42775c(dVar, new C29437a(ieVar), 1000, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: j */
    public final void mo34740j(String str, long j) {
        synchronized (C29441e.class) {
            if (this.f79822c.containsKey(str)) {
                ((C42775c) this.f79822c.get(str)).f112034a.mo34737a((int) j);
            }
        }
    }

    /* renamed from: k */
    public final void mo34741k(String str) {
        synchronized (C29441e.class) {
            this.f79822c.remove(str);
        }
    }
}
