package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.p10923ac.p10924a.C146763f;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.ab */
/* compiled from: PG */
public final /* synthetic */ class C97272ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C97276af f271680a;

    public /* synthetic */ C97272ab(C97276af afVar) {
        this.f271680a = afVar;
    }

    public final Object apply(Object obj) {
        C97276af afVar = this.f271680a;
        C146763f fVar = (C146763f) obj;
        int a = (int) ((C86124t) afVar.f271683b.mo27525b()).mo79743a(C90110fh.f250624aV);
        long b = fVar.mo123591a().mo123608b();
        if (b == -1 || b < afVar.f271686g.mo26871c() - ((long) (a * 1000))) {
            return null;
        }
        return C58833ax.m90833j((C147206h) C58557jl.m90130k((Iterable) fVar.mo123592b(), (Object) null));
    }
}
