package com.google.android.apps.gsa.staticplugins.p7433ba;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7192v.C91162o;
import com.google.android.apps.gsa.shared.p7192v.C91165r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ba.a */
/* compiled from: PG */
public final /* synthetic */ class C94444a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C94447b f264039a;

    public /* synthetic */ C94444a(C94447b bVar) {
        this.f264039a = bVar;
    }

    public final C60870cx apply(Object obj) {
        C94447b bVar = this.f264039a;
        C118826c cVar = (C118826c) obj;
        C86124t tVar = bVar.f264040a;
        C42876ab abVar = bVar.f264041b;
        C21370a aVar = bVar.f264042c;
        if (!C91165r.m148940o(tVar)) {
            return C118826c.f331423b;
        }
        return C118826c.m197213c(abVar.mo46039a(new C91162o(Instant.ofEpochMilli(aVar.mo26870b()).truncatedTo(ChronoUnit.DAYS).minus(C91165r.m148934i((int) tVar.mo79743a(C89972ak.f246559ag), tVar))), C60826bg.f164896a));
    }
}
