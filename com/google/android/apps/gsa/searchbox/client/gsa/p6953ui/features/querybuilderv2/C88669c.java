package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88804ao;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.c */
/* compiled from: PG */
public final class C88669c extends C88804ao {

    /* renamed from: b */
    private static final C58485gu f239738b = C58485gu.m89846n(32);

    public C88669c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        return (QueryBuilderV2SuggestionView) LayoutInflater.from(this.f240429a).inflate(R.layout.query_builder_suggestion_view, viewGroup, false);
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f239738b;
    }
}
