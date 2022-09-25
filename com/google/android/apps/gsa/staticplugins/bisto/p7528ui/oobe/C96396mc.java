package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mc */
/* compiled from: PG */
public final /* synthetic */ class C96396mc implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96397md f269682a;

    public /* synthetic */ C96396mc(C96397md mdVar) {
        this.f269682a = mdVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C96397md mdVar = this.f269682a;
        C124548d dVar = (C124548d) obj;
        String str = mdVar.f269683a;
        if (!C89643n.m145920e(dVar)) {
            cxVar = C60856cj.m92900i(1);
        } else {
            cxVar = mdVar.f269685c.mo83518b(str);
        }
        return C60922j.m93045h(C60838bs.m92859i(cxVar), new C96395mb(mdVar, str, dVar), mdVar.f269686d);
    }
}
