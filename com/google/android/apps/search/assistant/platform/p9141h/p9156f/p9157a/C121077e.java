package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121072a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.e */
/* compiled from: PG */
final class C121077e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f336485a;

    /* renamed from: b */
    final /* synthetic */ C121079g f336486b;

    public C121077e(C121079g gVar, AtomicBoolean atomicBoolean) {
        this.f336486b = gVar;
        this.f336485a = atomicBoolean;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C121079g.f336488a.mo56226d()).mo56382g(th)).mo56372aa(35704)).mo56386p("Failed to update mobile primary locale");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f336485a.get()) {
            for (C121072a b : (Set) this.f336486b.f336489b.mo27525b()) {
                b.mo104662b();
            }
        }
    }
}
