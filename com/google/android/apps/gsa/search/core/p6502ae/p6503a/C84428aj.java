package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21453aa;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21471s;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21472t;
import com.google.common.base.C58833ax;
import com.google.p4152bb.p4153a.C55040dq;
import com.google.p4152bb.p4153a.C55047dx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.aj */
/* compiled from: PG */
public final class C84428aj {

    /* renamed from: a */
    private final C84425ag f229725a;

    public C84428aj(C84425ag agVar) {
        this.f229725a = agVar;
    }

    public C84428aj(C58833ax axVar) {
        this.f229725a = (C84425ag) axVar.mo56111f();
    }

    /* renamed from: a */
    public final C21479b mo78007a(String str, String str2, String str3, C84429ak akVar) {
        C84425ag agVar = this.f229725a;
        String[] strArr = null;
        if (agVar == null) {
            return null;
        }
        if (str3 != null) {
            strArr = new String[]{str3};
        }
        String[] strArr2 = strArr;
        int min = Math.min(akVar.f229726a.f144826d, 50);
        if (akVar.f229730e == null) {
            C55047dx dxVar = akVar.f229726a;
            List<C21453aa> b = akVar.mo78009b(dxVar);
            C21471s sVar = (C21471s) akVar.f229727b.mo27525b();
            C21472t tVar = new C21472t();
            for (C21453aa b2 : b) {
                tVar.mo26951b(b2);
            }
            for (C55040dq dqVar : dxVar.f144830h) {
                String str4 = dqVar.f144808a;
                C142787ac acVar = tVar.f59912a;
                if (acVar.f387578b == null) {
                    acVar.f387578b = new ArrayList();
                }
                acVar.f387578b.add(str4);
            }
            tVar.f59912a.f387583g = dxVar.f144831i;
            int i = akVar.f229728c;
            if (i != 0) {
                tVar.mo26952c(i);
            }
            boolean z = dxVar.f144827e;
            C142787ac acVar2 = tVar.f59912a;
            acVar2.f387579c = z;
            acVar2.f387577a = dxVar.f144828f;
            akVar.f229730e = tVar.mo26950a();
        }
        return agVar.mo78001h(str, str2, strArr2, min, akVar.f229730e);
    }
}
