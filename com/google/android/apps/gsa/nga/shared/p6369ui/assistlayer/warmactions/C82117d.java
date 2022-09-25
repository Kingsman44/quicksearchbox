package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.warmactions;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81820m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.C130118a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.warmactions.d */
/* compiled from: PG */
public final /* synthetic */ class C82117d implements C130118a {

    /* renamed from: a */
    public final /* synthetic */ WarmActionsAssistUi f224497a;

    public /* synthetic */ C82117d(WarmActionsAssistUi warmActionsAssistUi) {
        this.f224497a = warmActionsAssistUi;
    }

    /* renamed from: a */
    public final void mo75520a(Object obj) {
        WarmActionsAssistUi warmActionsAssistUi = this.f224497a;
        Rect rect = (Rect) obj;
        if (rect.isEmpty()) {
            warmActionsAssistUi.f224486d.mo76660b(C81820m.m130058c());
            return;
        }
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CW);
        warmActionsAssistUi.f224486d.mo76660b(C81820m.m130059d(path));
    }
}
