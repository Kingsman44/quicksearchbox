package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.data.C46216k;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.data.manager.aa */
/* compiled from: PG */
public final /* synthetic */ class C46228aa implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46232ae f121190a;

    /* renamed from: b */
    public final /* synthetic */ List f121191b;

    /* renamed from: c */
    public final /* synthetic */ C46217l f121192c;

    public /* synthetic */ C46228aa(C46232ae aeVar, List list, C46217l lVar) {
        this.f121190a = aeVar;
        this.f121191b = list;
        this.f121192c = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46232ae aeVar = this.f121190a;
        List list = this.f121191b;
        C46217l lVar = this.f121192c;
        Set<C46216k> set = (Set) aeVar.f121202e.mo17428b();
        ArrayList arrayList = new ArrayList(set.size());
        for (C46216k c : set) {
            try {
                arrayList.add(c.mo47107c(lVar));
            } catch (Exception e) {
                arrayList.add(C60856cj.m92899h(e));
            }
        }
        list.addAll(arrayList);
        return C60856cj.m92894c(list).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
