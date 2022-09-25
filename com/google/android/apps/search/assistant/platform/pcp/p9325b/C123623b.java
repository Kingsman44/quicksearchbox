package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63010eb;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.b */
/* compiled from: PG */
public final class C123623b {

    /* renamed from: a */
    public static final C59071e f341549a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.b.b");

    /* renamed from: b */
    public final C42850e f341550b;

    /* renamed from: c */
    public final AccountId f341551c;

    /* renamed from: d */
    public final C123610ac f341552d;

    public C123623b(C42850e eVar, AccountId accountId, C123610ac acVar) {
        this.f341550b = eVar;
        this.f341551c = accountId;
        this.f341552d = acVar;
    }

    /* renamed from: e */
    private final C60870cx m202987e(String str, Map map) {
        return this.f341550b.mo45938b(new C123646w(str, map));
    }

    /* renamed from: a */
    public final C60870cx mo106074a(Map map) {
        if (map.isEmpty()) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92894c(C58485gu.m89847o(m202987e("SharedProactiveData", map), m202987e("ClientProactiveData", map))).mo57334a(C47810es.m84978r(C123607a.f341521a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo106075b(C53306j jVar, Optional optional) {
        C59104x b = f341549a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.AccountDatabaseHelper");
        ((C59052c) ((C59052c) b).mo56372aa(35166)).mo56354G("#getLastReturnedProactiveData for client type %s and proactive data type %s", jVar, optional);
        return this.f341552d.mo106060d(this.f341550b, jVar, optional);
    }

    /* renamed from: c */
    public final C60870cx mo106076c(C53306j jVar, int i, String str, C63010eb ebVar) {
        return this.f341550b.mo45937a(new C123645v(str, i, jVar, ebVar));
    }

    /* renamed from: d */
    public final C60870cx mo106077d(C53306j jVar, List list, C123777f fVar) {
        return this.f341552d.mo106064h(this.f341550b, jVar, fVar, list, true);
    }
}
