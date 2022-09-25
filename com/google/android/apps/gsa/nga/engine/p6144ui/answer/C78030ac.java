package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ac */
/* compiled from: PG */
final class C78030ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AnswerUiRenderer f214937a;

    public C78030ac(AnswerUiRenderer answerUiRenderer) {
        this.f214937a = answerUiRenderer;
    }

    public final void run() {
        AnswerUiRenderer answerUiRenderer = this.f214937a;
        if (answerUiRenderer.f214896l.f398740a >= 1.0f) {
            answerUiRenderer.mo72975i();
        } else {
            answerUiRenderer.mo72973g();
        }
    }
}
