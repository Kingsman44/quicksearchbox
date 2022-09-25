package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2069am.C25297ae;
import com.google.android.libraries.lens.view.p2069am.C25298af;
import com.google.common.base.C58839bc;
import com.google.lens.p4707j.C62578l;
import com.google.protobuf.C62963cj;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.view.gleam.bs */
/* compiled from: PG */
public final /* synthetic */ class C26487bs implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ int f72149a;

    /* renamed from: b */
    public final /* synthetic */ int f72150b;

    public /* synthetic */ C26487bs(int i, int i2) {
        this.f72149a = i;
        this.f72150b = i2;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        int i = this.f72149a;
        int i2 = this.f72150b;
        C25298af afVar = (C25298af) obj;
        int i3 = C26488bt.f72151a;
        int i4 = C26491bw.f72156y;
        int a = C25297ae.m46659a(afVar.f68810d);
        if (a != 0 && a == 4 && !new C62963cj(afVar.f68812f, C25298af.f68804g).isEmpty()) {
            C62578l lVar = (C62578l) new C62963cj(afVar.f68812f, C25298af.f68804g).get(0);
            Iterator it = new C62963cj(afVar.f68812f, C25298af.f68804g).iterator();
            while (true) {
                if (it.hasNext()) {
                    C62578l lVar2 = (C62578l) it.next();
                    if (lVar2 == C62578l.NONE) {
                        break;
                    } else if (lVar.getNumber() > lVar2.getNumber()) {
                        lVar = lVar2;
                    }
                } else if ((lVar.getNumber() - 1) % i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
