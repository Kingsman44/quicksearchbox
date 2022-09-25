package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d */
/* compiled from: PG */
public final /* synthetic */ class C117263d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117275f f325506a;

    /* renamed from: b */
    public final /* synthetic */ String f325507b;

    /* renamed from: c */
    public final /* synthetic */ String f325508c;

    public /* synthetic */ C117263d(C117275f fVar, String str, String str2) {
        this.f325506a = fVar;
        this.f325507b = str;
        this.f325508c = str2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117275f fVar = this.f325506a;
        String str = this.f325507b;
        String str2 = this.f325508c;
        byte[] f = ((C89057m) obj).mo83036f();
        int length = f.length;
        C86337q b = fVar.f325550a.mo80076b();
        b.mo80068c("search_widget_doodle_image", f);
        b.mo80073h("search_widget_doodle_alt_text", str);
        b.mo80073h("search_widget_doodle_url", str2);
        b.apply();
        return fVar.f325553d.mo78806d();
    }
}
