package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C22265q {
    /* renamed from: a */
    public static int m41638a(int i) {
        int i2 = C89885b.CRONET_NATIVE_ERROR_VALUE - i;
        if (i2 > 660000 && i2 < 662000) {
            return i2;
        }
        C59104x d = C22266r.f61527a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CronetEngineProvider");
        ((C59052c) ((C59052c) d).mo56372aa(48447)).mo56387q("Cronet error code for a native error out of range: %d", i2);
        int i3 = C90755l.f253831a;
        return C89885b.CRONET_ERROR_CODE_OUT_OF_RANGE_VALUE;
    }
}
