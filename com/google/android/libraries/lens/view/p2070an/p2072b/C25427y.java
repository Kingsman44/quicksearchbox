package com.google.android.libraries.lens.view.p2070an.p2072b;

import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.an.b.y */
/* compiled from: PG */
final class C25427y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C54002bj f69293a;

    /* renamed from: b */
    final /* synthetic */ C25396af f69294b;

    public C25427y(C25396af afVar, C54002bj bjVar) {
        this.f69294b = afVar;
        this.f69293a = bjVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C25396af afVar = this.f69294b;
        C37258g gVar = C37194a.f98416F;
        C56244ay ayVar = this.f69293a.f141679a;
        if (ayVar == null) {
            ayVar = C56244ay.f149802e;
        }
        C37252a h = gVar.mo40814h(ayVar.f149806c);
        h.mo40781e(th instanceof CancellationException ? C62722b.CANCELLED : C62722b.UNKNOWN);
        afVar.mo30440h(h);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24208ak akVar = (C24208ak) obj;
        C25396af afVar = this.f69294b;
        C37258g gVar = C37194a.f98416F;
        C56244ay ayVar = this.f69293a.f141679a;
        if (ayVar == null) {
            ayVar = C56244ay.f149802e;
        }
        C37252a h = gVar.mo40814h(ayVar.f149806c);
        h.mo40781e(C62722b.OK);
        afVar.mo30440h(h);
    }
}
