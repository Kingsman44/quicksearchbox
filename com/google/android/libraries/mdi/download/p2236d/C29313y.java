package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29397eu;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.common.base.C58817ah;
import com.google.p4433bz.p4437b.C57909n;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.y */
/* compiled from: PG */
public final /* synthetic */ class C29313y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79437a;

    /* renamed from: b */
    public final /* synthetic */ List f79438b;

    /* renamed from: c */
    public final /* synthetic */ Set f79439c;

    public /* synthetic */ C29313y(C29314z zVar, List list, Set set) {
        this.f79437a = zVar;
        this.f79438b = list;
        this.f79439c = set;
    }

    public final Object apply(Object obj) {
        C29314z zVar = this.f79437a;
        List<C29334dr> list = this.f79438b;
        Set set = this.f79439c;
        list.addAll((List) obj);
        for (C29334dr drVar : list) {
            for (C29328dl dlVar : drVar.f79512n) {
                Context context = zVar.f79440a;
                int a = C29332dp.m54217a(drVar.f79507i);
                if (a == 0) {
                    a = 1;
                }
                C29658ia iaVar = zVar.f79448i;
                C29397eu euVar = (C29397eu) C29398ev.f79698g.createBuilder();
                String e = C29099m.m54009e(dlVar);
                C29172hf hfVar = C29172hf.NEW_FILE_KEY;
                int ordinal = C29173hg.m54127a(context, iaVar).ordinal();
                if (ordinal == 0) {
                    String str = dlVar.f79474c;
                    euVar.copyOnWrite();
                    C29398ev evVar = (C29398ev) euVar.instance;
                    str.getClass();
                    evVar.f79700a = 1 | evVar.f79700a;
                    evVar.f79701b = str;
                    int i = dlVar.f79475d;
                    euVar.copyOnWrite();
                    C29398ev evVar2 = (C29398ev) euVar.instance;
                    evVar2.f79700a |= 2;
                    evVar2.f79702c = i;
                    euVar.copyOnWrite();
                    C29398ev evVar3 = (C29398ev) euVar.instance;
                    e.getClass();
                    evVar3.f79700a |= 4;
                    evVar3.f79703d = e;
                    euVar.copyOnWrite();
                    C29398ev evVar4 = (C29398ev) euVar.instance;
                    evVar4.f79704e = a - 1;
                    evVar4.f79700a |= 8;
                } else if (ordinal == 1) {
                    String str2 = dlVar.f79474c;
                    euVar.copyOnWrite();
                    C29398ev evVar5 = (C29398ev) euVar.instance;
                    str2.getClass();
                    evVar5.f79700a = 1 | evVar5.f79700a;
                    evVar5.f79701b = str2;
                    int i2 = dlVar.f79475d;
                    euVar.copyOnWrite();
                    C29398ev evVar6 = (C29398ev) euVar.instance;
                    evVar6.f79700a = 2 | evVar6.f79700a;
                    evVar6.f79702c = i2;
                    euVar.copyOnWrite();
                    C29398ev evVar7 = (C29398ev) euVar.instance;
                    e.getClass();
                    evVar7.f79700a |= 4;
                    evVar7.f79703d = e;
                    euVar.copyOnWrite();
                    C29398ev evVar8 = (C29398ev) euVar.instance;
                    evVar8.f79704e = a - 1;
                    evVar8.f79700a |= 8;
                    if ((dlVar.f79472a & 32) != 0) {
                        C57909n nVar = dlVar.f79478g;
                        if (nVar == null) {
                            nVar = C57909n.f154891b;
                        }
                        euVar.copyOnWrite();
                        C29398ev evVar9 = (C29398ev) euVar.instance;
                        nVar.getClass();
                        evVar9.f79705f = nVar;
                        evVar9.f79700a |= 16;
                    }
                } else if (ordinal == 2) {
                    euVar.copyOnWrite();
                    C29398ev evVar10 = (C29398ev) euVar.instance;
                    e.getClass();
                    evVar10.f79700a |= 4;
                    evVar10.f79703d = e;
                    euVar.copyOnWrite();
                    C29398ev evVar11 = (C29398ev) euVar.instance;
                    evVar11.f79704e = a - 1;
                    evVar11.f79700a |= 8;
                }
                set.add((C29398ev) euVar.build());
            }
        }
        return set;
    }
}
