package com.google.android.libraries.assistant.auto.tng.morris.framework;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14490ld;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14491le;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e */
/* compiled from: PG */
public final class C14938e {

    /* renamed from: a */
    public C58480gp f44887a;

    /* renamed from: b */
    public C58490gz f44888b;

    /* renamed from: a */
    public final void mo21859a(C14492lf lfVar, int i) {
        if (this.f44888b == null) {
            this.f44888b = new C58490gz(4);
        }
        C58490gz gzVar = this.f44888b;
        gzVar.getClass();
        gzVar.mo55429h(lfVar, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo21860b(int i) {
        if (this.f44887a == null) {
            this.f44887a = C58485gu.m89837e();
        }
        C58480gp gpVar = this.f44887a;
        gpVar.getClass();
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14490ld ldVar = (C14490ld) C14491le.f43793b.createBuilder();
        ldVar.copyOnWrite();
        ((C14491le) ldVar.instance).f43795a = i - 2;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14491le leVar = (C14491le) ldVar.build();
        leVar.getClass();
        lfVar.f43799b = leVar;
        lfVar.f43798a = 2;
        gpVar.mo55395g((C14492lf) gtVar.build());
    }
}
