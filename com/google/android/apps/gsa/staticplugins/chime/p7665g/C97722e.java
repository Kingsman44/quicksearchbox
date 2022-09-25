package com.google.android.apps.gsa.staticplugins.chime.p7665g;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.data.impl.C29810o;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55575k;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.g.e */
/* compiled from: PG */
public final class C97722e implements C90991b {

    /* renamed from: a */
    public final C29823n f272848a;

    /* renamed from: b */
    public final C29810o f272849b;

    /* renamed from: c */
    private final C22871g f272850c;

    public C97722e(C29823n nVar, C29810o oVar, C22871g gVar) {
        this.f272848a = nVar;
        this.f272849b = oVar;
        this.f272850c = gVar;
    }

    /* renamed from: a */
    public static void m161971a(C91006f fVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29827r rVar = (C29827r) it.next();
            fVar.mo85279c("id").mo85276a(C90752i.m148229c(rVar.mo35063j()));
            C55586v a = rVar.mo35052a();
            fVar.mo85279c("title").mo85276a(C90752i.m148233g(a.f146661b));
            fVar.mo85279c("text").mo85276a(C90752i.m148233g(a.f146662c));
            C91005e c = fVar.mo85279c("channel");
            C55575k kVar = a.f146673n;
            if (kVar == null) {
                kVar = C55575k.f146629b;
            }
            c.mo85276a(C90752i.m148229c(kVar.f146631a));
            C91005e c2 = fVar.mo85279c("tray");
            int s = rVar.mo35072s();
            String str = s != 1 ? s != 2 ? s != 3 ? "null" : "REMOVE_FROM_SYSTEM_TRAY" : "SHOW_IN_SYSTEM_TRAY" : "SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED";
            if (s != 0) {
                c2.mo85276a(C90752i.m148229c(str));
                fVar.mo85279c("expiration").mo85276a(C90752i.m148230d(rVar.mo35056e()));
            } else {
                throw null;
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C60856cj.m92910s(this.f272850c.mo28207g("ChimeStorageDumpable#dump", new C97721d(this, fVar)));
    }
}
