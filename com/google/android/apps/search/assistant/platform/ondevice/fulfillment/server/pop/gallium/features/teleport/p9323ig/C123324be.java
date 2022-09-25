package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.be */
/* compiled from: PG */
public final /* synthetic */ class C123324be implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C123324be f341074a = new C123324be();

    private /* synthetic */ C123324be() {
    }

    public final Object apply(Object obj) {
        C79891m mVar = (C79891m) obj;
        if (!mVar.f218979c.isEmpty()) {
            String str = mVar.f218979c;
            return false;
        } else if (mVar.f218978b.size() == 1) {
            return Boolean.valueOf(((Boolean) Optional.m71637of(Float.valueOf(0.5f)).map(new C123323bd((C79890l) mVar.f218978b.get(0))).orElse(false)).booleanValue());
        } else {
            mVar.f218978b.size();
            return false;
        }
    }
}
