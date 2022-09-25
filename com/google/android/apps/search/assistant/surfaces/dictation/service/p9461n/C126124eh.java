package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.al;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.eh */
/* compiled from: PG */
public final /* synthetic */ class C126124eh implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347556a;

    /* renamed from: b */
    public final /* synthetic */ Optional f347557b;

    public /* synthetic */ C126124eh(C126141ey eyVar, Optional optional) {
        this.f347556a = eyVar;
        this.f347557b = optional;
    }

    public final Object apply(Object obj) {
        C126141ey eyVar = this.f347556a;
        al alVar = (al) obj;
        if (!eyVar.f347589c.mo107376c((C126140ex) this.f347557b.get())) {
            return null;
        }
        eyVar.mo107378l("sending incremental UI", new C126127ek(eyVar, alVar));
        return null;
    }
}
