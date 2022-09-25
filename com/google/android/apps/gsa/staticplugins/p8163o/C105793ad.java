package com.google.android.apps.gsa.staticplugins.p8163o;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.ad */
/* compiled from: PG */
public final /* synthetic */ class C105793ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C105795af f295137a;

    /* renamed from: b */
    public final /* synthetic */ C88431bb f295138b;

    public /* synthetic */ C105793ad(C105795af afVar, C88431bb bbVar) {
        this.f295137a = afVar;
        this.f295138b = bbVar;
    }

    public final void run() {
        Object obj;
        C105795af afVar = this.f295137a;
        C88431bb bbVar = this.f295138b;
        C62940bt r2 = C62942bv.checkIsLite(C88459i.f239145a);
        bbVar.mo58887l(r2);
        Object l = bbVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        C88458h hVar = (C88458h) obj;
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.PODCAST_PLAYER;
        gVar.f239204f = "podcast_player";
        gVar.f239199a = 562949953421312L;
        afVar.f295142e = new C87673aa(afVar.f295141d, (C87682aj) null, (C90757ba) null, new ClientConfig(gVar), afVar.f295140c, afVar.f295139a);
        afVar.f295142e.mo81932c();
        afVar.f295143f = true;
        afVar.f295144g.mo78667d(new C105794ae());
    }
}
