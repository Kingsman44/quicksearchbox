package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ez */
/* compiled from: PG */
public final /* synthetic */ class C105606ez implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105610fc f294664a;

    /* renamed from: b */
    public final /* synthetic */ C83412a f294665b;

    public /* synthetic */ C105606ez(C105610fc fcVar, C83412a aVar) {
        this.f294664a = fcVar;
        this.f294665b = aVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105610fc fcVar = this.f294664a;
        C83412a aVar = this.f294665b;
        Boolean bool = (Boolean) obj;
        aVar.mo76745d(bool.booleanValue());
        if (bool.booleanValue()) {
            ((TextView) aVar.findViewById(R.id.title)).setTextColor(C1878d.m5128a(fcVar.f294670b, R.color.dark_theme_header_color));
            ((TextView) aVar.findViewById(R.id.text)).setTextColor(C1878d.m5128a(fcVar.f294670b, R.color.dark_theme_body_color));
        }
    }
}
