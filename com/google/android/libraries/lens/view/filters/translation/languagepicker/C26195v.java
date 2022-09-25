package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.v */
/* compiled from: PG */
final class C26195v extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C26197x f71176a;

    public C26195v(C26197x xVar) {
        this.f71176a = xVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lens_translate_filter_language_no_results, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        new C26186m(view).f71164j.setText(this.f71176a.f71177a.getString(R.string.lens_translate_search_no_results, new Object[]{((C26137af) ((C26133ab) obj)).mo31373a()}));
    }
}
