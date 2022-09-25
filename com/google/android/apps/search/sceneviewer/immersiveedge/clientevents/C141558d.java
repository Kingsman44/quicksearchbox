package com.google.android.apps.search.sceneviewer.immersiveedge.clientevents;

import com.google.android.libraries.p579ar.sceneviewer.common.function.TriConsumer;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.d */
/* compiled from: PG */
public final /* synthetic */ class C141558d implements TriConsumer {

    /* renamed from: a */
    public static final /* synthetic */ C141558d f384228a = new C141558d();

    private /* synthetic */ C141558d() {
    }

    public final void accept(Object obj, Object obj2, Object obj3) {
        UserActionManager.nSendSideChannelEventReturnCode(((Long) obj).longValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
    }
}
