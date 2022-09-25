package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95802ch;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.c */
/* compiled from: PG */
public final /* synthetic */ class C95739c implements C95802ch {

    /* renamed from: a */
    public final /* synthetic */ C95759w f268046a;

    public /* synthetic */ C95739c(C95759w wVar) {
        this.f268046a = wVar;
    }

    /* renamed from: a */
    public final void mo89728a(byte[] bArr) {
        Uri uri;
        C95759w wVar = this.f268046a;
        Uri b = wVar.f268094e.mo89782b();
        if (b != null && ((uri = wVar.f268112w) == null || !b.equals(uri))) {
            C58976aa aaVar = C58975e.f156826a;
            wVar.f268094e.mo89782b();
            wVar.f268112w = b;
            wVar.f268113x = 0;
        }
        int i = wVar.f268113x;
        int length = bArr.length;
        wVar.f268113x = i + length;
        synchronized (wVar) {
            wVar.mo89744j();
            wVar.mo89739e(wVar.f268107r).mo89732b(bArr);
            wVar.f268109t += length;
        }
    }
}
