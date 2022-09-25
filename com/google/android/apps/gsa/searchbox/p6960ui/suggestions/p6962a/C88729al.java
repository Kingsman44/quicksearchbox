package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54258v;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.al */
/* compiled from: PG */
public final class C88729al extends C88728ak implements C89199d {

    /* renamed from: a */
    private int f240014a;

    /* renamed from: b */
    private boolean f240015b;

    /* renamed from: c */
    private final int f240016c;

    /* renamed from: d */
    private int f240017d;

    public C88729al(Context context) {
        this.f240016c = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 33;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return this.f240015b ? 49 : 1;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return null;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        boolean z;
        String str;
        int c = C88727aj.m143699c(suggestion, f240006l);
        int a = C88727aj.m143696a(suggestion, this.f240016c);
        C54228aq o = C88727aj.m143706o(suggestion);
        if ((o.f142330a & 128) != 0) {
            C54258v vVar = o.f142339k;
            if (vVar == null) {
                vVar = C54258v.f142462c;
            }
            str = vVar.f142465b;
            z = false;
        } else {
            str = null;
            z = true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        anVar.mo82350d(this.f240010p.mo44239f("... ".concat(String.valueOf(str)), z, false), 1);
        anVar.mo82349c(0).mo82561d(c, a, false);
        if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f240017d, this.f240014a);
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240017d = jVar.f239875ae;
        this.f240014a = jVar.f239876b;
        this.f240015b = jVar.f239880f;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 1) {
            mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }
}
