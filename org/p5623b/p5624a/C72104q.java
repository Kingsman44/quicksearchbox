package org.p5623b.p5624a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.C72131f;
import org.p5623b.p5629b.p5630a.C72120f;

/* renamed from: org.b.a.q */
/* compiled from: PG */
public abstract class C72104q extends C72108u implements C72105r {

    /* renamed from: a */
    byte[] f191934a;

    public C72104q(byte[] bArr) {
        if (bArr != null) {
            this.f191934a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    /* renamed from: i */
    public static C72104q m105606i(Object obj) {
        if (obj == null || (obj instanceof C72104q)) {
            return (C72104q) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m105606i(C72108u.m105626q((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        } else {
            if (obj instanceof C72092e) {
                C72108u g = ((C72092e) obj).mo63233g();
                if (g instanceof C72104q) {
                    return (C72104q) g;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72104q)) {
            return false;
        }
        return Arrays.equals(this.f191934a, ((C72104q) uVar).f191934a);
    }

    /* renamed from: e */
    public final InputStream mo63238e() {
        return new ByteArrayInputStream(this.f191934a);
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72050bc(this.f191934a);
    }

    /* renamed from: h */
    public C72108u mo63229h() {
        return new C72050bc(this.f191934a);
    }

    public final int hashCode() {
        return C72123b.m105659a(mo63236k());
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        return this;
    }

    /* renamed from: k */
    public byte[] mo63236k() {
        return this.f191934a;
    }

    public final String toString() {
        return "#".concat(C72131f.m105663a(C72120f.m105654b(this.f191934a)));
    }
}
