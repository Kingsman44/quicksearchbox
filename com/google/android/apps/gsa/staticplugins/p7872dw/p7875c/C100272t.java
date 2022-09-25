package com.google.android.apps.gsa.staticplugins.p7872dw.p7875c;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100249a;
import com.google.android.apps.gsa.staticplugins.p7872dw.p7874b.C100250b;
import com.google.common.base.C58896f;
import com.google.common.base.C58898h;
import com.google.common.base.C58911u;

/* renamed from: com.google.android.apps.gsa.staticplugins.dw.c.t */
/* compiled from: PG */
final class C100272t implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C100274v f280399a;

    public C100272t(C100274v vVar) {
        this.f280399a = vVar;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f280399a.f63126Q.mo28316z()) {
            String o = new C58896f(C58911u.f156751b, C58898h.f156736a).mo56194o((String) ((C100253a) this.f280399a.f280403c).f280375e.f63720e);
            String o2 = new C58896f(C58911u.f156751b, C58898h.f156736a).mo56194o(editable.toString());
            if (o == null || !TextUtils.equals(o, o2)) {
                C100249a aVar = this.f280399a.f280402b;
                Bundle bundle = new Bundle();
                bundle.putString("text", o2);
                ((C100250b) aVar).f280369a.mo28345s("onOtherOptionTextChanged_java.lang.String", "SuggestFeedbackEventsDispatcher", bundle);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
