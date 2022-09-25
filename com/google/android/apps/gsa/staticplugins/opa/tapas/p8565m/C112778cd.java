package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cd */
/* compiled from: PG */
final class C112778cd implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ String f312593a;

    /* renamed from: b */
    final /* synthetic */ C113415ez f312594b;

    /* renamed from: c */
    final /* synthetic */ C112779ce f312595c;

    public C112778cd(C112779ce ceVar, String str, C113415ez ezVar) {
        this.f312595c = ceVar;
        this.f312593a = str;
        this.f312594b = ezVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = (TextView) view;
        if (textView.getLineCount() == 2 && textView.getLayout().getEllipsisCount(1) > 0) {
            textView.setText(this.f312595c.mo99738j(this.f312593a, this.f312594b.mo100199L(), this.f312594b.mo100221u(), true));
        }
        textView.removeOnLayoutChangeListener(this);
    }
}
