package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123729aw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18949b;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71212av;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.n */
/* compiled from: PG */
public final /* synthetic */ class C18740n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f52839a;

    /* renamed from: b */
    public final /* synthetic */ C18949b f52840b;

    public /* synthetic */ C18740n(C60870cx cxVar, C18949b bVar) {
        this.f52839a = cxVar;
        this.f52840b = bVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C60870cx cxVar = this.f52839a;
        C18949b bVar = this.f52840b;
        C123728av avVar = (C123728av) obj;
        C59071e eVar = C18742p.f52842a;
        if (avVar.f341758d.isEmpty()) {
            optional = Optional.empty();
        } else {
            C123729aw awVar = (C123729aw) C123730ax.f341767b.createBuilder();
            awVar.mo106115b(avVar);
            optional = Optional.m71637of((C123730ax) awVar.build());
        }
        C71212av avVar2 = (C71212av) C71213aw.f190093f.createBuilder();
        try {
            Objects.requireNonNull(avVar2);
            ((Optional) C60856cj.m92909r(cxVar)).ifPresent(new C18737k(avVar2));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C18742p.f52842a.mo56226d()).mo56382g(e)).mo56372aa(47346)).mo56386p("unable to log client type");
        }
        ((C18951d) bVar).mo24229b(2, (C71213aw) avVar2.build());
        return optional;
    }
}
