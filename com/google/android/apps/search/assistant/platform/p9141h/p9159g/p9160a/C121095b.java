package com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9160a;

import com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b.C121114f;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import dagger.C68214a;

/* renamed from: com.google.android.apps.search.assistant.platform.h.g.a.b */
/* compiled from: PG */
public final class C121095b implements C43019v {

    /* renamed from: a */
    public static final C59071e f336512a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.g.a.b");

    /* renamed from: b */
    public final C68214a f336513b;

    /* renamed from: c */
    public final C68214a f336514c;

    /* renamed from: d */
    private final AccountId f336515d;

    /* renamed from: e */
    private final C46128f f336516e;

    /* renamed from: f */
    private final C60887da f336517f;

    public C121095b(C68214a aVar, C68214a aVar2, AccountId accountId, C46128f fVar, C60887da daVar) {
        this.f336513b = aVar;
        this.f336514c = aVar2;
        this.f336516e = fVar;
        this.f336515d = accountId;
        this.f336517f = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        return C60922j.m93044g(this.f336516e.mo50215b(this.f336515d), C47810es.m84963c(new C121094a(this, (C121114f) messageLite)), this.f336517f);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
