package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.popovercontainer.C31032ag;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.l */
/* compiled from: PG */
public final /* synthetic */ class C30686l implements C31032ag {

    /* renamed from: a */
    public static final /* synthetic */ C30686l f82837a = new C30686l();

    private /* synthetic */ C30686l() {
    }

    /* renamed from: a */
    public final View mo36355a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
        frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
        return frameLayout;
    }
}
