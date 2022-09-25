package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.bl */
/* compiled from: PG */
public final /* synthetic */ class C82162bl implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ C82167bq f224582a;

    public /* synthetic */ C82162bl(C82167bq bqVar) {
        this.f224582a = bqVar;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        C82167bq bqVar = this.f224582a;
        MotionEvent.actionToString(motionEvent.getActionMasked());
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        bqVar.f224593b.mo76660b(C82165bo.TOUCH_INSIDE);
        return false;
    }
}
