package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.p */
/* compiled from: PG */
public final /* synthetic */ class C102773p implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C102779v f286884a;

    public /* synthetic */ C102773p(C102779v vVar) {
        this.f286884a = vVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        C102779v vVar = this.f286884a;
        Integer num = (Integer) obj;
        if (vVar.f286895f != null) {
            int intValue = ((Integer) ((C102783z) vVar.f286890a).f286909b.f63720e).intValue();
            if (intValue == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                str = vVar.f286892c.getString(intValue);
            }
            if (!TextUtils.isEmpty(str)) {
                vVar.f286895f.setVisibility(0);
                vVar.f286895f.setText(str);
                return;
            }
            vVar.f286895f.setVisibility(8);
        }
    }
}
