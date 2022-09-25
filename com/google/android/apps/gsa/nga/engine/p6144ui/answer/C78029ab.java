package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ab */
/* compiled from: PG */
final class C78029ab {

    /* renamed from: a */
    final /* synthetic */ AnswerUiRenderer f214936a;

    public C78029ab(AnswerUiRenderer answerUiRenderer) {
        this.f214936a = answerUiRenderer;
    }

    /* renamed from: a */
    public final float mo72988a() {
        return this.f214936a.f214892h.getTranslationY();
    }

    /* renamed from: b */
    public final void mo72989b(float f, float f2) {
        this.f214936a.f214892h.setAlpha(Math.max(1.0f - f2, 0.0f));
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = this.f214936a.f214892h;
        touchInterceptingFrameLayout.setTranslationY(Math.min(f, (float) touchInterceptingFrameLayout.getHeight()));
    }
}
