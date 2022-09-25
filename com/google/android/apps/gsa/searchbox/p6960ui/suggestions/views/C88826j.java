package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.j */
/* compiled from: PG */
public final class C88826j extends C88804ao implements C89199d {

    /* renamed from: b */
    private static final C58485gu f240486b = C58485gu.m89846n(14);

    /* renamed from: c */
    private int f240487c = -1;

    public C88826j(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        CompactSuggestionView compactSuggestionView = (CompactSuggestionView) LayoutInflater.from(this.f240429a).inflate(R.layout.compact_suggestion_view, viewGroup, false);
        int i2 = this.f240487c;
        if (i2 != -1) {
            compactSuggestionView.f240315a.setBackgroundColor(i2);
        }
        compactSuggestionView.mo82342b(i);
        return compactSuggestionView;
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f240486b;
    }

    /* renamed from: hD */
    public final /* synthetic */ void mo82217hD(Object obj) {
        this.f240487c = ((C88709j) obj).f239891q;
    }
}
