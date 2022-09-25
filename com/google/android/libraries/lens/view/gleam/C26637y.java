package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2154p.p2155a.C27534d;
import com.google.android.libraries.lens.view.p2154p.p2155a.C27535e;
import com.google.android.libraries.lens.view.p2154p.p2156b.C27543c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4699e.C62231l;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56262bp;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.lens.view.gleam.y */
/* compiled from: PG */
public final class C26637y {

    /* renamed from: a */
    public final C27543c f72643a;

    /* renamed from: b */
    public final C68214a f72644b;

    /* renamed from: c */
    public final C37215b f72645c;

    public C26637y(C68214a aVar, C27543c cVar, C37215b bVar) {
        this.f72644b = aVar;
        this.f72643a = cVar;
        this.f72645c = bVar;
        cVar.mo33103f(new C26636x(this));
    }

    /* renamed from: b */
    public static boolean m49210b(C25308ap apVar) {
        C25349y a = C25349y.m46667a(apVar.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        return C58832aw.m90831a(a, C25349y.DOCUMENT_GLEAM);
    }

    /* renamed from: a */
    public final C58833ax mo31917a() {
        return ((C27535e) this.f72644b.mo27525b()).mo33090b() ? C58833ax.m90833j((C62231l) C58833ax.m90833j(((C27535e) this.f72644b.mo27525b()).f75315b).mo56106b(C27534d.f75313a).mo56111f()) : C58836b.f156633a;
    }

    /* renamed from: c */
    public final boolean mo31918c() {
        if (!mo31919d()) {
            return false;
        }
        return ((C27535e) this.f72644b.mo27525b()).mo33091c();
    }

    /* renamed from: d */
    public final boolean mo31919d() {
        return ((C27535e) this.f72644b.mo27525b()).mo33090b() && this.f72643a.mo33102e().equals(C56262bp.CROPPING_VIEW);
    }
}
