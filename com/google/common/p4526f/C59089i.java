package com.google.common.p4526f;

import com.google.common.p4526f.p4531c.C59060h;
import com.google.common.p4526f.p4531c.C59061i;
import com.google.common.p4526f.p4531c.C59064l;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.f.i */
/* compiled from: PG */
final class C59089i extends C58976aa {
    public C59089i(Class cls) {
        super("tags", cls, false, true);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo56231b(Object obj, C59106z zVar) {
        C59060h hVar = new C59060h((C59061i) ((C59064l) obj).f156996c.f156986d);
        while (hVar.hasNext()) {
            Map.Entry entry = (Map.Entry) hVar.next();
            if (!((Set) entry.getValue()).isEmpty()) {
                for (Object a : (Set) entry.getValue()) {
                    zVar.mo56300a((String) entry.getKey(), a);
                }
            } else {
                zVar.mo56300a((String) entry.getKey(), (Object) null);
            }
        }
    }
}
