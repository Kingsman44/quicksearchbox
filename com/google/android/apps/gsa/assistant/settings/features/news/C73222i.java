package com.google.android.apps.gsa.assistant.settings.features.news;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.news.i */
/* compiled from: PG */
final class C73222i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C73223j f194038a;

    public C73222i(C73223j jVar) {
        this.f194038a = jVar;
    }

    public final void onClick(View view) {
        C73223j jVar = this.f194038a;
        TextView textView = jVar.f194040d;
        if (textView != null) {
            if (jVar.f194041e) {
                textView.setMaxLines(2);
                this.f194038a.f194040d.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                textView.setMaxLines(Integer.MAX_VALUE);
            }
        }
        C73223j jVar2 = this.f194038a;
        jVar2.f194041e = !jVar2.f194041e;
    }
}
