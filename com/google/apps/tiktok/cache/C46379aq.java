package com.google.apps.tiktok.cache;

import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42845bd;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.apps.tiktok.cache.aq */
/* compiled from: PG */
public final /* synthetic */ class C46379aq implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C46385aw f121400a;

    /* renamed from: b */
    public final /* synthetic */ Map f121401b;

    public /* synthetic */ C46379aq(C46385aw awVar, Map map) {
        this.f121400a = awVar;
        this.f121401b = map;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C46385aw awVar = this.f121400a;
        Map map = this.f121401b;
        long b = awVar.f121413d.mo26870b();
        C42840az azVar = new C42840az();
        azVar.f112130a.append("INSERT OR REPLACE INTO ");
        azVar.f112130a.append("cache_table");
        azVar.f112130a.append(" (");
        C46385aw.m82683k(azVar, "request_data");
        azVar.f112130a.append(",");
        C46385aw.m82683k(azVar, "response_data");
        azVar.f112130a.append(",");
        C46385aw.m82683k(azVar, "write_ms");
        azVar.f112130a.append(",");
        C46385aw.m82683k(azVar, "access_ms");
        azVar.f112130a.append(")");
        azVar.f112130a.append(" VALUES (");
        azVar.f112130a.append("?, ?, ?, ?);");
        C42839ay a = azVar.mo45920a();
        C42847bf.m75694g();
        Object[] objArr = a.f112129b;
        C58838bb.m90874i(objArr.length == 0, "Arguments should not be passed on prepared statements: %s", objArr);
        C42845bd bdVar = new C42845bd(bfVar, a.f112128a);
        try {
            for (Map.Entry entry : map.entrySet()) {
                bdVar.mo45923a(1, ((MessageLite) entry.getKey()).toByteArray());
                bdVar.mo45923a(2, ((MessageLite) C60856cj.m92909r((Future) entry.getValue())).toByteArray());
                bdVar.mo45924b(3, b);
                bdVar.mo45924b(4, b);
                bdVar.mo45927d();
            }
            bdVar.close();
            return;
        } catch (Throwable th) {
            C46371ai.m82671a(th, th);
        }
        throw th;
    }
}
