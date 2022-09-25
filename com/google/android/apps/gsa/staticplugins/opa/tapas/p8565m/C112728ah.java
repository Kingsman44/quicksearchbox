package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ah */
/* compiled from: PG */
final class C112728ah extends C0673gh {

    /* renamed from: a */
    final LinearLayout f312494a;

    /* renamed from: b */
    final TextView f312495b;

    /* renamed from: c */
    final TextView f312496c;

    public C112728ah(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.calculator_card);
        this.f312494a = linearLayout;
        this.f312495b = (TextView) view.findViewById(R.id.left_hand);
        this.f312496c = (TextView) view.findViewById(R.id.right_hand);
        linearLayout.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }
}
