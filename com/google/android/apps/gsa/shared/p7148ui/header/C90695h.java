package com.google.android.apps.gsa.shared.p7148ui.header;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a.C93995s;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.h */
/* compiled from: PG */
public final /* synthetic */ class C90695h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LogoHeaderView f253697a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f253698b;

    public /* synthetic */ C90695h(LogoHeaderView logoHeaderView, View.OnClickListener onClickListener) {
        this.f253697a = logoHeaderView;
        this.f253698b = onClickListener;
    }

    public final void onClick(View view) {
        LogoHeaderView logoHeaderView = this.f253697a;
        View.OnClickListener onClickListener = this.f253698b;
        logoHeaderView.f253638j.mo84539b(view, 2);
        ((C93995s) onClickListener).f262518a.mo88273k();
    }
}
