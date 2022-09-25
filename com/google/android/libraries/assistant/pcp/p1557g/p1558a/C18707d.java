package com.google.android.libraries.assistant.pcp.p1557g.p1558a;

import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18709a;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18710b;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.p4017at.p4099l.p4100a.C54561b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.pcp.g.a.d */
/* compiled from: PG */
public final class C18707d implements C18769h {

    /* renamed from: a */
    public static final C59071e f52774a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.g.a.d");

    /* renamed from: b */
    public final C54561b f52775b;

    /* renamed from: c */
    private final C60888db f52776c;

    public C18707d(C54561b bVar, C61358s sVar, C60888db dbVar) {
        this.f52775b = (C54561b) bVar.mo62577p(C61409d.f166071a, sVar);
        this.f52776c = dbVar;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18710b.f52780b;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        ((C59052c) ((C59052c) f52774a.mo56224b()).mo56372aa(47340)).mo56386p("#generatePCPClientResponse");
        C60870cx a = cVar.mo24114a(C18709a.f52778a);
        C60870cx a2 = cVar.mo24114a(C18710b.f52779a);
        C60870cx q = C60856cj.m92908q(C47636i.m84744c(a, a2).mo51519b(new C18703a(this, a2, a), this.f52776c).mo51515h(C18705b.f52772a, this.f52776c), 10, TimeUnit.SECONDS, this.f52776c);
        C18706c cVar2 = C18706c.f52773a;
        return C60846c.m92879h(q, TimeoutException.class, C47810es.m84966f(cVar2), this.f52776c);
    }
}
