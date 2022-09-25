package com.google.apps.tiktok.account.data.device;

import com.google.apps.tiktok.account.data.p3611a.C46121ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.data.device.i */
/* compiled from: PG */
public final /* synthetic */ class C46205i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46206j f121140a;

    public /* synthetic */ C46205i(C46206j jVar) {
        this.f121140a = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46206j jVar = this.f121140a;
        ArrayList arrayList = new ArrayList(1);
        for (C46121ab abVar : jVar.f121141a) {
            try {
                arrayList.add(abVar.f121011a.mo50249f());
            } catch (Exception e) {
                arrayList.add(C60856cj.m92899h(e));
            }
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
