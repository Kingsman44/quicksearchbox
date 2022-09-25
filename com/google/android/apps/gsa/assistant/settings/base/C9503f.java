package com.google.android.apps.gsa.assistant.settings.base;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.base.f */
/* compiled from: PG */
public final class C9503f extends k {

    /* renamed from: a */
    final /* synthetic */ C9506h f32982a;

    /* renamed from: b */
    final /* synthetic */ int f32983b;

    /* renamed from: c */
    final /* synthetic */ C9504g f32984c;

    public C9503f(C9504g gVar, C9506h hVar, int i) {
        this.f32984c = gVar;
        this.f32982a = hVar;
        this.f32983b = i;
    }

    /* renamed from: gn */
    public final void mo17785gn(Throwable th) {
        this.f32982a.mo17817a(th);
        this.f32984c.f32990f.remove(Integer.valueOf(this.f32983b));
    }

    /* renamed from: go */
    public final /* synthetic */ void mo17786go(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f32982a.mo17818b((acz) obj);
        this.f32984c.f32990f.remove(Integer.valueOf(this.f32983b));
    }
}
