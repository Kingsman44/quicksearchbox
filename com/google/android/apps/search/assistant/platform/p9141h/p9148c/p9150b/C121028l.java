package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.b.l */
/* compiled from: PG */
final class C121028l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f336402a;

    /* renamed from: b */
    final /* synthetic */ C121029m f336403b;

    public C121028l(C121029m mVar, AtomicBoolean atomicBoolean) {
        this.f336403b = mVar;
        this.f336402a = atomicBoolean;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C121029m.f336404a.mo56226d()).mo56372aa(35686)).mo56386p("Failed to notify about the update of assistant enabled settings");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f336402a.get()) {
            Collection.EL.stream((Set) this.f336403b.f336405b.mo27525b()).forEach(C121026j.f336399a);
        }
    }
}
