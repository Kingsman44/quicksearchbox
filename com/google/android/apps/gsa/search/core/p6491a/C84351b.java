package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.common.p4552o.C60003j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.search.core.a.b */
/* compiled from: PG */
public final /* synthetic */ class C84351b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C84357c f229567a;

    public /* synthetic */ C84351b(C84357c cVar) {
        this.f229567a = cVar;
    }

    public final void accept(Object obj) {
        C84357c cVar = this.f229567a;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.NGA_IMMEDIATE_ACTION_FIRED;
        fVar.f246204d = ((C60003j) obj).f162172f;
        cVar.mo77896a(fVar.mo83699a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
