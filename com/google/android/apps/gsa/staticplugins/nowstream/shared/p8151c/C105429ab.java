package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.c.ab */
/* compiled from: PG */
public final class C105429ab implements C105428aa {

    /* renamed from: a */
    private final C23112h f294059a;

    public C105429ab(C23112h hVar) {
        this.f294059a = hVar;
    }

    /* renamed from: e */
    public final void mo94703e(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("dismissedByClick", Boolean.valueOf(z).booleanValue());
        this.f294059a.mo28345s("dismissTooltip_boolean", "TooltipEventsDispatcher", bundle);
    }

    /* renamed from: f */
    public final void mo94704f(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("didShowTooltip", Boolean.valueOf(z).booleanValue());
        this.f294059a.mo28345s("doneProcessingTooltip_boolean", "TooltipEventsDispatcher", bundle);
    }

    /* renamed from: h */
    public final void mo94705h() {
        this.f294059a.mo28345s("resolveTooltipViewClick", "TooltipEventsDispatcher", new Bundle());
    }

    /* renamed from: j */
    public final void mo94707j(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("newState", Integer.valueOf(i).intValue());
        this.f294059a.mo28345s("updateScrollState_int", "TooltipEventsDispatcher", bundle);
    }
}
