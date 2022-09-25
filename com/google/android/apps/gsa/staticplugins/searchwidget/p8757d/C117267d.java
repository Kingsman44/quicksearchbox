package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139009i;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139010j;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.d */
/* compiled from: PG */
public final /* synthetic */ class C117267d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117271h f325516a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f325517b;

    /* renamed from: c */
    public final /* synthetic */ String f325518c;

    /* renamed from: d */
    public final /* synthetic */ int f325519d;

    public /* synthetic */ C117267d(C117271h hVar, int i, C63088z zVar, String str) {
        this.f325516a = hVar;
        this.f325519d = i;
        this.f325517b = zVar;
        this.f325518c = str;
    }

    public final Object apply(Object obj) {
        C117271h hVar = this.f325516a;
        int i = this.f325519d;
        C63088z zVar = this.f325517b;
        String str = this.f325518c;
        C139010j jVar = (C139010j) obj;
        hVar.mo103224c(C89849ae.SELECTABLE_SEARCH_WIDGET_ICON_DOWNLOAD_COMPLETED, i);
        C139009i iVar = (C139009i) C139010j.f378052d.createBuilder();
        iVar.copyOnWrite();
        C139010j jVar2 = (C139010j) iVar.instance;
        jVar2.f378054a |= 1;
        jVar2.f378055b = zVar;
        iVar.copyOnWrite();
        C139010j jVar3 = (C139010j) iVar.instance;
        str.getClass();
        jVar3.f378054a |= 2;
        jVar3.f378056c = str;
        return (C139010j) iVar.build();
    }
}
