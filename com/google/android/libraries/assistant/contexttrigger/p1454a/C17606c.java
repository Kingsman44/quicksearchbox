package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.android.libraries.assistant.contexttrigger.p1454a.C17611h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.c */
/* compiled from: PG */
public final /* synthetic */ class C17606c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17611h f50718a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f50719b;

    public /* synthetic */ C17606c(C17611h hVar, AccountId accountId) {
        this.f50718a = hVar;
        this.f50719b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C17611h hVar = this.f50718a;
        C58485gu guVar = (C58485gu) obj;
        C17613i eu = ((C17611h.C17612a) C47245e.m84045a(hVar.f50725c, C17611h.C17612a.class, this.f50719b)).mo23412eu();
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C17610g gVar = (C17610g) guVar.get(i);
            e.mo55395g(eu.mo23413a(gVar.mo23407a(), gVar.mo23408b()));
        }
        return C47633f.m84733g(C60856cj.m92896e(e.mo55394f())).mo51515h(C17609f.f50722a, C60826bg.f164896a);
    }
}
