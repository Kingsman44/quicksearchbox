package com.google.android.libraries.lens.view.p2067ak;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62995dn;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.al */
/* compiled from: PG */
public final /* synthetic */ class C25206al implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ C56306df f68648a;

    public /* synthetic */ C25206al(C56306df dfVar) {
        this.f68648a = dfVar;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        C56306df dfVar = this.f68648a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25274m mVar = aeVar.f68631d;
        if (mVar == null) {
            mVar = C25274m.f68751i;
        }
        C25272k kVar = (C25272k) mVar.toBuilder();
        int i = dfVar.f150068m;
        C25274m mVar2 = aeVar.f68631d;
        if (mVar2 == null) {
            mVar2 = C25274m.f68751i;
        }
        C62995dn dnVar = mVar2.f68760h;
        Integer valueOf = Integer.valueOf(i);
        int intValue = (dnVar.containsKey(valueOf) ? ((Integer) dnVar.get(valueOf)).intValue() : 0) + 1;
        kVar.copyOnWrite();
        C25274m mVar3 = (C25274m) kVar.instance;
        C62995dn dnVar2 = mVar3.f68760h;
        if (!dnVar2.f170058b) {
            mVar3.f68760h = dnVar2.mo58980a();
        }
        mVar3.f68760h.put(valueOf, Integer.valueOf(intValue));
        adVar.copyOnWrite();
        C25274m mVar4 = (C25274m) kVar.build();
        mVar4.getClass();
        ((C25199ae) adVar.instance).f68631d = mVar4;
        return (C25199ae) adVar.build();
    }
}
