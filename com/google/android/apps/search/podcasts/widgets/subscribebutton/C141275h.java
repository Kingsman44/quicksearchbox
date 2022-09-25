package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.h */
/* compiled from: PG */
public final class C141275h implements View.OnClickListener {

    /* renamed from: a */
    public static final C141275h f383548a = new C141275h();

    public final void onClick(View view) {
        C44581b bVar = new C44581b(view.getContext(), 0);
        bVar.mo47604w(R.string.podcasts_subscribe_button_label);
        bVar.mo47597p(R.string.podcasts_sign_in_to_subscribe);
        bVar.mo47601t(R.string.podcasts_sign_in_accept, new C141274g(view));
        bVar.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
        C0392m create = bVar.create();
        C69664n.m101060f(create, "v ->\n          val signI…)\n              .create()");
        create.show();
    }
}
