package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.core.google.p6796f.C85979a;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.preferences.C86338r;

/* renamed from: com.google.android.apps.gsa.search.core.google.c */
/* compiled from: PG */
public final class C85904c extends C85979a {

    /* renamed from: a */
    private final C86338r f232250a;

    public C85904c(C86338r rVar) {
        this.f232250a = rVar;
    }

    /* renamed from: a */
    public final void mo79491a(C85981c cVar) {
        String string = this.f232250a.getString("advertising_id", (String) null);
        if (string != null) {
            cVar.mo79637c(cVar.f232497e, "X-GSA-IAI", string);
            if (this.f232250a.getBoolean("limited_ad_tracking", false)) {
                cVar.mo79637c(cVar.f232497e, "X-GSA-LAT", "1");
            }
        }
    }
}
