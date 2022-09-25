package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.f */
/* compiled from: PG */
public final class C88822f extends C88804ao {

    /* renamed from: b */
    private static final C58485gu f240482b = C58485gu.m89846n(64);

    public C88822f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        ChipSuggestionView chipSuggestionView = (ChipSuggestionView) LayoutInflater.from(this.f240429a).inflate(R.layout.chip_suggestion_view, viewGroup, false);
        chipSuggestionView.mo82342b(i);
        return chipSuggestionView;
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f240482b;
    }
}
