package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.b */
/* compiled from: PG */
public final /* synthetic */ class C95253b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95258g f266500a;

    /* renamed from: b */
    public final /* synthetic */ Map f266501b;

    public /* synthetic */ C95253b(C95258g gVar, Map map) {
        this.f266500a = gVar;
        this.f266501b = map;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95258g gVar = this.f266500a;
        Map map = this.f266501b;
        Map map2 = (Map) obj;
        synchronized (gVar) {
            gVar.f266516g = null;
        }
        ((C89492cd) gVar.f266512c.mo27525b()).mo83376R(gVar.f266515f, map);
        gVar.f266513d.close();
    }
}
