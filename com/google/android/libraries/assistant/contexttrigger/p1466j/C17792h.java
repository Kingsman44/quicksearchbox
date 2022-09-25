package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.android.libraries.assistant.contexttrigger.p1462f.C17718j;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.h */
/* compiled from: PG */
public final /* synthetic */ class C17792h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17793i f51058a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f51059b;

    public /* synthetic */ C17792h(C17793i iVar, C58485gu guVar) {
        this.f51058a = iVar;
        this.f51059b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C17793i iVar = this.f51058a;
        C58485gu guVar = this.f51059b;
        ArrayList arrayList = new ArrayList();
        for (AccountId accountId : (Set) obj) {
            arrayList.add(iVar.f51066g.mo23465a(C17718j.m35001b(iVar.f51064e, accountId), C17718j.m35000a(iVar.f51064e, accountId), guVar, C58485gu.m89845m(), C58485gu.m89845m()));
        }
        return C60856cj.m92896e(arrayList);
    }
}
