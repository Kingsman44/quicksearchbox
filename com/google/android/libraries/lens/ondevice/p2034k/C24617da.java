package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.common.base.C58833ax;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.ondevice.k.da */
/* compiled from: PG */
public final class C24617da {
    /* renamed from: a */
    public static C58833ax m45705a(C24795f fVar, String str) {
        C24814y yVar = fVar.f67751c;
        if (yVar == null) {
            yVar = C24814y.f67826d;
        }
        return C58833ax.m90833j((C24778ak) Collection.EL.stream(yVar.f67830c).filter(new C24614cy(str)).findAny().orElse(null));
    }
}
