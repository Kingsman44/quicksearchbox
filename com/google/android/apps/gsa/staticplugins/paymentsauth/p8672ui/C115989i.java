package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.TextView;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.i */
/* compiled from: PG */
public final /* synthetic */ class C115989i implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ TextView f321646a;

    public /* synthetic */ C115989i(TextView textView) {
        this.f321646a = textView;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        TextView textView = this.f321646a;
        String str = (String) obj;
        if (str.isEmpty()) {
            textView.setVisibility(4);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }
}
