package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p033v7.app.C0392m;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104430ag;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104431ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.eb */
/* compiled from: PG */
public final /* synthetic */ class C104800eb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104804ef f292022a;

    public /* synthetic */ C104800eb(C104804ef efVar) {
        this.f292022a = efVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RadioGroup radioGroup;
        C104804ef efVar = this.f292022a;
        C0392m mVar = efVar.f292027b;
        if (mVar != null && (radioGroup = (RadioGroup) mVar.mo1197b().mo1177e(R.id.reason_list_view)) != null) {
            int indexOfChild = radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()));
            C104430ag agVar = efVar.f292026a;
            Bundle bundle = new Bundle();
            bundle.putInt("reasonIndex", Integer.valueOf(indexOfChild).intValue());
            ((C104431ah) agVar).f290564a.mo28345s("onReportSubmitted_int", "ReportContentEventsDispatcher", bundle);
        }
    }
}
