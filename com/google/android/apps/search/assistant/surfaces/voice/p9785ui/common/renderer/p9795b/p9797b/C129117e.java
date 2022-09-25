package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C129117e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354707a;

    public /* synthetic */ C129117e(C129123k kVar) {
        this.f354707a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C129123k kVar = this.f354707a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return kVar.f354717d.mo20104b(((C34890k) axVar.mo56107c()).mo39602a(), true);
        }
        throw new IllegalStateException("Failed to initialize carousel, no message data in the cache");
    }
}
