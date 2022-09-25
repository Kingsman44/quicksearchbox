package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.p */
/* compiled from: PG */
public final class C106391p {

    /* renamed from: a */
    public static final C59071e f296743a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.am.p");

    /* renamed from: b */
    public final C68214a f296744b;

    /* renamed from: c */
    public final C86124t f296745c;

    /* renamed from: d */
    public final C68214a f296746d;

    /* renamed from: e */
    private final C22871g f296747e;

    public C106391p(C86124t tVar, C22871g gVar, C68214a aVar, C68214a aVar2) {
        this.f296745c = tVar;
        this.f296747e = gVar;
        this.f296744b = aVar;
        this.f296746d = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo95492a(String str) {
        C60870cx g = C60922j.m93044g(mo95495d(), new C106382g(this, str), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo95493b() {
        return C60922j.m93044g(mo95495d(), C106385j.f296737a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo95494c(String str) {
        C58976aa aaVar = C58975e.f156826a;
        return C118826c.m197213c(((C42876ab) this.f296744b.mo27525b()).mo46039a(new C106383h(str), C60826bg.f164896a));
    }

    /* renamed from: d */
    public final C60870cx mo95495d() {
        return ((C42876ab) this.f296744b.mo27525b()).mo46042d();
    }

    /* renamed from: e */
    public final void mo95496e() {
        C58976aa aaVar = C58975e.f156826a;
        C90875ai.m148465b(C106389n.f296741a, mo95495d(), this.f296747e, "prewarmOverappDiscoveryDataStore").mo85223a(C106390o.f296742a);
    }

    /* renamed from: f */
    public final boolean mo95497f(String str) {
        return this.f296745c.mo79746e(C90037cp.f248420aA) && C90772bp.m148274A(this.f296745c.mo79745c(C90037cp.f248596dn), Integer.toString(C91042a.m148717a(str)));
    }

    /* renamed from: g */
    public final void mo95498g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C118826c.m197213c(((C42876ab) this.f296744b.mo27525b()).mo46039a(new C106377b(z), C60826bg.f164896a));
    }
}
