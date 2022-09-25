package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.aq */
/* compiled from: PG */
public enum C138638aq {
    DEFAULT_TEXT_STYLE(0, R.style.GaLineOneTextAppearance),
    EXPERIMENTAL_TEXT_STYLE(24, -1),
    TOP_ALIGNED_TEXT(3, R.style.GaUniversalSuggestionTopAlignedText),
    TOP_ALIGNED_TEXT_PIXEL(3, R.style.GaUniversalSuggestionTopAlignedTextPixel, (int) null),
    DESCRIPTION_TEXT_NEGATIVE(5, R.style.GaUniversalSuggestionDescriptionTextNegative),
    DESCRIPTION_TEXT_POSITIVE(6, R.style.GaUniversalSuggestionDescriptionTextPositive),
    SUGGESTION_TEXT(8, R.style.GaUniversalSuggestionSuggestionText),
    SUGGESTION_TEXT_PIXEL(8, R.style.GaUniversalSuggestionSuggestionTextPixel, (int) null),
    ANSWER_TEXT_MEDIUM(17, R.style.GaUniversalSuggestionAnswerTextMedium),
    ANSWER_TEXT_MEDIUM_PIXEL(17, R.style.GaUniversalSuggestionAnswerTextMediumPixel, (int) null),
    ANSWER_TEXT_LARGE(18, R.style.GaUniversalSuggestionAnswerTextLarge),
    ANSWER_TEXT_LARGE_PIXEL(18, R.style.GaUniversalSuggestionAnswerTextLargePixel, (int) null),
    SUGGESTION_SECONDARY_TEXT_SMALL(19, R.style.GaUniversalSuggestionSecondaryTextSmall),
    SUGGESTION_SECONDARY_TEXT_SMALL_PIXEL(19, R.style.GaUniversalSuggestionSecondaryTextSmallPixel, (int) null),
    SUGGESTION_SECONDARY_TEXT_MEDIUM(20, R.style.GaUniversalSuggestionSecondaryTextMedium),
    SUGGESTION_SECONDARY_TEXT_MEDIUM_PIXEL(20, R.style.GaUniversalSuggestionSecondaryTextMediumPixel, (int) null),
    SUGGESTION_SECONDARY_TEXT_LARGE(23, R.style.GaUniversalSuggestionSecondaryTextLarge),
    SUGGESTION_SECONDARY_TEXT_LARGE_PIXEL(23, R.style.GaUniversalSuggestionSecondaryTextLargePixel, (int) null);
    

    /* renamed from: t */
    private static final C58495hd f377059t = null;

    /* renamed from: u */
    private static final C58495hd f377060u = null;

    /* renamed from: v */
    private static final C58974d f377061v = null;

    /* renamed from: s */
    public final int f377063s;

    /* renamed from: x */
    private final boolean f377064x;

    /* renamed from: y */
    private final int f377065y;

    static {
        C58490gz gzVar = new C58490gz(4);
        C58490gz gzVar2 = new C58490gz(4);
        for (C138638aq aqVar : values()) {
            if (aqVar.f377064x) {
                gzVar2.mo55429h(Integer.valueOf(aqVar.f377065y), aqVar);
            } else {
                gzVar.mo55429h(Integer.valueOf(aqVar.f377065y), aqVar);
            }
        }
        f377059t = gzVar.mo55427f(false);
        f377060u = gzVar2.mo55427f(false);
        f377061v = C58974d.m91134h("AnswerSuggestTextStyle");
    }

    private C138638aq(int i, int i2) {
        this.f377064x = false;
        this.f377065y = i;
        this.f377063s = i2;
    }

    /* renamed from: a */
    public static C138638aq m225169a(String str, boolean z) {
        C138638aq aqVar;
        try {
            int parseInt = Integer.parseInt(str);
            if (z && (aqVar = (C138638aq) f377060u.get(Integer.valueOf(parseInt))) != null) {
                return aqVar;
            }
            C138638aq aqVar2 = (C138638aq) f377059t.get(Integer.valueOf(parseInt));
            return aqVar2 == null ? DEFAULT_TEXT_STYLE : aqVar2;
        } catch (NumberFormatException e) {
            ((C58970a) ((C58970a) ((C58970a) f377061v.mo56226d()).mo56382g(e)).mo56372aa(41280)).mo56389s("Attempting to use non-integer textFieldStringVal: %s to get from a Map of integer keys", str);
            return DEFAULT_TEXT_STYLE;
        }
    }

    private C138638aq(int i, int i2, byte[] bArr) {
        this.f377064x = true;
        this.f377065y = i;
        this.f377063s = i2;
    }
}
