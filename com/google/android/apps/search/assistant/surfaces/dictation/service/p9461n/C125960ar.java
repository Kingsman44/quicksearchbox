package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ar */
/* compiled from: PG */
public final /* synthetic */ class C125960ar implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126038bc f347180a;

    public /* synthetic */ C125960ar(C126038bc bcVar) {
        this.f347180a = bcVar;
    }

    public final C60870cx apply(Object obj) {
        C126038bc bcVar = this.f347180a;
        if (!((C125160i) obj).equals(C125160i.ELIGIBLE)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C125953ak akVar = new C125953ak(C126038bc.m206092d(bcVar.f347366l, new C125952aj(bcVar)));
        return C60856cj.m92902k(C47810es.m84965e(akVar), bcVar.f347364j.toMillis(), TimeUnit.MILLISECONDS, bcVar.f347361g);
    }
}
