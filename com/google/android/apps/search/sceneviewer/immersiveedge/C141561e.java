package com.google.android.apps.search.sceneviewer.immersiveedge;

import com.google.android.libraries.p579ar.sceneviewer.utilities.ThreadPools;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.e */
/* compiled from: PG */
public final /* synthetic */ class C141561e implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C141562f f384232a;

    public /* synthetic */ C141561e(C141562f fVar) {
        this.f384232a = fVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        String str = this.f384232a.f384234b;
        ((C59052c) ((C59052c) C141562f.f384233a.mo56224b()).mo56372aa(41733)).mo56389s("Loading ui config from %s", str);
        C141560d dVar = new C141560d(str);
        return new C46463o(new C60817ay(C60856cj.m92904m(C47810es.m84978r(dVar), ThreadPools.getThreadPoolExecutor())));
    }
}
