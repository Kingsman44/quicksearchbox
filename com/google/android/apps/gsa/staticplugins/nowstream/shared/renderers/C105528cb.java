package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cb */
/* compiled from: PG */
public final /* synthetic */ class C105528cb implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105530cd f294410a;

    public /* synthetic */ C105528cb(C105530cd cdVar) {
        this.f294410a = cdVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105530cd cdVar = this.f294410a;
        Boolean bool = (Boolean) obj;
        cdVar.f294415d.mo76745d(bool.booleanValue());
        if (bool.booleanValue()) {
            ((TextView) cdVar.f294414c.findViewById(R.id.no_cards_title)).setTextColor(C1878d.m5128a(cdVar.f294412a, R.color.dark_theme_header_color));
            ((TextView) cdVar.f294414c.findViewById(R.id.no_cards_body)).setTextColor(C1878d.m5128a(cdVar.f294412a, R.color.dark_theme_body_color));
        }
        cdVar.mo94873e(bool.booleanValue());
    }
}
