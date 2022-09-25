package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.CorpusBarView */
/* compiled from: PG */
public class CorpusBarView extends RelativeLayout {

    /* renamed from: a */
    public View f253623a;

    /* renamed from: b */
    public CorpusBarSelector f253624b;

    /* renamed from: c */
    public boolean f253625c;

    public CorpusBarView(Context context) {
        super(context);
    }

    public final boolean isShown() {
        return this.f253625c;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f253623a = findViewById(R.id.corpus_horizontal_scroll_view);
        this.f253624b = (CorpusBarSelector) findViewById(R.id.corpus_bar_selector);
    }

    public CorpusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorpusBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
