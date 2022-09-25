package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import com.google.android.libraries.notifications.data.C29827r;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55583s;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.j.a.m */
/* compiled from: PG */
public final class C29950m {
    /* renamed from: a */
    public static final C55564bq m55507a(List list) {
        C55563bp bpVar = (C55563bp) C55564bq.f146602f.createBuilder();
        bpVar.copyOnWrite();
        C55564bq bqVar = (C55564bq) bpVar.instance;
        bqVar.f146607d = 2;
        bqVar.f146604a |= 4;
        bpVar.copyOnWrite();
        C55564bq bqVar2 = (C55564bq) bpVar.instance;
        bqVar2.f146605b = 4;
        bqVar2.f146604a |= 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bpVar.copyOnWrite();
                C55564bq bqVar3 = (C55564bq) bpVar.instance;
                bqVar3.f146608e = 2;
                bqVar3.f146604a |= 8;
                break;
            }
            C55583s sVar = ((C29827r) it.next()).mo35052a().f146669j;
            if (sVar == null) {
                sVar = C55583s.f146644f;
            }
            if (sVar.f146650e) {
                break;
            }
        }
        return (C55564bq) bpVar.build();
    }
}
