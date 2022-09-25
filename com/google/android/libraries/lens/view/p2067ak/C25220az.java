package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62995dn;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.az */
/* compiled from: PG */
public final /* synthetic */ class C25220az implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ String f68659a;

    public /* synthetic */ C25220az(String str) {
        this.f68659a = str;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        String str = this.f68659a;
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
        C62995dn dnVar = uVar2.f68775a;
        int intValue = (dnVar.containsKey(str) ? ((Integer) dnVar.get(str)).intValue() : 1) + 1;
        str.getClass();
        qVar.copyOnWrite();
        C25282u uVar3 = (C25282u) qVar.instance;
        C62995dn dnVar2 = uVar3.f68775a;
        if (!dnVar2.f170058b) {
            uVar3.f68775a = dnVar2.mo58980a();
        }
        uVar3.f68775a.put(str, Integer.valueOf(intValue));
        adVar.copyOnWrite();
        C25282u uVar4 = (C25282u) qVar.build();
        uVar4.getClass();
        ((C25199ae) adVar.instance).f68641n = uVar4;
        return (C25199ae) adVar.build();
    }
}
