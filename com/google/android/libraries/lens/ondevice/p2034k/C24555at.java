package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.lens.p4701g.C62339dh;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4707j.C62431bh;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.ondevice.k.at */
/* compiled from: PG */
public final class C24555at {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67238a;

    public C24555at(OnDeviceEngineNativeApi onDeviceEngineNativeApi) {
        this.f67238a = onDeviceEngineNativeApi;
    }

    /* renamed from: a */
    public final C62355r mo29956a(C62339dh dhVar) {
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 9;
        pVar.f168327a |= 1;
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        dhVar.getClass();
        pVar2.f168329c = dhVar;
        pVar2.f168328b = 7;
        C62355r b = this.f67238a.mo30011b((C62353p) oVar.build());
        C62431bh bhVar = b.f168337d;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        if (bhVar.f168524b == C62722b.OK.f169415s) {
            return b;
        }
        Object[] objArr = new Object[2];
        C62431bh bhVar2 = b.f168337d;
        objArr[0] = Integer.valueOf((bhVar2 == null ? C62431bh.f168521d : bhVar2).f168524b);
        if (bhVar2 == null) {
            bhVar2 = C62431bh.f168521d;
        }
        objArr[1] = bhVar2.f168525c;
        throw new C24273e(String.format("Translate failed with %s, %s", objArr));
    }
}
