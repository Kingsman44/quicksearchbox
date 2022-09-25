package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.z */
/* compiled from: PG */
final class C13170z extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C13118ab f40778a;

    public C13170z(C13118ab abVar) {
        this.f40778a = abVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i == 0) {
            this.f40778a.f40670A.mo20927a(5);
            C13118ab abVar = this.f40778a;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) abVar.f40687l.requireView().findViewById(R.id.media_rec_content_container)).mLayout;
            if (linearLayoutManager == null) {
                C59104x d = C13118ab.f40669a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaRecFragment");
                ((C59052c) ((C59052c) d).mo56372aa(44615)).mo56386p("Layout manager not found. Failed to update the last completely visible item.");
            } else {
                abVar.f40671B = Math.max(abVar.f40671B, linearLayoutManager.findLastCompletelyVisibleItemPosition());
            }
        }
        C13118ab abVar2 = this.f40778a;
        if (!abVar2.f40672C) {
            C13141aw awVar = abVar2.f40701z;
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) ((RecyclerView) awVar.f40723a.requireView().findViewById(R.id.media_rec_content_container)).mLayout;
            if (linearLayoutManager2 != null) {
                int findFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                int findLastCompletelyVisibleItemPosition = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                int i3 = 1;
                if (awVar.f40724b == 1 && i != 1) {
                    int i4 = awVar.f40725c;
                    boolean z = (findFirstVisibleItemPosition == i4 && findLastVisibleItemPosition == awVar.f40726d && findFirstCompletelyVisibleItemPosition == awVar.f40727e && findLastCompletelyVisibleItemPosition == awVar.f40728f) ? false : true;
                    if (findFirstVisibleItemPosition > i4 || findLastVisibleItemPosition > awVar.f40726d || findFirstCompletelyVisibleItemPosition > awVar.f40727e || findLastCompletelyVisibleItemPosition > awVar.f40728f) {
                        C58976aa aaVar = C58975e.f156826a;
                        i2 = awVar.f40726d;
                        i3 = -1;
                    } else if (z) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        i2 = awVar.f40725c;
                    }
                    awVar.mo20919a(linearLayoutManager2, i2, i3);
                }
                awVar.f40724b = i;
                awVar.f40725c = findFirstVisibleItemPosition;
                awVar.f40726d = findLastVisibleItemPosition;
                awVar.f40727e = findFirstCompletelyVisibleItemPosition;
                awVar.f40728f = findLastCompletelyVisibleItemPosition;
            }
        }
    }
}
