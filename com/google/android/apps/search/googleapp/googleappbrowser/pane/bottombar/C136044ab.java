package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ab */
/* compiled from: PG */
public final /* synthetic */ class C136044ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136053ak f370504a;

    public /* synthetic */ C136044ab(C136053ak akVar) {
        this.f370504a = akVar;
    }

    public final void accept(Object obj) {
        ((C136059ap) obj).f370544a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f370504a.f370514b.requireView().findViewById(R.id.googleapp_browser_bottomsheet_container)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
