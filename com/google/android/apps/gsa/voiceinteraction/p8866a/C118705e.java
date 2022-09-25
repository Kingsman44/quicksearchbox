package com.google.android.apps.gsa.voiceinteraction.p8866a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89852b;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.a.e */
/* compiled from: PG */
public final /* synthetic */ class C118705e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C89852b f331122a;

    /* renamed from: b */
    public final /* synthetic */ C37309b f331123b;

    public /* synthetic */ C118705e(C89852b bVar, C37309b bVar2) {
        this.f331122a = bVar;
        this.f331123b = bVar2;
    }

    public final C60870cx apply(Object obj) {
        C89852b bVar = this.f331122a;
        C37309b bVar2 = this.f331123b;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = C59743a.GENERIC_APP_FLOW.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C71189f d = bVar2.mo40862d();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        d.getClass();
        ufVar2.f164244cv = d;
        ufVar2.f164255j |= 16384;
        bVar.mo79810a((C60555uf) tzVar.build(), (String) obj);
        return C60866ct.f164955a;
    }
}
