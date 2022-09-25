package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67607n;
import com.google.p5238v.p5239a.p5250f.C67614u;
import com.google.p5238v.p5239a.p5253h.C67638a;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.p5238v.p5239a.p5255j.C67722cy;
import com.google.p5238v.p5239a.p5255j.C67728dd;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.v.a.aa */
/* compiled from: PG */
public final class C67530aa {

    /* renamed from: a */
    public final Class f183439a;

    /* renamed from: b */
    public ConcurrentMap f183440b = new ConcurrentHashMap();

    /* renamed from: c */
    public C67531ab f183441c;

    /* renamed from: d */
    public C67638a f183442d;

    public C67530aa(Class cls) {
        this.f183439a = cls;
        this.f183442d = C67638a.f183586a;
    }

    /* renamed from: a */
    public final void mo59903a(Object obj, C67728dd ddVar, boolean z) {
        byte[] bArr;
        C67728dd ddVar2 = ddVar;
        ConcurrentMap concurrentMap = this.f183440b;
        if (concurrentMap != null) {
            int b = C67722cy.m97849b(ddVar2.f183757b);
            if (b == 0 || b != 3) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            Integer valueOf = Integer.valueOf(ddVar2.f183758c);
            C67742dr a = C67742dr.m97851a(ddVar2.f183759d);
            if (a == null) {
                a = C67742dr.UNRECOGNIZED;
            }
            if (a == C67742dr.RAW) {
                valueOf = null;
            }
            Integer num = valueOf;
            C67607n nVar = C67607n.f183545a;
            C67721cx cxVar = ddVar2.f183756a;
            if (cxVar == null) {
                cxVar = C67721cx.f183740d;
            }
            String str = cxVar.f183742a;
            C67721cx cxVar2 = ddVar2.f183756a;
            C63088z zVar = (cxVar2 == null ? C67721cx.f183740d : cxVar2).f183743b;
            if (cxVar2 == null) {
                cxVar2 = C67721cx.f183740d;
            }
            C67720cw a2 = C67720cw.m97847a(cxVar2.f183744c);
            if (a2 == null) {
                a2 = C67720cw.UNRECOGNIZED;
            }
            C67720cw cwVar = a2;
            C67742dr a3 = C67742dr.m97851a(ddVar2.f183759d);
            if (a3 == null) {
                a3 = C67742dr.UNRECOGNIZED;
            }
            C67742dr drVar = a3;
            if (drVar == C67742dr.RAW) {
                if (num != null) {
                    throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                }
            } else if (num == null) {
                throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
            }
            C67640i e = nVar.mo59946e(new C67614u(str, zVar, cwVar, drVar, num));
            C67742dr a4 = C67742dr.m97851a(ddVar2.f183759d);
            if (a4 == null) {
                a4 = C67742dr.UNRECOGNIZED;
            }
            int ordinal = a4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = C67552d.f183465a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(ddVar2.f183758c).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(ddVar2.f183758c).array();
            }
            byte[] bArr2 = bArr;
            int b2 = C67722cy.m97849b(ddVar2.f183757b);
            int i = b2 == 0 ? 1 : b2;
            C67742dr a5 = C67742dr.m97851a(ddVar2.f183759d);
            if (a5 == null) {
                a5 = C67742dr.UNRECOGNIZED;
            }
            C67531ab abVar = new C67531ab(obj, bArr2, i, a5, ddVar2.f183758c, e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(abVar);
            C67532ac acVar = new C67532ac(abVar.mo59904a());
            List list = (List) concurrentMap.put(acVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(abVar);
                concurrentMap.put(acVar, Collections.unmodifiableList(arrayList2));
            }
            if (!z) {
                return;
            }
            if (this.f183441c == null) {
                this.f183441c = abVar;
                return;
            }
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }
}
