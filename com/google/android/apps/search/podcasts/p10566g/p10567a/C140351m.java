package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.g.a.m */
/* compiled from: PG */
public final /* synthetic */ class C140351m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f381252a;

    /* renamed from: b */
    public final /* synthetic */ TextView f381253b;

    /* renamed from: c */
    public final /* synthetic */ ViewSwitcher f381254c;

    public /* synthetic */ C140351m(TextView textView, TextView textView2, ViewSwitcher viewSwitcher) {
        this.f381252a = textView;
        this.f381253b = textView2;
        this.f381254c = viewSwitcher;
    }

    public final void onClick(View view) {
        TextView textView = this.f381252a;
        TextView textView2 = this.f381253b;
        ViewSwitcher viewSwitcher = this.f381254c;
        textView.setText(R.string.podcasts_play_store_improve_title);
        textView2.setText(R.string.podcasts_send_feedback);
        viewSwitcher.showNext();
    }
}
