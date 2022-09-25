package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.jni.l */
/* compiled from: PG */
public final /* synthetic */ class C124360l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124362n f343266a;

    /* renamed from: b */
    public final /* synthetic */ C124206v f343267b;

    public /* synthetic */ C124360l(C124362n nVar, C124206v vVar) {
        this.f343266a = nVar;
        this.f343267b = vVar;
    }

    public final void run() {
        C124362n nVar = this.f343266a;
        C124206v vVar = this.f343267b;
        WholeHomeJniNative wholeHomeJniNative = nVar.f343271b;
        wholeHomeJniNative.nativeHandleOnRemoteExecutionResponse(wholeHomeJniNative.f343242c, vVar.toByteArray());
    }
}
