package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.VoiceLayoutManager */
/* compiled from: PG */
public class VoiceLayoutManager extends LinearLayoutManager {
    public VoiceLayoutManager(Context context) {
        super(context, 0, false);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C115804fr frVar = new C115804fr(recyclerView.getContext());
        frVar.f2449g = i;
        startSmoothScroll(frVar);
    }
}
