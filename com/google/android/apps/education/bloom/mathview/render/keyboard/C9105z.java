package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.z */
/* compiled from: PG */
final class C9105z extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ LatexKeyboardView f31371a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9105z(LatexKeyboardView latexKeyboardView) {
        super(0);
        this.f31371a = latexKeyboardView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        View findViewById = this.f31371a.findViewById(R.id.view_pager);
        C69664n.m101058d(findViewById);
        return (ViewPager2) findViewById;
    }
}
