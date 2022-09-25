package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.y */
/* compiled from: PG */
public final /* synthetic */ class C125801y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C60931s f346717a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f346718b;

    public /* synthetic */ C125801y(C60931s sVar, Runnable runnable) {
        this.f346717a = sVar;
        this.f346718b = runnable;
    }

    public final C60870cx apply(Object obj) {
        C60931s sVar = this.f346717a;
        Runnable runnable = this.f346718b;
        Optional optional = (Optional) obj;
        C59071e eVar = C125774an.f346613a;
        if (optional.isPresent()) {
            return sVar.apply((C125422z) optional.get());
        }
        runnable.run();
        return C60866ct.f164955a;
    }
}
