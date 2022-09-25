package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88465o;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a.C97026a;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97037c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.e */
/* compiled from: PG */
public final class C97054e extends C97026a {

    /* renamed from: b */
    private final C88465o f271192b;

    public C97054e(C85923cq cqVar, C97037c cVar, C88465o oVar) {
        super(cqVar, cVar);
        this.f271192b = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo90378a() {
        C88465o oVar = C88465o.UNKNOWN_CLIENT;
        int ordinal = this.f271192b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return "lr_bbl";
        }
        if (ordinal == 2) {
            return "fn_bbl";
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo90379b() {
        return "bbl";
    }
}
