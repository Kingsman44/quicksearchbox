package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67534ae;
import com.google.p5238v.p5239a.C67640i;
import com.google.p5238v.p5239a.C67909y;
import com.google.p5238v.p5239a.p5260n.C67898a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.v.a.g.o */
/* compiled from: PG */
final class C67636o implements C67534ae {

    /* renamed from: a */
    public static final Logger f183582a = Logger.getLogger(C67636o.class.getName());

    /* renamed from: b */
    public static final byte[] f183583b = {0};

    /* renamed from: a */
    public final Class mo59899a() {
        return C67909y.class;
    }

    /* renamed from: b */
    public final Class mo59900b() {
        return C67909y.class;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo59901c(C67533ad adVar) {
        for (List it : adVar.mo59909a()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C67531ab abVar = (C67531ab) it2.next();
                    C67640i iVar = abVar.f183446d;
                    if (iVar instanceof C67633l) {
                        C67633l lVar = (C67633l) iVar;
                        C67898a a = C67898a.m98152a(abVar.mo59904a());
                        if (!a.equals(lVar.mo59954c())) {
                            String valueOf = String.valueOf(lVar.mo59953b());
                            String valueOf2 = String.valueOf(lVar.mo59954c());
                            String obj = a.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + valueOf2 + ") instead of (" + obj + ")");
                        }
                    }
                }
            }
        }
        return new C67635n(adVar);
    }
}
