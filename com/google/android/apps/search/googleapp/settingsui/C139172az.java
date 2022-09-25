package com.google.android.apps.search.googleapp.settingsui;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5477g.C69678a;
import p5462h.p5480j.C69699g;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.az */
/* compiled from: PG */
public final class C139172az extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ int f378499a;

    /* renamed from: b */
    final /* synthetic */ View f378500b;

    /* renamed from: c */
    final /* synthetic */ C139219cn f378501c;

    public C139172az(int i, View view, C139219cn cnVar) {
        this.f378499a = i;
        this.f378500b = view;
        this.f378501c = cnVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        MenuItem findItem;
        float e = (float) C69699g.m101123e(recyclerView.computeVerticalScrollOffset(), this.f378499a);
        float f = e / ((float) this.f378499a);
        this.f378500b.setAlpha(1.0f - f);
        this.f378500b.setTranslationY(-e);
        C139219cn cnVar = this.f378501c;
        if (cnVar.f378646g && (findItem = cnVar.f378647h.mo2393g().findItem(R.id.googleapp_settings_search)) != null) {
            int a = C69678a.m101088a(f * 255.0f);
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                icon.setAlpha(a);
            }
            findItem.setVisible(a != 0);
        }
    }
}
