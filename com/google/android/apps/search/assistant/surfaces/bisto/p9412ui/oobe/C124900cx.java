package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.GlifLayout;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cx */
/* compiled from: PG */
public final /* synthetic */ class C124900cx implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ GlifLayout f344615a;

    public /* synthetic */ C124900cx(GlifLayout glifLayout) {
        this.f344615a = glifLayout;
    }

    public final void accept(Object obj) {
        ((TextView) this.f344615a.findViewById(R.id.assistant_bisto_oobe_generic_footer)).setText((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
