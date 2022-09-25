package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3741aa.p3742a.p3743a.C48157e;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import com.google.assistant.p3741aa.p3742a.p3743a.C48162j;
import com.google.assistant.p3741aa.p3742a.p3743a.C48163k;
import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.g.a.c */
/* compiled from: PG */
public final class C124269c implements C124271b {

    /* renamed from: a */
    public static final C59071e f343087a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.g.a.c");

    /* renamed from: b */
    public final C47632e f343088b = new C47632e();

    /* renamed from: c */
    public final Map f343089c = new HashMap();

    /* renamed from: d */
    public final Map f343090d = new HashMap();

    /* renamed from: e */
    public final Set f343091e;

    /* renamed from: f */
    public final Executor f343092f;

    public C124269c(Set set, Executor executor) {
        this.f343091e = set;
        this.f343092f = executor;
    }

    /* renamed from: a */
    public final void mo106355a(String str) {
        C48163k kVar = (C48163k) C48166n.f124622e.createBuilder();
        kVar.copyOnWrite();
        C48166n nVar = (C48166n) kVar.instance;
        str.getClass();
        nVar.f124624a |= 1;
        nVar.f124625b = str;
        kVar.copyOnWrite();
        C48166n nVar2 = (C48166n) kVar.instance;
        nVar2.f124626c = 2;
        nVar2.f124624a = 2 | nVar2.f124624a;
        mo106356b((C48166n) kVar.build(), false);
    }

    /* renamed from: b */
    public final void mo106356b(C48166n nVar, boolean z) {
        C46459k.m82829b(this.f343088b.mo51512b(new C124268b(this, nVar, z), this.f343092f), "Failed to updateRemoteDeviceState", new Object[0]);
    }

    /* renamed from: c */
    public final C48160h mo106357c() {
        C48157e eVar = (C48157e) C48160h.f124608d.createBuilder();
        eVar.copyOnWrite();
        C48160h hVar = (C48160h) eVar.instance;
        hVar.f124611b = 1;
        hVar.f124610a = 1 | hVar.f124610a;
        for (C48162j jVar : this.f343089c.values()) {
            eVar.copyOnWrite();
            C48160h hVar2 = (C48160h) eVar.instance;
            jVar.getClass();
            C62971cq cqVar = hVar2.f124612c;
            if (!cqVar.mo58948c()) {
                hVar2.f124612c = C62942bv.mutableCopy(cqVar);
            }
            hVar2.f124612c.add(jVar);
        }
        return (C48160h) eVar.build();
    }
}
