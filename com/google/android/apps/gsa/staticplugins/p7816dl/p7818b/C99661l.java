package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.l */
/* compiled from: PG */
public final /* synthetic */ class C99661l implements C23109a {

    /* renamed from: a */
    public final /* synthetic */ Intent f278921a;

    public /* synthetic */ C99661l(Intent intent) {
        this.f278921a = intent;
    }

    /* renamed from: a */
    public final void mo28347a(Object obj) {
        C99655f fVar = (C99655f) obj;
        Bundle extras = this.f278921a.getExtras();
        if (!((Boolean) ((C99643a) fVar.f278898a).f278827e.f63720e).booleanValue() && fVar.f278905h && fVar.f278900c.mo26871c() - fVar.f278906i >= 250) {
            fVar.f278907j = null;
            if (extras == null || !extras.containsKey("extra_update_request_option") || TextUtils.equals(extras.getString("extra_update_request_option"), "update_request_immediate")) {
                fVar.mo91561j(extras);
                return;
            }
            if (TextUtils.equals(extras.getString("extra_update_request_option"), true != ((Boolean) ((C99643a) fVar.f278898a).f278826d.f63720e).booleanValue() ? "update_request_when_hidden" : "update_request_when_shown")) {
                fVar.mo91561j(extras);
            } else {
                fVar.f278907j = extras;
            }
        }
    }
}
