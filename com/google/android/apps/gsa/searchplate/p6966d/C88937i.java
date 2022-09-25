package com.google.android.apps.gsa.searchplate.p6966d;

import android.text.Spanned;
import android.text.style.SuggestionSpan;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.searchplate.d.i */
/* compiled from: PG */
public final class C88937i {
    /* renamed from: a */
    public static C88936h m144544a(Query query) {
        CharSequence charSequence;
        CharSequence charSequence2 = query.f252768g;
        if (!(charSequence2 instanceof Spanned) || ((Spanned) charSequence2).getSpans(0, charSequence2.length(), SuggestionSpan.class).length <= 0) {
            charSequence = query.f252768g.toString();
        } else {
            charSequence = query.f252768g;
        }
        String be = query.mo84346be();
        boolean cO = query.mo84382cO();
        if (query.mo84420dA()) {
            cO |= true;
        }
        if (query.mo84367c() == -2) {
            cO |= true;
        }
        if (query.mo84315b() == -2) {
            cO |= true;
        }
        if (query.mo84335bT() && (query.f252765d & 72057594037927936L) != 0) {
            cO |= true;
        }
        query.mo84367c();
        query.mo84315b();
        return new C88936h(charSequence2, charSequence, be, cO ? 1 : 0);
    }
}
