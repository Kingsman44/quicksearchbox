package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.android.libraries.assistant.contexttrigger.p1462f.C17718j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.d */
/* compiled from: PG */
public final /* synthetic */ class C17607d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17611h f50720a;

    public /* synthetic */ C17607d(C17611h hVar) {
        this.f50720a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C17611h hVar = this.f50720a;
        C58480gp e = C58485gu.m89837e();
        for (AccountId accountId : (Set) obj) {
            e.mo55395g(C47633f.m84733g(C17718j.m35001b(hVar.f50725c, accountId).f50900a.mo46042d()).mo51515h(C17605b.f50717a, hVar.f50724b).mo51516i(new C17606c(hVar, accountId), hVar.f50724b));
        }
        return C60856cj.m92896e(e.mo55394f());
    }
}
