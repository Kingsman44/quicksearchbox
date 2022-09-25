package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104423a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104439b;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C104690a implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104798e f291531a;

    /* renamed from: b */
    public final /* synthetic */ C44565p f291532b;

    public /* synthetic */ C104690a(C104798e eVar, C44565p pVar) {
        this.f291531a = eVar;
        this.f291532b = pVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C104798e eVar = this.f291531a;
        C44565p pVar = this.f291532b;
        C104423a aVar = eVar.f292015a;
        Bundle bundle = new Bundle();
        bundle.putInt("which", Integer.valueOf(i).intValue());
        ((C104439b) aVar).f290568a.mo28345s("optionSelected_int", "AdDismissSurveyEventsDispatcher", bundle);
        pVar.dismiss();
    }
}
