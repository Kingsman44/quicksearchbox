package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9968c;

import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.c.g */
/* compiled from: PG */
public final /* synthetic */ class C131286g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131292m f358949a;

    public /* synthetic */ C131286g(C131292m mVar) {
        this.f358949a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C131292m mVar = this.f358949a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return mVar.f358959c.mo110131e((C50818do) optional.get());
    }
}
