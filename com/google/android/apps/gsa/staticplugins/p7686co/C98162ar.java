package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4575r.C60757n;
import com.google.p375ai.p378b.C7753ir;
import com.google.p375ai.p378b.C7754is;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.ar */
/* compiled from: PG */
public final /* synthetic */ class C98162ar implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98237bb f274121a;

    public /* synthetic */ C98162ar(C98237bb bbVar) {
        this.f274121a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int i;
        NumberFormatException e;
        C98237bb bbVar = this.f274121a;
        C7753ir irVar = (C7753ir) C7754is.f27157b.createBuilder();
        Set<String> stringSet = bbVar.f274299j.f232790a.mo79723b().getStringSet("now_opted_in_experiments", C58733pz.f156496a);
        if (!stringSet.isEmpty()) {
            int[] iArr = new int[stringSet.size()];
            int i2 = 0;
            for (String str : stringSet) {
                try {
                    if (!C58837ba.m90859h(str)) {
                        i = i2 + 1;
                        try {
                            iArr[i2] = Integer.parseInt(str);
                        } catch (NumberFormatException e2) {
                            e = e2;
                        }
                        i2 = i;
                    }
                } catch (NumberFormatException e3) {
                    NumberFormatException numberFormatException = e3;
                    i = i2;
                    e = numberFormatException;
                    ((C59052c) ((C59052c) ((C59052c) C98237bb.f274280c.mo56225c()).mo56382g(e)).mo56372aa(30514)).mo56389s("Bad forced experimentId: %s", str);
                    i2 = i;
                }
            }
            if (i2 != stringSet.size()) {
                iArr = Arrays.copyOf(iArr, i2);
            }
            List j = C60757n.m92749j(iArr);
            irVar.copyOnWrite();
            C7754is isVar = (C7754is) irVar.instance;
            C62961ch chVar = isVar.f27159a;
            if (!chVar.mo58948c()) {
                isVar.f27159a = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) j, (List) isVar.f27159a);
        }
        return (C7754is) irVar.build();
    }
}
