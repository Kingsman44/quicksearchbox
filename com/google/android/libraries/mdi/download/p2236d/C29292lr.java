package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29397eu;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.p4433bz.p4437b.C57909n;

/* renamed from: com.google.android.libraries.mdi.download.d.lr */
/* compiled from: PG */
public final /* synthetic */ class C29292lr {
    /* renamed from: a */
    public static C29398ev m54176a(C29328dl dlVar, int i) {
        C29397eu euVar = (C29397eu) C29398ev.f79698g.createBuilder();
        String str = dlVar.f79474c;
        euVar.copyOnWrite();
        C29398ev evVar = (C29398ev) euVar.instance;
        str.getClass();
        evVar.f79700a |= 1;
        evVar.f79701b = str;
        int i2 = dlVar.f79475d;
        euVar.copyOnWrite();
        C29398ev evVar2 = (C29398ev) euVar.instance;
        evVar2.f79700a |= 2;
        evVar2.f79702c = i2;
        String e = C29099m.m54009e(dlVar);
        euVar.copyOnWrite();
        C29398ev evVar3 = (C29398ev) euVar.instance;
        e.getClass();
        evVar3.f79700a |= 4;
        evVar3.f79703d = e;
        euVar.copyOnWrite();
        C29398ev evVar4 = (C29398ev) euVar.instance;
        evVar4.f79704e = i - 1;
        evVar4.f79700a |= 8;
        if ((dlVar.f79472a & 32) != 0) {
            C57909n nVar = dlVar.f79478g;
            if (nVar == null) {
                nVar = C57909n.f154891b;
            }
            euVar.copyOnWrite();
            C29398ev evVar5 = (C29398ev) euVar.instance;
            nVar.getClass();
            evVar5.f79705f = nVar;
            evVar5.f79700a |= 16;
        }
        return (C29398ev) euVar.build();
    }
}
