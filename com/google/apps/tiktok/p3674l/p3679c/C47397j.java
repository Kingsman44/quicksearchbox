package com.google.apps.tiktok.p3674l.p3679c;

import androidx.swiperefreshlayout.widget.C4186o;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.apps.tiktok.tracing.C47525ak;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;

/* renamed from: com.google.apps.tiktok.l.c.j */
/* compiled from: PG */
public final /* synthetic */ class C47397j implements C4186o {

    /* renamed from: a */
    public final /* synthetic */ C47400m f123121a;

    /* renamed from: b */
    public final /* synthetic */ SwipeRefreshLayout f123122b;

    /* renamed from: c */
    public final /* synthetic */ C47388b f123123c;

    public /* synthetic */ C47397j(C47400m mVar, SwipeRefreshLayout swipeRefreshLayout, C47388b bVar) {
        this.f123121a = mVar;
        this.f123122b = swipeRefreshLayout;
        this.f123123c = bVar;
    }

    /* renamed from: a */
    public final void mo8858a() {
        C47400m mVar = this.f123121a;
        SwipeRefreshLayout swipeRefreshLayout = this.f123122b;
        C47388b bVar = this.f123123c;
        if (C47525ak.m84586a(swipeRefreshLayout.getContext())) {
            C47538ax e = mVar.f123127a.mo51615e(C47400m.m84244c("Swipe Refresh swiped", swipeRefreshLayout), C47562bm.f123426a);
            try {
                C47393f.m84237h(bVar, swipeRefreshLayout);
                if (e != null) {
                    e.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47394g.m84242a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
