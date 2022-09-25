package com.google.android.setupcompat.template;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.C45252d;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* renamed from: com.google.android.setupcompat.template.h */
/* compiled from: PG */
public final class C45281h implements C45280g {

    /* renamed from: a */
    private final C45251c f118293a;

    /* renamed from: b */
    private StatusBarBackgroundLayout f118294b;

    /* renamed from: c */
    private LinearLayout f118295c;

    /* renamed from: d */
    private final View f118296d;

    public C45281h(C45251c cVar, Window window, AttributeSet attributeSet, int i) {
        this.f118293a = cVar;
        View h = cVar.mo49127h(R.id.suc_layout_status);
        if (h != null) {
            if (h instanceof StatusBarBackgroundLayout) {
                this.f118294b = (StatusBarBackgroundLayout) h;
            } else {
                this.f118295c = (LinearLayout) h;
            }
            View decorView = window.getDecorView();
            this.f118296d = decorView;
            window.setStatusBarColor(0);
            TypedArray obtainStyledAttributes = cVar.getContext().obtainStyledAttributes(attributeSet, C45252d.f118193d, i, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, (decorView.getSystemUiVisibility() & 8192) == 8192);
            if (cVar.mo49121f()) {
                Context context = cVar.getContext();
                z = C45240c.m80574e(context).mo49105j(context, C45238a.CONFIG_LIGHT_STATUS_BAR, false);
            }
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
            }
            mo49185a(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
    }

    /* renamed from: a */
    public final void mo49185a(Drawable drawable) {
        if (this.f118293a.mo49121f() && !this.f118293a.mo49122g()) {
            Context context = this.f118293a.getContext();
            drawable = C45240c.m80574e(context).mo49101c(context, C45238a.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.f118294b;
        if (statusBarBackgroundLayout == null) {
            this.f118295c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.f118306a = drawable;
        boolean z = true;
        statusBarBackgroundLayout.setWillNotDraw(drawable == null);
        if (drawable == null) {
            z = false;
        }
        statusBarBackgroundLayout.setFitsSystemWindows(z);
        statusBarBackgroundLayout.invalidate();
    }
}
