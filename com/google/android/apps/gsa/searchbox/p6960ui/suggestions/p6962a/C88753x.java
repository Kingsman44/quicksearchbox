package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.x */
/* compiled from: PG */
public final class C88753x extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f240097a;

    public C88753x(Context context) {
        this.f240097a = context;
    }

    /* renamed from: n */
    private final Spanned m143880n(Suggestion suggestion) {
        String str;
        C54228aq o = C88727aj.m143706o(suggestion);
        if ((o.f142330a & 4) != 0) {
            C54216ae aeVar = o.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            str = aeVar.f142294e;
        } else {
            str = BuildConfig.FLAVOR;
        }
        return this.f240010p.mo44238e(str);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 111;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        String f = C89235z.m145134f(suggestion, this.f240097a);
        if (f == null) {
            return null;
        }
        String obj = m143880n(suggestion).toString();
        return this.f240097a.getResources().getString(R.string.app_result_suggestion_content_description, new Object[]{obj, f});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82468y(R.string.app_history_suggestion_message, R.string.app_history_learn_more_url, (Suggestion) null, false, C88727aj.f239990a);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        Drawable h;
        if (!C89235z.m145121A(suggestion) || (h = C88727aj.m143703h(this.f240097a.getPackageManager(), C89235z.m145145q(suggestion))) == null) {
            return false;
        }
        anVar.mo82587v(m143880n(suggestion));
        anVar.mo82349c(0).mo82563f(h, -1);
        return true;
    }
}
