package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.q */
/* compiled from: PG */
public final class C120032q {
    /* renamed from: a */
    public static final C120124o m198936a(Bundle bundle, C120124o oVar) {
        C69664n.m101061g(oVar, "defaultValue");
        if (bundle == null || !bundle.containsKey("PLATFORM_PREFERRED_SESSION_VARIANCE")) {
            return oVar;
        }
        String string = bundle.getString("PLATFORM_PREFERRED_SESSION_VARIANCE", BuildConfig.FLAVOR);
        C69664n.m101060f(string, "args.getString(EXTRA_BAS…INE_SESSION_VARIANCE, \"\")");
        try {
            return C120124o.m199063a(string);
        } catch (RuntimeException unused) {
            C59052c cVar = (C59052c) C120033r.f334194a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Constants");
            cVar.mo56379ah(new C59094n(34635));
            cVar.mo56389s("Failed to parse baseline session variance(%s).", string);
            return oVar;
        }
    }
}
