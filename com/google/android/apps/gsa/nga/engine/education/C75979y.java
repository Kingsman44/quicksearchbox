package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.y */
/* compiled from: PG */
public final /* synthetic */ class C75979y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210787a;

    /* renamed from: b */
    public final /* synthetic */ String f210788b;

    public /* synthetic */ C75979y(C75688am amVar, String str) {
        this.f210787a = amVar;
        this.f210788b = str;
    }

    public final void accept(Object obj) {
        C75688am amVar = this.f210787a;
        String str = this.f210788b;
        amVar.f210103f.mo74271b(C89849ae.FRE_SELECTED_MODE_SUGGESTION_FETCH_SUCCESS);
        C80905at.m128763g(amVar.f210108k.mo74906v(str, ((C75650ai) obj).mo71806j()), C75753h.f210237a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
