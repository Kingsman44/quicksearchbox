package com.google.android.libraries.lens.view.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;

@Deprecated
/* renamed from: com.google.android.libraries.lens.view.utils.x */
/* compiled from: PG */
public final class C28135x {
    /* renamed from: b */
    public static MaterialButton m52426b(ViewGroup viewGroup) {
        return (MaterialButton) viewGroup.findViewById(R.id.lens_alert_dialog_negative_button);
    }

    /* renamed from: c */
    public static MaterialButton m52427c(ViewGroup viewGroup) {
        return (MaterialButton) viewGroup.findViewById(R.id.lens_alert_dialog_positive_button);
    }

    /* renamed from: d */
    public static void m52428d(ViewGroup viewGroup, View view) {
        ((FrameLayout) viewGroup.findViewById(R.id.lens_alert_dialog_subtitle_container)).addView(view);
    }

    /* renamed from: e */
    public static ViewGroup m52429e(LayoutInflater layoutInflater) {
        return (ViewGroup) layoutInflater.inflate(R.layout.lens_alert_dialog, (ViewGroup) null, false);
    }

    /* renamed from: a */
    public static TextView m52425a(ViewGroup viewGroup) {
        viewGroup.getClass();
        return (TextView) viewGroup.findViewById(R.id.lens_alert_dialog_title);
    }
}
