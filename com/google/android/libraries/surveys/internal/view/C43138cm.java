package com.google.android.libraries.surveys.internal.view;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.surveys.internal.view.cm */
/* compiled from: PG */
final class C43138cm extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ View f112822a;

    /* renamed from: b */
    final /* synthetic */ C43139cn f112823b;

    public C43138cm(C43139cn cnVar, View view) {
        this.f112823b = cnVar;
        this.f112822a = view;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.f112822a.findViewById(R.id.survey_system_info_dialog_title).setElevation(0.0f);
        } else {
            this.f112822a.findViewById(R.id.survey_system_info_dialog_title).setElevation((float) this.f112823b.getResources().getDimensionPixelSize(R.dimen.survey_system_info_dialog_title_elevation));
        }
        this.f112822a.findViewById(R.id.survey_system_info_dialog_section_divider).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
