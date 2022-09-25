package com.google.apps.tiktok.tracing.contrib.p3714j;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72603bl;

/* renamed from: com.google.apps.tiktok.tracing.contrib.j.v */
/* compiled from: PG */
public final class C47745v extends C72603bl {

    /* renamed from: a */
    final /* synthetic */ C72603bl f123714a;

    /* renamed from: b */
    final /* synthetic */ C47746w f123715b;

    public C47745v(C47746w wVar, C72603bl blVar) {
        this.f123715b = wVar;
        this.f123714a = blVar;
    }

    /* renamed from: a */
    public final void mo47091a(C72601bj bjVar) {
        if (C47831fm.m85027v()) {
            this.f123714a.mo47091a(bjVar);
            return;
        }
        C47538ax c = this.f123715b.f123716a.mo51613c("onActiveTabChanged");
        try {
            this.f123714a.mo47091a(bjVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47744u.m84899a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo47092b(C72601bj bjVar) {
        if (C47831fm.m85027v()) {
            this.f123714a.mo47092b(bjVar);
            return;
        }
        C47538ax c = this.f123715b.f123716a.mo51613c("onTabAdded");
        try {
            this.f123714a.mo47092b(bjVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47744u.m84899a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo47093c(C72601bj bjVar) {
        if (C47831fm.m85027v()) {
            this.f123714a.mo47093c(bjVar);
            return;
        }
        C47538ax c = this.f123715b.f123716a.mo51613c("onTabRemoved");
        try {
            this.f123714a.mo47093c(bjVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47744u.m84899a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo47094d() {
        if (C47831fm.m85027v()) {
            this.f123714a.mo47094d();
            return;
        }
        C47538ax c = this.f123715b.f123716a.mo51613c("onWillDestroyBrowserAndAllTabs");
        try {
            this.f123714a.mo47094d();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47744u.m84899a(th, th);
        }
        throw th;
    }
}
