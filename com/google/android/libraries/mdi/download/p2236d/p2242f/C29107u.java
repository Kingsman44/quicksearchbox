package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import com.google.android.libraries.mdi.download.p2236d.C29237jq;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.storage.protostore.C42936cd;
import com.google.android.libraries.storage.protostore.C42939cg;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.mdi.download.d.f.u */
/* compiled from: PG */
public final class C29107u {
    /* renamed from: a */
    public static C43019v m54028a(Context context, C60887da daVar, C29037d dVar, C29237jq jqVar, C58833ax axVar) {
        C42936cd d = C42939cg.m75826d(context, daVar);
        d.f112321c = C29111y.m54041d("gms_icing_mdd_groups", axVar);
        d.mo46008b();
        d.f112325g = new C29106t(jqVar);
        d.mo46009c(new C29105s(dVar));
        return d.mo46007a();
    }

    /* renamed from: b */
    public static C43019v m54029b(Context context, C60887da daVar, C29037d dVar, C29237jq jqVar, C58833ax axVar) {
        C42936cd d = C42939cg.m75826d(context, daVar);
        d.f112321c = C29111y.m54041d("gms_icing_mdd_shared_files", axVar);
        d.mo46008b();
        d.f112325g = new C29106t(jqVar);
        d.mo46009c(new C29104r(dVar));
        return d.mo46007a();
    }
}
