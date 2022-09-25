package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81214fi;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1931p.C23320a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fj */
/* compiled from: PG */
public final class C104045fj implements C103384h {

    /* renamed from: a */
    public static final C58974d f289499a = C58974d.m91136j();

    /* renamed from: b */
    public final C103901aa f289500b;

    /* renamed from: c */
    private final C22871g f289501c;

    /* renamed from: d */
    private final C68214a f289502d;

    /* renamed from: e */
    private final C68214a f289503e;

    /* renamed from: f */
    private final C68214a f289504f;

    /* renamed from: g */
    private final C68214a f289505g;

    /* renamed from: h */
    private final C68214a f289506h;

    public C104045fj(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C103901aa aaVar) {
        this.f289501c = gVar;
        this.f289502d = aVar;
        this.f289503e = aVar2;
        this.f289504f = aVar3;
        this.f289505g = aVar4;
        this.f289506h = aVar5;
        this.f289500b = aaVar;
    }

    /* renamed from: a */
    public final boolean mo93930a() {
        return ((C90021c) this.f289502d.mo27525b()).mo79746e(C90126fx.f251685nV);
    }

    /* renamed from: i */
    public final void mo93533i() {
        if (((C74720bx) this.f289503e.mo27525b()).mo71089f().b()) {
            C81214fi fiVar = (C81214fi) this.f289506h.mo27525b();
            if (C81214fi.m129201a(((C103799g) this.f289505g.mo27525b()).mo93858a(), ((C90021c) this.f289502d.mo27525b()).mo79758x(C90126fx.f251641me))) {
                this.f289501c.mo28211k((C60870cx) ((Optional) this.f289504f.mo27525b()).map(C104043fh.f289497a).orElse(C60856cj.m92900i(C23320a.DISABLED)), "[NGA] NgaNativeLibraryDownloadStarter.maybeDownloadNativeLibrary", new C104044fi(this));
            }
        }
    }
}
