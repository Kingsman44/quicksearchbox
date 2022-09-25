package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.SuggestionSpan;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.p6941ui.C88525e;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.searchplate.SimpleSearchText;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.o */
/* compiled from: PG */
public final class C87641o implements C41704d {

    /* renamed from: a */
    public final /* synthetic */ C87625ad f236900a;

    public C87641o(C87625ad adVar) {
        this.f236900a = adVar;
    }

    /* renamed from: a */
    public final CharSequence mo44287a() {
        return this.f236900a.f236844au.f252768g;
    }

    /* renamed from: b */
    public final void mo44288b() {
        this.f236900a.mo81796ac(true, false);
    }

    /* renamed from: c */
    public final void mo44289c() {
    }

    /* renamed from: d */
    public final void mo44290d(C41703c cVar) {
        this.f236900a.f236788R = cVar;
    }

    /* renamed from: e */
    public final void mo81839e(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f236900a.f236830ag) {
            query = query.mo84277aN().mo84265aB();
        }
        C87625ad adVar = this.f236900a;
        adVar.f236844au = query;
        C87673aa aaVar2 = adVar.f236773C;
        C88489j jVar = new C88489j(C87739bu.QUERY_SET);
        jVar.mo82015c(query);
        aaVar2.mo81937i(jVar.mo82013a());
        C87625ad adVar2 = this.f236900a;
        adVar2.mo81798ae(adVar2.f236844au, false);
    }

    /* renamed from: f */
    public final void mo44291f(Spanned spanned) {
        C87625ad adVar = this.f236900a;
        if (!adVar.f236827ad) {
            SearchPlate searchPlate = adVar.f236778H;
            C88525e eVar = new C88525e(adVar.f236874p);
            SimpleSearchText simpleSearchText = searchPlate.f240735h;
            simpleSearchText.f240757d = eVar;
            if (simpleSearchText.f240756c) {
                simpleSearchText.f240757d.mo82158f();
            } else {
                simpleSearchText.f240757d.mo82154b(simpleSearchText);
            }
            this.f236900a.f236827ad = true;
        }
        this.f236900a.f236778H.mo82689q(spanned, false);
    }

    /* renamed from: g */
    public final void mo44292g(CharSequence charSequence) {
        CharSequence charSequence2;
        mo81839e(this.f236900a.f236844au.mo84268aE(charSequence, false));
        mo44288b();
        SimpleSearchText simpleSearchText = this.f236900a.f236778H.f240735h;
        Editable text = simpleSearchText.getText();
        if (text == null) {
            charSequence2 = BuildConfig.FLAVOR;
        } else {
            SpannableString spannableString = new SpannableString(text.toString());
            for (Object obj : text.getSpans(0, text.length(), Object.class)) {
                if ((obj instanceof SuggestionSpan) || (obj instanceof CorrectionSpan)) {
                    spannableString.setSpan(obj, text.getSpanStart(obj), text.getSpanEnd(obj), text.getSpanFlags(obj));
                }
            }
            charSequence2 = spannableString;
        }
        simpleSearchText.setSelection(charSequence2.length());
    }

    /* renamed from: h */
    public final void mo44293h() {
        this.f236900a.mo81796ac(false, false);
    }

    /* renamed from: i */
    public final boolean mo44294i() {
        return this.f236900a.f236844au.mo84378cK();
    }
}
