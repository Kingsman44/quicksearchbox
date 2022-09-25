package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.g */
/* compiled from: PG */
public final /* synthetic */ class C117270g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117271h f325524a;

    /* renamed from: b */
    public final /* synthetic */ Uri f325525b;

    /* renamed from: c */
    public final /* synthetic */ int f325526c;

    public /* synthetic */ C117270g(C117271h hVar, Uri uri, int i) {
        this.f325524a = hVar;
        this.f325525b = uri;
        this.f325526c = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117271h hVar = this.f325524a;
        Uri uri = this.f325525b;
        int i = this.f325526c;
        C59104x c = C117271h.f325527a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SelectableWdgtMgr");
        ((C59052c) ((C59052c) c).mo56372aa(32801)).mo56354G("Failed to load image from %s, Error %s", uri, ((Throwable) obj).getMessage());
        hVar.mo103224c(C89849ae.SELECTABLE_SEARCH_WIDGET_ICON_DOWNLOAD_FAILED, i);
        return null;
    }
}
