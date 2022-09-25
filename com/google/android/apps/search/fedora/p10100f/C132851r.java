package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.gsa.p8867w.p8877g.C118794b;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.fedora.f.r */
/* compiled from: PG */
public final class C132851r implements C43019v {

    /* renamed from: a */
    private static final C59071e f362455a = C59071e.m91332i("com.google.android.apps.search.fedora.f.r");

    /* renamed from: b */
    private final AccountId f362456b;

    /* renamed from: c */
    private final C46128f f362457c;

    /* renamed from: d */
    private final C60887da f362458d;

    /* renamed from: e */
    private final C118794b f362459e;

    public C132851r(AccountId accountId, C46128f fVar, C118794b bVar, C60887da daVar) {
        this.f362456b = accountId;
        this.f362457c = fVar;
        this.f362458d = daVar;
        this.f362459e = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        ((C59052c) ((C59052c) f362455a.mo56224b()).mo56372aa(39857)).mo56386p("FedoraProtoStoreMigration.migrate()");
        C47633f h = C47633f.m84733g(this.f362457c.mo50215b(this.f362456b)).mo51515h(C132848o.f362452a, C60826bg.f164896a);
        C118794b bVar = this.f362459e;
        Objects.requireNonNull(bVar);
        return h.mo51516i(new C132849p(bVar), this.f362458d).mo51515h(new C132850q((C132773ad) messageLite), this.f362458d);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
