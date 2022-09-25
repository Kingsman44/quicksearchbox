package com.google.android.apps.search.assistant.platform.p9141h.p9167j;

import com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a.C121167d;
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

/* renamed from: com.google.android.apps.search.assistant.platform.h.j.f */
/* compiled from: PG */
public final class C121172f implements C43019v {

    /* renamed from: a */
    public static final C59071e f336670a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.j.f");

    /* renamed from: b */
    public final C68214a f336671b;

    /* renamed from: c */
    private final AccountId f336672c;

    /* renamed from: d */
    private final C46128f f336673d;

    /* renamed from: e */
    private final C60887da f336674e;

    public C121172f(AccountId accountId, C46128f fVar, C68214a aVar, C60887da daVar) {
        this.f336672c = accountId;
        this.f336673d = fVar;
        this.f336671b = aVar;
        this.f336674e = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        return C60922j.m93044g(this.f336673d.mo50215b(this.f336672c), C47810es.m84963c(new C121171e(this, (C121167d) messageLite)), this.f336674e);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
