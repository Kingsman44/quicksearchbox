package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58879cp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.f */
/* compiled from: PG */
public final class C110431f extends C110435j {
    public C110431f(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 35;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        if (C58879cp.m90962d(this.f307866a.mo44287a().toString())) {
            return super.mo82331hI(suggestion, anVar);
        }
        return false;
    }

    /* renamed from: k */
    public final void mo82352k(C88803an anVar, Suggestion suggestion) {
        mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
    }
}
