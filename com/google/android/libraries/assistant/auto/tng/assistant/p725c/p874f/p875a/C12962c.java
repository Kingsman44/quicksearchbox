package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p874f.p875a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.f.a.c */
/* compiled from: PG */
public final class C12962c {

    /* renamed from: a */
    public static final C59071e f40330a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.f.a.c");

    /* renamed from: b */
    public static final C58528ij f40331b = C58528ij.m90015O(C70967n.ONLINE_RESPONSE, C70967n.STRUCTURED_TTS, C70967n.MESSAGE_READ_ONLINE, C70967n.MESSAGE_READ_OFFLINE, C70967n.SUGGESTION, C70967n.DEVICE_PERMISSION, C70967n.PERMISSION_REQUEST, C70967n.DATA_SUBSCRIPTION, C70967n.NOTIFICATION_PERMISSION, C70967n.NOTIFICATION_ANNOUNCE);

    /* renamed from: c */
    public final C15481g f40332c;

    /* renamed from: d */
    private final Executor f40333d;

    public C12962c(C15481g gVar, Executor executor) {
        this.f40332c = gVar;
        this.f40333d = executor;
    }

    /* renamed from: a */
    public final void mo20856a(C17331a aVar, C70967n nVar) {
        C60870cx b = aVar.mo23276b();
        C12960a aVar2 = new C12960a(this, nVar);
        C60856cj.m92911t(b, C47810es.m84974n(aVar2), this.f40333d);
        C60870cx a = aVar.mo23275a();
        C12961b bVar = new C12961b(this, nVar);
        C60856cj.m92911t(a, C47810es.m84974n(bVar), this.f40333d);
    }
}
