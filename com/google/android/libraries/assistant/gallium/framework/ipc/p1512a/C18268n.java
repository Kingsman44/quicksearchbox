package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.n */
/* compiled from: PG */
public final /* synthetic */ class C18268n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18280z f51846a;

    /* renamed from: b */
    public final /* synthetic */ C58881cr f51847b;

    public /* synthetic */ C18268n(C18280z zVar, C58881cr crVar) {
        this.f51846a = zVar;
        this.f51847b = crVar;
    }

    public final C60870cx apply(Object obj) {
        C18280z zVar = this.f51846a;
        C58881cr crVar = this.f51847b;
        Void voidR = (Void) obj;
        if (!zVar.f51877f.isPresent()) {
            return C60856cj.m92899h(C18218av.m35478a(13, "Handle for writing stream is not set."));
        }
        return (C60870cx) crVar.mo6453a();
    }
}
