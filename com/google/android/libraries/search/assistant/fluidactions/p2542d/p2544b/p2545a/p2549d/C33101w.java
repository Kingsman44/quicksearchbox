package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.p4522b.C58490gz;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.w */
/* compiled from: PG */
public final class C33101w {

    /* renamed from: a */
    public static final Map f88619a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("fluid_action_id_next", m61405a("media.NEXT"));
        gzVar.mo55429h("fluid_action_id_prev", m61405a("media.PREVIOUS"));
        gzVar.mo55429h("fluid_action_id_pause", m61405a("media.PAUSE"));
        gzVar.mo55429h("fluid_action_id_play", m61405a("media.RESUME"));
        f88619a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    private static C51809dy m61405a(String str) {
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136865d = 1;
        hkVar.f136862a |= 16;
        dvVar.mo53733c(C33116d.m61458q("common_media_control_args", "assistant.api.client_op.media_args", hgVar.build()));
        return C33116d.m61445d(str, (C51807dw) dvVar.build());
    }
}
