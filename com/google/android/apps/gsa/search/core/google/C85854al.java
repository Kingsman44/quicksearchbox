package com.google.android.apps.gsa.search.core.google;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.google.al */
/* compiled from: PG */
public final class C85854al implements C85983e {

    /* renamed from: a */
    private final C86338r f232141a;

    /* renamed from: b */
    private final bm f232142b;

    /* renamed from: c */
    private final C86124t f232143c;

    public C85854al(C86338r rVar, bm bmVar, C86124t tVar) {
        this.f232141a = rVar;
        this.f232142b = bmVar;
        this.f232143c = tVar;
    }

    /* renamed from: a */
    public final String mo79488a() {
        return this.f232141a.getInt("search_language_state", 1) == 0 ? this.f232141a.getString("hl_parameter", BuildConfig.FLAVOR) : C90772bp.m148312t(Locale.getDefault());
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        C58495hd hdVar;
        String str = query.f252754L;
        if (str != null) {
            cVar.mo79638d("hl", str);
        } else if (this.f232143c.mo79746e(C90081ef.f249835d) && (hdVar = query.f252779r) != null && hdVar.containsKey("hl")) {
            cVar.mo79638d("hl", (String) query.f252779r.get("hl"));
        } else if (query.mo84403cj() || (query.f252766e & 1048576) != 0) {
            cVar.mo79638d("hl", this.f232142b.b());
        } else {
            cVar.mo79638d("hl", mo79488a());
        }
    }
}
