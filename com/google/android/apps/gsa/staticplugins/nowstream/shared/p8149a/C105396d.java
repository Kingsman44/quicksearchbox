package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105196ar;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105308y;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.C143876h;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.d */
/* compiled from: PG */
public final class C105396d implements C23113i {

    /* renamed from: a */
    private final C105394b f294020a;

    public C105396d(C105394b bVar) {
        this.f294020a = bVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("GooglePlayServicesCardEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onRecoveryClicked")) {
                C105196ar arVar = (C105196ar) this.f294020a;
                int intValue = ((Integer) ((C105308y) arVar.f293399a).f293823c.f63720e).intValue();
                int i = C143699aa.f389596a;
                Intent k = C143876h.f389991d.mo119363k((Context) null, intValue, (String) null);
                if (k != null) {
                    arVar.f293400b.mo65089a(k);
                }
            }
        }
    }
}
