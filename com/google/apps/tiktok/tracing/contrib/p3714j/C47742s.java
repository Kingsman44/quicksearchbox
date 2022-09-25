package com.google.apps.tiktok.tracing.contrib.p3714j;

import android.net.Uri;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import org.chromium.weblayer.C72602bk;
import org.chromium.weblayer.C72624m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.tracing.contrib.j.s */
/* compiled from: PG */
public final class C47742s extends C72602bk {

    /* renamed from: a */
    final /* synthetic */ C72602bk f123711a;

    /* renamed from: b */
    final /* synthetic */ C47743t f123712b;

    public C47742s(C47743t tVar, C72602bk bkVar) {
        this.f123712b = tVar;
        this.f123711a = bkVar;
    }

    /* renamed from: c */
    public final void mo47188c() {
        if (C47831fm.m85027v()) {
            this.f123711a.mo47188c();
            return;
        }
        C47538ax c = this.f123712b.f123713a.mo51613c("onRenderProcessGone");
        try {
            this.f123711a.mo47188c();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47741r.m84894a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo47189d(String str) {
        if (C47831fm.m85027v()) {
            this.f123711a.mo47189d(str);
            return;
        }
        C47538ax c = this.f123712b.f123713a.mo51613c("onTitleUpdated");
        try {
            this.f123711a.mo47189d(str);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47741r.m84894a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo47190e(Uri uri) {
        if (C47831fm.m85027v()) {
            C69664n.m101061g(uri, "url");
            return;
        }
        C47538ax c = this.f123712b.f123713a.mo51613c("onVisibleUriChanged");
        try {
            C69664n.m101061g(uri, "url");
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47741r.m84894a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo47191f(C72624m mVar) {
        C47538ax c = this.f123712b.f123713a.mo51613c("showContextMenu");
        try {
            this.f123711a.mo47191f(mVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47741r.m84894a(th, th);
        }
        throw th;
    }
}
