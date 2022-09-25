package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.SwitchPreference;
import android.util.AttributeSet;
import com.google.android.apps.gsa.shared.util.C90772bp;

/* compiled from: PG */
public class GelUsageStatsSwitchPreference extends SwitchPreference {
    public GelUsageStatsSwitchPreference(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Boolean.valueOf(C90772bp.m148279F(getContext()));
    }

    public GelUsageStatsSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GelUsageStatsSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
