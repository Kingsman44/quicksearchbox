package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10927b.C146792e;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.e.ai */
/* compiled from: PG */
final class C146839ai implements C146792e {
    /* renamed from: a */
    public final String apply(C64098p pVar) {
        C63979ap apVar;
        int i = pVar.f173294a;
        C58838bb.m90869d(i == 2, "This converter should be applied to Footprints ChannelId. Actually called for ".concat(String.valueOf(String.valueOf(C64097o.m96355a(i)))));
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        C58827ar c = C58827ar.m90818c(':');
        String num = Integer.toString(apVar.f173029b);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toString(apVar.f173030c);
        C63978ao a = C63978ao.m96329a(apVar.f173031d);
        if (a == null) {
            a = C63978ao.UNKNOWN;
        }
        objArr[1] = Integer.toString(a.f173025e);
        return c.mo56097d(new C58825ap(objArr, "fs", num));
    }
}
