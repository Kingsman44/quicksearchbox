package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.t */
/* compiled from: PG */
public final class C120035t {
    /* renamed from: a */
    public static final C120036u m198938a(Bundle bundle, C120124o oVar) {
        Intent intent;
        C120036u uVar;
        C69664n.m101061g(bundle, "onShowArgs");
        C69664n.m101061g(oVar, "platformVariance");
        Bundle bundle2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            intent = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT", Intent.class);
        } else {
            Parcelable parcelable = bundle.getParcelable("com.google.voicesearch.VI_INTENT");
            intent = parcelable instanceof Intent ? (Intent) parcelable : null;
        }
        if (intent != null) {
            bundle2 = intent.getExtras();
        }
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
            C69664n.m101060f(bundle2, "EMPTY");
        }
        String string = bundle2.getString("REQUIRE_SESSION_VARIANCE");
        if (string != null) {
            uVar = new C120036u(C120124o.m199063a(string), oVar, "EXPLICITLY_REQUIRED");
        } else if (bundle2.getBoolean("nga_programmatic_context_request", false)) {
            uVar = new C120036u(C120124o.CLASSIC, oVar, "NGA_PROGRAMMATIC_CONTEXT_REQUEST");
        } else if (bundle.containsKey("com.google.voicesearch.VI_INTENT")) {
            uVar = new C120036u(C120124o.CLASSIC, oVar, "EXTRA_VOICE_INTERACTION_INTENT");
        } else {
            uVar = new C120036u(oVar, oVar, "CURRENT_PLATFORM_VARIANCE");
        }
        C59052c cVar = (C59052c) C120037v.f334200a.mo56224b();
        cVar.mo56379ah(new C59094n(34636));
        cVar.mo56389s("APA or Classic session decision: %s.", uVar);
        return uVar;
    }
}
