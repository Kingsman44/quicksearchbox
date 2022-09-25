package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.e */
/* compiled from: PG */
final class C105460e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C105464i f294097a;

    public C105460e(C105464i iVar) {
        this.f294097a = iVar;
    }

    public final void run() {
        View findViewById = this.f294097a.f294102b.findViewById(R.id.bubble_snackbar_click_target);
        if (findViewById != null) {
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setVisibility(8);
            findViewById.setClickable(false);
        }
    }
}
