package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.i */
/* compiled from: PG */
public final class C26182i {

    /* renamed from: a */
    public static final C59071e f71142a = C59071e.m91332i("com.google.android.libraries.lens.view.filters.translation.languagepicker.i");

    /* renamed from: b */
    public final int f71143b;

    /* renamed from: c */
    public final Context f71144c;

    /* renamed from: d */
    public final TextView f71145d;

    /* renamed from: e */
    public final CircularProgressIndicator f71146e;

    /* renamed from: f */
    public final C28306ab f71147f;

    /* renamed from: g */
    public final C28443m f71148g;

    /* renamed from: h */
    public final C26217r f71149h;

    /* renamed from: i */
    public final DownloadButtonLayout f71150i;

    /* renamed from: j */
    public final C26173bo f71151j;

    /* renamed from: k */
    public final DownloadStateImageView f71152k;

    /* renamed from: l */
    public final View f71153l;

    public C26182i(DownloadButtonLayout downloadButtonLayout, C28306ab abVar, C28443m mVar, C26217r rVar, C26173bo boVar) {
        this.f71147f = abVar;
        this.f71148g = mVar;
        this.f71149h = rVar;
        this.f71151j = boVar;
        Context context = downloadButtonLayout.getContext();
        this.f71144c = context;
        this.f71150i = downloadButtonLayout;
        LayoutInflater.from(context).inflate(R.layout.lens_translate_filter_language_picker_download_button, downloadButtonLayout, true);
        this.f71152k = (DownloadStateImageView) downloadButtonLayout.findViewById(R.id.lens_translate_download_icon);
        this.f71153l = downloadButtonLayout.findViewById(R.id.lens_translate_download_button_click_area);
        this.f71145d = (TextView) downloadButtonLayout.findViewById(R.id.lens_translate_download_button_label);
        this.f71146e = (CircularProgressIndicator) downloadButtonLayout.findViewById(R.id.lens_translate_progress_indicator);
        this.f71143b = context.getResources().getInteger(R.integer.lens_translate_download_progress_indicator_resolution);
    }

    /* renamed from: a */
    public static void m48348a(View view, int i, C28306ab abVar) {
        abVar.mo33802c(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
        view.setTag(R.id.is_bound_tag, true);
    }
}
