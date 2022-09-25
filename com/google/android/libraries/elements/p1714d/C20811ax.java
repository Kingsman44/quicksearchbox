package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6278fu;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.p323b.C6117a;
import com.google.android.libraries.elements.interfaces.C21308o;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.d.ax */
/* compiled from: PG */
final class C20811ax extends C6279fv {
    @C6117a(mo12871a = 5)

    /* renamed from: a */
    C58485gu f58272a;
    @C6117a(mo12871a = 13)

    /* renamed from: b */
    AtomicBoolean f58273b;
    @C6117a(mo12871a = 13)

    /* renamed from: c */
    AtomicBoolean f58274c;
    @C6117a(mo12871a = 13)

    /* renamed from: d */
    AtomicReference f58275d;
    @C6117a(mo12871a = 13)

    /* renamed from: e */
    Boolean f58276e;

    /* renamed from: a */
    public final void mo13275a(C6278fu fuVar) {
        Object[] objArr = fuVar.f18538b;
        int i = fuVar.f18537a;
        if (i == 0) {
            C6281fx fxVar = new C6281fx();
            fxVar.f18496a = this.f58276e;
            C6281fx fxVar2 = new C6281fx();
            fxVar2.f18496a = this.f58272a;
            fxVar2.f18496a = C58485gu.m89842j(((C21308o) objArr[0]).identifiers());
            fxVar.f18496a = false;
            this.f58276e = (Boolean) fxVar.f18496a;
            this.f58272a = (C58485gu) fxVar2.f18496a;
        } else if (i == 1) {
            C6281fx fxVar3 = new C6281fx();
            fxVar3.f18496a = this.f58276e;
            C6281fx fxVar4 = new C6281fx();
            fxVar4.f18496a = this.f58272a;
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            C58485gu guVar = (C58485gu) fxVar4.f18496a;
            if (guVar != null) {
                ArrayList arrayList = new ArrayList(guVar);
                arrayList.add(intValue2, (String) arrayList.remove(intValue));
                fxVar4.f18496a = C58485gu.m89842j(arrayList);
                fxVar3.f18496a = true;
            }
            this.f58276e = (Boolean) fxVar3.f18496a;
            this.f58272a = (C58485gu) fxVar4.f18496a;
        }
    }
}
