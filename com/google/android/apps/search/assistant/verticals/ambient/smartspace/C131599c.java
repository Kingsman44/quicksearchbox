package com.google.android.apps.search.assistant.verticals.ambient.smartspace;

import com.google.android.apps.search.assistant.verticals.ambient.settings.C131567i;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c */
/* compiled from: PG */
public final class C131599c implements C46675m {

    /* renamed from: a */
    private final C60887da f359558a;

    /* renamed from: b */
    private final C38469m f359559b;

    /* renamed from: c */
    private final C131567i f359560c;

    public C131599c(C60887da daVar, C38469m mVar, C131567i iVar) {
        C69664n.m101061g(daVar, "lightweightExecutor");
        C69664n.m101061g(mVar, "gellerAccessor");
        this.f359558a = daVar;
        this.f359559b = mVar;
        this.f359560c = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        C60870cx b = this.f359560c.mo110190b();
        C60870cx g = C60922j.m93044g(C60838bs.m92859i(this.f359559b.mo41432c(C65753ak.SMARTSPACE_CARD_UPDATE_RECORD, (String) null, C63662ac.f172144a)), new C131578a(), this.f359558a);
        return C47638k.m84751b(b, g).mo51520a(new C131597b(b, g), this.f359558a);
    }
}
