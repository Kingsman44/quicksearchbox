package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.server.C61572t;
import com.google.frameworks.client.data.android.server.tiktok.C61608w;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.z */
/* compiled from: PG */
final class C61612z implements C61572t {

    /* renamed from: a */
    final /* synthetic */ C61608w f166481a;

    /* renamed from: b */
    private final C61592g f166482b;

    public C61612z(C61608w wVar, C61592g gVar) {
        this.f166481a = wVar;
        this.f166482b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo58126a(C70334de deVar, C70256c cVar) {
        C60870cx a = this.f166482b.mo20126a(new C61573a(deVar, cVar));
        C61611y yVar = new C61611y(deVar);
        return C60922j.m93044g(a, C47810es.m84963c(yVar), this.f166481a.f166478c);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C70298d mo58127b(Object obj, String str) {
        Map map;
        C69464a aVar;
        C61610x xVar = (C61610x) obj;
        AccountId a = xVar.mo58135a();
        String b = xVar.mo58136b();
        if (a == null) {
            return null;
        }
        C61608w.C61609a aVar2 = (C61608w.C61609a) C47245e.m84045a(this.f166481a.f166477b, C61608w.C61609a.class, a);
        if (b != null) {
            map = (Map) aVar2.mo58146iQ().get(b);
        } else {
            map = aVar2.mo58147iR();
        }
        if (map == null || (aVar = (C69464a) map.get(str)) == null) {
            return null;
        }
        return (C70298d) aVar.mo17428b();
    }
}
