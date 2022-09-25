package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ak */
/* compiled from: PG */
public final /* synthetic */ class C98586ak implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C98586ak f275349a = new C98586ak();

    private /* synthetic */ C98586ak() {
    }

    public final Object apply(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        C59104x d = C98590ao.f275355a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "IsGoogleDefaultTask");
        ((C59052c) ((C59052c) d).mo56372aa(19101)).mo56386p("Timed out.");
        return C118826c.f331422a;
    }
}
