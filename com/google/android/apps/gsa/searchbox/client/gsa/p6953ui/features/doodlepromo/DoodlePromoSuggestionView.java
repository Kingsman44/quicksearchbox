package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.doodlepromo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88795af;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.doodlepromo.DoodlePromoSuggestionView */
/* compiled from: PG */
public class DoodlePromoSuggestionView extends C88795af {

    /* renamed from: a */
    public static final C59071e f239716a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.doodlepromo.DoodlePromoSuggestionView");

    /* renamed from: b */
    public ImageView f239717b;

    public DoodlePromoSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240416m = 60;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 60;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.doodle_image);
        imageView.getClass();
        this.f239717b = imageView;
    }
}
