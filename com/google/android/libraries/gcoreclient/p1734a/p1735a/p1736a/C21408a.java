package com.google.android.libraries.gcoreclient.p1734a.p1735a.p1736a;

import android.content.Context;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.p10725a.p10726a.p10728b.C142668a;
import com.google.android.libraries.gcoreclient.p1763h.C21526a;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.a.a.a.a */
/* compiled from: PG */
public final class C21408a {

    /* renamed from: a */
    public final C142668a f59883a;

    public C21408a(String str, Context context) {
        try {
            this.f59883a = new C142668a(str, context);
        } catch (C144022y e) {
            C21526a aVar = new C21526a(e.getMessage(), e.getCause());
            aVar.setStackTrace(e.getStackTrace());
            throw aVar;
        }
    }
}
