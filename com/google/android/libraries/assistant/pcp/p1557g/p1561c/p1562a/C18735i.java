package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18949b;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C18735i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18949b f52827a;

    public /* synthetic */ C18735i(C18949b bVar) {
        this.f52827a = bVar;
    }

    public final Object apply(Object obj) {
        C18949b bVar = this.f52827a;
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) ((C59052c) C18736j.f52828a.mo56226d()).mo56382g(th)).mo56372aa(47344)).mo56386p("Error getting on device media");
        ((C18951d) bVar).mo24229b(th instanceof CancellationException ? 4 : 3, C71213aw.f190093f);
        return Optional.empty();
    }
}
