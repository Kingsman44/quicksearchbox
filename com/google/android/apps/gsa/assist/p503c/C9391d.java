package com.google.android.apps.gsa.assist.p503c;

import com.google.android.apps.search.assistant.platform.p9141h.p9167j.C121163a;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.C121170d;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a.C121166c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.assist.c.d */
/* compiled from: PG */
public final /* synthetic */ class C9391d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C9393f f32556a;

    /* renamed from: b */
    public final /* synthetic */ int f32557b;

    public /* synthetic */ C9391d(C9393f fVar, int i) {
        this.f32556a = fVar;
        this.f32557b = i;
    }

    public final C60870cx apply(Object obj) {
        C121166c cVar;
        C9393f fVar = this.f32556a;
        int i = this.f32557b;
        C121170d a = ((C9392e) C47245e.m84045a(fVar.f32558a, C9392e.class, (AccountId) obj)).mo17588a();
        if (i == -1) {
            cVar = C121166c.REJECTED;
        } else if (i == 1) {
            cVar = C121166c.ACCEPTED;
        } else if (i != 3) {
            cVar = C121166c.UNSPECIFIED;
        } else {
            cVar = C121166c.ACCEPTED_WITH_DONATION;
        }
        return a.f336667b.mo46039a(new C121163a(cVar), a.f336666a);
    }
}
