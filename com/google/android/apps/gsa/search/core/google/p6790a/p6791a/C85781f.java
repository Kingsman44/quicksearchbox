package com.google.android.apps.gsa.search.core.google.p6790a.p6791a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.gms.p10811h.C144351b;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.a.f */
/* compiled from: PG */
public final class C85781f implements C85776a {

    /* renamed from: a */
    public static final C59071e f231933a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.a.f");

    /* renamed from: b */
    public final Context f231934b;

    /* renamed from: c */
    public final AtomicBoolean f231935c = new AtomicBoolean();

    /* renamed from: d */
    private final C86124t f231936d;

    /* renamed from: e */
    private final C90851k f231937e;

    public C85781f(Context context, C86124t tVar, C90851k kVar) {
        this.f231934b = context;
        this.f231936d = tVar;
        this.f231937e = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo79439a() {
        if (!this.f231936d.mo79746e(C90014bt.f247382gB)) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        return C60846c.m92878g(C43205e.m76192b(C144351b.m234629a(this.f231934b).mo119866c()), Exception.class, new C85779d(this), this.f231937e.mo85210c("Fetching HomeGraph Id from AGSA-C"));
    }
}
