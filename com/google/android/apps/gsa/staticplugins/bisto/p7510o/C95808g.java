package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.net.Uri;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.g */
/* compiled from: PG */
public final /* synthetic */ class C95808g implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C95814m f268262a;

    /* renamed from: b */
    public final /* synthetic */ Uri f268263b;

    public /* synthetic */ C95808g(C95814m mVar, Uri uri) {
        this.f268262a = mVar;
        this.f268263b = uri;
    }

    public final void run() {
        C95814m mVar = this.f268262a;
        Uri uri = this.f268263b;
        if (uri != null && !uri.equals(mVar.f268274c.get())) {
            C59104x b = C95814m.f268272a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DefVoiceInputHandler");
            ((C59052c) ((C59052c) b).mo56372aa(15158)).mo56389s("Cleaning up stale URI=%s", uri);
            mVar.mo89786m(new C95809h(mVar, uri));
        }
    }
}
