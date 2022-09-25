package com.google.android.libraries.assistant.pcp.p1557g;

import com.google.assistant.p3994s.p3995a.C53109bs;
import com.google.assistant.p3994s.p3995a.C53453ol;
import com.google.assistant.p3994s.p3995a.C53459or;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.j */
/* compiled from: PG */
public final /* synthetic */ class C18771j implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18771j f52888a = new C18771j();

    private /* synthetic */ C18771j() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || (((C53459or) optional.get()).f140309a & 1) == 0) {
            return Optional.empty();
        }
        C53453ol olVar = ((C53459or) optional.get()).f140311c;
        if (olVar == null) {
            olVar = C53453ol.f140292b;
        }
        C53109bs bsVar = olVar.f140294a;
        if (bsVar == null) {
            bsVar = C53109bs.f139176a;
        }
        return Optional.m71637of(bsVar);
    }
}
