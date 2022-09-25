package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54250n;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.z */
/* compiled from: PG */
public final class C88755z extends C88728ak implements C89199d {

    /* renamed from: a */
    private C88710k f240099a;

    /* renamed from: b */
    private final Context f240100b;

    /* renamed from: c */
    private final int f240101c;

    public C88755z(Context context) {
        this.f240100b = context;
        this.f240101c = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 83;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 58;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240100b.getResources().getString(R.string.nav_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82453B(this.f240100b.getResources().getString(R.string.remove_pnav_title), this.f240100b.getResources().getString(R.string.remove_url_history_message), suggestion, this);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        String str;
        C54228aq o = C88727aj.m143706o(suggestion);
        if ((o.f142330a & 32) != 0) {
            C54250n nVar = o.f142337i;
            if (nVar == null) {
                nVar = C54250n.f142445d;
            }
            str = nVar.f142449c;
        } else {
            str = BuildConfig.FLAVOR;
        }
        anVar.mo82350d(this.f240099a.mo44238e(str), 2);
        anVar.mo82546i(suggestion.mo44268u(), 2);
        anVar.mo82349c(0).mo82561d(C88727aj.m143699c(suggestion, R.drawable.ic_globe), C88727aj.m143696a(suggestion, this.f240101c), false);
        anVar.mo82349c(1).mo82560c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return false;
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f240099a = pVar.f239938j;
    }
}
