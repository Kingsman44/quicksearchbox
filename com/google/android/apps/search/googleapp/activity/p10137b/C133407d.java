package com.google.android.apps.search.googleapp.activity.p10137b;

import android.support.p033v7.view.menu.C0480t;
import android.view.MenuItem;
import com.google.android.apps.search.googleapp.collections.C133514l;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.C137404d;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139709a;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139711c;
import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.material.navigation.C44825l;
import com.google.android.material.navigation.NavigationBarView;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.activity.b.d */
/* compiled from: PG */
public final /* synthetic */ class C133407d implements C44825l {

    /* renamed from: a */
    public final /* synthetic */ C133409f f363507a;

    /* renamed from: b */
    public final /* synthetic */ C28452b f363508b;

    /* renamed from: c */
    public final /* synthetic */ NavigationBarView f363509c;

    public /* synthetic */ C133407d(C133409f fVar, C28452b bVar, NavigationBarView navigationBarView) {
        this.f363507a = fVar;
        this.f363508b = bVar;
        this.f363509c = navigationBarView;
    }

    /* renamed from: a */
    public final boolean mo48238a(MenuItem menuItem) {
        C133409f fVar = this.f363507a;
        C28452b bVar = this.f363508b;
        NavigationBarView navigationBarView = this.f363509c;
        int i = ((C0480t) menuItem).f1682a;
        fVar.f363513c.mo33853c(C28442l.m53142h().mo33894a(), bVar.mo33908b(Integer.valueOf(i)));
        if (i == R.id.googleapp_navigation_bar_search) {
            C139765f fVar2 = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar = C139779t.SEARCH;
            fVar2.copyOnWrite();
            C139767h hVar = (C139767h) fVar2.instance;
            hVar.f379872b = tVar.f379907i;
            hVar.f379871a |= 1;
            boolean b = fVar.f363518h.mo110979b();
            fVar2.copyOnWrite();
            C139767h hVar2 = (C139767h) fVar2.instance;
            hVar2.f379871a |= 2;
            hVar2.f379873c = b;
            C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
            C137404d dVar = (C137404d) C137411e.f373755g.createBuilder();
            C139704d dVar2 = C139704d.SEARCH_TAB;
            dVar.copyOnWrite();
            C137411e eVar = (C137411e) dVar.instance;
            eVar.f373758b = dVar2.f379715p;
            eVar.f373757a |= 1;
            jVar.copyOnWrite();
            C139770k kVar = (C139770k) jVar.instance;
            C137411e eVar2 = (C137411e) dVar.build();
            eVar2.getClass();
            kVar.f379885b = eVar2;
            kVar.f379884a = 2;
            fVar2.copyOnWrite();
            C139767h hVar3 = (C139767h) fVar2.instance;
            C139770k kVar2 = (C139770k) jVar.build();
            kVar2.getClass();
            hVar3.f379877g = kVar2;
            hVar3.f379871a |= 16;
            C47393f.m84237h(new C139760a((C139767h) fVar2.build()), navigationBarView);
        } else if (i == R.id.googleapp_navigation_bar_discover) {
            C47393f.m84237h(C139762c.m227230b(C139779t.HOME_SCREEN), navigationBarView);
        } else if (i == R.id.googleapp_navigation_bar_collections) {
            C139765f fVar3 = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar2 = C139779t.COLLECTIONS;
            fVar3.copyOnWrite();
            C139767h hVar4 = (C139767h) fVar3.instance;
            hVar4.f379872b = tVar2.f379907i;
            hVar4.f379871a |= 1;
            boolean z = fVar.f363519i;
            fVar3.copyOnWrite();
            C139767h hVar5 = (C139767h) fVar3.instance;
            hVar5.f379871a = 2 | hVar5.f379871a;
            hVar5.f379873c = z;
            C139769j jVar2 = (C139769j) C139770k.f379882c.createBuilder();
            C133514l lVar = C133514l.f363786c;
            jVar2.copyOnWrite();
            C139770k kVar3 = (C139770k) jVar2.instance;
            lVar.getClass();
            kVar3.f379885b = lVar;
            kVar3.f379884a = 3;
            fVar3.copyOnWrite();
            C139767h hVar6 = (C139767h) fVar3.instance;
            C139770k kVar4 = (C139770k) jVar2.build();
            kVar4.getClass();
            hVar6.f379877g = kVar4;
            hVar6.f379871a |= 16;
            C47393f.m84237h(new C139760a((C139767h) fVar3.build()), navigationBarView);
        } else if (i == R.id.googleapp_navigation_bar_tabs) {
            C139765f fVar4 = (C139765f) C139767h.f379869k.createBuilder();
            C139779t tVar3 = C139779t.TABS;
            fVar4.copyOnWrite();
            C139767h hVar7 = (C139767h) fVar4.instance;
            hVar7.f379872b = tVar3.f379907i;
            hVar7.f379871a |= 1;
            fVar4.copyOnWrite();
            C139767h hVar8 = (C139767h) fVar4.instance;
            hVar8.f379871a |= 2;
            hVar8.f379873c = true;
            C139769j jVar3 = (C139769j) C139770k.f379882c.createBuilder();
            C139709a aVar = (C139709a) C139712d.f379748d.createBuilder();
            C139711c cVar = C139711c.BOTTOM_NAVIGATION;
            aVar.copyOnWrite();
            C139712d dVar3 = (C139712d) aVar.instance;
            dVar3.f379751b = cVar.f379747d;
            dVar3.f379750a |= 1;
            jVar3.copyOnWrite();
            C139770k kVar5 = (C139770k) jVar3.instance;
            C139712d dVar4 = (C139712d) aVar.build();
            dVar4.getClass();
            kVar5.f379885b = dVar4;
            kVar5.f379884a = 5;
            fVar4.copyOnWrite();
            C139767h hVar9 = (C139767h) fVar4.instance;
            C139770k kVar6 = (C139770k) jVar3.build();
            kVar6.getClass();
            hVar9.f379877g = kVar6;
            hVar9.f379871a |= 16;
            C47393f.m84237h(new C139760a((C139767h) fVar4.build()), navigationBarView);
        } else if (i == R.id.googleapp_navigation_bar_inbox) {
            C47393f.m84237h(C139762c.m227230b(C139779t.INBOX), navigationBarView);
        }
        return true;
    }
}
