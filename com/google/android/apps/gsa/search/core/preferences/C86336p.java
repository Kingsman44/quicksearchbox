package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.preference.CheckBoxPreference;
import android.view.View;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.p */
/* compiled from: PG */
public final class C86336p extends CheckBoxPreference {

    /* renamed from: a */
    public Drawable f233430a;

    public C86336p(Context context) {
        super(context);
        setLayoutResource(R.layout.searchable_item_preference);
    }

    /* access modifiers changed from: protected */
    public final void onBindView(View view) {
        super.onBindView(view);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(this.f233430a);
        view.setBackgroundResource(0);
    }

    public final void setIcon(Drawable drawable) {
        this.f233430a = drawable;
    }
}
