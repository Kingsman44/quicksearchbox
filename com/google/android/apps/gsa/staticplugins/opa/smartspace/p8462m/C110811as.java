package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import android.util.Pair;
import com.google.android.apps.gsa.opa.smartspace.C83782e;
import com.google.android.apps.gsa.opa.smartspace.C83786f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.as */
/* compiled from: PG */
public final /* synthetic */ class C110811as implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C110811as f308726a = new C110811as();

    private /* synthetic */ C110811as() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar;
        Pair pair = (Pair) obj;
        C83782e eVar = new C83782e();
        eVar.mo77100a(C58485gu.m89845m());
        eVar.mo77101b(C58485gu.m89845m());
        eVar.mo77100a(C58485gu.m89842j((Collection) pair.second));
        eVar.mo77101b(C58485gu.m89842j((Collection) pair.first));
        C58485gu guVar2 = eVar.f228360a;
        if (guVar2 != null && (guVar = eVar.f228361b) != null) {
            return C60856cj.m92900i(new C83786f(guVar2, guVar));
        }
        StringBuilder sb = new StringBuilder();
        if (eVar.f228360a == null) {
            sb.append(" smartspaceCardsList");
        }
        if (eVar.f228361b == null) {
            sb.append(" smartspaceChipsList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
