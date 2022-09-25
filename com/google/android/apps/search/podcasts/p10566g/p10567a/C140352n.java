package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140969a;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140975g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.search.podcasts.g.a.n */
/* compiled from: PG */
public final /* synthetic */ class C140352n implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ View f381255a;

    /* renamed from: b */
    public final /* synthetic */ TextView f381256b;

    public /* synthetic */ C140352n(View view, TextView textView) {
        this.f381255a = view;
        this.f381256b = textView;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        View view = this.f381255a;
        TextView textView = this.f381256b;
        if (TextUtils.equals(textView.getText(), view.getContext().getString(R.string.podcasts_play_store_rate_title))) {
            return new C140975g(C140969a.RATE_APP);
        }
        return new C140975g(C140969a.SEND_FEEDBACK);
    }
}
