package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.util.C23341f;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ak */
/* compiled from: PG */
public abstract class C88728ak implements C89200e, C89199d {

    /* renamed from: g */
    protected static final int f240001g = Color.rgb(66, 122, 244);

    /* renamed from: h */
    public static final int f240002h = R.color.agsa_color_icon_display;

    /* renamed from: i */
    public static final int f240003i = Color.rgb(173, 173, 173);

    /* renamed from: j */
    public static final int f240004j = R.color.agsa_color_icon_interactive;

    /* renamed from: k */
    public static final int f240005k = R.drawable.quantum_ic_access_time_white_24;

    /* renamed from: l */
    public static final int f240006l = R.drawable.quantum_ic_search_white_24;

    /* renamed from: m */
    public C88701b f240007m;

    /* renamed from: n */
    protected C88705f f240008n;

    /* renamed from: o */
    protected C88706g f240009o;

    /* renamed from: p */
    protected C88710k f240010p;

    /* renamed from: q */
    public C88727aj f240011q;

    /* renamed from: r */
    public C88698g f240012r;

    /* renamed from: s */
    public C88709j f240013s;

    /* renamed from: u */
    public static boolean m143730u(Suggestion suggestion) {
        return suggestion.f108925z.contains(275);
    }

    /* renamed from: b */
    public abstract int mo82327b();

    /* renamed from: c */
    public abstract int mo82328c(Suggestion suggestion);

    /* renamed from: e */
    public abstract String mo82329e(Suggestion suggestion);

    /* renamed from: hH */
    public boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        return false;
    }

    /* renamed from: hI */
    public abstract boolean mo82331hI(Suggestion suggestion, C88803an anVar);

    /* renamed from: hJ */
    public void mo82217hD(C88709j jVar) {
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public void mo82333hK(int i, View view, Suggestion suggestion, String str) {
    }

    /* renamed from: hN */
    public CharSequence mo82470hN(Suggestion suggestion) {
        return suggestion.mo44269v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo82334j() {
        return false;
    }

    /* renamed from: k */
    public void mo82352k(C88803an anVar, Suggestion suggestion) {
        this.f240007m.mo44280t(suggestion, (View) anVar, mo82334j() ? mo82470hN(suggestion) : null);
    }

    /* renamed from: l */
    public void mo82185d(C88715p pVar) {
        this.f240007m = pVar.f239935g;
        this.f240008n = pVar.f239939k;
        this.f240009o = pVar.f239940l;
        this.f240012r = pVar.f239937i;
        this.f240010p = pVar.f239938j;
        this.f240011q = pVar.f239945q;
    }

    /* renamed from: p */
    public void mo82471p(int i, C88803an anVar, Suggestion suggestion) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo82472s(Suggestion suggestion, View view, String str) {
        mo82473t(suggestion);
        this.f240007m.mo44279s(suggestion, view, str);
    }

    /* renamed from: t */
    public void mo82473t(Suggestion suggestion) {
        this.f240012r.mo82417x(suggestion);
    }

    /* renamed from: v */
    public void mo82474v(int i, View view, Suggestion suggestion, String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo82475w(CharSequence charSequence) {
        C88706g gVar = this.f240009o;
        gVar.f239832b.mo82402i(5);
        gVar.f239832b.mo82397A();
        gVar.f239832b.mo82419z();
        gVar.f239832b.mo82407n();
        CharSequence a = gVar.mo82429a();
        String e = C23341f.m43778e(a);
        if (charSequence.toString().regionMatches(true, 0, e.toString(), 0, e.length())) {
            if (charSequence.length() != e.length()) {
                charSequence = TextUtils.concat(new CharSequence[]{e, charSequence.subSequence(e.length(), charSequence.length())});
            } else {
                return;
            }
        }
        gVar.f239832b.mo82406m(charSequence.length() - a.length());
        gVar.f239834d.mo82425b(charSequence.toString());
        gVar.f239833c.mo44292g(charSequence);
    }
}
