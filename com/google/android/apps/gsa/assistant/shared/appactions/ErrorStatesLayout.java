package com.google.android.apps.gsa.assistant.shared.appactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* compiled from: PG */
public class ErrorStatesLayout extends LinearLayout {

    /* renamed from: a */
    public Optional f195102a;

    public ErrorStatesLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ErrorStatesLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f195102a = Optional.empty();
        View.inflate(context, R.layout.error_states_layout, this);
    }
}
