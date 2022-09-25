package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.at */
/* compiled from: PG */
public final class C117205at implements C86091a {

    /* renamed from: a */
    private final C89257aa f325367a;

    /* renamed from: b */
    private final C118561t f325368b;

    public C117205at(C89257aa aaVar, C118561t tVar) {
        this.f325367a = aaVar;
        this.f325368b = tVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (this.f325367a.mo83220l()) {
            this.f325367a.mo83219k();
            if (this.f325367a.mo83226s().length != 0) {
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 2;
                agVar.f328823c = 60000;
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328824d = 1;
                agVar2.f328821a |= 4;
                this.f325368b.mo103754e(C118522by.SEARCH_WIDGET_REFRESH_TASK, (C118472ag) afVar.build());
            }
        }
        this.f325367a.mo83218j();
        if (z2) {
            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
            afVar2.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar2.instance;
            agVar3.f328821a |= 2;
            agVar3.f328823c = 60000;
            afVar2.copyOnWrite();
            C118472ag agVar4 = (C118472ag) afVar2.instance;
            agVar4.f328824d = 1;
            agVar4.f328821a |= 4;
            this.f325368b.mo103754e(C118522by.DOODLE_SCHEDULE_SYNC_TASK, (C118472ag) afVar2.build());
        }
    }
}
