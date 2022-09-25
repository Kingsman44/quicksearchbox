package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.features.p562ao.C10180d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bh */
/* compiled from: PG */
public final /* synthetic */ class C9924bh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f34027a;

    public /* synthetic */ C9924bh(LinearLayout linearLayout) {
        this.f34027a = linearLayout;
    }

    public final void accept(Object obj) {
        LinearLayout linearLayout = this.f34027a;
        View view = (View) obj;
        C58976aa aaVar = C58975e.f156826a;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
        C10180d.m25050b(view);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
