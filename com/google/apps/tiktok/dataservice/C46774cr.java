package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.apps.tiktok.dataservice.cr */
/* compiled from: PG */
public final /* synthetic */ class C46774cr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46776ct f122125a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f122126b;

    /* renamed from: c */
    public final /* synthetic */ C46771co f122127c;

    public /* synthetic */ C46774cr(C46776ct ctVar, C58817ah ahVar, C46771co coVar) {
        this.f122125a = ctVar;
        this.f122126b = ahVar;
        this.f122127c = coVar;
    }

    public final void run() {
        C46776ct ctVar = this.f122125a;
        C58817ah ahVar = this.f122126b;
        C46771co coVar = this.f122127c;
        if (ahVar != null) {
            ctVar.f122130a.remove(ahVar);
        }
        ctVar.f122131b.mo50787a(C60866ct.f164955a, ((C46883w) coVar).f122324b);
    }
}
