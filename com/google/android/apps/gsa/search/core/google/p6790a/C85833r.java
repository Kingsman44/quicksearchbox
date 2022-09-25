package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21680j;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.r */
/* compiled from: PG */
public final /* synthetic */ class C85833r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C52518us f232082a;

    public /* synthetic */ C85833r(C52518us usVar) {
        this.f232082a = usVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C52518us usVar = this.f232082a;
        C21680j jVar = (C21680j) obj;
        long a = jVar.mo27047a();
        usVar.copyOnWrite();
        C52522uw uwVar = (C52522uw) usVar.instance;
        C52522uw uwVar2 = C52522uw.f137864j;
        uwVar.f137866a |= 4;
        uwVar.f137869d = a;
        String b = jVar.mo27048b();
        usVar.copyOnWrite();
        C52522uw uwVar3 = (C52522uw) usVar.instance;
        b.getClass();
        uwVar3.f137866a |= 8;
        uwVar3.f137870e = b;
        String c = jVar.mo27049c();
        usVar.copyOnWrite();
        C52522uw uwVar4 = (C52522uw) usVar.instance;
        c.getClass();
        uwVar4.f137866a |= 16;
        uwVar4.f137871f = c;
        return C60856cj.m92900i((C52522uw) usVar.build());
    }
}
