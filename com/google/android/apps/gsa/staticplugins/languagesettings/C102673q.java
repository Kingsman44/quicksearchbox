package com.google.android.apps.gsa.staticplugins.languagesettings;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.C38497c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38494c;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.q */
/* compiled from: PG */
public final /* synthetic */ class C102673q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f286593a;

    public /* synthetic */ C102673q(String str) {
        this.f286593a = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f286593a;
        C38494c cVar = (C38494c) C38495d.f101847e.createBuilder();
        cVar.copyOnWrite();
        C38495d dVar = (C38495d) cVar.instance;
        dVar.f101849a |= 2;
        dVar.f101851c = str;
        return ((C38497c) obj).mo41447c((C38495d) cVar.build());
    }
}
