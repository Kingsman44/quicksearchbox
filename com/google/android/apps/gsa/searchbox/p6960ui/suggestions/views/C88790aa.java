package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.aa */
/* compiled from: PG */
public final class C88790aa extends C88804ao {

    /* renamed from: b */
    private static final C58485gu f240407b = C58485gu.m89847o(38, 39);

    public C88790aa(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88803an mo82344a(int i, ViewGroup viewGroup) {
        OnDeviceAppResultSuggestionView onDeviceAppResultSuggestionView = (OnDeviceAppResultSuggestionView) LayoutInflater.from(this.f240429a).inflate(R.layout.on_device_app_result_suggestion_view, viewGroup, false);
        onDeviceAppResultSuggestionView.mo82342b(i);
        return onDeviceAppResultSuggestionView;
    }

    /* renamed from: b */
    public final /* synthetic */ List mo82345b() {
        return f240407b;
    }
}
