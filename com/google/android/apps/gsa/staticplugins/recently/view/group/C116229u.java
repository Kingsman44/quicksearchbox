package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.util.Property;
import android.view.View;
import com.google.android.libraries.p10982ad.C147445i;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.u */
/* compiled from: PG */
public final /* synthetic */ class C116229u implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C116226r f322303a;

    /* renamed from: b */
    public final /* synthetic */ C147446j f322304b;

    /* renamed from: c */
    public final /* synthetic */ float f322305c;

    public /* synthetic */ C116229u(C116226r rVar, C147446j jVar, float f) {
        this.f322303a = rVar;
        this.f322304b = jVar;
        this.f322305c = f;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C116226r rVar = this.f322303a;
        C147446j jVar = this.f322304b;
        float f = this.f322305c;
        Property property = RecentlyView.f322190a;
        C58485gu guVar = rVar.f322283d;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            View view = ((C116214f) guVar.get(i)).f322258g;
            if (view != null) {
                view.setAlpha(jVar.mo124175a());
            }
        }
        View view2 = rVar.f322286g.f322258g;
        if (view2 != null) {
            view2.setAlpha(jVar.mo124175a() * f);
        }
    }
}
