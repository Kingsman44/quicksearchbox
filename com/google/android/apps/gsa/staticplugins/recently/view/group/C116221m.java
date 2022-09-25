package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.view.View;
import com.google.android.libraries.p10982ad.C147445i;
import com.google.android.libraries.p10982ad.C147446j;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.m */
/* compiled from: PG */
public final /* synthetic */ class C116221m implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C116226r f322272a;

    /* renamed from: b */
    public final /* synthetic */ C116214f f322273b;

    /* renamed from: c */
    public final /* synthetic */ C147446j f322274c;

    public /* synthetic */ C116221m(C116226r rVar, C116214f fVar, C147446j jVar) {
        this.f322272a = rVar;
        this.f322273b = fVar;
        this.f322274c = jVar;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C116226r rVar = this.f322272a;
        C116214f fVar = this.f322273b;
        C147446j jVar = this.f322274c;
        if (rVar.f322283d.contains(fVar)) {
            View view = fVar.f322258g;
            view.getClass();
            view.setAlpha(jVar.mo124175a());
        }
        if (jVar.mo124175a() == 1.0f) {
            rVar.f322297r = null;
            rVar.mo102619j();
        }
    }
}
