package com.google.android.libraries.assistant.pcp.p1573k;

import android.os.Bundle;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.List;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69246l;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69247m;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69249o;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.b */
/* compiled from: PG */
public final class C18922b {

    /* renamed from: a */
    private final C69464a f53223a;

    public C18922b(C69464a aVar) {
        this.f53223a = aVar;
    }

    /* renamed from: b */
    private static void m36379b(Bundle bundle, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bundle.putBoolean((String) it.next(), true);
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: a */
    public final Bundle mo24224a(C53306j jVar, String str) {
        Bundle bundle = new Bundle();
        C58976aa aaVar = C58975e.f156826a;
        int i = jVar.f139793X;
        for (C69247m mVar : ((C69249o) this.f53223a.mo17428b()).f185362a) {
            int a = C69246l.m100445a(mVar.f185355a);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 0) {
                m36379b(bundle, mVar.f185358d);
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (mVar.f185356b.contains(Integer.valueOf(jVar.f139793X)) && mVar.f185357c.contains(str)) {
                        m36379b(bundle, mVar.f185358d);
                    }
                } else if (mVar.f185357c.contains(str)) {
                    m36379b(bundle, mVar.f185358d);
                }
            } else if (mVar.f185356b.contains(Integer.valueOf(jVar.f139793X))) {
                m36379b(bundle, mVar.f185358d);
            }
        }
        return bundle;
    }
}
