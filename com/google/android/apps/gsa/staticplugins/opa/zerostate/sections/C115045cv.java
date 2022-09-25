package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.assistant.p3994s.p3995a.C53200fb;
import com.google.assistant.p3994s.p3995a.C53250gy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cv */
/* compiled from: PG */
public final class C115045cv implements C114758l {

    /* renamed from: a */
    public final C53250gy f319361a;

    public C115045cv(C53250gy gyVar) {
        this.f319361a = gyVar;
    }

    /* renamed from: b */
    public final int mo101585b() {
        C53200fb fbVar = C53200fb.COMMUTE_DATA;
        int ordinal = C53200fb.m86786a(this.f319361a.f139588a).ordinal();
        if (ordinal == 0) {
            return 13;
        }
        if (ordinal == 1) {
            return 24;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 1 : 25;
        }
        return 6;
    }
}
