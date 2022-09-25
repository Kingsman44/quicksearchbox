package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.al;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.es */
/* compiled from: PG */
public final /* synthetic */ class C126135es implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347578a;

    /* renamed from: b */
    public final /* synthetic */ long f347579b;

    public /* synthetic */ C126135es(C126141ey eyVar, long j) {
        this.f347578a = eyVar;
        this.f347579b = j;
    }

    public final Object apply(Object obj) {
        C126141ey eyVar = this.f347578a;
        long j = this.f347579b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || j != eyVar.f347590d.get()) {
            return null;
        }
        eyVar.mo107363g((al) optional.get());
        return null;
    }
}
