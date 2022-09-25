package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.view.View;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.c */
/* compiled from: PG */
public final class C141270c {

    /* renamed from: a */
    private final C47770dh f383540a;

    /* renamed from: b */
    private final View f383541b;

    public C141270c(C47770dh dhVar, View view) {
        this.f383540a = dhVar;
        this.f383541b = view;
    }

    /* renamed from: a */
    public final void mo116292a(C140646b bVar) {
        if (bVar.f382007m) {
            this.f383541b.setSelected(true);
            View view = this.f383541b;
            view.setContentDescription(view.getContext().getString(R.string.podcasts_confirm_unsubscribe_button_label));
            this.f383541b.setOnClickListener(new C47591co(this.f383540a, "Unsubscribe from show header action item", new C141268a(this, bVar)));
        } else {
            this.f383541b.setSelected(false);
            View view2 = this.f383541b;
            view2.setContentDescription(view2.getContext().getString(R.string.podcasts_subscribe_button_label));
            this.f383541b.setOnClickListener(new C47591co(this.f383540a, "Subscribe from show header action item", new C141269b(this, bVar)));
        }
        this.f383541b.setVisibility(0);
    }
}
