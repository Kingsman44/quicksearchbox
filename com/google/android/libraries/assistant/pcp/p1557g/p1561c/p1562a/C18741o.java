package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18949b;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.CancellationException;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C18741o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18949b f52841a;

    public /* synthetic */ C18741o(C18949b bVar) {
        this.f52841a = bVar;
    }

    public final C60870cx apply(Object obj) {
        C18949b bVar = this.f52841a;
        Throwable th = (Throwable) obj;
        C59071e eVar = C18742p.f52842a;
        ((C18951d) bVar).mo24229b(th instanceof CancellationException ? 4 : 3, C71213aw.f190093f);
        return C60856cj.m92899h(th);
    }
}
