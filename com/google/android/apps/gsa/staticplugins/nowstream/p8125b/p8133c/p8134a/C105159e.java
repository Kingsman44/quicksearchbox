package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8133c.p8134a;

import android.view.Menu;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105150d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105152f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C105159e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105164j f293156a;

    /* renamed from: b */
    public final /* synthetic */ Menu f293157b;

    public /* synthetic */ C105159e(C105164j jVar, Menu menu) {
        this.f293156a = jVar;
        this.f293157b = menu;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105164j jVar = this.f293156a;
        Menu menu = this.f293157b;
        C105152f fVar = (C105152f) obj;
        menu.clear();
        for (int i = 0; i < fVar.f293125a.size(); i++) {
            C105150d dVar = (C105150d) fVar.f293125a.get(i);
            menu.add(0, dVar.f293121b, 0, dVar.f293122c);
        }
        jVar.f293167f = menu.add(0, 0, 0, jVar.f293165d.getResources().getString(R.string.header_feedback));
        jVar.f293168g = menu.add(0, 0, 0, jVar.f293165d.getResources().getString(R.string.header_help));
    }
}
