package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bk */
/* compiled from: PG */
final class C114654bk implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Drawable f318074a;

    /* renamed from: b */
    final /* synthetic */ ZeroStateMediaController f318075b;

    public C114654bk(ZeroStateMediaController zeroStateMediaController, Drawable drawable) {
        this.f318075b = zeroStateMediaController;
        this.f318074a = drawable;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = ZeroStateMediaController.f317924a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSMiCtl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(29301)).mo56386p("Unable to load album art.");
        this.f318075b.mo101460f(C90772bp.m148294b(this.f318074a));
        this.f318075b.mo101457c((Drawable) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Drawable drawable = (Drawable) obj;
        this.f318075b.mo101460f(C90772bp.m148294b(drawable));
        this.f318075b.mo101457c(drawable);
    }
}
