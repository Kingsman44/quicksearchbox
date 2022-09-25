package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.tabs.TabLayout;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.w */
/* compiled from: PG */
final class C9102w extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ LatexKeyboardView f31370a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9102w(LatexKeyboardView latexKeyboardView) {
        super(0);
        this.f31370a = latexKeyboardView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        View findViewById = this.f31370a.findViewById(R.id.page_indicator);
        C69664n.m101058d(findViewById);
        return (TabLayout) findViewById;
    }
}
