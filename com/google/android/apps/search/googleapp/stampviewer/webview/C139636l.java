package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.googlequicksearchbox.R;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.l */
/* compiled from: PG */
public final /* synthetic */ class C139636l implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C139638n f379568a;

    public /* synthetic */ C139636l(C139638n nVar) {
        this.f379568a = nVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        View findViewById;
        View findViewById2;
        C139638n nVar = this.f379568a;
        if (((C139343y) obj).equals(C139343y.VIEWER_MODE_FULLSCREEN)) {
            nVar.f379596t = C139343y.VIEWER_MODE_FULLSCREEN;
            View view = nVar.f379580d.getView();
            if (!(view == null || (findViewById2 = view.findViewById(R.id.googleapp_stamp_viewer_bottom_bar)) == null)) {
                findViewById2.setVisibility(0);
            }
            View view2 = nVar.f379580d.getView();
            if (!(view2 == null || (findViewById = view2.findViewById(R.id.googleapp_stamp_viewer_fullscreen_status_bar)) == null)) {
                findViewById.setVisibility(0);
            }
            nVar.mo115118a();
            nVar.mo115124g("visible");
        }
    }
}
