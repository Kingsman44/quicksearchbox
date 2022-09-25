package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.content.p091b.C1874w;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32051a;
import com.google.android.libraries.p2460r.p2469c.C32120bh;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32069l;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.aj */
/* compiled from: PG */
public final class C104867aj implements C32069l {

    /* renamed from: a */
    private final Map f292243a;

    public C104867aj(Map map) {
        this.f292243a = map;
    }

    /* renamed from: a */
    public final void mo37850a(String str, boolean z, C32051a aVar) {
        C104866ai aiVar = (C104866ai) this.f292243a.get(str);
        if (aiVar == null) {
            ((C32120bh) aVar).mo37836a((Typeface) null);
        } else if (aiVar.f292241c != null) {
            aiVar.mo94382a(z, aVar);
        } else {
            C1874w.m5110g(aiVar.f292239a, aiVar.f292240b, new C104865ah(aiVar, z, aVar), (Handler) null);
        }
    }
}
