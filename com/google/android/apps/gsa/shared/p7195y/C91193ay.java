package com.google.android.apps.gsa.shared.p7195y;

import android.text.TextUtils;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.shared.y.ay */
/* compiled from: PG */
public abstract class C91193ay {
    /* renamed from: a */
    public abstract C91196ba mo85443a();

    /* renamed from: b */
    public abstract void mo85444b(C91210bo boVar);

    /* renamed from: c */
    public final C91196ba mo85445c() {
        C91196ba a = mo85443a();
        boolean z = false;
        boolean z2 = a.mo85468m() == null || TextUtils.isEmpty(a.mo85468m());
        byte[] o = a.mo85470o();
        boolean z3 = o == null || o.length == 0;
        C58838bb.m90869d(!z2 || !z3, "url or imageContent has to be set");
        if (z3 || z2) {
            z = true;
        }
        C58838bb.m90869d(z, "url and imageContent can not be set at the same time.");
        return a;
    }
}
