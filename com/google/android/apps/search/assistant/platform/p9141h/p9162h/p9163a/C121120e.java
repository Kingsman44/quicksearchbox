package com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9163a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121135m;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65806cj;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.a.e */
/* compiled from: PG */
public final class C121120e implements C21851cg {

    /* renamed from: a */
    public static final C59071e f336556a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.h.a.e");

    /* renamed from: b */
    public static final C65753ak f336557b = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: c */
    public static final String f336558c = C65806cj.PERSONAL_RESULTS.name();

    /* renamed from: d */
    public final C60887da f336559d;

    /* renamed from: e */
    public final Context f336560e;

    /* renamed from: f */
    private final C46128f f336561f;

    /* renamed from: com.google.android.apps.search.assistant.platform.h.h.a.e$a */
    /* compiled from: PG */
    public interface C121121a {
        /* renamed from: ao */
        C121135m mo105056ao();

        /* renamed from: fN */
        C38469m mo105057fN();
    }

    public C121120e(Context context, C60887da daVar, C46128f fVar) {
        this.f336559d = daVar;
        this.f336561f = fVar;
        this.f336560e = context;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.PRIVACY_SETTINGS && account != null) {
            ((C59052c) ((C59052c) f336556a.mo56224b()).mo56372aa(35718)).mo56386p("PR status onSyncCompleted called in TNG");
            C46459k.m82829b(C47633f.m84733g(this.f336561f.mo50216c(account.name)).mo51516i(new C121118c(this), this.f336559d), "Failed to sync PR status", new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
