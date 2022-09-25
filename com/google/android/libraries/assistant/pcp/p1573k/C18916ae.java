package com.google.android.libraries.assistant.pcp.p1573k;

import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.ae */
/* compiled from: PG */
public final /* synthetic */ class C18916ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18921aj f53206a;

    public /* synthetic */ C18916ae(C18921aj ajVar) {
        this.f53206a = ajVar;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        Bundle a = ((MediaBrowserCompat) this.f53206a.f53220d.get()).mo797a();
        boolean z = false;
        if (a != null && a.getBoolean("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement", false)) {
            z = true;
        }
        C59104x b = C18921aj.f53217a.mo56224b();
        Boolean valueOf = Boolean.valueOf(z);
        ((C59052c) ((C59052c) b).mo56372aa(47368)).mo56389s("#isYoutubeMusicPremium output: %s", valueOf);
        return Optional.m71637of(valueOf);
    }
}
