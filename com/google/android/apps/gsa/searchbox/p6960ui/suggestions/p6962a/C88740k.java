package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.Spanned;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.k */
/* compiled from: PG */
public final class C88740k extends C88728ak implements C89199d {

    /* renamed from: a */
    private static final C59071e f240058a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.a.k");

    /* renamed from: b */
    private final Context f240059b;

    /* renamed from: c */
    private final int f240060c;

    public C88740k(Context context) {
        this.f240059b = context;
        this.f240060c = C1878d.m5128a(context, f240002h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.text.Spanned m143835n(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r3) {
        /*
            r2 = this;
            com.google.android.libraries.searchbox.shared.suggestion.e r0 = r3.f108907B
            int r1 = r0.f109007a
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0017
            com.google.android.libraries.searchbox.shared.suggestion.w r0 = r0.f109014h
            if (r0 != 0) goto L_0x000e
            com.google.android.libraries.searchbox.shared.suggestion.w r0 = com.google.android.libraries.searchbox.shared.suggestion.C41697w.f109068c
        L_0x000e:
            int r1 = r0.f109070a
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = r0.f109071b
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0042
            com.google.at.h.d.a.aq r3 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj.m143706o(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0046
            int r1 = r3.f142330a
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0046
            com.google.at.h.d.a.n r3 = r3.f142337i
            if (r3 != 0) goto L_0x0032
            com.google.at.h.d.a.n r3 = com.google.p4017at.p4060h.p4073d.p4074a.C54250n.f142445d
        L_0x0032:
            java.lang.String r3 = r3.f142449c
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0046
            com.google.android.apps.gsa.searchbox.ui.k r0 = r2.f240010p
            r1 = 0
            android.text.Spanned r0 = r0.mo44239f(r3, r1, r1)
            goto L_0x0046
        L_0x0042:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88740k.m143835n(com.google.android.libraries.searchbox.shared.suggestion.Suggestion):android.text.Spanned");
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 5;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return m143835n(suggestion) == null ? 57 : 58;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240059b.getResources().getString(R.string.nav_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82469z(R.string.regular_url_suggestion_message, suggestion, true);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, R.drawable.ic_globe);
        int a = C88727aj.m143696a(suggestion, this.f240060c);
        Spanned n = m143835n(suggestion);
        if (n != null) {
            anVar.mo82350d(n, 2);
            anVar.mo82546i(suggestion.mo44268u(), 2);
        } else {
            C59104x c2 = f240058a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "sb.u.NavSugRenderer");
            ((C59052c) ((C59052c) c2).mo56372aa(10004)).mo56389s("Title for does not exist for suggestion: %s", suggestion);
            anVar.mo82350d(suggestion.mo44268u(), 2);
        }
        anVar.mo82349c(0).mo82561d(c, a, false);
        anVar.mo82349c(1).mo82560c();
        return true;
    }
}
