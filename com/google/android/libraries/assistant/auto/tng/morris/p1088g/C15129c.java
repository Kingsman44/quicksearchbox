package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c */
/* compiled from: PG */
public final /* synthetic */ class C15129c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ View f45410a;

    /* renamed from: b */
    public final /* synthetic */ ContextThemeWrapper f45411b;

    public /* synthetic */ C15129c(View view, ContextThemeWrapper contextThemeWrapper) {
        this.f45410a = view;
        this.f45411b = contextThemeWrapper;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        View view = this.f45410a;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f45411b, R.anim.help_text_out);
        loadAnimation.setAnimationListener(new C15162d(view));
        view.startAnimation(loadAnimation);
        return C60866ct.f164955a;
    }
}
