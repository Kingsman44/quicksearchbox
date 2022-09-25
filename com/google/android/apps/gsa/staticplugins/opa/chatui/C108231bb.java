package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bb */
/* compiled from: PG */
final class C108231bb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f301022a;

    public C108231bb(ViewGroup viewGroup) {
        this.f301022a = viewGroup;
    }

    public final void onClick(View view) {
        ViewGroup viewGroup = this.f301022a;
        if (viewGroup.getVisibility() == 0) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
        }
    }
}
