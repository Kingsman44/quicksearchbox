package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.manager.x */
/* compiled from: PG */
public final /* synthetic */ class C46316x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46232ae f121306a;

    public /* synthetic */ C46316x(C46232ae aeVar) {
        this.f121306a = aeVar;
    }

    public final C60870cx apply(Object obj) {
        C46232ae aeVar = this.f121306a;
        ArrayList arrayList = new ArrayList();
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            arrayList.add(aeVar.mo50278m((AccountId) entry.getKey(), (C46227h) entry.getValue()));
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
