package org.p5623b.p5624a;

import java.io.IOException;
import java.util.Iterator;
import org.p5623b.p5629b.C72114a;

/* renamed from: org.b.a.z */
/* compiled from: PG */
public abstract class C72113z extends C72108u implements Iterable {

    /* renamed from: a */
    public final C72092e[] f191942a;

    /* renamed from: b */
    protected final boolean f191943b;

    public C72113z() {
        this.f191942a = C72093f.f191911a;
        this.f191943b = true;
    }

    protected C72113z(C72093f fVar) {
        C72092e[] d = fVar.mo63280d();
        this.f191942a = d;
        this.f191943b = d.length < 2;
    }

    /* renamed from: e */
    public static C72113z m105645e(Object obj) {
        if (obj == null || (obj instanceof C72113z)) {
            return (C72113z) obj;
        }
        if (obj instanceof C72015aa) {
            return m105645e(((C72015aa) obj).mo63233g());
        }
        if (obj instanceof byte[]) {
            try {
                return m105645e(C72108u.m105626q((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        } else {
            if (obj instanceof C72092e) {
                C72108u g = ((C72092e) obj).mo63233g();
                if (g instanceof C72113z) {
                    return (C72113z) g;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
    }

    /* renamed from: i */
    private static boolean m105646i(byte[] bArr, byte[] bArr2) {
        byte b = bArr[0] & -33;
        byte b2 = bArr2[0] & -33;
        if (b == b2) {
            int min = Math.min(bArr.length, bArr2.length) - 1;
            int i = 1;
            while (i < min) {
                byte b3 = bArr[i];
                byte b4 = bArr2[i];
                if (b3 == b4) {
                    i++;
                } else if ((b3 & 255) < (b4 & 255)) {
                    return true;
                } else {
                    return false;
                }
            }
            if ((bArr[min] & 255) <= (bArr2[min] & 255)) {
                return true;
            }
            return false;
        } else if (b < b2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    private static byte[] m105647j(C72092e eVar) {
        try {
            return eVar.mo63233g().mo63294p("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72113z)) {
            return false;
        }
        C72113z zVar = (C72113z) uVar;
        int length = this.f191942a.length;
        if (zVar.f191942a.length != length) {
            return false;
        }
        C72056bi biVar = (C72056bi) mo63228f();
        C72056bi biVar2 = (C72056bi) zVar.mo63228f();
        for (int i = 0; i < length; i++) {
            C72108u g = biVar.f191942a[i].mo63233g();
            C72108u g2 = biVar2.f191942a[i].mo63233g();
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

    /* renamed from: h */
    public C72108u mo63229h() {
        return new C72071bx(this.f191943b, this.f191942a);
    }

    public final int hashCode() {
        int length = this.f191942a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f191942a[length].mo63233g().hashCode();
        }
    }

    public final Iterator iterator() {
        return new C72114a(C72093f.m105548c(this.f191942a));
    }

    public final String toString() {
        int length = this.f191942a.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f191942a[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public C72113z(boolean z, C72092e[] eVarArr) {
        this.f191942a = eVarArr;
        boolean z2 = true;
        if (!z && eVarArr.length >= 2) {
            z2 = false;
        }
        this.f191943b = z2;
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        C72092e[] eVarArr;
        if (this.f191943b) {
            eVarArr = this.f191942a;
        } else {
            eVarArr = (C72092e[]) this.f191942a.clone();
            int length = eVarArr.length;
            if (length >= 2) {
                C72092e eVar = eVarArr[0];
                C72092e eVar2 = eVarArr[1];
                byte[] j = m105647j(eVar);
                byte[] j2 = m105647j(eVar2);
                boolean i = m105646i(j2, j);
                byte[] bArr = true != i ? j2 : j;
                if (true == i) {
                    j = j2;
                }
                C72092e eVar3 = true != i ? eVar2 : eVar;
                if (true == i) {
                    eVar = eVar2;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    C72092e eVar4 = eVarArr[i2];
                    byte[] j3 = m105647j(eVar4);
                    if (m105646i(bArr, j3)) {
                        eVarArr[i2 - 2] = eVar;
                        eVar = eVar3;
                        j = bArr;
                        eVar3 = eVar4;
                        bArr = j3;
                    } else if (m105646i(j, j3)) {
                        eVarArr[i2 - 2] = eVar;
                        eVar = eVar4;
                        j = j3;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i3--;
                            if (i3 <= 0) {
                                break;
                            }
                            C72092e eVar5 = eVarArr[i3 - 1];
                            if (m105646i(m105647j(eVar5), j3)) {
                                break;
                            }
                            eVarArr[i3] = eVar5;
                        }
                        eVarArr[i3] = eVar4;
                    }
                }
                eVarArr[length - 2] = eVar;
                eVarArr[length - 1] = eVar3;
            }
        }
        return new C72056bi(eVarArr);
    }
}
