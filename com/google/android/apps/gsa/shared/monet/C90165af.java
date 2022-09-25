package com.google.android.apps.gsa.shared.monet;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.monet.af */
/* compiled from: PG */
public final class C90165af {

    /* renamed from: a */
    private final Map f251929a = new HashMap();

    /* renamed from: b */
    private final Map f251930b = new HashMap();

    /* renamed from: a */
    public final C90164ae mo83913a(String str) {
        C58838bb.m90868c(!this.f251930b.containsKey(str));
        C90164ae aeVar = new C90164ae();
        this.f251930b.put(str, aeVar);
        if (this.f251929a.containsKey(str)) {
            aeVar.f251928b = (C22939d) this.f251929a.get(str);
            aeVar.mo83912a();
        }
        return aeVar;
    }

    /* renamed from: b */
    public final void mo83914b(String str, C22939d dVar) {
        C58838bb.m90868c(!this.f251929a.containsKey(str));
        this.f251929a.put(str, dVar);
        if (this.f251930b.containsKey(str)) {
            C90164ae aeVar = (C90164ae) this.f251930b.get(str);
            aeVar.f251928b = dVar;
            aeVar.mo83912a();
        }
    }

    /* renamed from: c */
    public final void mo83915c(String str, C22939d dVar) {
        C58838bb.m90868c(this.f251929a.containsKey(str));
        this.f251929a.remove(str);
        if (this.f251930b.containsKey(str)) {
            C90164ae aeVar = (C90164ae) this.f251930b.get(str);
            aeVar.f251928b = null;
            C90163ad adVar = aeVar.f251927a;
            if (adVar != null) {
                adVar.mo76768b(dVar);
            }
        }
    }
}
