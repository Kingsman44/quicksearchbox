package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature.C135941c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature.C135944f;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.web.c.b.y */
/* compiled from: PG */
public final class C43356y implements C44107h {

    /* renamed from: a */
    public final Map f113252a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map f113253b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map f113254c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map f113255d = new ConcurrentHashMap();

    /* renamed from: e */
    public final Map f113256e = new ConcurrentHashMap();

    /* renamed from: f */
    private final C43339h f113257f;

    public C43356y(WebModelProvider webModelProvider) {
        C43339h hVar = (C43339h) webModelProvider.mo47072a(C43339h.class);
        this.f113257f = hVar;
        ((Set) hVar.f113207b.get()).add(this);
    }

    /* renamed from: a */
    public final void mo44356a() {
        ((Set) this.f113257f.f113207b.get()).remove(this);
    }

    /* renamed from: b */
    public final void mo46473b(C43376u uVar) {
        C60870cx cxVar;
        for (C135944f fVar : this.f113256e.values()) {
            if (!uVar.f113329b.isEmpty()) {
                if (fVar.f370251g) {
                    cxVar = fVar.f370249e.mo112395a();
                } else {
                    cxVar = C60856cj.m92900i(true);
                }
                C135941c cVar = new C135941c(fVar, uVar);
                C60856cj.m92911t(cxVar, C47810es.m84974n(cVar), fVar.f370248d);
            }
        }
    }
}
