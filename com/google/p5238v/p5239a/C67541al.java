package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.p5238v.p5239a.p5255j.C67722cy;
import com.google.p5238v.p5239a.p5255j.C67728dd;
import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.p5238v.p5239a.p5255j.C67730df;
import com.google.p5238v.p5239a.p5255j.C67731dg;
import com.google.p5238v.p5239a.p5255j.C67732dh;
import com.google.p5238v.p5239a.p5255j.C67733di;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.al */
/* compiled from: PG */
public final class C67541al {
    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static C67733di m97641a(C67729de deVar) {
        C67730df dfVar = (C67730df) C67733di.f183770c.createBuilder();
        int i = deVar.f183762a;
        dfVar.copyOnWrite();
        ((C67733di) dfVar.instance).f183772a = i;
        for (C67728dd ddVar : deVar.f183763b) {
            C67731dg dgVar = (C67731dg) C67732dh.f183764e.createBuilder();
            C67721cx cxVar = ddVar.f183756a;
            if (cxVar == null) {
                cxVar = C67721cx.f183740d;
            }
            String str = cxVar.f183742a;
            dgVar.copyOnWrite();
            str.getClass();
            ((C67732dh) dgVar.instance).f183766a = str;
            int b = C67722cy.m97849b(ddVar.f183757b);
            if (b == 0) {
                b = 1;
            }
            dgVar.copyOnWrite();
            ((C67732dh) dgVar.instance).f183767b = C67722cy.m97848a(b);
            C67742dr a = C67742dr.m97851a(ddVar.f183759d);
            if (a == null) {
                a = C67742dr.UNRECOGNIZED;
            }
            dgVar.copyOnWrite();
            ((C67732dh) dgVar.instance).f183769d = a.getNumber();
            int i2 = ddVar.f183758c;
            dgVar.copyOnWrite();
            ((C67732dh) dgVar.instance).f183768c = i2;
            C67732dh dhVar = (C67732dh) dgVar.build();
            dfVar.copyOnWrite();
            C67733di diVar = (C67733di) dfVar.instance;
            dhVar.getClass();
            C62971cq cqVar = diVar.f183773b;
            if (!cqVar.mo58948c()) {
                diVar.f183773b = C62942bv.mutableCopy(cqVar);
            }
            diVar.f183773b.add(dhVar);
        }
        return (C67733di) dfVar.build();
    }

    /* renamed from: b */
    public static void m97642b(C67729de deVar) {
        int i = deVar.f183762a;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (C67728dd ddVar : deVar.f183763b) {
            int b = C67722cy.m97849b(ddVar.f183757b);
            if (b != 0 && b == 3) {
                if (ddVar.f183756a != null) {
                    C67742dr a = C67742dr.m97851a(ddVar.f183759d);
                    if (a == null) {
                        a = C67742dr.UNRECOGNIZED;
                    }
                    if (a != C67742dr.UNKNOWN_PREFIX) {
                        int b2 = C67722cy.m97849b(ddVar.f183757b);
                        if (b2 != 0 && b2 == 2) {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(ddVar.f183758c)}));
                        }
                        if (ddVar.f183758c == i) {
                            if (!z) {
                                z = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        C67721cx cxVar = ddVar.f183756a;
                        if (cxVar == null) {
                            cxVar = C67721cx.f183740d;
                        }
                        C67720cw a2 = C67720cw.m97847a(cxVar.f183744c);
                        if (a2 == null) {
                            a2 = C67720cw.UNRECOGNIZED;
                        }
                        z2 &= a2 == C67720cw.ASYMMETRIC_PUBLIC;
                        i2++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(ddVar.f183758c)}));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(ddVar.f183758c)}));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    /* renamed from: c */
    public static byte[] m97643c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
