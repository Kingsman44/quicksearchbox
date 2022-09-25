package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139011k;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139012l;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.c */
/* compiled from: PG */
public final /* synthetic */ class C117266c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117271h f325512a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f325513b;

    /* renamed from: c */
    public final /* synthetic */ String f325514c;

    /* renamed from: d */
    public final /* synthetic */ int f325515d;

    public /* synthetic */ C117266c(C117271h hVar, int i, C63088z zVar, String str) {
        this.f325512a = hVar;
        this.f325515d = i;
        this.f325513b = zVar;
        this.f325514c = str;
    }

    public final Object apply(Object obj) {
        C117271h hVar = this.f325512a;
        int i = this.f325515d;
        C63088z zVar = this.f325513b;
        String str = this.f325514c;
        C139012l lVar = (C139012l) obj;
        hVar.mo103224c(C89849ae.SELECTABLE_SEARCH_WIDGET_ICON_DOWNLOAD_COMPLETED, i);
        C139011k kVar = (C139011k) C139012l.f378057d.createBuilder();
        kVar.copyOnWrite();
        C139012l lVar2 = (C139012l) kVar.instance;
        lVar2.f378059a |= 1;
        lVar2.f378060b = zVar;
        kVar.copyOnWrite();
        C139012l lVar3 = (C139012l) kVar.instance;
        str.getClass();
        lVar3.f378059a |= 2;
        lVar3.f378061c = str;
        return (C139012l) kVar.build();
    }
}
