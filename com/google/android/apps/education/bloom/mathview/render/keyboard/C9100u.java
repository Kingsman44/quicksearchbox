package com.google.android.apps.education.bloom.mathview.render.keyboard;

import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.tabs.C44909l;
import com.google.android.material.tabs.C44912o;
import com.google.android.material.tabs.C44915r;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.u */
/* compiled from: PG */
final class C9100u implements C44915r {

    /* renamed from: a */
    final /* synthetic */ LatexKeyboardView f31367a;

    /* renamed from: b */
    final /* synthetic */ int f31368b;

    public C9100u(LatexKeyboardView latexKeyboardView, int i) {
        this.f31367a = latexKeyboardView;
        this.f31368b = i;
    }

    /* renamed from: a */
    public final void mo17416a(C44909l lVar, int i) {
        lVar.mo48443c(C1877c.m5125a(this.f31367a.getContext(), R.drawable.keyboard_tab_indicator));
        C44912o oVar = lVar.f117227h;
        oVar.setMinimumWidth(this.f31368b);
        C69664n.m101060f(oVar, BuildConfig.FLAVOR);
        oVar.setPadding(0, 0, 0, 0);
    }
}
