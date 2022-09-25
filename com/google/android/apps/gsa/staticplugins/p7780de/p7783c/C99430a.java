package com.google.android.apps.gsa.staticplugins.p7780de.p7783c;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99431a;
import com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99432b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.c.a */
/* compiled from: PG */
public final class C99430a {

    /* renamed from: a */
    public static final C58485gu f278220a = C58485gu.m89847o(C99431a.MAIN_CONTENT, C99431a.MAIN_CONTENT_OVERLAY);

    /* renamed from: a */
    public static C90208n m164908a(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C90208n.NO_TAB;
        }
        for (C90208n nVar : C90208n.values()) {
            if (axVar.equals(m164909b(nVar)) && nVar != C90208n.UNKNOWN_TAB) {
                return nVar;
            }
        }
        return C90208n.NO_TAB;
    }

    /* renamed from: b */
    public static C58833ax m164909b(C90208n nVar) {
        C99432b bVar = C99432b.INVALID_SURFACE;
        C90208n nVar2 = C90208n.UNKNOWN_TAB;
        int ordinal = nVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return C58833ax.m90834k(C99432b.INTEREST_FEED);
        }
        if (ordinal == 2) {
            return C58833ax.m90834k(C99432b.LEGACY_UPCOMING);
        }
        if (ordinal == 4) {
            return C58833ax.m90834k(C99432b.SRP);
        }
        if (ordinal == 6) {
            return C58833ax.m90834k(C99432b.DRAWER);
        }
        if (ordinal != 7) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(C99432b.COLLECTIONS);
    }

    /* renamed from: c */
    public static boolean m164910c(C99432b bVar) {
        C99432b bVar2 = C99432b.INVALID_SURFACE;
        C90208n nVar = C90208n.UNKNOWN_TAB;
        int ordinal = bVar.ordinal();
        return ordinal == 1 || ordinal == 6 || ordinal == 3 || ordinal == 4;
    }
}
