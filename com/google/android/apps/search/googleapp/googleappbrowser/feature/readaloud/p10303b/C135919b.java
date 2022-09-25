package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135910c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135912e;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135914g;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b.b */
/* compiled from: PG */
public final /* synthetic */ class C135919b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C135923f f370177a;

    public /* synthetic */ C135919b(C135923f fVar) {
        this.f370177a = fVar;
    }

    public final Object apply(Object obj) {
        C135914g gVar;
        C135923f fVar = this.f370177a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C46688af.m83206c(C135923f.m220532a(C135914g.READABILITY_STATE_PENDING));
        }
        C46370ah ahVar = (C46370ah) axVar.mo56107c();
        if (!fVar.f370182b.mo112621a(ahVar.f121385b)) {
            return C46688af.m83206c(C135923f.m220532a(C135914g.READABILITY_STATE_PENDING));
        }
        int a = C135910c.m220525a(((C135912e) ahVar.f121384a).f370159b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            gVar = C135914g.READABILITY_STATE_READABLE;
        } else if (i != 3) {
            gVar = C135914g.READABILITY_STATE_NON_READABLE;
        } else {
            gVar = C135914g.READABILITY_STATE_CHECK_DISABLED;
        }
        return C46688af.m83205b(C135923f.m220532a(gVar), ahVar.f121385b);
    }
}
