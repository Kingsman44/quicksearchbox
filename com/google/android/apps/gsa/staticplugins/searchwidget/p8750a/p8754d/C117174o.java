package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.o */
/* compiled from: PG */
final class C117174o implements C23123s {

    /* renamed from: a */
    final /* synthetic */ C117182w f325274a;

    public C117174o(C117182w wVar) {
        this.f325274a = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28366a(Object obj) {
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            this.f325274a.f325288f.setVisibility(0);
            this.f325274a.f325289g.setVisibility(4);
        } else if (intValue != 1) {
            ((C59052c) ((C59052c) C117182w.f325282a.mo56226d()).mo56372aa(32777)).mo56386p("Unknown panel opton triggered from model change");
        } else {
            this.f325274a.f325288f.setVisibility(4);
            this.f325274a.f325289g.setVisibility(0);
            this.f325274a.mo28297il().post(new C117173n(this));
        }
    }
}
