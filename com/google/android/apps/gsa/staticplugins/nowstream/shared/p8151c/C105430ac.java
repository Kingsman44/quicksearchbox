package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.c.ac */
/* compiled from: PG */
public final class C105430ac implements C23113i {

    /* renamed from: a */
    private final C105428aa f294060a;

    public C105430ac(C105428aa aaVar) {
        this.f294060a = aaVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("TooltipEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("dismissTooltip_boolean")) {
                this.f294060a.mo94703e(Boolean.valueOf(pVar.f63472a.getBoolean("dismissedByClick")).booleanValue());
            } else if (str.equals("doneProcessingTooltip_boolean")) {
                this.f294060a.mo94704f(Boolean.valueOf(pVar.f63472a.getBoolean("didShowTooltip")).booleanValue());
            } else if (str.equals("resolveTooltipViewClick")) {
                this.f294060a.mo94705h();
            } else if (str.equals("updateScrollState_int")) {
                this.f294060a.mo94707j(Integer.valueOf(pVar.f63472a.getInt("newState")).intValue());
            }
        }
    }
}
