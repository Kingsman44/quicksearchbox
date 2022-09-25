package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.support.p031v4.app.C0213ce;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.g */
/* compiled from: PG */
public final /* synthetic */ class C136089g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C0213ce f370635a;

    public /* synthetic */ C136089g(C0213ce ceVar) {
        this.f370635a = ceVar;
    }

    public final void accept(Object obj) {
        this.f370635a.mo511h(R.id.googleapp_browser_bottombar_action_buttons, (Fragment) obj, "GAB_ACTION_FRAGMENT", 1);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
