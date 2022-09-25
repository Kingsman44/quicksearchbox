package com.google.android.apps.search.assistant.platform.p9080f.p9111h.p9112a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C120706b implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C120706b f335713a = new C120706b();

    private /* synthetic */ C120706b() {
    }

    public final C60870cx apply(Object obj) {
        C59104x d = C120710f.f335718a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.Locale");
        ((C59052c) ((C59052c) d).mo56372aa(35575)).mo56389s("Fetching locale failed from Context API: %s", ((Throwable) obj).getMessage());
        return C60856cj.m92900i(Optional.empty());
    }
}
