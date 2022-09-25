package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j.p8436a;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.assistant.shared.bp;
import com.google.android.apps.gsa.assistant.shared.q;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.a.a */
/* compiled from: PG */
public final class C110189a implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ Bundle f307029a;

    /* renamed from: b */
    final /* synthetic */ C110402b f307030b;

    public C110189a(Bundle bundle, C110402b bVar) {
        this.f307029a = bundle;
        this.f307030b = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        String string = this.f307029a.getString("dreamliner_seq_args");
        if (string != null) {
            q c = C73845bq.m108430c();
            c.a = string;
            return c.c();
        } else if (!this.f307030b.mo98629a() || !this.f307029a.getBoolean("seq_args_is_ch_am", false)) {
            return null;
        } else {
            bp c2 = C73845bq.m108430c();
            c2.b(true);
            return c2.c();
        }
    }
}
