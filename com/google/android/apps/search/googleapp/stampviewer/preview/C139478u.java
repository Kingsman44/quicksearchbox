package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139356l;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.u */
/* compiled from: PG */
final class C139478u extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C139477t f379256a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139478u(long j, C139477t tVar) {
        super(j, 1000);
        this.f379256a = tVar;
    }

    public final void onFinish() {
        C47393f.m84236g(new C139356l(), this.f379256a);
    }

    public final void onTick(long j) {
        TextView textView = (TextView) this.f379256a.requireView().findViewById(R.id.googleapp_stamp_viewer_overlay_count_down);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(this.f379256a.getString(R.string.googleapp_stamp_viewer_preview_count_down, Integer.valueOf(((int) j) / 1000)));
        }
    }
}
