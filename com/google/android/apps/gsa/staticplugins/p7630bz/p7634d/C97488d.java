package com.google.android.apps.gsa.staticplugins.p7630bz.p7634d;

import com.google.android.apps.gsa.staticplugins.p7630bz.p7633c.C97483a;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7633c.C97484b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3135d.C40346e;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40394f;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40463g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40479p;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60888db;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.d.d */
/* compiled from: PG */
final class C97488d implements C69464a {

    /* renamed from: a */
    private final C97489e f272244a;

    /* renamed from: b */
    private final int f272245b;

    public C97488d(C97489e eVar, int i) {
        this.f272244a = eVar;
        this.f272245b = i;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        switch (this.f272245b) {
            case 0:
                return new C97484b(this.f272244a.f272246a);
            case 1:
                return new C97483a();
            case 2:
                C60888db a = this.f272244a.f272257l.mo85208a("xUIKitBackground");
                C68225k.m98532d(a);
                return a;
            case 3:
                return new C40463g();
            case 4:
                C60888db c = this.f272244a.f272257l.mo85210c("xUIKitLightweight");
                C68225k.m98532d(c);
                return c;
            case 5:
                return new C40479p();
            case 6:
                C97489e eVar = this.f272244a;
                return new C40346e(eVar.f272247b, (C60888db) eVar.f272252g.mo17428b());
            default:
                return C40394f.m70078a(C58836b.f156633a, this.f272244a.f272254i);
        }
    }
}
