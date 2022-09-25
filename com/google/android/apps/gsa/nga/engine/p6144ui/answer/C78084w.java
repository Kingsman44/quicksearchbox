package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.w */
/* compiled from: PG */
public final /* synthetic */ class C78084w implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ AnswerUiRenderer f215070a;

    public /* synthetic */ C78084w(AnswerUiRenderer answerUiRenderer) {
        this.f215070a = answerUiRenderer;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        AnswerUiRenderer answerUiRenderer = this.f215070a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        answerUiRenderer.f214889e.mo73047a();
        return false;
    }
}
