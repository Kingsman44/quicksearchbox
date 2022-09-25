package com.google.android.libraries.web.shared.lifecycle;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.common.base.C58893dc;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.c */
/* compiled from: PG */
public final /* synthetic */ class C44102c implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C44103d f114794a;

    public /* synthetic */ C44102c(C44103d dVar) {
        this.f114794a = dVar;
    }

    public final void accept(Object obj, Object obj2) {
        C44103d dVar = this.f114794a;
        Fragment fragment = (Fragment) obj;
        C44107h hVar = (C44107h) obj2;
        if (dVar.f114795a != null && dVar.f114798d.f114806a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            Consumer consumer = dVar.f114795a;
            C58893dc.m90996a(consumer);
            consumer.accept(hVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
