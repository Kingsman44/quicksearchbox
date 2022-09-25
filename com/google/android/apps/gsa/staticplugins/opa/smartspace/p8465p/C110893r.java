package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.C83792h;
import com.google.assistant.p3886c.C50738bc;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.r */
/* compiled from: PG */
public final class C110893r implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C50738bc bcVar = (C50738bc) obj;
        C50738bc bcVar2 = (C50738bc) obj2;
        boolean z = bcVar.f132042i;
        int i = -(z == bcVar2.f132042i ? 0 : z ? 1 : -1);
        if (i != 0) {
            return i;
        }
        return C83792h.m133412a(bcVar).compareTo(C83792h.m133412a(bcVar2));
    }
}
