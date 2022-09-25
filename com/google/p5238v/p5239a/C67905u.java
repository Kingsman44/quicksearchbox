package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67594ac;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.p5238v.p5239a.p5255j.C67722cy;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5255j.C67726db;
import com.google.p5238v.p5239a.p5255j.C67727dc;
import com.google.p5238v.p5239a.p5255j.C67728dd;
import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import java.security.GeneralSecurityException;
import java.util.Collections;

/* renamed from: com.google.v.a.u */
/* compiled from: PG */
public final class C67905u {

    /* renamed from: a */
    private final C67726db f184086a;

    public C67905u(C67726db dbVar) {
        this.f184086a = dbVar;
    }

    /* renamed from: b */
    public static C67905u m98172b(C67904t tVar) {
        return new C67905u((C67726db) tVar.f184084a.toBuilder());
    }

    /* renamed from: f */
    private final synchronized int m98173f() {
        int a;
        a = C67594ac.m97757a();
        while (m98176i(a)) {
            a = C67594ac.m97757a();
        }
        return a;
    }

    /* renamed from: g */
    private final synchronized C67728dd m98174g(C67721cx cxVar, C67742dr drVar) {
        C67727dc dcVar;
        int f = m98173f();
        if (drVar != C67742dr.UNKNOWN_PREFIX) {
            dcVar = (C67727dc) C67728dd.f183754e.createBuilder();
            dcVar.copyOnWrite();
            cxVar.getClass();
            ((C67728dd) dcVar.instance).f183756a = cxVar;
            dcVar.copyOnWrite();
            ((C67728dd) dcVar.instance).f183758c = f;
            dcVar.copyOnWrite();
            ((C67728dd) dcVar.instance).f183757b = C67722cy.m97848a(3);
            dcVar.copyOnWrite();
            ((C67728dd) dcVar.instance).f183759d = drVar.getNumber();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C67728dd) dcVar.build();
    }

    /* renamed from: h */
    private final synchronized C67728dd m98175h(C67725da daVar) {
        C67721cx b;
        C67742dr a;
        b = C67539aj.m97627b(daVar);
        a = C67742dr.m97851a(daVar.f183753c);
        if (a == null) {
            a = C67742dr.UNRECOGNIZED;
        }
        return m98174g(b, a);
    }

    /* renamed from: i */
    private final synchronized boolean m98176i(int i) {
        for (C67728dd ddVar : Collections.unmodifiableList(((C67729de) this.f184086a.instance).f183763b)) {
            if (ddVar.f183758c == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized C67904t mo60043a() {
        return C67904t.m98167a((C67729de) this.f184086a.build());
    }

    /* renamed from: c */
    public final synchronized void mo60044c(C67902r rVar) {
        mo60045d(rVar.f184083a);
    }

    @Deprecated
    /* renamed from: d */
    public final synchronized void mo60045d(C67725da daVar) {
        C67728dd h = m98175h(daVar);
        this.f184086a.mo59976a(h);
        int i = h.f183758c;
    }

    /* renamed from: e */
    public final synchronized void mo60046e(int i) {
        int i2 = 0;
        while (i2 < ((C67729de) this.f184086a.instance).f183763b.size()) {
            C67728dd ddVar = (C67728dd) ((C67729de) this.f184086a.instance).f183763b.get(i2);
            if (ddVar.f183758c == i) {
                int b = C67722cy.m97849b(ddVar.f183757b);
                if (b == 0 || b != 3) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                C67726db dbVar = this.f184086a;
                dbVar.copyOnWrite();
                ((C67729de) dbVar.instance).f183762a = i;
            } else {
                i2++;
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
    }
}
