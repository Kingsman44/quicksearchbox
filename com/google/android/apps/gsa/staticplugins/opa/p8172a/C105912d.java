package com.google.android.apps.gsa.staticplugins.opa.p8172a;

import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a.d */
/* compiled from: PG */
public final class C105912d implements C105916h {

    /* renamed from: a */
    private static final C58528ij f295718a = new C58759qy("media.PLAY_MEDIA");

    /* renamed from: b */
    private final C68214a f295719b;

    /* renamed from: c */
    private final C68214a f295720c;

    /* renamed from: d */
    private final C58881cr f295721d;

    public C105912d(C68214a aVar, C68214a aVar2, C58881cr crVar) {
        this.f295719b = aVar;
        this.f295720c = aVar2;
        this.f295721d = crVar;
    }

    /* renamed from: b */
    public final boolean mo95178b(C52081en enVar) {
        z zVar;
        if (!((Boolean) this.f295721d.mo6453a()).booleanValue() && (!((C86124t) this.f295719b.mo27525b()).mo79746e(C90014bt.f247199ce) || (zVar = (z) ((C73798aa) ((C58833ax) this.f295720c.mo27525b()).mo56107c()).mo65278b().mo3842a()) == null || zVar == z.a)) {
            return false;
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C58528ij ijVar = f295718a;
                C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (((C58759qy) ijVar).f156534a.equals(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo95179c() {
        return 2;
    }

    /* renamed from: d */
    public final C51809dy mo95180d() {
        return C109725c.m182677a("opa_android.SHOW_AMBIENT_MEDIA_IMMERSIVE", new C52232kc[0]);
    }
}
