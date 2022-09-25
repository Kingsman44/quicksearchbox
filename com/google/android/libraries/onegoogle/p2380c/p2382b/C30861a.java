package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.android.libraries.logging.p2185ve.p2186a.C28300d;
import com.google.android.libraries.logging.p2185ve.p2186a.C28303g;
import com.google.android.libraries.logging.p2185ve.p2186a.C28304h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.c.b.a */
/* compiled from: PG */
public abstract class C30861a {
    /* renamed from: b */
    public static C30861a m57616b(C30158c cVar, C30313v vVar, Object obj) {
        if (vVar != null && vVar.f81976b) {
            return new C30873b(4, (String) null);
        }
        if (obj == null) {
            return m57617e();
        }
        if (!cVar.mo35558i(obj)) {
            return new C30873b(3, (String) null);
        }
        String d = cVar.mo35553d(obj);
        return (d == null || !d.contains("@")) ? m57617e() : new C30873b(1, d);
    }

    /* renamed from: e */
    private static C30861a m57617e() {
        return new C30873b(2, (String) null);
    }

    /* renamed from: c */
    public abstract String mo36549c();

    /* renamed from: d */
    public abstract int mo36550d();

    /* renamed from: a */
    public final C28423g mo36548a() {
        int d = mo36550d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        } else if (i == 0) {
            return C28297a.m52922b((String) Objects.requireNonNull(mo36549c()));
        } else {
            if (i == 1) {
                return C28297a.m52921a();
            }
            if (i == 2) {
                return C28297a.m52923c();
            }
            if (i != 3) {
                return C28297a.m52921a();
            }
            C62940bt btVar = C28304h.f76989a;
            C28300d dVar = (C28300d) C28303g.f76984d.createBuilder();
            dVar.copyOnWrite();
            C28303g gVar = (C28303g) dVar.instance;
            gVar.f76988c = 4;
            gVar.f76986a = 2 | gVar.f76986a;
            return new C28423g(btVar, (C28303g) dVar.build());
        }
    }
}
