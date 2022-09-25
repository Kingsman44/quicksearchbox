package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88795af;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionIconView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.SliceSuggestionView */
/* compiled from: PG */
public class SliceSuggestionView extends C88795af {

    /* renamed from: a */
    public static final C59071e f239740a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.SliceSuggestionView");

    /* renamed from: b */
    C88682l f239741b;

    /* renamed from: c */
    public RelativeLayout f239742c;

    /* renamed from: d */
    RelativeLayout f239743d;

    /* renamed from: e */
    public boolean f239744e;

    /* renamed from: f */
    private SuggestionIconView f239745f;

    public SliceSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f239744e = false;
        this.f240416m = 55;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 55;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f239745f;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo82355e() {
        this.f239741b = null;
        removeView(this.f239742c);
        this.f239742c = null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.slice_icon);
        findViewById.getClass();
        this.f239745f = (SuggestionIconView) findViewById;
        RelativeLayout a = C88673c.m143429a(getContext());
        this.f239743d = a;
        addView(a);
    }

    SliceSuggestionView(Context context, AttributeSet attributeSet, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this(context, attributeSet);
        this.f239742c = relativeLayout;
        this.f239743d = relativeLayout2;
    }
}
