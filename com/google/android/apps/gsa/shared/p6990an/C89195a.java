package com.google.android.apps.gsa.shared.p6990an;

import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.an.a */
/* compiled from: PG */
public final /* synthetic */ class C89195a implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C89195a f241818a = new C89195a();

    private /* synthetic */ C89195a() {
    }

    public final int compare(Object obj, Object obj2) {
        Suggestion suggestion = (Suggestion) obj;
        Suggestion suggestion2 = (Suggestion) obj2;
        if (suggestion.f108916q != suggestion2.f108916q) {
            return suggestion.f108916q - suggestion2.f108916q;
        }
        int compareTo = suggestion.f108915p.compareTo(suggestion2.f108915p);
        if (compareTo != 0) {
            return compareTo;
        }
        return suggestion2.f108917r - suggestion.f108917r;
    }
}
