package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131245n;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C130801d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f358041a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358042b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358043c;

    public /* synthetic */ C130801d(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f358041a = cxVar;
        this.f358042b = cxVar2;
        this.f358043c = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f358041a;
        C60870cx cxVar2 = this.f358042b;
        C60870cx cxVar3 = this.f358043c;
        try {
            C50841m mVar = (C50841m) C50842n.f132378f.createBuilder();
            Objects.requireNonNull(mVar);
            ((Optional) C60856cj.m92909r(cxVar)).ifPresent(new C130798a(mVar));
            ((Optional) C60856cj.m92909r(cxVar2)).ifPresent(new C130799b(mVar));
            Objects.requireNonNull(mVar);
            ((Optional) C60856cj.m92909r(cxVar3)).ifPresent(new C130800c(mVar));
            return C60856cj.m92900i(C131245n.m213736a(((C50842n) mVar.build()).toByteArray()));
        } catch (ExecutionException e) {
            return C60856cj.m92900i((String) Optional.ofNullable(e.getMessage()).orElse(BuildConfig.FLAVOR));
        }
    }
}
