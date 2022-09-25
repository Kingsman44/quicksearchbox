package com.google.android.libraries.surveys.internal.view;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.surveys.internal.view.y */
/* compiled from: PG */
final class C43167y extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ View f112863a;

    /* renamed from: b */
    final /* synthetic */ C43168z f112864b;

    public C43167y(C43168z zVar, View view) {
        this.f112864b = zVar;
        this.f112863a = view;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.f112863a.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            this.f112863a.findViewById(R.id.survey_system_info_dialog_title).setElevation((float) this.f112864b.getResources().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        }
        this.f112863a.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
