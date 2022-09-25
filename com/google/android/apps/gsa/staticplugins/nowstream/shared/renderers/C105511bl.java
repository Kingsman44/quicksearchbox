package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91768d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91821b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7249e.C91822a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105457d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105465j;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105403k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8150b.C105424e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8150b.C105425f;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105437g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8152d.C105459b;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23306v;
import com.google.p375ai.p378b.C8142xb;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bl */
/* compiled from: PG */
public abstract class C105511bl extends C105474ab {

    /* renamed from: M */
    private final C105424e f294367M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C105511bl(C22945j jVar, Context context, C105437g gVar, C105403k kVar, boolean z, C23306v vVar, C90314b bVar, C105457d dVar, C91821b bVar2, C91768d dVar2, C105419b bVar3, C90323a aVar, C91825b bVar4, C91728l lVar, C90479a aVar2, C91822a aVar3, C90320d dVar3, C105459b bVar5, C105425f fVar) {
        super(jVar, context, gVar, kVar, z, vVar, bVar, dVar, bVar2, dVar2, bVar3, aVar, bVar4, lVar, aVar2, aVar3, dVar3, bVar5);
        C105425f fVar2 = fVar;
        C8142xb E = mo94595E();
        C105465j jVar2 = (C105465j) fVar2.f294056a.mo17428b();
        jVar2.getClass();
        C90314b bVar6 = (C90314b) ((C68221g) fVar2.f294057b).f184583a;
        bVar6.getClass();
        E.getClass();
        this.f294367M = new C105424e(jVar2, bVar6, gVar, jVar, kVar, z, E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo94826H(FrameLayout frameLayout) {
        super.mo94826H(frameLayout);
        frameLayout.addView(this.f294367M.f294054f.f294102b);
    }
}
