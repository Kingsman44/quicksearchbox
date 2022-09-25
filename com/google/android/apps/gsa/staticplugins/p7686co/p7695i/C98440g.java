package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.g */
/* compiled from: PG */
public final /* synthetic */ class C98440g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98446m f274826a;

    /* renamed from: b */
    public final /* synthetic */ int f274827b;

    public /* synthetic */ C98440g(C98446m mVar, int i) {
        this.f274826a = mVar;
        this.f274827b = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Class cls;
        C98446m mVar = this.f274826a;
        int i = this.f274827b;
        Boolean bool = (Boolean) obj;
        synchronized (mVar.f274846d) {
            int i2 = 4;
            if (!bool.booleanValue()) {
                List<C98400bu> g = mVar.mo91118g(i);
                ArrayList arrayList = new ArrayList();
                for (C98400bu buVar : g) {
                    C98418cl clVar = buVar.f274693d;
                    if (clVar == null) {
                        clVar = C98418cl.f274760h;
                    }
                    if ((clVar.f274762a & 1) != 0) {
                        arrayList.add(buVar);
                    } else {
                        C98399bt btVar = (C98399bt) buVar.toBuilder();
                        C98418cl clVar2 = buVar.f274693d;
                        if (clVar2 == null) {
                            clVar2 = C98418cl.f274760h;
                        }
                        C98417ck ckVar = (C98417ck) clVar2.toBuilder();
                        ckVar.copyOnWrite();
                        C98418cl clVar3 = (C98418cl) ckVar.instance;
                        clVar3.f274762a |= 1;
                        clVar3.f274763b = i;
                        btVar.copyOnWrite();
                        C98400bu buVar2 = (C98400bu) btVar.instance;
                        C98418cl clVar4 = (C98418cl) ckVar.build();
                        clVar4.getClass();
                        buVar2.f274693d = clVar4;
                        buVar2.f274690a |= 4;
                        arrayList.add((C98400bu) btVar.build());
                    }
                }
                mVar.mo91122m(arrayList);
            }
            mVar.mo91121j(i);
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < mVar.f274850h.size(); i4++) {
                C98435db dbVar = mVar.f274844b;
                C98418cl clVar5 = ((C98400bu) mVar.f274850h.valueAt(i4)).f274693d;
                if (clVar5 == null) {
                    clVar5 = C98418cl.f274760h;
                }
                int b = dbVar.mo91099b(clVar5, i);
                if (b < i3) {
                    i3 = b;
                }
            }
            C98426ct ctVar = mVar.f274847e;
            boolean booleanValue = bool.booleanValue();
            if (i3 == Integer.MAX_VALUE) {
                i2 = 1;
            } else if (i3 > i) {
                i2 = 2;
            } else if (!booleanValue) {
                i2 = 3;
            }
            ctVar.mo91090b(i2, Math.max(0, i3 - i));
            mVar.mo91120i();
            cls = Void.TYPE;
        }
        return cls;
    }
}
