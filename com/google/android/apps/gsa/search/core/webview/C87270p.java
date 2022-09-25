package com.google.android.apps.gsa.search.core.webview;

import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.android.libraries.search.location.p3029a.C38628bt;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.webview.p */
/* compiled from: PG */
public final /* synthetic */ class C87270p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C87273s f235719a;

    public /* synthetic */ C87270p(C87273s sVar) {
        this.f235719a = sVar;
    }

    public final C60870cx apply(Object obj) {
        Optional ia = ((C38628bt) C47245e.m84045a(this.f235719a.f235726b, C38628bt.class, (AccountId) obj)).mo41526ia();
        if (ia.isPresent()) {
            return ((C38627bs) ia.get()).mo41509e();
        }
        return C60856cj.m92900i(true);
    }
}
