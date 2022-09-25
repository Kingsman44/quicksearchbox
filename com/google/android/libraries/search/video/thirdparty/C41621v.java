package com.google.android.libraries.search.video.thirdparty;

import android.view.View;
import androidx.media3.p174ui.LegacyPlayerControlView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.video.thirdparty.v */
/* compiled from: PG */
public final /* synthetic */ class C41621v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41623x f108791a;

    public /* synthetic */ C41621v(C41623x xVar) {
        this.f108791a = xVar;
    }

    public final void onClick(View view) {
        C41623x xVar = this.f108791a;
        LegacyPlayerControlView legacyPlayerControlView = xVar.f108800e;
        if (legacyPlayerControlView != null) {
            legacyPlayerControlView.mo7665c();
        }
        if (xVar.f108802g.getVisibility() == 0) {
            xVar.f108802g.setVisibility(8);
            xVar.f108801f.setImageResource(R.drawable.quantum_ic_subtitles_white_24);
            xVar.f108801f.setContentDescription(xVar.f108796a.getString(R.string.third_party_subtitles_on_description));
            return;
        }
        xVar.f108802g.setVisibility(0);
        xVar.f108801f.setImageResource(R.drawable.quantum_ic_subtitles_off_white_24);
        xVar.f108801f.setContentDescription(xVar.f108796a.getString(R.string.third_party_subtitles_off_description));
    }
}
