package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.view.View;
import com.google.android.libraries.p10982ad.C147445i;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.aa */
/* compiled from: PG */
public final /* synthetic */ class C116204aa implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ RecentlyView f322239a;

    /* renamed from: b */
    public final /* synthetic */ C116226r f322240b;

    /* renamed from: c */
    public final /* synthetic */ C147446j f322241c;

    /* renamed from: d */
    public final /* synthetic */ float f322242d;

    public /* synthetic */ C116204aa(RecentlyView recentlyView, C116226r rVar, C147446j jVar, float f) {
        this.f322239a = recentlyView;
        this.f322240b = rVar;
        this.f322241c = jVar;
        this.f322242d = f;
    }

    /* renamed from: a */
    public final void mo18517a() {
        RecentlyView recentlyView = this.f322239a;
        C116226r rVar = this.f322240b;
        C147446j jVar = this.f322241c;
        float f = this.f322242d;
        if (recentlyView.f322216d.contains(rVar)) {
            C58485gu guVar = rVar.f322283d;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                View view = ((C116214f) guVar.get(i)).f322258g;
                view.getClass();
                view.setAlpha(jVar.mo124175a());
            }
            View view2 = rVar.f322286g.f322258g;
            view2.getClass();
            view2.setAlpha(jVar.mo124175a() * f);
        }
    }
}
