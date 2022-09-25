package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.C106602a;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.f */
/* compiled from: PG */
public final class C110108f implements C106602a {

    /* renamed from: a */
    private final C110111i f306804a;

    /* renamed from: b */
    private final C90021c f306805b;

    /* renamed from: c */
    private final C110402b f306806c;

    public C110108f(C110111i iVar, C110402b bVar, C90021c cVar) {
        this.f306804a = iVar;
        this.f306806c = bVar;
        this.f306805b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo95591a(Intent intent) {
        if (!this.f306805b.mo79746e(C90014bt.f247073aK) || !this.f306806c.mo98629a()) {
            return C118826c.f331423b;
        }
        String action = intent.getAction();
        if ("pss_action_startup".equals(action)) {
            C110111i iVar = this.f306804a;
            if (iVar.f306813c.mo98624b(true)) {
                C58976aa aaVar = C58975e.f156826a;
                iVar.mo98387d();
            }
            return C118826c.f331423b;
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            return this.f306804a.mo98384a(intent);
        } else {
            return C118826c.f331423b;
        }
    }
}
