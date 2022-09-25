package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.h */
/* compiled from: PG */
public final /* synthetic */ class C124159h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342881a;

    public /* synthetic */ C124159h(C124166o oVar) {
        this.f342881a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C124166o oVar = this.f342881a;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(oVar.mo106308a(Optional.empty(), C58485gu.m89845m(), Optional.empty(), Optional.empty()));
        for (C46108a a : (List) obj) {
            e.mo55395g(oVar.mo106308a(Optional.m71637of(a.mo50209a()), C58485gu.m89845m(), Optional.empty(), Optional.empty()));
        }
        C58485gu f = e.mo55394f();
        return C47638k.m84752c(f).mo51521b(new C124161j(oVar, f), oVar.f342898d);
    }
}
