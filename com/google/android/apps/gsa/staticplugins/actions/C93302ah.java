package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.ah */
/* compiled from: PG */
public final class C93302ah {

    /* renamed from: a */
    public static final C59071e f260189a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.ah");

    /* renamed from: b */
    private final C90931ca f260190b;

    /* renamed from: c */
    private final C22871g f260191c;

    public C93302ah(C90931ca caVar, C22871g gVar) {
        this.f260190b = caVar;
        this.f260191c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo87624a(String str, int i, C93301ag agVar, C90919bp bpVar) {
        C60870cx c = this.f260190b.mo85138c(new C93300af(str, i, agVar));
        new C90873ag(c, this.f260191c, "[NonUi2UiCallbackRunner] On ".concat(str), bpVar).mo85223a(new C93299ae(str));
        return c;
    }
}
