package com.google.android.apps.gsa.staticplugins.bisto.p7492j;

import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96631a;
import com.google.android.apps.gsa.staticplugins.bisto.p7534y.C96632b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.j.b */
/* compiled from: PG */
public final /* synthetic */ class C95472b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C95473c f267159a;

    public /* synthetic */ C95472b(C95473c cVar) {
        this.f267159a = cVar;
    }

    public final Object apply(Object obj) {
        C95473c cVar = this.f267159a;
        C96632b bVar = (C96632b) obj;
        C96631a aVar = (C96631a) bVar.toBuilder();
        long b = ((C21370a) cVar.f267160a.mo27525b()).mo26870b();
        aVar.copyOnWrite();
        C96632b bVar2 = (C96632b) aVar.instance;
        bVar2.f270320a |= 1;
        bVar2.f270321b = b;
        int i = bVar.f270322c;
        aVar.copyOnWrite();
        C96632b bVar3 = (C96632b) aVar.instance;
        bVar3.f270320a |= 2;
        bVar3.f270322c = i + 1;
        return (C96632b) aVar.build();
    }
}
