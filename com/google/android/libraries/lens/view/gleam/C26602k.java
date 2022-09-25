package com.google.android.libraries.lens.view.gleam;

import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62223d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.gleam.k */
/* compiled from: PG */
public final class C26602k {
    static {
        C58974d.m91135i("DeepGleamHelper");
    }

    /* renamed from: a */
    public static C58495hd m49118a(List list) {
        C58490gz gzVar = new C58490gz(4);
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62223d dVar = (C62223d) it.next();
            for (String str : dVar.f168009c) {
                if (!C58837ba.m90859h(str) && !hashSet.contains(str)) {
                    gzVar.mo55429h(str, dVar);
                    hashSet.add(str);
                }
            }
            for (String str2 : dVar.f168010d) {
                if (!C58837ba.m90859h(str2) && !hashSet.contains(str2)) {
                    gzVar.mo55429h(str2, dVar);
                    hashSet.add(str2);
                }
            }
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public static String m49119b(C56320r rVar) {
        C56318p pVar = rVar.f150101h;
        if (pVar == null) {
            pVar = C56318p.f150087c;
        }
        return pVar.f150090b;
    }
}
