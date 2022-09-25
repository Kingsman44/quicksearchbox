package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91812s;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91813t;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8128b.C105127i;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C105111r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105116w f293049a;

    public /* synthetic */ C105111r(C105116w wVar) {
        this.f293049a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105116w wVar = this.f293049a;
        C91812s sVar = (C91812s) C91813t.f256060d.createBuilder();
        boolean booleanValue = ((Boolean) wVar.f293056c.mo94536e().f63720e).booleanValue();
        sVar.copyOnWrite();
        C91813t tVar = (C91813t) sVar.instance;
        tVar.f256062a |= 2;
        tVar.f256064c = booleanValue;
        C23278b bVar = wVar.f293055b;
        bVar.mo28754e("OFFLINE_WARNING_CARD", wVar.mo28494O("TYPE_OFFLINE_WARNING"), C23245b.m43556a((C91813t) sVar.build()), bVar.f63752b.f63757a.f63585a.mo28704b());
        wVar.mo94573f((C105127i) obj);
    }
}
