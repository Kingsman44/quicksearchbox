package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.n */
/* compiled from: PG */
public final /* synthetic */ class C123896n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342218a;

    public /* synthetic */ C123896n(C123904v vVar) {
        this.f342218a = vVar;
    }

    public final C60870cx apply(Object obj) {
        C123904v vVar = this.f342218a;
        Optional optional = (Optional) obj;
        boolean z = false;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(false);
        }
        if (((C123751br) optional.get()).f341829b > vVar.f342244h.mo26870b() && ((C123751br) optional.get()).f341829b - vVar.f342244h.mo26870b() < C123904v.f342238b) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
