package com.google.android.material.appbar;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.appbar.c */
/* compiled from: PG */
public final /* synthetic */ class C44507c implements View.OnUnhandledKeyEventListener {

    /* renamed from: a */
    public final /* synthetic */ View f115735a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f115736b;

    public /* synthetic */ C44507c(View view, AppBarLayout appBarLayout) {
        this.f115735a = view;
        this.f115736b = appBarLayout;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        View view2 = this.f115735a;
        AppBarLayout appBarLayout = this.f115736b;
        if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                double measuredHeight = (double) view2.getMeasuredHeight();
                Double.isNaN(measuredHeight);
                if (((double) view2.getScrollY()) < measuredHeight * 0.1d) {
                    appBarLayout.mo47405o(true, C2043bi.m5570ax(appBarLayout), true);
                }
            } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view2.getScrollY() > 0) {
                appBarLayout.mo47405o(false, C2043bi.m5570ax(appBarLayout), true);
            }
        }
        return false;
    }
}
