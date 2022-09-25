package com.google.android.libraries.web.postmessage.internal;

import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.web.postmessage.internal.h */
/* compiled from: PG */
public final class C43961h implements C44107h {

    /* renamed from: a */
    public final C43959f f114446a;

    /* renamed from: b */
    public final Map f114447b = new HashMap();

    public C43961h(WebModelProvider webModelProvider) {
        this.f114446a = (C43959f) webModelProvider.mo47072a(C43959f.class);
    }

    /* renamed from: a */
    public final void mo44356a() {
        for (C43966m mVar : this.f114447b.values()) {
            C43959f fVar = mVar.f114456b;
            C43775a aVar = mVar.f114455a;
            C43963j jVar = mVar.f114457c;
            C43958e eVar = (C43958e) fVar.f114444a.get(aVar);
            if (eVar != null) {
                eVar.f114442a.remove(jVar);
            }
        }
    }
}
