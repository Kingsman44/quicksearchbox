package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88795af;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.QueryBuilderV2SuggestionView */
/* compiled from: PG */
public class QueryBuilderV2SuggestionView extends C88795af {

    /* renamed from: a */
    public TextView f239730a;

    public QueryBuilderV2SuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240416m = 32;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 32;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f239730a.setText(spanned.toString());
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.chip);
        textView.getClass();
        this.f239730a = textView;
    }
}
