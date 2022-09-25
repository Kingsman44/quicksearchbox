package com.google.android.apps.education.bloom.mathview.render.keyboard;

import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.s */
/* compiled from: PG */
final class C9098s extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ LatexKeyboardView f31366a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9098s(LatexKeyboardView latexKeyboardView) {
        super(0);
        this.f31366a = latexKeyboardView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        return (ImeButton) this.f31366a.findViewById(R.id.ime_action);
    }
}
