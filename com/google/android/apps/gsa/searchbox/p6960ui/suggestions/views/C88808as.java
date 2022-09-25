package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.as */
/* compiled from: PG */
public final class C88808as extends C88804ao {

    /* renamed from: b */
    private static final C58485gu f240437b = C58485gu.m89847o(12, 13);

    public C88808as(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) LayoutInflater.from(this.f240429a).inflate(R.layout.suggestion_view_with_actions, viewGroup, false);
        suggestionViewWithActions.mo82342b(i);
        return suggestionViewWithActions;
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f240437b;
    }
}
