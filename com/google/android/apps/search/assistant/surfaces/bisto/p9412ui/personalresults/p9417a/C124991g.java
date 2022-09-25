package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults.p9417a;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.g */
/* compiled from: PG */
public final /* synthetic */ class C124991g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ View f344881a;

    public /* synthetic */ C124991g(View view) {
        this.f344881a = view;
    }

    public final void accept(Object obj) {
        ((TextView) this.f344881a.findViewById(R.id.assistant_title)).setText((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
