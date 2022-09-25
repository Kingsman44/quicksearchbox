package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.n */
/* compiled from: PG */
public final /* synthetic */ class C13158n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C13141aw f40764a;

    public /* synthetic */ C13158n(C13141aw awVar) {
        this.f40764a = awVar;
    }

    public final void onClick(View view) {
        C13141aw awVar = this.f40764a;
        C58976aa aaVar = C58975e.f156826a;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) awVar.f40723a.requireView().findViewById(R.id.media_rec_content_container)).mLayout;
        if (linearLayoutManager != null) {
            awVar.mo20919a(linearLayoutManager, linearLayoutManager.findFirstVisibleItemPosition(), 1);
        }
    }
}
