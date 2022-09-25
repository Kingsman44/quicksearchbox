package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.d */
/* compiled from: PG */
public final class C90691d {

    /* renamed from: a */
    public final Context f253664a;

    /* renamed from: b */
    public final C68214a f253665b;

    /* renamed from: c */
    public final int f253666c;

    /* renamed from: d */
    public boolean f253667d;

    /* renamed from: e */
    public final FrameLayout f253668e;

    /* renamed from: f */
    public final int f253669f;

    /* renamed from: g */
    public final SearchPlate f253670g;

    /* renamed from: h */
    public View f253671h;

    public C90691d(C87673aa aaVar, Context context, FrameLayout frameLayout, int i, SearchPlate searchPlate, C68214a aVar) {
        this.f253664a = context;
        this.f253668e = frameLayout;
        this.f253669f = i;
        this.f253670g = searchPlate;
        this.f253665b = aVar;
        this.f253666c = frameLayout.getResources().getDimensionPixelSize(R.dimen.search_plate_progress_bar_padding);
        aaVar.mo81940l(new C90690c(this), C88244um.ATTACH_MATERIAL_PROGRESS_BAR);
        searchPlate.f240729b.mo83073a(new C90689b(frameLayout));
    }
}
