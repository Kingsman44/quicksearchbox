package com.google.android.apps.search.podcasts.p10601r;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58881cr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.s */
/* compiled from: PG */
public final class C140997s {

    /* renamed from: a */
    public final C28443m f382792a;

    /* renamed from: b */
    private final C47770dh f382793b;

    public C140997s(C47770dh dhVar, C28443m mVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(mVar, "interactionLogger");
        this.f382793b = dhVar;
        this.f382792a = mVar;
    }

    /* renamed from: a */
    public final void mo116062a(View view, View.OnClickListener onClickListener, String str) {
        C69664n.m101061g(view, "view");
        view.setOnClickListener(new C47591co(this.f382793b, str, new C140995q(this, onClickListener)));
    }

    /* renamed from: b */
    public final void mo116063b(View view, C58881cr crVar, String str) {
        C69664n.m101061g(view, "view");
        view.setOnClickListener(new C47591co(this.f382793b, str, new C140996r(this, crVar)));
    }

    /* renamed from: c */
    public final void mo116064c(View view, C47388b bVar, String str, boolean z) {
        C69664n.m101061g(view, "view");
        view.setOnClickListener(new C47591co(this.f382793b, str, new C140994p(z, this, bVar)));
    }
}
