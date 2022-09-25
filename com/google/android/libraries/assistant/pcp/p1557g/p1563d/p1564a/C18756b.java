package com.google.android.libraries.assistant.pcp.p1557g.p1563d.p1564a;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18712d;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36982a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.a.b */
/* compiled from: PG */
public final class C18756b implements C18769h {

    /* renamed from: a */
    private final Executor f52862a;

    /* renamed from: b */
    private final C36991j f52863b;

    public C18756b(C36991j jVar, Executor executor) {
        this.f52863b = jVar;
        this.f52862a = executor;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18712d.f52786b;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C36991j jVar = this.f52863b;
        C36982a aVar = new C36982a();
        aVar.mo40512d(C51313db.OPA);
        aVar.mo40516h(C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS);
        aVar.mo40510b(C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN);
        aVar.mo40513e(C51319dh.DEFAULT);
        aVar.mo40515g(C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL);
        aVar.mo40514f();
        aVar.mo40511c(C39226b.TAG_ASSISTANT_MOBILE_ASSISTANT);
        return C47633f.m84733g(jVar.mo40520a(aVar.mo40509a())).mo51515h(C18755a.f52861a, this.f52862a);
    }
}
