package org.p5623b.p5624a;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: org.b.a.ce */
/* compiled from: PG */
final class C72087ce extends C72110w {

    /* renamed from: b */
    private byte[] f191906b;

    public C72087ce(byte[] bArr) {
        this.f191906b = bArr;
    }

    /* renamed from: l */
    private final void m105534l() {
        if (this.f191906b != null) {
            C72093f fVar = new C72093f(10);
            C72086cd cdVar = new C72086cd(this.f191906b);
            while (cdVar.hasMoreElements()) {
                fVar.mo63279b((C72108u) cdVar.nextElement());
            }
            this.f191939a = fVar.mo63280d();
            this.f191906b = null;
        }
    }

    /* renamed from: a */
    public final synchronized int mo63217a() {
        byte[] bArr = this.f191906b;
        if (bArr != null) {
            return C72090ch.m105544a(bArr.length) + 1 + this.f191906b.length;
        }
        return super.mo63229h().mo63217a();
    }

    /* renamed from: b */
    public final synchronized void mo63218b(C72106s sVar, boolean z) {
        byte[] bArr = this.f191906b;
        if (bArr != null) {
            sVar.mo63301e(z, 48, bArr);
        } else {
            super.mo63229h().mo63218b(sVar, z);
        }
    }

    /* renamed from: e */
    public final synchronized int mo63272e() {
        m105534l();
        return this.f191939a.length;
    }

    /* renamed from: f */
    public final synchronized C72108u mo63228f() {
        m105534l();
        return super.mo63228f();
    }

    /* renamed from: h */
    public final synchronized C72108u mo63229h() {
        m105534l();
        return super.mo63229h();
    }

    public final synchronized int hashCode() {
        m105534l();
        return super.hashCode();
    }

    /* renamed from: i */
    public final synchronized Enumeration mo63273i() {
        byte[] bArr = this.f191906b;
        if (bArr != null) {
            return new C72086cd(bArr);
        }
        return new C72109v(this);
    }

    public final synchronized Iterator iterator() {
        m105534l();
        return super.iterator();
    }

    /* renamed from: j */
    public final synchronized C72092e mo63275j(int i) {
        m105534l();
        return this.f191939a[i];
    }
}
