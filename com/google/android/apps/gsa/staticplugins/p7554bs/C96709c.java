package com.google.android.apps.gsa.staticplugins.p7554bs;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.ConfigFlagsImpl;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.c */
/* compiled from: PG */
public final class C96709c {

    /* renamed from: a */
    private final C86124t f270538a;

    /* renamed from: b */
    private final C21370a f270539b;

    public C96709c(C86124t tVar, C21370a aVar) {
        this.f270538a = tVar;
        this.f270539b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ConfigFlagsImpl mo90320a(boolean z) {
        C58490gz gzVar = new C58490gz(4);
        C58490gz gzVar2 = new C58490gz(4);
        C58490gz gzVar3 = new C58490gz(4);
        C58490gz gzVar4 = new C58490gz(4);
        C58490gz gzVar5 = new C58490gz(4);
        if (z) {
            for (C26242ac acVar : C26242ac.values()) {
                C90048d dVar = acVar.f71380d;
                gzVar.mo55429h(Integer.valueOf(dVar.f248757a), Boolean.valueOf(this.f270538a.mo79746e(dVar)));
            }
        } else {
            C26239a[] values = C26239a.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C26239a aVar = values[i];
                int i2 = aVar.f71362ae;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 == 0) {
                        Integer valueOf = Integer.valueOf(aVar.f71357Z);
                        C86124t tVar = this.f270538a;
                        C90048d dVar2 = aVar.f71359ab;
                        dVar2.getClass();
                        gzVar.mo55429h(valueOf, Boolean.valueOf(tVar.mo79746e(dVar2)));
                    } else if (i3 == 1) {
                        Integer valueOf2 = Integer.valueOf(aVar.f71357Z);
                        C86124t tVar2 = this.f270538a;
                        C90075e eVar = aVar.f71360ac;
                        eVar.getClass();
                        gzVar2.mo55429h(valueOf2, Double.valueOf(tVar2.mo79747m(eVar)));
                    } else if (i3 == 2) {
                        Integer valueOf3 = Integer.valueOf(aVar.f71357Z);
                        C86124t tVar3 = this.f270538a;
                        C90102f fVar = aVar.f71358aa;
                        fVar.getClass();
                        gzVar3.mo55429h(valueOf3, Long.valueOf(tVar3.mo79743a(fVar)));
                    } else if (i3 == 3) {
                        Integer valueOf4 = Integer.valueOf(aVar.f71357Z);
                        C86124t tVar4 = this.f270538a;
                        C90129h hVar = aVar.f71361ad;
                        hVar.getClass();
                        gzVar4.mo55429h(valueOf4, tVar4.mo79758x(hVar));
                    }
                    i++;
                } else {
                    throw null;
                }
            }
        }
        return new ConfigFlagsImpl(gzVar.mo55427f(false), gzVar2.mo55427f(false), gzVar3.mo55427f(false), gzVar4.mo55427f(false), gzVar5.mo55427f(false), this.f270538a.mo79759y(), this.f270538a.mo79737h(), this.f270538a.mo79756v(), z, !z, this.f270539b.mo26872d());
    }
}
