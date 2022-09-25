package com.google.apps.tiktok.account.p3606d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.d.m */
/* compiled from: PG */
public final /* synthetic */ class C46095m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46101s f120973a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f120974b;

    public /* synthetic */ C46095m(C46101s sVar, C58528ij ijVar) {
        this.f120973a = sVar;
        this.f120974b = ijVar;
    }

    public final C60870cx apply(Object obj) {
        C46101s sVar = this.f120973a;
        C58528ij F = C58528ij.m90006F(C58758qx.m90645c(this.f120974b, (Set) obj));
        C46090h hVar = sVar.f120987g;
        C58485gu a = hVar.mo50199a(F, (C58528ij) null);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(hVar.f120963a.mo50208a((File) a.get(i)));
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C46089g(arrayList), C60826bg.f164896a);
    }
}
