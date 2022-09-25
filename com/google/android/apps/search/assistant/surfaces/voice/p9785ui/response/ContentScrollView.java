package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ContentScrollView */
/* compiled from: PG */
public final class ContentScrollView extends ScrollView {

    /* renamed from: a */
    public int f356833a = 0;

    public ContentScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f356833a > 0) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), this.f356833a));
        }
    }

    public ContentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContentScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
