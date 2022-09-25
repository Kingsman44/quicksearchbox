package com.google.android.libraries.search.video.p3196f;

import android.os.CountDownTimer;
import android.text.Html;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.video.players.C41592w;

/* renamed from: com.google.android.libraries.search.video.f.c */
/* compiled from: PG */
final class C41509c extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C41511e f108435a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41509c(C41511e eVar, long j) {
        super(j, 100);
        this.f108435a = eVar;
    }

    public final void onFinish() {
        C41592w wVar = this.f108435a.f108447k;
        if (wVar != null) {
            wVar.mo44087j();
        }
    }

    public final void onTick(long j) {
        C41511e eVar = this.f108435a;
        TextView textView = eVar.f108443g;
        textView.getClass();
        textView.setText(Html.fromHtml(eVar.f108445i.getString(R.string.replay_count_down, new Object[]{Long.valueOf((j / 1000) + 1)})));
    }
}
