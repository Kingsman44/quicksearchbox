package com.google.android.apps.gsa.search.shared.service;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88096p;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88123q;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88150r;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.service.ad */
/* compiled from: PG */
public final class C87676ad {

    /* renamed from: a */
    public static final C59071e f237013a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.service.ad");

    /* renamed from: b */
    public Parcelable f237014b;

    /* renamed from: c */
    public final C91097g f237015c;

    /* renamed from: d */
    public final C58833ax f237016d;

    /* renamed from: e */
    private final C87673aa f237017e;

    /* renamed from: f */
    private final C87682aj f237018f = new C87675ac(this);

    public C87676ad(C87673aa aaVar, C91097g gVar, C58833ax axVar) {
        this.f237017e = aaVar;
        this.f237015c = gVar;
        this.f237016d = axVar;
        if (!gVar.mo65092d()) {
            C59104x c = f237013a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientActivityStarter");
            ((C59052c) ((C59052c) c).mo56372aa(9771)).mo56386p("Intent starter does not support start activity for result");
        }
        if (!gVar.mo65093e()) {
            C59104x c2 = f237013a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ClientActivityStarter");
            ((C59052c) ((C59052c) c2).mo56372aa(9770)).mo56386p("Intent starter does not support start intent sender for result");
        }
    }

    /* renamed from: a */
    public final void mo81955a(int i, int i2, Intent intent, Parcelable parcelable) {
        C58976aa aaVar = C58975e.f156826a;
        C88123q qVar = (C88123q) C88150r.f238281d.createBuilder();
        qVar.copyOnWrite();
        C88150r rVar = (C88150r) qVar.instance;
        rVar.f238283a |= 1;
        rVar.f238284b = i;
        qVar.copyOnWrite();
        C88150r rVar2 = (C88150r) qVar.instance;
        rVar2.f238283a |= 2;
        rVar2.f238285c = i2;
        C88489j jVar = new C88489j(C87739bu.ACTIVITY_COMPLETED_WITH_RESULT);
        jVar.mo82014b(C88096p.f238183a, (C88150r) qVar.build());
        jVar.mo82015c(new StartActivityForResultEventCompoundParcelable(intent, parcelable));
        this.f237017e.mo81937i(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo81956b() {
        this.f237017e.mo81940l(this.f237018f, C88244um.START_ACTIVITY_FOR_RESULT);
    }

    /* renamed from: c */
    public final void mo81957c() {
        this.f237017e.mo81941m(this.f237018f, C88244um.START_ACTIVITY_FOR_RESULT);
    }
}
