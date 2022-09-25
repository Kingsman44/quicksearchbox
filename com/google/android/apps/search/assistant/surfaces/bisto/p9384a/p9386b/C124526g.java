package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142390do;
import com.google.android.p10712d.C142413ek;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.b.g */
/* compiled from: PG */
public final class C124526g {
    /* renamed from: a */
    public static boolean m203993a(C124548d dVar) {
        if (!dVar.mo106526x().f386154g) {
            return true;
        }
        C142390do z = dVar.mo106528z();
        C58976aa aaVar = C58975e.f156826a;
        if (z.equals(C142390do.ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_SINGULAR) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_BOTH) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_LEFT) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_RIGHT)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m203994b(C124548d dVar) {
        if (!m203993a(dVar)) {
            return false;
        }
        if (!dVar.mo106526x().f386154g) {
            return true;
        }
        C142390do z = dVar.mo106528z();
        C142413ek B = dVar.mo106461B();
        C58976aa aaVar = C58975e.f156826a;
        if (z.equals(C142390do.ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_SINGULAR) || z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_BOTH) || ((z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_LEFT) && !B.equals(C142413ek.OHD_RIGHT_DETECTED)) || (z.equals(C142390do.ASSISTANT_GESTURE_AVAILABLE_RIGHT) && !B.equals(C142413ek.OHD_LEFT_DETECTED)))) {
            return true;
        }
        return false;
    }
}
