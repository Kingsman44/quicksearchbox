package com.google.android.libraries.search.video.p3191a;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40019a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40045j;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4552o.C60450qm;
import com.google.common.p4552o.aql;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54783c;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.video.a.n */
/* compiled from: PG */
final class C41455n implements C41454m {

    /* renamed from: a */
    private static final C58528ij f108265a = new C58759qy("com.google.android.googlequicksearchbox");

    /* renamed from: b */
    private final Context f108266b;

    public C41455n(Fragment fragment) {
        this.f108266b = fragment.getContext();
    }

    /* renamed from: a */
    public final int mo43982a() {
        return 1514000000;
    }

    /* renamed from: b */
    public final C57194y mo43983b(C57128al alVar) {
        int i = alVar.f152497a;
        if (i == 2) {
            C57194y yVar = ((C57175f) alVar.f152498b).f152642c;
            if (yVar == null) {
                return C57194y.f152692i;
            }
            return yVar;
        } else if (i == 1) {
            return (C57194y) alVar.f152498b;
        } else {
            return C57194y.f152692i;
        }
    }

    /* renamed from: c */
    public final void mo43984c(C40027ah ahVar, C57696b bVar, C54806z zVar) {
        if (bVar != null && (ahVar instanceof C40025af)) {
            C40025af afVar = (C40025af) ahVar;
            Set<C40045j> singleton = Collections.singleton(new C40019a(C54783c.f143723a, zVar));
            aql e = C40025af.m69528e(2, bVar);
            for (C40045j jVar : singleton) {
                e.mo58885m(jVar.mo42123a(), jVar.mo42124b());
            }
            afVar.mo42131d(bVar, e, (C60450qm) null);
        }
    }

    /* renamed from: d */
    public final boolean mo43985d() {
        C58528ij ijVar = f108265a;
        return ((C58759qy) ijVar).f156534a.equals(this.f108266b.getPackageName());
    }
}
