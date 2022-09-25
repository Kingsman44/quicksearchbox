package com.google.android.apps.search.assistant.libraries.p8946b.p8950c;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a.C124348r;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.c.c */
/* compiled from: PG */
public final class C119228c implements C21851cg {

    /* renamed from: a */
    public static final C59071e f332503a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.b.c.c");

    /* renamed from: b */
    public final Context f332504b;

    /* renamed from: c */
    public final C124348r f332505c;

    /* renamed from: d */
    private final C32204e f332506d;

    /* renamed from: e */
    private final Executor f332507e;

    /* renamed from: com.google.android.apps.search.assistant.libraries.b.c.c$a */
    /* compiled from: PG */
    public interface C119229a {
        /* renamed from: fM */
        C38469m mo104252fM();
    }

    public C119228c(Context context, C32204e eVar, C124348r rVar, Executor executor) {
        this.f332504b = context;
        this.f332506d = eVar;
        this.f332505c = rVar;
        this.f332507e = executor;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar.equals(C65753ak.LOCAL_NETWORK_SYNC_METADATA)) {
            if (account == null) {
                ((C59052c) ((C59052c) f332503a.mo56226d()).mo56372aa(34376)).mo56386p("Skip Usonia module downloading because account is null");
                return;
            }
            ((C59052c) ((C59052c) f332503a.mo56224b()).mo56372aa(34375)).mo56386p("geller sync completed for LOCAL_NETWORK_SYNC_METADATA. Start Usonia Module Downloading");
            C46459k.m82829b(C47633f.m84733g(this.f332506d.mo37990a(account.name)).mo51516i(new C119226a(this), this.f332507e).mo51516i(new C119227b(this), this.f332507e), "UsoniaModuleDownloader failed.", new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
