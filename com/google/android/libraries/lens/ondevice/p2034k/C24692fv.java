package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

@C24266a(mo29795a = "ServerTranslateEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.fv */
/* compiled from: PG */
public final class C24692fv implements C24650eg {

    /* renamed from: a */
    private final C24735hk f67531a;

    public C24692fv(C24735hk hkVar) {
        this.f67531a = hkVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24735hk hkVar = this.f67531a;
        C24790aw awVar = fVar.f67755g;
        if (awVar == null) {
            awVar = C24790aw.f67732g;
        }
        hkVar.f67615a = C58833ax.m90834k(awVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final boolean mo29952d(C24795f fVar) {
        C24790aw awVar = fVar.f67755g;
        if (awVar == null) {
            awVar = C24790aw.f67732g;
        }
        if (!awVar.f67735b.equals(this.f67531a.mo29986a().mo56109e("auto"))) {
            return true;
        }
        C24790aw awVar2 = fVar.f67755g;
        if (awVar2 == null) {
            awVar2 = C24790aw.f67732g;
        }
        return !awVar2.f67736c.equals(this.f67531a.mo29987b().mo56109e("en"));
    }
}
