package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.Html;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54244h;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.c */
/* compiled from: PG */
public final class C88732c extends C88728ak implements C89199d {

    /* renamed from: a */
    private final int f240024a;

    public C88732c(Context context) {
        this.f240024a = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 19;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return null;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, f240006l);
        int a = C88727aj.m143696a(suggestion, this.f240024a);
        C54228aq o = C88727aj.m143706o(suggestion);
        if (o == null || (o.f142330a & 512) == 0) {
            return false;
        }
        C54244h hVar = o.f142341m;
        if (hVar == null) {
            hVar = C54244h.f142422d;
        }
        String str = hVar.f142425b;
        C54244h hVar2 = o.f142341m;
        if (hVar2 == null) {
            hVar2 = C54244h.f142422d;
        }
        String str2 = hVar2.f142426c;
        anVar.mo82350d(Html.fromHtml((str + " = " + str2).replaceAll("�", "&nbsp;")), 3);
        anVar.mo82349c(0).mo82561d(c, a, false);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }
}
