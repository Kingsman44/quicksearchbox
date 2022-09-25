package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.content.Context;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.onegoogle.account.disc.C30186an;
import com.google.android.libraries.onegoogle.account.disc.C30210j;
import com.google.android.libraries.onegoogle.account.disc.C30212l;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.b */
/* compiled from: PG */
public final /* synthetic */ class C30526b implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30528d f82455a;

    /* renamed from: b */
    public final /* synthetic */ Context f82456b;

    public /* synthetic */ C30526b(C30528d dVar, Context context) {
        this.f82455a = dVar;
        this.f82456b = context;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        Object obj2;
        boolean z;
        C58833ax axVar;
        C30528d dVar = this.f82455a;
        Context context = this.f82456b;
        C58833ax axVar2 = (C58833ax) obj;
        C2332ag agVar = dVar.f81607a;
        if (dVar.f82461e == null) {
            obj2 = C58836b.f156633a;
        } else {
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(dVar.f82462f);
            e.mo55395g(dVar.f82461e);
            C58485gu f = e.mo55394f();
            if (!dVar.f82459c.mo35726p(f)) {
                obj2 = C58836b.f156633a;
            } else {
                C30210j jVar = new C30210j();
                jVar.f81671a = C58833ax.m90834k(dVar.f82459c.mo35724n(context));
                if (!dVar.f82463g) {
                    z = false;
                } else {
                    C30238l lVar = dVar.f82459c;
                    Objects.requireNonNull(lVar);
                    z = C58557jl.m90138s(f, new C30527c(lVar));
                }
                if (z) {
                    axVar = C58833ax.m90834k(new C30212l((C30186an) null, dVar.f82460d, (String) null, 3));
                } else {
                    axVar = C58836b.f156633a;
                }
                jVar.f81672b = axVar;
                obj2 = C58833ax.m90834k(jVar.mo35622a());
            }
        }
        agVar.mo5706i(obj2);
    }
}
