package com.google.android.libraries.web.postmessage.internal;

import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.web.postmessage.internal.q */
/* compiled from: PG */
public final class C43970q {

    /* renamed from: a */
    private final C43959f f114468a;

    /* renamed from: b */
    private final Map f114469b = new HashMap();

    public C43970q(WebModelProvider webModelProvider) {
        this.f114468a = (C43959f) webModelProvider.mo47072a(C43959f.class);
    }

    /* renamed from: a */
    public final C43976w mo46963a(C43775a aVar) {
        C43976w wVar = (C43976w) this.f114469b.get(aVar);
        if (wVar != null) {
            return wVar;
        }
        C43976w wVar2 = new C43976w(aVar, this.f114468a);
        this.f114469b.put(aVar, wVar2);
        return wVar2;
    }

    /* renamed from: b */
    public final void mo46964b() {
        for (C43976w a : this.f114469b.values()) {
            a.mo46965a();
        }
    }
}
