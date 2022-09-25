package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6513aj.C84544d;
import com.google.android.apps.gsa.search.core.p6513aj.C84547g;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.util.C90723ag;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.p.v */
/* compiled from: PG */
public final class C86267v implements Closeable, C84544d, C90991b {

    /* renamed from: a */
    public final C84547g f233193a;

    /* renamed from: b */
    public final Object f233194b = new Object();

    /* renamed from: c */
    public final Set f233195c = new HashSet();

    /* renamed from: d */
    public boolean f233196d;

    /* renamed from: e */
    public C89022at f233197e;

    /* renamed from: f */
    public C90456c f233198f;

    /* renamed from: g */
    private boolean f233199g;

    /* renamed from: h */
    private final C60870cx f233200h;

    public C86267v(C90931ca caVar, C90723ag agVar, int i) {
        C84547g gVar = new C84547g(this);
        this.f233193a = gVar;
        this.f233200h = caVar.mo85139d(new C86265t(agVar, i, gVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79964a() {
        HashSet<C86266u> hashSet;
        synchronized (this.f233194b) {
            if (this.f233196d) {
                hashSet = new HashSet<>(this.f233195c);
                this.f233196d = false;
            } else {
                hashSet = null;
            }
        }
        if (hashSet != null) {
            for (C86266u a : hashSet) {
                a.mo79963a();
            }
        }
    }

    /* renamed from: b */
    public final void mo78262b() {
        synchronized (this.f233194b) {
            C58838bb.m90883r(this.f233198f == null);
            this.f233196d = !this.f233199g;
            this.f233199g = true;
            close();
        }
        mo79964a();
    }

    /* renamed from: c */
    public final void mo78263c(C90456c cVar) {
        synchronized (this.f233194b) {
            boolean z = true;
            C58838bb.m90883r(!this.f233199g);
            if (this.f233198f != null) {
                z = false;
            }
            this.f233196d = z;
            this.f233198f = cVar;
            close();
        }
        mo79964a();
    }

    public final void close() {
        synchronized (this.f233194b) {
            C60870cx cxVar = this.f233200h;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo79966e() {
        boolean z;
        synchronized (this.f233194b) {
            z = this.f233198f != null;
        }
        return z;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AsyncHttpResponse");
        fVar.mo85279c("buffer").mo85276a(C90752i.m148229c(String.valueOf(this.f233193a)));
        synchronized (this.f233194b) {
            fVar.mo85279c("fetch").mo85276a(C90752i.m148229c(this.f233200h.isDone() ? "done" : this.f233200h.isCancelled() ? "cancelled" : "running"));
            fVar.mo85279c("state").mo85276a(C90752i.m148229c(this.f233199g ? "complete" : this.f233198f != null ? "error" : "running"));
            fVar.mo85279c("has headers").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f233197e != null)));
            if (this.f233198f != null) {
                C91005e c = fVar.mo85279c("error");
                C90456c cVar = this.f233198f;
                c.mo85276a(C90752i.m148229c(C90454b.m147153c(cVar.mo79844b(), cVar.mo79843a())));
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f233193a);
        return "AsyncHttpResponse{" + valueOf + "}";
    }
}
