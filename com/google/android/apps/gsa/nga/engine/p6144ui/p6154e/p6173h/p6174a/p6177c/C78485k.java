package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.k */
/* compiled from: PG */
final class C78485k extends C78379bb {

    /* renamed from: a */
    private Optional f216146a = Optional.empty();

    /* renamed from: b */
    private C78391bn f216147b;

    /* renamed from: a */
    public final C78380bc mo73317a() {
        C78391bn bnVar = this.f216147b;
        if (bnVar != null) {
            return new C78486l(this.f216146a, bnVar);
        }
        throw new IllegalStateException("Missing required properties: baseStageInput");
    }

    /* renamed from: b */
    public final void mo73318b(C78391bn bnVar) {
        if (bnVar != null) {
            this.f216147b = bnVar;
            return;
        }
        throw new NullPointerException("Null baseStageInput");
    }

    /* renamed from: c */
    public final void mo73319c(Optional optional) {
        if (optional != null) {
            this.f216146a = optional;
            return;
        }
        throw new NullPointerException("Null lastTranscriptionChangeInstant");
    }
}
