package com.google.android.apps.search.googleapp.tabs.manager.p10525b;

import android.net.Uri;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135457c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135465k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.b.a */
/* compiled from: PG */
public final /* synthetic */ class C139732a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139733b f379818a;

    /* renamed from: b */
    public final /* synthetic */ String f379819b;

    public /* synthetic */ C139732a(C139733b bVar, String str) {
        this.f379818a = bVar;
        this.f379819b = str;
    }

    public final Object apply(Object obj) {
        C139733b bVar = this.f379818a;
        String str = this.f379819b;
        if (!((C135465k) obj).f369076b) {
            return null;
        }
        C135457c cVar = bVar.f379822c;
        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
        C135461g gVar = C135461g.TABS_MANAGER;
        eVar.copyOnWrite();
        C135462h hVar = (C135462h) eVar.instance;
        hVar.f369064d = gVar.f369058p;
        hVar.f369061a |= 4;
        eVar.copyOnWrite();
        C135462h hVar2 = (C135462h) eVar.instance;
        hVar2.f369061a |= 256;
        hVar2.f369070j = true;
        eVar.copyOnWrite();
        C135462h hVar3 = (C135462h) eVar.instance;
        str.getClass();
        hVar3.f369061a |= 8;
        hVar3.f369065e = str;
        return cVar.mo112350b((Uri) null, eVar);
    }
}
