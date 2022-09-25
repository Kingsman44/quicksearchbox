package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.p */
/* compiled from: PG */
public final /* synthetic */ class C78077p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78078q f215062a;

    public /* synthetic */ C78077p(C78078q qVar) {
        this.f215062a = qVar;
    }

    public final void run() {
        AnswerUiRenderer answerUiRenderer;
        WeakReference weakReference = this.f215062a.f215064b;
        if (weakReference != null && (answerUiRenderer = (AnswerUiRenderer) weakReference.get()) != null) {
            answerUiRenderer.mo72977k();
        }
    }
}
