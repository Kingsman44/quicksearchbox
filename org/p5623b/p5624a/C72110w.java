package org.p5623b.p5624a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.p5623b.p5629b.C72114a;

/* renamed from: org.b.a.w */
/* compiled from: PG */
public abstract class C72110w extends C72108u implements Iterable {

    /* renamed from: a */
    C72092e[] f191939a;

    public C72110w() {
        this.f191939a = C72093f.f191911a;
    }

    protected C72110w(C72093f fVar) {
        this.f191939a = fVar.mo63280d();
    }

    public C72110w(C72092e[] eVarArr, byte[] bArr) {
        this.f191939a = eVarArr;
    }

    /* renamed from: k */
    public static C72110w m105637k(Object obj) {
        if (obj == null || (obj instanceof C72110w)) {
            return (C72110w) obj;
        }
        if (obj instanceof C72111x) {
            return m105637k(((C72111x) obj).mo63233g());
        }
        if (obj instanceof byte[]) {
            try {
                return m105637k(m105626q((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        } else {
            if (obj instanceof C72092e) {
                C72108u g = ((C72092e) obj).mo63233g();
                if (g instanceof C72110w) {
                    return (C72110w) g;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72110w)) {
            return false;
        }
        C72110w wVar = (C72110w) uVar;
        int e = mo63272e();
        if (wVar.mo63272e() != e) {
            return false;
        }
        for (int i = 0; i < e; i++) {
            C72108u g = this.f191939a[i].mo63233g();
            C72108u g2 = wVar.f191939a[i].mo63233g();
            if (g != g2 && !g.mo63219c(g2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return true;
    }

    /* renamed from: e */
    public int mo63272e() {
        return this.f191939a.length;
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72054bg(this.f191939a, (byte[]) null);
    }

    /* renamed from: h */
    public C72108u mo63229h() {
        return new C72069bv(this.f191939a);
    }

    public int hashCode() {
        int length = this.f191939a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f191939a[length].mo63233g().hashCode();
        }
    }

    /* renamed from: i */
    public Enumeration mo63273i() {
        return new C72109v(this);
    }

    public Iterator iterator() {
        return new C72114a(this.f191939a);
    }

    /* renamed from: j */
    public C72092e mo63275j(int i) {
        return this.f191939a[i];
    }

    public final String toString() {
        int e = mo63272e();
        if (e == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f191939a[i]);
            i++;
            if (i >= e) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    protected C72110w(C72092e[] eVarArr) {
        if (eVarArr != null) {
            int length = eVarArr.length;
            int i = 0;
            while (i < length) {
                if (eVarArr[i] != null) {
                    i++;
                }
            }
            this.f191939a = C72093f.m105548c(eVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
