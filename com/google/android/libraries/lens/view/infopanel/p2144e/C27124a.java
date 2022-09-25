package com.google.android.libraries.lens.view.infopanel.p2144e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.a */
/* compiled from: PG */
final class C27124a extends C27180v {

    /* renamed from: a */
    private C58485gu f74115a;

    /* renamed from: b */
    private final C58833ax f74116b;

    /* renamed from: c */
    private final C58833ax f74117c;

    public C27124a() {
        C58836b bVar = C58836b.f156633a;
        this.f74116b = bVar;
        this.f74117c = bVar;
    }

    /* renamed from: a */
    public final C27181w mo32559a() {
        C58485gu guVar = this.f74115a;
        if (guVar != null) {
            return new C27151b(guVar, this.f74116b, this.f74117c);
        }
        throw new IllegalStateException("Missing required properties: rotatingIconUris");
    }

    /* renamed from: b */
    public final void mo32560b(C58485gu guVar) {
        if (guVar != null) {
            this.f74115a = guVar;
            return;
        }
        throw new NullPointerException("Null rotatingIconUris");
    }
}
