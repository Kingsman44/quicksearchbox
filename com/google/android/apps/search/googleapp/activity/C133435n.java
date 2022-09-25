package com.google.android.apps.search.googleapp.activity;

import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.p10115a.p10116a.C133074a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.activity.n */
/* compiled from: PG */
public final /* synthetic */ class C133435n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f363581a;

    public /* synthetic */ C133435n(ViewGroup viewGroup) {
        this.f363581a = viewGroup;
    }

    public final void accept(Object obj) {
        ViewGroup viewGroup = this.f363581a;
        C58974d dVar = C133444w.f363591a;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.googleapp_content_wrapper);
        ((C133074a) obj).mo110969a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
