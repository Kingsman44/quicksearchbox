package com.google.android.apps.gsa.assistant.settings.features.language;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.preference.C3998ax;
import androidx.preference.ListPreference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class DynamicWidgetListPreference extends ListPreference {

    /* renamed from: I */
    public ImageView f193993I;

    public DynamicWidgetListPreference(Context context) {
        super(context);
        this.f12719E = R.layout.preference_widget_dynamic;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        this.f193993I = (ImageView) axVar.mo8435a(R.id.dynamic_widget);
    }

    public DynamicWidgetListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12719E = R.layout.preference_widget_dynamic;
    }

    public DynamicWidgetListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12719E = R.layout.preference_widget_dynamic;
    }

    public DynamicWidgetListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12719E = R.layout.preference_widget_dynamic;
    }
}
