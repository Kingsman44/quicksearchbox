package com.google.android.apps.search.sceneviewer.immersiveedge;

import com.google.android.libraries.p579ar.sceneviewer.utilities.ThreadPools;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.g */
/* compiled from: PG */
public final /* synthetic */ class C141563g implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C141565i f384236a;

    public /* synthetic */ C141563g(C141565i iVar) {
        this.f384236a = iVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        String str = this.f384236a.f384239b;
        ((C59052c) ((C59052c) C141565i.f384238a.mo56224b()).mo56372aa(41736)).mo56389s("Loading ui config from %s", str);
        C141564h hVar = new C141564h(str);
        return new C46463o(new C60817ay(C60856cj.m92904m(C47810es.m84978r(hVar), ThreadPools.getThreadPoolExecutor())));
    }
}
