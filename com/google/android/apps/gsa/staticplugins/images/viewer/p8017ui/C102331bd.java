package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bd */
/* compiled from: PG */
public final class C102331bd {

    /* renamed from: a */
    public final C102360cf f285593a;

    /* renamed from: b */
    public final View f285594b;

    /* renamed from: c */
    public final View f285595c;

    /* renamed from: d */
    public final View f285596d;

    /* renamed from: e */
    public final View f285597e;

    public C102331bd(View view, C102360cf cfVar) {
        this.f285593a = cfVar;
        View findViewById = view.findViewById(R.id.image_viewer_longpress_menu);
        this.f285594b = findViewById;
        this.f285595c = view.findViewById(R.id.image_viewer_download_menu_item);
        this.f285596d = view.findViewById(R.id.image_viewer_share_menu_item);
        this.f285597e = view.findViewById(R.id.image_viewer_visit_page_menu_item);
        C28292j jVar = new C28292j(38458);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        C28292j jVar2 = new C28292j(37611);
        jVar2.mo33795i(5);
        C28295m.m52919e(findViewById, jVar2);
        C28292j jVar3 = new C28292j(37684);
        jVar3.mo33795i(5);
        C28295m.m52919e(findViewById, jVar3);
        C28292j jVar4 = new C28292j(37685);
        jVar4.mo33795i(5);
        C28295m.m52919e(findViewById, jVar4);
    }
}
