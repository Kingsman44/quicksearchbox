package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.graphics.drawable.GradientDrawable;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bv */
/* compiled from: PG */
public final /* synthetic */ class C105521bv implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105522bw f294398a;

    public /* synthetic */ C105521bv(C105522bw bwVar) {
        this.f294398a = bwVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105522bw bwVar = this.f294398a;
        if (((Boolean) obj).booleanValue()) {
            ((GradientDrawable) bwVar.f294402c.getBackground()).setColor(C1878d.m5128a(bwVar.f294400a, R.color.agsa_color_dark_primary));
            bwVar.f294401b.setTextColor(C1878d.m5128a(bwVar.f294400a, R.color.agsa_color_dark_on_primary));
            return;
        }
        ((GradientDrawable) bwVar.f294402c.getBackground()).setColor(C1878d.m5128a(bwVar.f294400a, R.color.agsa_color_light_primary));
        bwVar.f294401b.setTextColor(C1878d.m5128a(bwVar.f294400a, R.color.agsa_color_light_on_primary));
    }
}
