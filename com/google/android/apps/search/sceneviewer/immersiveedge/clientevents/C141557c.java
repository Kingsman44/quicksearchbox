package com.google.android.apps.search.sceneviewer.immersiveedge.clientevents;

import com.google.android.apps.search.sceneviewer.p10650e.C141547a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.c */
/* compiled from: PG */
public final /* synthetic */ class C141557c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ UserActionManager f384226a;

    /* renamed from: b */
    public final /* synthetic */ int f384227b;

    public /* synthetic */ C141557c(UserActionManager userActionManager, int i) {
        this.f384226a = userActionManager;
        this.f384227b = i;
    }

    public final Object apply(Object obj) {
        this.f384226a.sendSideChannelEventReturnCode(this.f384227b, ((C141547a) obj).getNumber());
        return null;
    }
}
