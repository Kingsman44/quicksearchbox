package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

/* compiled from: PG */
public class PersonalResponseSwitchPreference extends HubSwitchPreference {
    public PersonalResponseSwitchPreference(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m138976a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m138976a(viewGroup.getChildAt(i));
            }
        } else if (view instanceof Switch) {
            ((Switch) view).setClickable(true);
        }
    }

    public final void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(16908304);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        m138976a(view);
    }

    public PersonalResponseSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PersonalResponseSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PersonalResponseSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
