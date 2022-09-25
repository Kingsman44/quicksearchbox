package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.p */
/* compiled from: PG */
public final /* synthetic */ class C29304p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79425a;

    public /* synthetic */ C29304p(C29314z zVar) {
        this.f79425a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79425a;
        if (!((Boolean) obj).booleanValue()) {
            zVar.f79444e.mo34543h(1036);
            C29045l.m53935g("%s: Failed to write back stale groups!", "ExpirationHandler");
        }
        return C60866ct.f164955a;
    }
}
