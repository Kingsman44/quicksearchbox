package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.as */
/* compiled from: PG */
public final /* synthetic */ class C113944as implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315566a;

    public /* synthetic */ C113944as(C114071eg egVar) {
        this.f315566a = egVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Integer num = (Integer) obj;
        View findViewById = this.f315566a.f315986v.findViewById(R.id.valyrian_chat_ui_root);
        if (findViewById != null) {
            ((C59052c) ((C59052c) C114071eg.f315790j.mo56224b()).mo56372aa(28545)).mo56389s("initialPlateHeight: %s", num);
            if (num.intValue() > 0) {
                findViewById.setMinimumHeight(num.intValue());
            } else {
                findViewById.setMinimumHeight(0);
            }
        }
    }
}
