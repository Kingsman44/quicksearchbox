package com.google.android.libraries.search.integrations.p3015b.p3016a;

import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42905ba;
import com.google.apps.tiktok.account.p3606d.p3608b.C46080b;
import com.google.apps.tiktok.p3648i.p3650b.C47162f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.integrations.b.a.g */
/* compiled from: PG */
public final class C38501g implements C38497c {

    /* renamed from: b */
    private static final C59071e f101858b = C59071e.m91332i("com.google.android.libraries.search.integrations.b.a.g");

    /* renamed from: a */
    public final C42876ab f101859a;

    /* renamed from: c */
    private final Executor f101860c;

    /* renamed from: d */
    private final C47162f f101861d;

    public C38501g(Executor executor, C42876ab abVar, C47162f fVar) {
        this.f101860c = executor;
        this.f101859a = abVar;
        this.f101861d = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo41445a() {
        return this.f101859a.mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo41446b() {
        try {
            return C42905ba.m75775c(((C46080b) this.f101861d.f122808a).f120944a);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f101858b.mo56226d()).mo56382g(e)).mo56372aa(53115)).mo56386p("Discover language store could not sync with LAMS server");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo41447c(C38495d dVar) {
        return this.f101859a.mo46039a(new C38500f(dVar), this.f101860c);
    }
}
