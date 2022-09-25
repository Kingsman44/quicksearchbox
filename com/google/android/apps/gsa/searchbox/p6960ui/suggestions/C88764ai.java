package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ai */
/* compiled from: PG */
public enum C88764ai {
    DEFAULT_TEXT_STYLE(0, R.style.LineOneTextAppearance),
    EXPERIMENTAL_TEXT_STYLE(24, -1),
    TOP_ALIGNED_TEXT(3, R.style.UniversalSuggestionTopAlignedText),
    DESCRIPTION_TEXT_NEGATIVE(5, R.style.UniversalSuggestionDescriptionTextNegative),
    DESCRIPTION_TEXT_POSITIVE(6, R.style.UniversalSuggestionDescriptionTextPositive),
    SUGGESTION_TEXT(8, R.style.UniversalSuggestionSuggestionText),
    ANSWER_TEXT_MEDIUM(17, R.style.UniversalSuggestionAnswerTextMedium),
    ANSWER_TEXT_LARGE(18, R.style.UniversalSuggestionAnswerTextLarge),
    SUGGESTION_SECONDARY_TEXT_SMALL(19, R.style.UniversalSuggestionSecondaryTextSmall),
    SUGGESTION_SECONDARY_TEXT_MEDIUM(20, R.style.UniversalSuggestionSecondaryTextMedium),
    SUGGESTION_SECONDARY_TEXT_LARGE(23, R.style.UniversalSuggestionSecondaryTextLarge);
    

    /* renamed from: m */
    private static final C59071e f240170m = null;

    /* renamed from: n */
    private static final C58495hd f240171n = null;

    /* renamed from: l */
    public final int f240173l;

    /* renamed from: p */
    private final int f240174p;

    static {
        f240170m = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.ai");
        C58490gz gzVar = new C58490gz(4);
        for (C88764ai aiVar : values()) {
            gzVar.mo55429h(Integer.valueOf(aiVar.f240174p), aiVar);
        }
        f240171n = gzVar.mo55427f(false);
    }

    private C88764ai(int i, int i2) {
        this.f240174p = i;
        this.f240173l = i2;
    }

    /* renamed from: a */
    public static C88764ai m143938a(String str) {
        try {
            C88764ai aiVar = (C88764ai) f240171n.get(Integer.valueOf(Integer.parseInt(str)));
            return aiVar == null ? DEFAULT_TEXT_STYLE : aiVar;
        } catch (NumberFormatException unused) {
            C59104x d = f240170m.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.u.UniSugTextStyle");
            ((C59052c) ((C59052c) d).mo56372aa(10003)).mo56389s("Attemping to use non-integer textFieldStringVal: %s to get from a Map of integer keys", str);
            return DEFAULT_TEXT_STYLE;
        }
    }
}
