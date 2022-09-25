package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.d */
/* compiled from: PG */
public final class C84129d extends C84140o {

    /* renamed from: a */
    private final C22871g f229054a;

    /* renamed from: b */
    private final C91097g f229055b;

    /* renamed from: c */
    private final C68214a f229056c;

    /* renamed from: d */
    private final C85923cq f229057d;

    /* renamed from: e */
    private final Context f229058e;

    /* renamed from: f */
    private final C22871g f229059f;

    /* renamed from: g */
    private final C89012aj f229060g;

    public C84129d(C22871g gVar, C91097g gVar2, C68214a aVar, C85923cq cqVar, Context context, C22871g gVar3, C89012aj ajVar) {
        this.f229054a = gVar;
        this.f229055b = gVar2;
        this.f229056c = aVar;
        this.f229057d = cqVar;
        this.f229058e = context;
        this.f229059f = gVar3;
        this.f229060g = ajVar;
    }

    /* renamed from: a */
    public final C84144s mo77559a() {
        return new C84138m(this.f229059f, this.f229060g, mo77560b(), this.f229057d);
    }

    /* renamed from: b */
    public final C84150y mo77560b() {
        return new C84131f(this.f229056c, this.f229059f, this.f229060g, this.f229057d);
    }

    /* renamed from: c */
    public final C84122ab mo77561c() {
        return new C84134i(this.f229054a, this.f229055b, mo77560b(), this.f229057d, this.f229058e);
    }

    /* renamed from: d */
    public final C84125ae mo77562d() {
        return new C84135j();
    }
}
