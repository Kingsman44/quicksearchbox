package com.google.android.apps.search.assistant.libraries.p8966e.p8968b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9018a.C119694b;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.assistant.p3897e.p3921j.alz;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.b.b */
/* compiled from: PG */
public final class C119343b {

    /* renamed from: a */
    public static final C51785da f332748a;

    /* renamed from: b */
    public static final C33480d f332749b = C33480d.m62053a("mic_behavior_args", "assistant.api.client_op.MicBehaviorArgs", C52654zt.f138233e);

    /* renamed from: c */
    public final C71422aw f332750c;

    /* renamed from: d */
    public final C119694b f332751d;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar, "newBuilder()");
        alz a = C69664n.m101061g(czVar, "builder");
        a.mo53699b("mic.UPDATE");
        C51773cz czVar2 = a.f135357a;
        czVar2.copyOnWrite();
        C51785da daVar = (C51785da) czVar2.instance;
        daVar.f135877a |= 2;
        daVar.f135879c = 1;
        f332748a = a.mo53698a();
    }

    public C119343b(C71422aw awVar, C119694b bVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f332750c = awVar;
        this.f332751d = bVar;
    }
}
