package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C133193c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Instant f363057a;

    public /* synthetic */ C133193c(Instant instant) {
        this.f363057a = instant;
    }

    public final Object apply(Object obj) {
        Instant instant = this.f363057a;
        C46690ah ahVar = C133202l.f363066a;
        C133191a aVar = (C133191a) ((C133192b) obj).toBuilder();
        aVar.copyOnWrite();
        C133192b bVar = (C133192b) aVar.instance;
        bVar.f363052a |= 1;
        bVar.f363053b = 0;
        aVar.copyOnWrite();
        C133192b bVar2 = (C133192b) aVar.instance;
        bVar2.f363052a |= 2;
        bVar2.f363054c = false;
        C63042fg c = C62950b.m95472c(instant);
        aVar.copyOnWrite();
        C133192b bVar3 = (C133192b) aVar.instance;
        c.getClass();
        bVar3.f363055d = c;
        bVar3.f363052a |= 4;
        return (C133192b) aVar.build();
    }
}
