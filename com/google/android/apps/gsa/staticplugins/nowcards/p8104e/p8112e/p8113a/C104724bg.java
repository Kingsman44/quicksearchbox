package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.staticplugins.nowcards.base.BottomSheetListView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104457t;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104458u;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C104724bg implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104727bj f291699a;

    /* renamed from: b */
    public final /* synthetic */ C44565p f291700b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetListView f291701c;

    public /* synthetic */ C104724bg(C104727bj bjVar, C44565p pVar, BottomSheetListView bottomSheetListView) {
        this.f291699a = bjVar;
        this.f291700b = pVar;
        this.f291701c = bottomSheetListView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C104727bj bjVar = this.f291699a;
        C44565p pVar = this.f291700b;
        int count = this.f291701c.getAdapter().getCount();
        if (i >= 0 && i < count) {
            C104457t tVar = bjVar.f291705a;
            Bundle bundle = new Bundle();
            bundle.putInt("optionIndex", Integer.valueOf(i).intValue());
            ((C104458u) tVar).f290578a.mo28345s("onOptionSelected_int", "FollowUpSurveyEventsDispatcher", bundle);
        }
        pVar.dismiss();
    }
}
