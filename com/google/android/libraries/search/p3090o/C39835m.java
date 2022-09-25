package com.google.android.libraries.search.p3090o;

import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58817ah;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.o.m */
/* compiled from: PG */
public final /* synthetic */ class C39835m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39837o f104737a;

    public /* synthetic */ C39835m(C39837o oVar) {
        this.f104737a = oVar;
    }

    public final Object apply(Object obj) {
        C39837o oVar = this.f104737a;
        C39824b bVar = (C39824b) obj;
        C63042fg fgVar = bVar.f104724d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Duration ofSeconds = Duration.ofSeconds(fgVar.f170154a);
        if (oVar.f104739a.mo42023c(ofSeconds)) {
            C56016b a = C56016b.m87883a(bVar.f104723c);
            if (a == null) {
                a = C56016b.UNSPECIFIED_TEMPERATURE_UNIT;
            }
            return C46688af.m83206c(a);
        }
        C56016b a2 = C56016b.m87883a(bVar.f104723c);
        if (a2 == null) {
            a2 = C56016b.UNSPECIFIED_TEMPERATURE_UNIT;
        }
        return C46688af.m83205b(a2, ofSeconds.toMillis());
    }
}
