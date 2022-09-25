package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b.C146776d;
import com.google.common.base.C58887cx;
import com.google.common.p4552o.p4566l.C60173ck;
import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.p4552o.p4566l.C60194de;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.ac.b.k.n */
/* compiled from: PG */
public final /* synthetic */ class C147154n implements C60931s {
    public final C60870cx apply(Object obj) {
        Exception exc = (Exception) obj;
        HashMap hashMap = new HashMap();
        for (Throwable th : C58887cx.m90978e(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (hashMap.containsKey(C146776d.class)) {
            C60173ck ckVar = (C60173ck) C60178cp.f162787o.createBuilder();
            C60194de deVar = C60194de.CALL_CREDENTIALS_ERROR;
            ckVar.copyOnWrite();
            C60178cp cpVar = (C60178cp) ckVar.instance;
            cpVar.f162791c = deVar.getNumber();
            cpVar.f162789a |= 2;
            return C60856cj.m92900i((C60178cp) ckVar.build());
        } else if (hashMap.containsKey(C147134ai.class)) {
            C60173ck ckVar2 = (C60173ck) C60178cp.f162787o.createBuilder();
            C60194de i = C147159s.m239962i((C147134ai) hashMap.get(C147134ai.class));
            ckVar2.copyOnWrite();
            C60178cp cpVar2 = (C60178cp) ckVar2.instance;
            cpVar2.f162791c = i.getNumber();
            cpVar2.f162789a |= 2;
            return C60856cj.m92900i((C60178cp) ckVar2.build());
        } else {
            throw exc;
        }
    }
}
