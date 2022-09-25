package com.google.android.libraries.web.shared.lifecycle;

import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.d */
/* compiled from: PG */
public final class C44103d {

    /* renamed from: a */
    public Consumer f114795a;

    /* renamed from: b */
    public Consumer f114796b;

    /* renamed from: c */
    public boolean f114797c = false;

    /* renamed from: d */
    final /* synthetic */ C44106g f114798d;

    /* renamed from: e */
    private final Class f114799e;

    public C44103d(C44106g gVar, Class cls) {
        this.f114798d = gVar;
        this.f114799e = cls;
    }

    /* renamed from: a */
    public final void mo47075a(String str) {
        C58838bb.m90887v(!this.f114798d.f114806a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "%s must be called at Fragment#onCreate.", str);
        C44106g gVar = this.f114798d;
        C43751j.m77264a(gVar.f114806a).mo46776c(new C44100a(gVar, this.f114799e, new C44102c(this)));
        Consumer consumer = this.f114795a;
        if (consumer != null) {
            C44106g gVar2 = this.f114798d;
            Consumer consumer2 = this.f114796b;
            C58893dc.m90996a(consumer2);
            gVar2.f114806a.getLifecycle().mo5790b(new WebFragmentModelMixin$2(gVar2, this.f114797c, consumer, consumer2));
        }
    }
}
