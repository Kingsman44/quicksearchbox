package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54242f;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.a */
/* compiled from: PG */
public final class C88717a extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f239953a;

    public C88717a(Context context) {
        this.f239953a = context;
    }

    /* renamed from: n */
    private static String m143627n(C54228aq aqVar) {
        if (aqVar == null || (aqVar.f142330a & 4) == 0) {
            return null;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142295f;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 114;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return TextUtils.isEmpty(m143627n(C88727aj.m143706o(suggestion))) ? 57 : 58;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        String f = C89235z.m145134f(suggestion, this.f239953a);
        if (suggestion.mo44269v() == null || f == null) {
            return null;
        }
        return this.f239953a.getResources().getString(R.string.app_result_suggestion_content_description, new Object[]{suggestion.mo44269v(), f});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82469z(R.string.regular_app_result_suggestion_message, (Suggestion) null, false);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        Drawable h;
        if (!C89235z.m145121A(suggestion) || suggestion.f108908i == null || (h = C88727aj.m143703h(this.f239953a.getPackageManager(), C89235z.m145145q(suggestion))) == null) {
            return false;
        }
        anVar.mo82587v(suggestion.mo44268u());
        C54228aq o = C88727aj.m143706o(suggestion);
        String n = m143627n(o);
        if (!TextUtils.isEmpty(n)) {
            anVar.mo82588w(this.f240010p.mo44238e(n));
        }
        if (!(o == null || (o.f142330a & 2048) == 0)) {
            C54242f fVar = o.f142343o;
            if (fVar == null) {
                fVar = C54242f.f142415f;
            }
            if ((fVar.f142417a & 2) != 0) {
                C54242f fVar2 = o.f142343o;
                if (fVar2 == null) {
                    fVar2 = C54242f.f142415f;
                }
                int f = C88727aj.m143701f(fVar2.f142419c);
                if (f != 0) {
                    anVar.mo82548k(this.f239953a.getResources().getDrawable(f));
                }
            }
        }
        anVar.mo82349c(0).mo82563f(h, -1);
        anVar.mo82349c(1).mo82560c();
        return true;
    }
}
