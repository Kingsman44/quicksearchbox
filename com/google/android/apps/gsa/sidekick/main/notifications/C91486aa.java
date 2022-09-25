package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.p489g.p493c.C9131d;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.aa */
/* compiled from: PG */
public final class C91486aa {

    /* renamed from: a */
    public final C118561t f255195a;

    public C91486aa(C118561t tVar) {
        this.f255195a = tVar;
    }

    /* renamed from: a */
    public final void mo85830a(Collection collection) {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 16;
        agVar.f328826f = true;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        ajVar.mo58885m(C9131d.f31425b, new ArrayList(collection));
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar2.f328827g = akVar;
        agVar2.f328821a |= 32;
        this.f255195a.mo103754e(C118522by.NOW_NOTIFICATION_DELETE, (C118472ag) afVar.build());
    }
}
