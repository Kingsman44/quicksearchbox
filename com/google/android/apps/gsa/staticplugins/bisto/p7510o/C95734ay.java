package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95650ad;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ay */
/* compiled from: PG */
public final /* synthetic */ class C95734ay implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95735az f268031a;

    /* renamed from: b */
    public final /* synthetic */ boolean f268032b;

    public /* synthetic */ C95734ay(C95735az azVar, boolean z) {
        this.f268031a = azVar;
        this.f268032b = z;
    }

    public final void run() {
        C95735az azVar = this.f268031a;
        boolean z = this.f268032b;
        C95688l lVar = azVar.f268033a;
        if (lVar != null) {
            Context context = azVar.f268035c;
            C95651ae aeVar = (C95651ae) lVar;
            if (aeVar.mo89623g()) {
                if (aeVar.f267715f.mo89618f(new C95650ad(new C94650n(context, aeVar.f267722m, aeVar.f267712c, context.getString(true != z ? R.string.mic_on : R.string.mic_off), (Uri) null)))) {
                    C58976aa aaVar = C58975e.f156826a;
                }
            }
        }
    }
}
