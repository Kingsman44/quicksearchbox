package com.google.android.apps.gsa.staticplugins.opa.p8172a;

import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a.c */
/* compiled from: PG */
public final class C105911c implements C105916h {

    /* renamed from: a */
    private static final C58528ij f295715a = C58528ij.m90014N("media.PLAY_MEDIA", "media.NEXT", "media.PREVIOUS", "media.PAUSE", "media.RESUME");

    /* renamed from: b */
    private final C68214a f295716b;

    /* renamed from: c */
    private final C58881cr f295717c;

    public C105911c(C68214a aVar, C58881cr crVar) {
        this.f295716b = aVar;
        this.f295717c = crVar;
    }

    /* renamed from: b */
    public final boolean mo95178b(C52081en enVar) {
        z zVar = (z) ((C73798aa) ((C58833ax) this.f295716b.mo27525b()).mo56107c()).mo65278b().mo3842a();
        if (((Boolean) this.f295717c.mo6453a()).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (zVar == null || zVar == z.a) {
            return false;
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C58528ij ijVar = f295715a;
                C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (ijVar.contains(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo95179c() {
        return 1;
    }

    /* renamed from: d */
    public final C51809dy mo95180d() {
        return C109725c.m182678b("stay_in_immersive", new C52232kc[0]);
    }
}
