package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.y */
/* compiled from: PG */
public final /* synthetic */ class C113708y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterListeningBoxesView f314907a;

    /* renamed from: b */
    public final /* synthetic */ int f314908b;

    public /* synthetic */ C113708y(InterpreterListeningBoxesView interpreterListeningBoxesView, int i) {
        this.f314907a = interpreterListeningBoxesView;
        this.f314908b = i;
    }

    public final void run() {
        InterpreterListeningBoxesView interpreterListeningBoxesView = this.f314907a;
        int i = this.f314908b;
        C58976aa aaVar = C58975e.f156826a;
        if (interpreterListeningBoxesView.f314749c && interpreterListeningBoxesView.getChildCount() <= interpreterListeningBoxesView.f314750d) {
            int dimensionPixelSize = interpreterListeningBoxesView.getResources().getDimensionPixelSize(R.dimen.interpreter_auto_listening_box_height);
            int dimensionPixelSize2 = interpreterListeningBoxesView.getResources().getDimensionPixelSize(R.dimen.interpreter_auto_listening_horizontal_separation);
            int dimensionPixelSize3 = interpreterListeningBoxesView.getResources().getDimensionPixelSize(R.dimen.interpreter_auto_listening_vertical_separation);
            ImageView imageView = new ImageView(interpreterListeningBoxesView.getContext(), (AttributeSet) null, 0, R.style.interpreter_auto_listening_box);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(i, dimensionPixelSize);
            layoutParams.setMargins(0, 0, dimensionPixelSize2, dimensionPixelSize3);
            imageView.setLayoutParams(layoutParams);
            Animation loadAnimation = AnimationUtils.loadAnimation(interpreterListeningBoxesView.getContext(), R.anim.auto_listening_box_fade_in);
            loadAnimation.setAnimationListener(new C113650ab(interpreterListeningBoxesView, imageView));
            imageView.setAnimation(loadAnimation);
            interpreterListeningBoxesView.addView(imageView);
        }
    }
}
