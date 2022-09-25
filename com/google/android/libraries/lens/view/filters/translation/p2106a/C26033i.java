package com.google.android.libraries.lens.view.filters.translation.p2106a;

import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.a.i */
/* compiled from: PG */
public final /* synthetic */ class C26033i implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C26034j f70750a;

    public /* synthetic */ C26033i(C26034j jVar) {
        this.f70750a = jVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C58495hd c = C26034j.m48061c((C65603f) this.f70750a.f70753c.mo17428b());
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = c.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            try {
                gzVar.mo55429h((String) entry.getKey(), Long.valueOf(Long.parseLong((String) entry.getValue())));
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) C26034j.f70751a.mo56225c()).mo56382g(e)).mo56372aa(49406)).mo56389s("Skipping %s: Value is not a long", entry);
            }
        }
        return gzVar.mo55427f(false);
    }
}
