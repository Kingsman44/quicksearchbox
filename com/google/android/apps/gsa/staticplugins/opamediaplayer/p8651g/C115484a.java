package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52176ia;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.g.a */
/* compiled from: PG */
public final class C115484a {
    /* renamed from: a */
    public static Intent m191566a(C52176ia iaVar, C86124t tVar) {
        Intent a = C90334c.m146886a(C90332a.DEFAULT.f252281i, new C23129y("opamediaplayer", "root"), C23245b.m43556a(iaVar));
        a.setAction("android.intent.action.VIEW");
        a.setFlags(268468224);
        if (tVar.mo79746e(C90014bt.f247431gy)) {
            a.putExtra("opa_allow_launch_intent_on_lockscreen", true);
        }
        return a;
    }
}
