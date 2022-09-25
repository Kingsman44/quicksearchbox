package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.g.a.l */
/* compiled from: PG */
public final /* synthetic */ class C140350l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f381249a;

    /* renamed from: b */
    public final /* synthetic */ TextView f381250b;

    /* renamed from: c */
    public final /* synthetic */ ViewSwitcher f381251c;

    public /* synthetic */ C140350l(TextView textView, TextView textView2, ViewSwitcher viewSwitcher) {
        this.f381249a = textView;
        this.f381250b = textView2;
        this.f381251c = viewSwitcher;
    }

    public final void onClick(View view) {
        TextView textView = this.f381249a;
        TextView textView2 = this.f381250b;
        ViewSwitcher viewSwitcher = this.f381251c;
        textView.setText(R.string.podcasts_play_store_rate_title);
        textView2.setText(R.string.podcasts_play_store_rate_button);
        viewSwitcher.showNext();
    }
}
