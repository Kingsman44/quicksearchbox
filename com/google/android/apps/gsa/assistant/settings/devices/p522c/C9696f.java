package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.f */
/* compiled from: PG */
public final /* synthetic */ class C9696f implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C9697g f33505a;

    public /* synthetic */ C9696f(C9697g gVar) {
        this.f33505a = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        Boolean bool = (Boolean) obj;
        View findViewById = this.f33505a.f33517l.findViewById(R.id.settings_nexus_page_content_container);
        if (findViewById != null) {
            int i = 8;
            if (bool != null && bool.booleanValue()) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
