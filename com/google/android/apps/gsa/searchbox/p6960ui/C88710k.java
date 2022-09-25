package com.google.android.apps.gsa.searchbox.p6960ui;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.p3202c.C41643a;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.k */
/* compiled from: PG */
public final class C88710k extends C41643a implements C89199d {

    /* renamed from: a */
    public boolean f239901a = false;

    /* renamed from: b */
    public boolean f239902b = false;

    /* renamed from: d */
    private final Context f239903d;

    public C88710k(Context context) {
        this.f239903d = context;
    }

    /* renamed from: b */
    public final ForegroundColorSpan mo44235b(boolean z, boolean z2) {
        return new ForegroundColorSpan(this.f239903d.getResources().getColor((!this.f239902b || !z2) ? (this.f239901a || z) ? R.color.agsa_color_custom_suggestion_on_surface : R.color.agsa_color_custom_suggestion_on_surface_variant : R.color.agsa_color_custom_suggestion_on_surface_visited));
    }

    /* renamed from: c */
    public final StyleSpan mo44236c(boolean z) {
        int i = 0;
        if (this.f239901a && z) {
            i = 1;
        }
        return new StyleSpan(i);
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88709j jVar = (C88709j) obj;
        this.f239902b = jVar.f239864U;
        this.f239901a = jVar.f239863T;
    }
}
