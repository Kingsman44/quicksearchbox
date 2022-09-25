package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99684i;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99685j;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99688m;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.aa */
/* compiled from: PG */
final class C99691aa implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C99692ab f278967a;

    public C99691aa(C99692ab abVar) {
        this.f278967a = abVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C99688m mVar;
        C99692ab abVar = this.f278967a;
        if (!abVar.f278980m) {
            C99684i iVar = abVar.f278970c;
            RadioButton radioButton = abVar.f278976i;
            radioButton.getClass();
            if (i == radioButton.getId()) {
                mVar = C99688m.GOOGLE_TAB;
            } else {
                mVar = C99688m.PARTNER_TAB;
            }
            Bundle bundle = new Bundle();
            C99688m.values();
            bundle.putInt("selectedTab", mVar.ordinal());
            ((C99685j) iVar).f278957a.mo28345s("onTabClicked_com.google.android.apps.gsa.staticplugins.sharedminusone.shared.SharedMinusOneModel.SelectedTab", "SharedMinusOneEventsDispatcher", bundle);
        }
        RadioButton radioButton2 = this.f278967a.f278976i;
        radioButton2.getClass();
        if (i == radioButton2.getId()) {
            C89949q.m146521e(C28285c.m52882i(this.f278967a.f278976i, 5, (Integer) null), false);
            this.f278967a.f278979l.setVisibility(8);
            this.f278967a.f278978k.setVisibility(0);
            return;
        }
        C89949q.m146521e(C28285c.m52882i(this.f278967a.f278977j, 5, (Integer) null), false);
        this.f278967a.f278978k.setVisibility(8);
        this.f278967a.f278979l.setVisibility(0);
    }
}
