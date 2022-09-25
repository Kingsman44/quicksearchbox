package com.google.android.apps.gsa.velvet.p8863ui.settings;

import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.android.libraries.search.location.p3029a.C38628bt;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.w */
/* compiled from: PG */
public final /* synthetic */ class C118684w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118686y f331079a;

    public /* synthetic */ C118684w(C118686y yVar) {
        this.f331079a = yVar;
    }

    public final C60870cx apply(Object obj) {
        Optional ia = ((C38628bt) C47245e.m84045a(this.f331079a.f331081a, C38628bt.class, (AccountId) obj)).mo41526ia();
        if (!ia.isPresent()) {
            return C60856cj.m92900i(false);
        }
        C60870cx f = ((C38627bs) ia.get()).mo41510f();
        C118683v vVar = C118683v.f331078a;
        return C60922j.m93044g(f, C47810es.m84963c(vVar), C60826bg.f164896a);
    }
}
