package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.af */
/* compiled from: PG */
public final class C88761af {

    /* renamed from: g */
    private static final Animation f240146g;

    /* renamed from: a */
    public final Context f240147a;

    /* renamed from: b */
    public final HashMap f240148b = new HashMap();

    /* renamed from: c */
    public final HashMap f240149c = new HashMap();

    /* renamed from: d */
    public final HashMap f240150d = new HashMap();

    /* renamed from: e */
    public String f240151e;

    /* renamed from: f */
    public int f240152f;

    static {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        f240146g = alphaAnimation;
        alphaAnimation.setDuration(500);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
    }

    public C88761af(Context context) {
        this.f240147a = context;
        this.f240152f = 1;
    }

    /* renamed from: a */
    public final void mo82501a(ViewGroup viewGroup, String str) {
        if (this.f240148b.containsKey(str) && mo82502b()) {
            viewGroup.removeView((View) this.f240148b.get(str));
            this.f240152f = 1;
        }
    }

    /* renamed from: b */
    public final boolean mo82502b() {
        int i = this.f240152f;
        return i == 2 || i == 3;
    }
}
