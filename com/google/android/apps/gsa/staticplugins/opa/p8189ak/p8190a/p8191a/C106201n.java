package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.opa.p8345bl.C108098d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C106201n implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296375a;

    public /* synthetic */ C106201n(C106203p pVar) {
        this.f296375a = pVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C106203p pVar = this.f296375a;
        C108098d dVar = (C108098d) ((Optional) pVar.f296394r.mo27525b()).get();
        Intent flags = new Intent().setClassName(dVar.f300682a, "com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.LongPressPowerContextualEduActivity").setFlags(268435456);
        flags.putExtra("intent_extra_animated_buttons_max_size", dVar.f300683b.mo79743a(C90053de.f248984q));
        flags.putExtra("intent_extra_animated_top_button_margin_top", dVar.f300683b.mo79743a(C90053de.f248986s));
        flags.putExtra("intent_extra_animated_bottom_button_margin_top", dVar.f300683b.mo79743a(C90053de.f248985r));
        pVar.f296377a.startActivity(flags);
        return C118826c.f331422a;
    }
}
