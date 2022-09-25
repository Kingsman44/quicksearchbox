package com.google.android.libraries.mdi.download.p2243e;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.p10983ae.p10984a.C147473r;
import com.google.android.libraries.storage.p3304a.p3313g.C42801d;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.e.g */
/* compiled from: PG */
public final class C29357g implements C42803f, C147473r, C29349ac {

    /* renamed from: a */
    public final C29662ie f79581a;

    /* renamed from: b */
    public final Executor f79582b;

    /* renamed from: c */
    public final HashMap f79583c = new HashMap();

    public C29357g(C29662ie ieVar, Executor executor) {
        this.f79581a = ieVar;
        this.f79582b = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C42802e mo34689a(Uri uri) {
        return mo34690b(uri);
    }

    /* renamed from: b */
    public final C42802e mo34690b(Uri uri) {
        synchronized (C29357g.class) {
            if (this.f79583c.get(uri) == null) {
                return null;
            }
            C42802e eVar = (C42802e) this.f79583c.get(uri);
            return eVar;
        }
    }

    /* renamed from: c */
    public final void mo34667c(Uri uri, C29353c cVar) {
        synchronized (C29357g.class) {
            if (!this.f79583c.containsKey(uri)) {
                this.f79583c.put(uri, new C29356f(this, uri, cVar));
            }
        }
    }

    /* renamed from: d */
    public final void mo34691d() {
    }

    /* renamed from: e */
    public final void mo34692e() {
    }

    /* renamed from: f */
    public final void mo34693f() {
        synchronized (C29357g.class) {
            for (C29356f fVar : this.f79583c.values()) {
                fVar.f79576a.mo34576c();
            }
        }
    }

    /* renamed from: g */
    public final void mo34668g(Uri uri) {
        synchronized (C29357g.class) {
            this.f79583c.remove(uri);
        }
    }

    /* renamed from: h */
    public final C42801d mo34694h() {
        return null;
    }
}
