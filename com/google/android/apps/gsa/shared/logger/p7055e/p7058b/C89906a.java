package com.google.android.apps.gsa.shared.logger.p7055e.p7058b;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.gsa.shared.logger.p7055e.C89887a;
import com.google.android.apps.gsa.shared.logger.p7055e.C89905b;
import com.google.android.apps.gsa.shared.logger.p7055e.p7056a.C89888a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58691ok;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59787fo;
import com.google.common.p4552o.C59788fp;
import com.google.common.p4552o.C59789fq;
import com.google.common.p4552o.C59791fs;
import com.google.common.p4552o.C59792ft;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.b.a */
/* compiled from: PG */
public final class C89906a implements c {

    /* renamed from: a */
    public final C89905b f246334a;

    public C89906a(C89905b bVar) {
        this.f246334a = bVar;
    }

    /* renamed from: b */
    public static C89905b m146417b(C89905b bVar, C89905b bVar2) {
        Iterable iterable;
        if ((bVar.f246332c == 0 && bVar.f246333d == 0 && (bVar.f246331b.isEmpty() || bVar.f246331b.size() == 0)) || bVar.f246332c > bVar2.f246332c || bVar.f246333d != bVar2.f246333d) {
            return bVar2;
        }
        C89887a aVar = (C89887a) C89905b.f246328e.createBuilder();
        if (bVar.f246331b.isEmpty()) {
            iterable = bVar2.f246331b;
        } else {
            iterable = m146418c(bVar2.f246331b, bVar.f246331b);
        }
        aVar.mo83726a(iterable);
        long j = bVar.f246332c;
        aVar.copyOnWrite();
        C89905b bVar3 = (C89905b) aVar.instance;
        bVar3.f246330a |= 1;
        bVar3.f246332c = j;
        int i = bVar.f246333d;
        aVar.copyOnWrite();
        C89905b bVar4 = (C89905b) aVar.instance;
        bVar4.f246330a |= 2;
        bVar4.f246333d = i;
        return (C89905b) aVar.build();
    }

    /* renamed from: c */
    public static List m146418c(List list, List list2) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59792ft ftVar = (C59792ft) it.next();
            String str = ftVar.f161565c;
            C59791fs a = C59791fs.m92505a(ftVar.f161564b);
            if (a == null) {
                a = C59791fs.UNKNOWN;
            }
            hashMap.put(new C89888a(str, a), ftVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C59792ft ftVar2 = (C59792ft) it2.next();
            String str2 = ftVar2.f161565c;
            C59791fs a2 = C59791fs.m92505a(ftVar2.f161564b);
            if (a2 == null) {
                a2 = C59791fs.UNKNOWN;
            }
            C89888a aVar = new C89888a(str2, a2);
            if (hashMap.containsKey(aVar)) {
                C59792ft ftVar3 = (C59792ft) hashMap.get(aVar);
                C58838bb.m90868c(ftVar2.f161565c.equals(ftVar3.f161565c));
                C59791fs a3 = C59791fs.m92505a(ftVar2.f161564b);
                if (a3 == null) {
                    a3 = C59791fs.UNKNOWN;
                }
                C59791fs a4 = C59791fs.m92505a(ftVar3.f161564b);
                if (a4 == null) {
                    a4 = C59791fs.UNKNOWN;
                }
                C58838bb.m90868c(a3 == a4);
                C59789fq fqVar = (C59789fq) C59792ft.f161561h.createBuilder();
                C59791fs a5 = C59791fs.m92505a(ftVar2.f161564b);
                if (a5 == null) {
                    a5 = C59791fs.UNKNOWN;
                }
                fqVar.copyOnWrite();
                C59792ft ftVar4 = (C59792ft) fqVar.instance;
                ftVar4.f161564b = a5.f161560e;
                ftVar4.f161563a |= 2;
                String str3 = ftVar2.f161565c;
                fqVar.copyOnWrite();
                C59792ft ftVar5 = (C59792ft) fqVar.instance;
                str3.getClass();
                ftVar5.f161563a |= 4;
                ftVar5.f161565c = str3;
                int i = ftVar2.f161566d;
                int i2 = ftVar3.f161566d;
                fqVar.copyOnWrite();
                C59792ft ftVar6 = (C59792ft) fqVar.instance;
                ftVar6.f161563a |= 8;
                ftVar6.f161566d = i + i2;
                int i3 = ftVar2.f161568f;
                int i4 = ftVar3.f161568f;
                fqVar.copyOnWrite();
                C59792ft ftVar7 = (C59792ft) fqVar.instance;
                ftVar7.f161563a |= 32;
                ftVar7.f161568f = i3 + i4;
                int i5 = ftVar2.f161567e;
                int i6 = ftVar3.f161567e;
                fqVar.copyOnWrite();
                C59792ft ftVar8 = (C59792ft) fqVar.instance;
                ftVar8.f161563a |= 16;
                ftVar8.f161567e = i5 + i6;
                C62971cq cqVar = ftVar2.f161569g;
                C62971cq cqVar2 = ftVar3.f161569g;
                C58461fx fxVar = new C58461fx();
                m146419d(fxVar, cqVar);
                m146419d(fxVar, cqVar2);
                for (C58691ok okVar : fxVar.mo54975m()) {
                    C59787fo foVar = (C59787fo) C59788fp.f161549d.createBuilder();
                    C59753ej ejVar = (C59753ej) okVar.mo55768b();
                    foVar.copyOnWrite();
                    C59788fp fpVar = (C59788fp) foVar.instance;
                    ejVar.getClass();
                    fpVar.f161552b = ejVar;
                    fpVar.f161551a |= 1;
                    int a6 = okVar.mo55767a();
                    foVar.copyOnWrite();
                    C59788fp fpVar2 = (C59788fp) foVar.instance;
                    fpVar2.f161551a |= 2;
                    fpVar2.f161553c = a6;
                    fqVar.mo57056a((C59788fp) foVar.build());
                }
                hashMap.put(aVar, (C59792ft) fqVar.build());
            } else {
                hashMap.put(aVar, ftVar2);
            }
        }
        return new ArrayList(hashMap.values());
    }

    /* renamed from: d */
    private static void m146419d(C58461fx fxVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C59788fp fpVar = (C59788fp) it.next();
            C59753ej ejVar = fpVar.f161552b;
            if (ejVar == null) {
                ejVar = C59753ej.f161449e;
            }
            fxVar.mo54931lF(ejVar, fpVar.f161553c);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo83754a(Object obj) {
        return m146417b((C89905b) obj, this.f246334a);
    }
}
