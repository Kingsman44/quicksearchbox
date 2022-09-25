package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.g */
/* compiled from: PG */
public final class C115148g extends C115141a {

    /* renamed from: a */
    private static final C59071e f319569a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.b.g");

    /* renamed from: b */
    private final C68214a f319570b;

    /* renamed from: c */
    private final C22871g f319571c;

    /* renamed from: d */
    private final C68214a f319572d;

    /* renamed from: e */
    private C58833ax f319573e = C58836b.f156633a;

    public C115148g(C68214a aVar, C22871g gVar, C68214a aVar2) {
        this.f319570b = aVar;
        this.f319571c = gVar;
        this.f319572d = aVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo77783a(C52176ia iaVar) {
    }

    /* renamed from: b */
    public final void mo77784b(C84275o oVar) {
        if (oVar.mo77810p() && (!this.f319573e.mo56113h() || !((C84275o) this.f319573e.mo56107c()).mo77810p())) {
            C90873ag agVar = new C90873ag(((C89037bh) this.f319570b.mo27525b()).mo27378c(), this.f319571c, "get-connectivity-info", new C115145d(this));
            agVar.mo85224b(RuntimeException.class, new C115146e(this));
            agVar.mo85223a(new C115147f(this));
        }
        this.f319573e = C58833ax.m90834k(oVar);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo101846c(C84269i iVar, C84271k kVar) {
    }

    /* renamed from: d */
    public final void mo101857d(Exception exc) {
        ((C59052c) ((C59052c) ((C59052c) f319569a.mo56225c()).mo56382g(exc)).mo56372aa(29695)).mo56386p("Failed to get connectivity info");
        mo101858e(C89885b.OPA_MEDIA_PLAYER_PLAYBACK_ERROR.f246280a);
    }

    /* renamed from: e */
    public final void mo101858e(int i) {
        ((C89911f) this.f319572d.mo27525b()).mo83756b(new C90452a(211, i)).mo83721a();
    }
}
