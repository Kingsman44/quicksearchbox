package com.google.android.apps.gsa.shared.p7148ui.p7152d;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;

/* renamed from: com.google.android.apps.gsa.shared.ui.d.d */
/* compiled from: PG */
public final class C90671d {

    /* renamed from: a */
    public final Context f253560a;

    /* renamed from: b */
    public final C87680ah f253561b;

    /* renamed from: c */
    public final C58881cr f253562c = C58886cw.m90973a(new C90669b(this));

    public C90671d(Context context, C87680ah ahVar) {
        this.f253560a = context;
        this.f253561b = ahVar;
    }

    /* renamed from: a */
    public final void mo84966a(boolean z) {
        int i;
        View view = (View) this.f253562c.mo6453a();
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.network_status_label);
        TextView textView = (TextView) view.findViewById(R.id.get_latest_button);
        if (z) {
            relativeLayout.setVisibility(8);
            textView.setVisibility(0);
            i = 22789;
        } else {
            relativeLayout.setVisibility(0);
            textView.setVisibility(8);
            i = 22788;
        }
        C28295m.m52919e(view, new C28292j(i));
    }
}
