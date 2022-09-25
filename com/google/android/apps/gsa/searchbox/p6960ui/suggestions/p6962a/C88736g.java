package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionIconView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.g */
/* compiled from: PG */
public final class C88736g extends C88728ak {

    /* renamed from: a */
    private final Context f240052a;

    public C88736g(Context context) {
        this.f240052a = context;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 167;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 63;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240052a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82468y(R.string.follow_interest_suggestion_message, R.string.regular_query_learn_more_url, suggestion, true, C88727aj.f239990a);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        SuggestionIconView suggestionIconView;
        View s = anVar.mo82585s();
        C54228aq aqVar = suggestion.f108906A;
        if (aqVar == null) {
            return false;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        if ((aeVar.f142290a & 8) != 0) {
            TextView textView = (TextView) s.findViewById(R.id.follow_lure_text);
            C54216ae aeVar2 = aqVar.f142334f;
            if (aeVar2 == null) {
                aeVar2 = C54216ae.f142285C;
            }
            textView.setText(aeVar2.f142294e);
        }
        C54216ae aeVar3 = aqVar.f142334f;
        if (aeVar3 == null) {
            aeVar3 = C54216ae.f142285C;
        }
        if ((aeVar3.f142290a & 16) != 0) {
            TextView textView2 = (TextView) s.findViewById(R.id.follow_lure_snippet_text);
            C54216ae aeVar4 = aqVar.f142334f;
            if (aeVar4 == null) {
                aeVar4 = C54216ae.f142285C;
            }
            textView2.setText(aeVar4.f142295f);
        }
        String str = C88727aj.m143688P(suggestion)[0];
        int layoutDirection = this.f240052a.getResources().getConfiguration().getLayoutDirection();
        int Y = C88727aj.m143695Y(suggestion) - 1;
        if (Y != 1) {
            if (Y != 2) {
                suggestionIconView = (SuggestionIconView) s.findViewById(R.id.follow_lure_image_end);
            } else if (layoutDirection == 0) {
                suggestionIconView = (SuggestionIconView) s.findViewById(R.id.follow_lure_image_end);
            } else {
                suggestionIconView = (SuggestionIconView) s.findViewById(R.id.follow_lure_image_start);
            }
        } else if (layoutDirection == 0) {
            suggestionIconView = (SuggestionIconView) s.findViewById(R.id.follow_lure_image_start);
        } else {
            suggestionIconView = (SuggestionIconView) s.findViewById(R.id.follow_lure_image_end);
        }
        suggestionIconView.mo82568k(str, this.f240008n, BuildConfig.FLAVOR, ImageView.ScaleType.FIT_CENTER, 0, 0, 0, 0, 0);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }
}
