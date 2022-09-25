package com.google.android.libraries.surveys.internal.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.google.android.libraries.surveys.internal.view.ba */
/* compiled from: PG */
public final /* synthetic */ class C43099ba implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112720a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f112721b;

    /* renamed from: c */
    public final /* synthetic */ MaterialCardView f112722c;

    /* renamed from: d */
    public final /* synthetic */ TextView f112723d;

    public /* synthetic */ C43099ba(C43108bj bjVar, FrameLayout frameLayout, MaterialCardView materialCardView, TextView textView) {
        this.f112720a = bjVar;
        this.f112721b = frameLayout;
        this.f112722c = materialCardView;
        this.f112723d = textView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C43108bj bjVar = this.f112720a;
        FrameLayout frameLayout = this.f112721b;
        MaterialCardView materialCardView = this.f112722c;
        TextView textView = this.f112723d;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                if (C43108bj.m76065d(motionEvent, view)) {
                    return true;
                }
                frameLayout.setPressed(false);
                materialCardView.mo4473c(C1878d.m5128a(bjVar.getContext(), R.color.google_transparent));
                textView.setTextColor(C1878d.m5128a(bjVar.getContext(), R.color.survey_primary_text_color));
                return true;
            } else if (!frameLayout.isPressed()) {
                return true;
            } else {
                frameLayout.performClick();
                return true;
            }
        } else if (!C43108bj.m76065d(motionEvent, view)) {
            return true;
        } else {
            frameLayout.setPressed(true);
            materialCardView.mo4473c(C1878d.m5128a(bjVar.getContext(), R.color.survey_accent_color));
            textView.setTextColor(C1878d.m5128a(bjVar.getContext(), R.color.survey_surface_color_elevation_2));
            return true;
        }
    }
}
