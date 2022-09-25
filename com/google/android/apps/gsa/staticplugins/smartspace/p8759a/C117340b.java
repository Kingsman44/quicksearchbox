package com.google.android.apps.gsa.staticplugins.smartspace.p8759a;

import com.google.assistant.p3886c.C50817dn;
import com.google.assistant.p3886c.C50818do;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.a.b */
/* compiled from: PG */
public final class C117340b implements Comparator {
    /* renamed from: a */
    private static float m194989a(C50818do doVar) {
        C50817dn dnVar = doVar.f132295A;
        if (dnVar == null) {
            dnVar = C50817dn.f132287e;
        }
        if ((dnVar.f132289a & 1) == 0) {
            return -1.0f;
        }
        C50817dn dnVar2 = doVar.f132295A;
        if (dnVar2 == null) {
            dnVar2 = C50817dn.f132287e;
        }
        return dnVar2.f132290b;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(m194989a((C50818do) obj), m194989a((C50818do) obj2));
    }
}
