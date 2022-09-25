package com.google.android.apps.gsa.nga.shared.p6319ak;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.gsa.nga.api.C74693at;
import com.google.android.apps.gsa.nga.api.C74697ax;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.AnswerUiRenderer;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78081t;
import com.google.android.apps.gsa.nga.shared.p6321am.p6323b.C80936f;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.ak.b */
/* compiled from: PG */
public final class C80882b extends C74693at {

    /* renamed from: a */
    public static final C59071e f221833a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ak.b");

    /* renamed from: b */
    private final C80936f f221834b;

    /* renamed from: c */
    private final Handler f221835c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final C78081t f221836d;

    public C80882b(C78081t tVar, C80936f fVar) {
        this.f221836d = tVar;
        this.f221834b = fVar;
    }

    /* renamed from: e */
    public final void mo71051e(C74697ax axVar) {
        C80936f fVar = this.f221834b;
        View view = this.f221836d.f215067a;
        Duration duration = AnswerUiRenderer.f214882a;
        fVar.mo74719a(view, new C80881a(axVar), this.f221835c);
    }
}
