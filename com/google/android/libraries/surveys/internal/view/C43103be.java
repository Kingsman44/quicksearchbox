package com.google.android.libraries.surveys.internal.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.be */
/* compiled from: PG */
public final /* synthetic */ class C43103be implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112731a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f112732b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f112733c;

    public /* synthetic */ C43103be(C43108bj bjVar, FrameLayout frameLayout, ImageView imageView) {
        this.f112731a = bjVar;
        this.f112732b = frameLayout;
        this.f112733c = imageView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C43108bj bjVar = this.f112731a;
        FrameLayout frameLayout = this.f112732b;
        ImageView imageView = this.f112733c;
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
                C43066o.m75992m(imageView, bjVar.getContext(), C1878d.m5128a(bjVar.getContext(), R.color.survey_grey_icon_color));
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
            C43066o.m75992m(imageView, bjVar.getContext(), C1878d.m5128a(bjVar.getContext(), R.color.survey_accent_color));
            return true;
        }
    }
}
