package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.Spanned;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88693b;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.libraries.searchbox.shared.suggestion.C41681g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ac */
/* compiled from: PG */
public final class C88720ac extends C88734e implements C89199d {
    public C88720ac(Context context, C88693b bVar) {
        super(context, bVar);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 44;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spanned mo82443m(Suggestion suggestion, C88710k kVar) {
        return C88727aj.m143705n(suggestion, kVar);
    }

    /* renamed from: n */
    public final Long mo82444n(Suggestion suggestion) {
        return C89235z.m145133e(C89235z.m145138j(suggestion));
    }

    /* renamed from: o */
    public final String mo82445o(Suggestion suggestion) {
        C41681g gVar = suggestion.f108907B.f109018l;
        if (gVar == null) {
            gVar = C41681g.f109022b;
        }
        return gVar.f109024a;
    }
}
