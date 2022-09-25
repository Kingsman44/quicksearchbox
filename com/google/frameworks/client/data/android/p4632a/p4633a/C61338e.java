package com.google.frameworks.client.data.android.p4632a.p4633a;

import android.accounts.Account;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58827ar;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60890dd;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import com.google.frameworks.client.data.android.p4632a.C61347h;
import com.google.frameworks.client.data.android.p4632a.C61352m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.frameworks.client.data.android.a.a.e */
/* compiled from: PG */
public final class C61338e implements C61343d {

    /* renamed from: a */
    static final long f165874a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    static final long f165875b = TimeUnit.HOURS.toMillis(1);

    /* renamed from: e */
    private static final C58827ar f165876e = new C58827ar(" ");

    /* renamed from: c */
    public final Map f165877c = new HashMap();

    /* renamed from: d */
    public final Map f165878d = new HashMap();

    /* renamed from: f */
    private final C61352m f165879f;

    /* renamed from: g */
    private final C21370a f165880g;

    /* renamed from: h */
    private final boolean f165881h;

    /* renamed from: i */
    private final C60887da f165882i = new C60890dd();

    public C61338e(C61352m mVar, C21370a aVar, boolean z) {
        this.f165879f = mVar;
        this.f165880g = aVar;
        this.f165881h = z;
    }

    /* renamed from: f */
    private static final String m93829f(Set set) {
        return "oauth2:".concat(f165876e.mo56097d(set));
    }

    /* renamed from: a */
    public final C61347h mo57911a(C61333a aVar, Set set) {
        C60870cx cxVar;
        C60871cy cyVar;
        C61339f fVar = new C61339f(new Account(aVar.mo57903d(), "com.google"), m93829f(set));
        synchronized (this.f165878d) {
            cxVar = (C60870cx) this.f165878d.get(fVar);
            if (cxVar == null) {
                cyVar = new C60871cy((Callable) new C61335b(this, fVar));
                cyVar.f164961a.mo57297a(new C61336c(this, fVar), this.f165882i);
                this.f165878d.put(fVar, cyVar);
                cxVar = cyVar;
            } else {
                cyVar = null;
            }
        }
        if (cyVar != null) {
            cyVar.run();
        }
        try {
            return (C61347h) cxVar.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C61346g) {
                throw ((C61346g) cause);
            }
            throw new C61346g("Failed to refresh token", cause);
        }
    }

    /* renamed from: b */
    public final C61347h mo57912b(C61333a aVar, Set set) {
        C61347h c;
        try {
            C61339f fVar = new C61339f(new Account(aVar.mo57903d(), "com.google"), m93829f(set));
            synchronized (this.f165877c) {
                c = mo57913c(fVar);
            }
            return c;
        } catch (C61346g e) {
            throw e;
        } catch (Throwable th) {
            throw new C61346g("Failed to get auth token", th);
        }
    }

    /* renamed from: c */
    public final C61347h mo57913c(C61337d dVar) {
        C61347h hVar = (C61347h) this.f165877c.get(dVar);
        if (hVar != null) {
            if (hVar.f165906c == null ? this.f165880g.mo26870b() - hVar.f165905b < f165875b - f165874a : TimeUnit.SECONDS.toMillis(hVar.f165906c.longValue()) - this.f165880g.mo26870b() > f165874a) {
                return hVar;
            }
            mo57915e(hVar);
        }
        return mo57914d(dVar);
    }

    /* renamed from: d */
    public final C61347h mo57914d(C61337d dVar) {
        C61339f fVar = (C61339f) dVar;
        C61347h a = this.f165879f.mo57905a(fVar.f165883a, fVar.f165884b);
        if (this.f165881h || a.f165906c != null) {
            this.f165877c.put(dVar, a);
        }
        return a;
    }

    /* renamed from: e */
    public final void mo57915e(C61347h hVar) {
        this.f165879f.mo57906b(hVar.f165904a);
    }
}
