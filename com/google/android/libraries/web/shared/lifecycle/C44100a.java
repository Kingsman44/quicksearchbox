package com.google.android.libraries.web.shared.lifecycle;

import android.support.p031v4.app.Fragment;
import com.google.common.base.C58893dc;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.a */
/* compiled from: PG */
public final /* synthetic */ class C44100a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C44106g f114789a;

    /* renamed from: b */
    public final /* synthetic */ Class f114790b;

    /* renamed from: c */
    public final /* synthetic */ BiConsumer f114791c;

    public /* synthetic */ C44100a(C44106g gVar, Class cls, BiConsumer biConsumer) {
        this.f114789a = gVar;
        this.f114790b = cls;
        this.f114791c = biConsumer;
    }

    public final void accept(Object obj) {
        C44106g gVar = this.f114789a;
        Class cls = this.f114790b;
        BiConsumer biConsumer = this.f114791c;
        Fragment fragment = (Fragment) obj;
        if (gVar.f114808c == null) {
            gVar.f114808c = new WebModelProvider(fragment).mo47072a(cls);
            fragment.getLifecycle().mo5790b(new WebFragmentModelMixin$1(gVar));
        }
        C44107h hVar = gVar.f114808c;
        C58893dc.m90996a(hVar);
        biConsumer.accept(fragment, hVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
