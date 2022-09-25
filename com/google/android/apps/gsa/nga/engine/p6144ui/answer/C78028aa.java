package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.aa */
/* compiled from: PG */
final class C78028aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ AnswerUiRenderer f214935a;

    public C78028aa(AnswerUiRenderer answerUiRenderer) {
        this.f214935a = answerUiRenderer;
    }

    public final void onGlobalLayout() {
        this.f214935a.f214892h.getViewTreeObserver().removeOnGlobalLayoutListener(this.f214935a.f214897m);
        AnswerUiRenderer answerUiRenderer = this.f214935a;
        if (answerUiRenderer.f214896l.f398740a != 1.0f) {
            C78031ad adVar = answerUiRenderer.f214895k;
            adVar.f214939b = adVar.f214938a.getHeight();
            answerUiRenderer.f214896l.mo124460b(1.0f, AnswerUiRenderer.f214882a);
        }
    }
}
