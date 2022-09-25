package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C116181j implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C116166ai f322150a;

    /* renamed from: b */
    public final /* synthetic */ View f322151b;

    public /* synthetic */ C116181j(C116166ai aiVar, View view) {
        this.f322150a = aiVar;
        this.f322151b = view;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C116166ai aiVar = this.f322150a;
        this.f322151b.getLayoutParams().height = aiVar.f322103e.getDimensionPixelOffset(true != ((Boolean) obj).booleanValue() ? R.dimen.action_bar_height : R.dimen.action_bar_height_short);
        aiVar.mo28297il().requestLayout();
    }
}
