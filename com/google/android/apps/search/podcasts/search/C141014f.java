package com.google.android.apps.search.podcasts.search;

import android.view.View;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.podcasts.search.f */
/* compiled from: PG */
final class C141014f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f382831a;

    public C141014f(EditText editText) {
        this.f382831a = editText;
    }

    public final void onClick(View view) {
        this.f382831a.setText(BuildConfig.FLAVOR);
    }
}
