package com.google.android.apps.gsa.sidekick.shared.monet.p7250f;

import android.view.View;
import com.google.android.libraries.p1730f.C21370a;
import java.util.Collections;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.f.b */
/* compiled from: PG */
public final class C91825b {

    /* renamed from: a */
    public int f256089a = 0;

    /* renamed from: b */
    private final Set f256090b;

    /* renamed from: c */
    private final C21370a f256091c;

    public C91825b(C21370a aVar) {
        this.f256091c = aVar;
        this.f256090b = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: a */
    public final void mo86302a(C91826c cVar) {
        this.f256090b.add(cVar);
    }

    /* renamed from: b */
    public final void mo86303b(View view, String str, int i) {
        this.f256089a = i;
        this.f256091c.mo26870b();
        for (C91826c h : this.f256090b) {
            h.mo86307h(view, str, i);
        }
    }

    /* renamed from: c */
    public final void mo86304c(C91826c cVar) {
        this.f256090b.remove(cVar);
    }

    /* renamed from: d */
    public final void mo86305d(String str, int i, int i2) {
        for (C91826c g : this.f256090b) {
            g.mo86306g(str, i, i2);
        }
    }
}
