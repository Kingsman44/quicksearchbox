package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.android.apps.gsa.assistant.shared.k.a.h;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.g */
/* compiled from: PG */
public final /* synthetic */ class C106382g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106391p f296733a;

    /* renamed from: b */
    public final /* synthetic */ String f296734b;

    public /* synthetic */ C106382g(C106391p pVar, String str) {
        this.f296733a = pVar;
        this.f296734b = str;
    }

    public final Object apply(Object obj) {
        C106391p pVar = this.f296733a;
        d dVar = (d) obj;
        String num = Integer.toString(C91042a.m148717a(this.f296734b));
        num.getClass();
        if (!dVar.b.containsKey(num)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        h hVar = (h) Collections.unmodifiableMap(dVar.b).get(num);
        if (hVar == null || (hVar.a & 1) == 0 || hVar.b < ((int) pVar.f296745c.mo79743a(C90037cp.f248495bW))) {
            return true;
        }
        return false;
    }
}
