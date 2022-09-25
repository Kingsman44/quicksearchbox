package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118308af;
import com.google.android.apps.gsa.store.C118326q;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118335x;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7681g;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C98176ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274148a;

    /* renamed from: b */
    public final /* synthetic */ int f274149b;

    public /* synthetic */ C98176ad(C98211bl blVar, int i) {
        this.f274148a = blVar;
        this.f274149b = i;
    }

    public final C60870cx apply(Object obj) {
        C98211bl blVar = this.f274148a;
        int i = this.f274149b;
        C98203bd bdVar = (C98203bd) obj;
        if (bdVar.mo91014e()) {
            return C60856cj.m92900i(bdVar);
        }
        C118335x g = blVar.f274218h.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, 0));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274463g, 1));
        g.f328475b.mo55395g(C98324af.f274461e);
        g.f328474a.mo55395g(C98324af.f274464h);
        C58800sl lA = C98211bl.f254944c.iterator();
        while (lA.hasNext()) {
            C118302a aVar = C98324af.f274458b;
            int i2 = ((C7681g) lA.next()).f26835cv;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C118308af.m196474h(aVar));
            arrayList.add(C118308af.m196476j((long) i2));
            g.f328476c.mo55395g(C118326q.m196505a(arrayList, 6));
        }
        return blVar.mo91029v(g.mo103674a(), i, bdVar);
    }
}
