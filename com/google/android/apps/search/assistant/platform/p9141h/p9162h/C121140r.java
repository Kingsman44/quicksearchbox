package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65806cj;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.r */
/* compiled from: PG */
public final class C121140r implements C121135m {

    /* renamed from: a */
    public static final C59071e f336590a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.h.r");

    /* renamed from: b */
    public static final C65753ak f336591b = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: c */
    public static final String f336592c = C65806cj.PERSONAL_RESULTS.name();

    /* renamed from: d */
    public final C60887da f336593d;

    /* renamed from: e */
    public final C68214a f336594e;

    /* renamed from: f */
    public final C38469m f336595f;

    /* renamed from: g */
    public final C21370a f336596g;

    /* renamed from: h */
    public final AccountId f336597h;

    /* renamed from: i */
    public final C38424a f336598i;

    /* renamed from: j */
    public final boolean f336599j;

    /* renamed from: k */
    private final C42876ab f336600k;

    public C121140r(C60887da daVar, C42876ab abVar, C68214a aVar, C38469m mVar, C21370a aVar2, AccountId accountId, C38424a aVar3, boolean z) {
        this.f336593d = daVar;
        this.f336600k = abVar;
        this.f336594e = aVar;
        this.f336595f = mVar;
        this.f336596g = aVar2;
        this.f336597h = accountId;
        this.f336598i = aVar3;
        this.f336599j = z;
    }

    /* renamed from: a */
    public final C60870cx mo105060a(Boolean bool, Boolean bool2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C60870cx a = this.f336600k.mo46039a(new C121137o(atomicBoolean, bool), this.f336593d);
        C121139q qVar = new C121139q(this, atomicBoolean, bool2, bool);
        C60856cj.m92911t(a, C47810es.m84974n(qVar), this.f336593d);
        return a;
    }
}
