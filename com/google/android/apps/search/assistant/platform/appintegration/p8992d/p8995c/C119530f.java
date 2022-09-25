package com.google.android.apps.search.assistant.platform.appintegration.p8992d.p8995c;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.p8992d.C119522a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36992k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.d.c.f */
/* compiled from: PG */
public final class C119530f implements C119522a {

    /* renamed from: b */
    public static final /* synthetic */ int f333148b = 0;

    /* renamed from: c */
    private static final C59071e f333149c = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.d.c.f");

    /* renamed from: d */
    private static final C32836cd f333150d;

    /* renamed from: a */
    public final C36991j f333151a;

    /* renamed from: e */
    private final C60887da f333152e;

    /* renamed from: f */
    private final AccountId f333153f;

    /* renamed from: g */
    private final C46194e f333154g;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "asst.device.properties";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f333150d = (C32836cd) ccVar.build();
    }

    public C119530f(AccountId accountId, C46194e eVar, C60887da daVar, C36992k kVar) {
        this.f333153f = accountId;
        this.f333152e = daVar;
        this.f333151a = kVar.mo40522a();
        this.f333154g = eVar;
    }

    /* renamed from: a */
    public final C32836cd mo104416a() {
        C32836cd cdVar = f333150d;
        ((C59052c) ((C59052c) f333149c.mo56224b()).mo56372aa(34438)).mo56389s("get context key=%s", cdVar);
        return cdVar;
    }

    /* renamed from: b */
    public final C60870cx mo104417b(C119640v vVar) {
        C47633f g = C47633f.m84733g(this.f333154g.mo50254a());
        AccountId accountId = this.f333153f;
        Objects.requireNonNull(accountId);
        return C47633f.m84733g(g.mo51515h(new C119527c(accountId), this.f333152e).mo51513e(IllegalArgumentException.class, C119528d.f333146a, this.f333152e).mo51515h(C119529e.f333147a, this.f333152e)).mo51516i(new C119525a(this), this.f333152e).mo51515h(C119526b.f333144a, this.f333152e);
    }
}
