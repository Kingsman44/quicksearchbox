package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62995dn;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ah */
/* compiled from: PG */
public final /* synthetic */ class C25202ah implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ String f68644a;

    public /* synthetic */ C25202ah(String str) {
        this.f68644a = str;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        String str = this.f68644a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25282u uVar = aeVar.f68641n;
        if (uVar == null) {
            uVar = C25282u.f68773d;
        }
        C25278q qVar = (C25278q) uVar.toBuilder();
        C25282u uVar2 = aeVar.f68641n;
        if (uVar2 == null) {
            uVar2 = C25282u.f68773d;
        }
        str.getClass();
        C62995dn dnVar = uVar2.f68776b;
        int intValue = (dnVar.containsKey(str) ? ((Integer) dnVar.get(str)).intValue() : 1) + 1;
        str.getClass();
        qVar.copyOnWrite();
        C25282u uVar3 = (C25282u) qVar.instance;
        C62995dn dnVar2 = uVar3.f68776b;
        if (!dnVar2.f170058b) {
            uVar3.f68776b = dnVar2.mo58980a();
        }
        uVar3.f68776b.put(str, Integer.valueOf(intValue));
        adVar.copyOnWrite();
        C25282u uVar4 = (C25282u) qVar.build();
        uVar4.getClass();
        ((C25199ae) adVar.instance).f68641n = uVar4;
        return (C25199ae) adVar.build();
    }
}
