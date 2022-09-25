package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20670z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.am */
/* compiled from: PG */
public final /* synthetic */ class C98588am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98590ao f275351a;

    public /* synthetic */ C98588am(C98590ao aoVar) {
        this.f275351a = aoVar;
    }

    public final C60870cx apply(Object obj) {
        C98590ao aoVar = this.f275351a;
        C20670z d = ((C20665u) obj).mo25658d();
        if (d == null) {
            C59104x d2 = C98590ao.f275355a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "IsGoogleDefaultTask");
            ((C59052c) ((C59052c) d2).mo56372aa(19103)).mo56386p("CCT session creation failed");
            return C118826c.f331423b;
        }
        C98589an anVar = new C98589an(aoVar, d);
        d.f57940c.f57883a = anVar;
        d.f57938a.mo25660h();
        return anVar.f275352a;
    }
}
