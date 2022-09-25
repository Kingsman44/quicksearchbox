package com.google.android.gms.location;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.location.internal.C144941s;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.location.u */
/* compiled from: PG */
public final /* synthetic */ class C144973u implements C143798cs {

    /* renamed from: a */
    public static final /* synthetic */ C144973u f391941a = new C144973u();

    private /* synthetic */ C144973u() {
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C144918ag agVar = (C144918ag) obj;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, (String) null, (ClientIdentity) null);
        Context context = agVar.f390156t;
        boolean q = agVar.mo120420q(C144956q.f391913f);
        IInterface G = agVar.mo119451G();
        if (q) {
            ((C144930h) G).mo120437h(lastLocationRequest, new C144941s((C146010af) obj2));
            return;
        }
        ((C146010af) obj2).f394698a.mo122508v(((C144930h) G).mo120434e());
    }
}
