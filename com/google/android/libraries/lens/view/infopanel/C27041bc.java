package com.google.android.libraries.lens.view.infopanel;

import android.support.p033v7.widget.C0508af;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bc */
/* compiled from: PG */
public final /* synthetic */ class C27041bc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27051bm f73700a;

    /* renamed from: b */
    public final /* synthetic */ View f73701b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f73702c;

    public /* synthetic */ C27041bc(C27051bm bmVar, View view, TextInputLayout textInputLayout) {
        this.f73700a = bmVar;
        this.f73701b = view;
        this.f73702c = textInputLayout;
    }

    public final void onClick(View view) {
        C27051bm bmVar = this.f73700a;
        View view2 = this.f73701b;
        TextInputLayout textInputLayout = this.f73702c;
        bmVar.f73724d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view2));
        ((C0508af) textInputLayout.findViewById(R.id.multimodal_panel_input)).setText(BuildConfig.FLAVOR);
    }
}
