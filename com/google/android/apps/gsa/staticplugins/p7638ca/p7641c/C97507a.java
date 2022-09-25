package com.google.android.apps.gsa.staticplugins.p7638ca.p7641c;

import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100072o;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100077t;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.c.a */
/* compiled from: PG */
public final /* synthetic */ class C97507a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97508b f272310a;

    /* renamed from: b */
    public final /* synthetic */ SuggestionGridLayout f272311b;

    public /* synthetic */ C97507a(C97508b bVar, SuggestionGridLayout suggestionGridLayout) {
        this.f272310a = bVar;
        this.f272311b = suggestionGridLayout;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C97508b bVar = this.f272310a;
        SuggestionGridLayout suggestionGridLayout = this.f272311b;
        int i9 = 0;
        int i10 = 0;
        for (int i11 : suggestionGridLayout.f253367d) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        int max = Math.max(0, i10 - suggestionGridLayout.getPaddingTop());
        if (max != suggestionGridLayout.f253364a) {
            i9 = max;
        }
        if (bVar.f272315d != i9) {
            bVar.f272315d = i9;
            C100072o oVar = bVar.f272316e;
            if (oVar != null) {
                C100077t tVar = oVar.f279887a.f279889b;
                if (tVar.f279903i != i9) {
                    tVar.f279903i = i9;
                    tVar.mo91740k();
                }
            }
        }
    }
}
