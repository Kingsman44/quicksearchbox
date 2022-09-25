package com.google.android.libraries.onegoogle.common;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.onegoogle.common.ah */
/* compiled from: PG */
public final class C30908ah {
    /* renamed from: a */
    public static void m57698a(RecyclerView recyclerView, C0640fb fbVar) {
        C30907ag agVar = new C30907ag(recyclerView, fbVar);
        if (C2043bi.m5569aw(recyclerView)) {
            agVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(agVar);
    }
}
