package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.manager.ar */
/* compiled from: PG */
public final /* synthetic */ class C46245ar implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C46222c f121223a;

    /* renamed from: b */
    public final /* synthetic */ C46243ap f121224b;

    /* renamed from: c */
    public final /* synthetic */ List f121225c;

    public /* synthetic */ C46245ar(C46222c cVar, C46243ap apVar, List list) {
        this.f121223a = cVar;
        this.f121224b = apVar;
        this.f121225c = list;
    }

    public final Object call() {
        C46222c cVar = this.f121223a;
        C46243ap apVar = this.f121224b;
        List<C60870cx> list = this.f121225c;
        C46221b bVar = (C46221b) cVar.toBuilder();
        int a = apVar.mo50296a();
        bVar.copyOnWrite();
        C46222c cVar2 = (C46222c) bVar.instance;
        cVar2.f121175a |= 1;
        cVar2.f121176b = a;
        for (C60870cx r : list) {
            C46227h hVar = (C46227h) C60856cj.m92909r(r);
            bVar.mo50269a(hVar.f121186b, hVar);
        }
        return (C46222c) bVar.build();
    }
}
