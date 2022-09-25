package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cp */
/* compiled from: PG */
public final /* synthetic */ class C105542cp implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105544cr f294459a;

    public /* synthetic */ C105542cp(C105544cr crVar) {
        this.f294459a = crVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105544cr crVar = this.f294459a;
        Boolean bool = (Boolean) obj;
        crVar.f294462b.mo76745d(bool.booleanValue());
        if (bool.booleanValue()) {
            ((TextView) crVar.f294462b.findViewById(R.id.stale_warning_title)).setTextColor(C1878d.m5128a(crVar.f294461a, R.color.dark_theme_header_color));
            ((TextView) crVar.f294462b.findViewById(R.id.stale_warning_body)).setTextColor(C1878d.m5128a(crVar.f294461a, R.color.dark_theme_body_color));
        }
    }
}
