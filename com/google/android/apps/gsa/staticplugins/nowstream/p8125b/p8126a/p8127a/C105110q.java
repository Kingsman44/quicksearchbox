package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91802i;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91803j;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8128b.C105119a;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C105110q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105116w f293048a;

    public /* synthetic */ C105110q(C105116w wVar) {
        this.f293048a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105116w wVar = this.f293048a;
        C105119a aVar = (C105119a) obj;
        C23278b bVar = wVar.f293055b;
        C23129y O = wVar.mo28494O("TYPE_GOOGLE_PLAY_SERVICES");
        C91802i iVar = (C91802i) C91803j.f256027c.createBuilder();
        int i = aVar.f293092a;
        iVar.copyOnWrite();
        C91803j jVar = (C91803j) iVar.instance;
        jVar.f256029a |= 1;
        jVar.f256030b = i;
        bVar.mo28754e("NAME_GOOGLE_PLAY_SERVICES_ERROR", O, C23245b.m43556a((C91803j) iVar.build()), bVar.f63752b.f63757a.f63585a.mo28704b());
        wVar.mo94573f(aVar);
    }
}
