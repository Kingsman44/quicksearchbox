package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.hotword.C90586c;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p415a.C8453c;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.e */
/* compiled from: PG */
public final class C18359e implements C28746bx {

    /* renamed from: a */
    public static final C58974d f52077a = C58974d.m91134h("DspHwModelPopulator");

    /* renamed from: b */
    private final C68214a f52078b;

    public C18359e(C68214a aVar) {
        this.f52078b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        if (!((C86124t) this.f52078b.mo27525b()).mo79746e(C90082eg.f249876S)) {
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        C8453c c = C90586c.m147805c((C86124t) this.f52078b.mo27525b());
        if (c == null) {
            ((C58970a) ((C58970a) f52077a.mo56226d()).mo56372aa(47297)).mo56386p("DSP model download enabled, but no available models found.");
            return C60866ct.f164955a;
        }
        Map.EL.forEach(Collections.unmodifiableMap(c.f29365a), new C18356b(arrayList, fdVar));
        return C60856cj.m92892a(arrayList).mo57334a(C47810es.m84978r(C18357c.f52075a), C60826bg.f164896a);
    }
}
