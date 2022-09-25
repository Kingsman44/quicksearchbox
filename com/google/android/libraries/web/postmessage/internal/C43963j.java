package com.google.android.libraries.web.postmessage.internal;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58893dc;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.web.postmessage.internal.j */
/* compiled from: PG */
final class C43963j implements C43955b {

    /* renamed from: a */
    final /* synthetic */ C43966m f114449a;

    public C43963j(C43966m mVar) {
        this.f114449a = mVar;
    }

    /* renamed from: a */
    public final void mo46954a() {
        this.f114449a.f114459e.clear();
        this.f114449a.f114462h = null;
    }

    /* renamed from: b */
    public final int mo46955b(JSONObject jSONObject) {
        int i = 1;
        for (Map.Entry entry : this.f114449a.f114458d.entrySet()) {
            C43966m mVar = this.f114449a;
            int intValue = ((Integer) entry.getKey()).intValue();
            C43964k kVar = (C43964k) entry.getValue();
            if (kVar.f114450a.mo5941a(jSONObject)) {
                if (mVar.f114461g) {
                    mVar.mo46958a(jSONObject, intValue);
                } else if (!kVar.f114451b) {
                    mVar.f114459e.add(new C43965l(intValue, jSONObject));
                } else if (kVar.f114452c != null) {
                    C43968o b = mVar.mo46959b();
                    C58893dc.m90996a(b);
                    C46459k.m82829b(b.mo46960a(kVar.f114452c.toString()), "Failed to send the failure response.", new Object[0]);
                }
                i = 2;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo46956c(C43974u uVar) {
        this.f114449a.f114462h = uVar;
    }
}
