package com.google.android.apps.gsa.staticplugins.bisto.p7464ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ab.d */
/* compiled from: PG */
public final /* synthetic */ class C94805d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94809h f265100a;

    /* renamed from: b */
    public final /* synthetic */ String f265101b = "en-us-x-hol-local";

    /* renamed from: c */
    public final /* synthetic */ String f265102c;

    public /* synthetic */ C94805d(C94809h hVar, String str) {
        this.f265100a = hVar;
        this.f265102c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94809h hVar = this.f265100a;
        String str = this.f265101b;
        String str2 = this.f265102c;
        C59104x c = C94809h.f265108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(16917)).mo56386p("Failed to retrieve Assistant Voice Setting from server");
        if (C58837ba.m90859h(hVar.f265112e.mo85402g(str2, BuildConfig.FLAVOR))) {
            C59104x b = C94809h.f265108a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
            ((C59052c) ((C59052c) b).mo56372aa(16921)).mo56354G("%s Falling back to default: %s", str2, str);
            C90875ai.m148465b(C94806e.f265103a, hVar.mo88621b(str2, str), hVar.f265111d, "Notify Setting Changed").mo85223a(C94807f.f265104a);
        }
    }
}
