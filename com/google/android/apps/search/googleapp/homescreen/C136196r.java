package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.homescreen.searchbox.C136199b;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.apps.search.lens.p10547a.C139917b;
import com.google.android.apps.search.lens.p10547a.C139918c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.lens.p4707j.C62433bj;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.r */
/* compiled from: PG */
final class C136196r implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136193o f370934a;

    public C136196r(C136193o oVar) {
        this.f370934a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136193o oVar = this.f370934a;
        C69664n.m101061g((C136199b) bVar, "searchboxLensClickEvent");
        C139916a aVar = oVar.f370930y;
        C139917b bVar2 = (C139917b) C139918c.f380355d.createBuilder();
        C62433bj bjVar = C62433bj.LENS_IN_SEARCH_PLATE_HOMESCREEN;
        bVar2.copyOnWrite();
        C139918c cVar = (C139918c) bVar2.instance;
        cVar.f380358b = bjVar.f168594ao;
        cVar.f380357a |= 1;
        aVar.mo41490e(bVar2.build());
        return C47392e.f123115a;
    }
}
