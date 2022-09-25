package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ae */
/* compiled from: PG */
public final /* synthetic */ class C116441ae implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ Snackbar f322876a;

    public /* synthetic */ C116441ae(Snackbar snackbar) {
        this.f322876a = snackbar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        Snackbar snackbar = this.f322876a;
        TextView textView = (TextView) snackbar.findViewById(R.id.save_snackbar_message);
        textView.setText((String) obj);
        textView.post(new C116448al(snackbar, textView));
    }
}
