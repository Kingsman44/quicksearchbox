package com.google.android.libraries.lens.view.filters.translation;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.translation.tooltip.TranslationTooltipView;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bu */
/* compiled from: PG */
public final /* synthetic */ class C26083bu implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26104co f70893a;

    public /* synthetic */ C26083bu(C26104co coVar) {
        this.f70893a = coVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26104co coVar = this.f70893a;
        C26114cy cyVar = coVar.f70918a;
        if (((Boolean) obj).booleanValue()) {
            cyVar.f70961i.setVisibility(0);
            cyVar.f70962j.setVisibility(0);
            cyVar.f70963k.setVisibility(0);
            cyVar.f70964l.animate().rotation(-180.0f).setListener(new C26113cx(cyVar));
        } else {
            cyVar.f70966n = false;
            TranslationTooltipView translationTooltipView = cyVar.f70967o;
            if (translationTooltipView != null) {
                translationTooltipView.mo17754z().mo31443a(new C26111cv(cyVar));
            } else {
                cyVar.mo31301d();
            }
        }
        coVar.f70934q.mo31315h();
    }
}
