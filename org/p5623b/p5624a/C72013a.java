package org.p5623b.p5624a;

import java.util.Arrays;
import org.p5623b.p5629b.C72123b;
import org.p5623b.p5629b.p5630a.C72120f;

/* renamed from: org.b.a.a */
/* compiled from: PG */
public class C72013a extends C72108u {

    /* renamed from: a */
    protected final boolean f191747a;

    /* renamed from: b */
    protected final int f191748b;

    /* renamed from: c */
    protected final byte[] f191749c;

    public C72013a(boolean z, int i, byte[] bArr) {
        this.f191747a = z;
        this.f191748b = i;
        this.f191749c = C72123b.m105660b(bArr);
    }

    /* renamed from: a */
    public final int mo63217a() {
        int b = C72090ch.m105545b(this.f191748b);
        int length = this.f191749c.length;
        return b + C72090ch.m105544a(length) + length;
    }

    /* renamed from: b */
    public void mo63218b(C72106s sVar, boolean z) {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72013a)) {
            return false;
        }
        C72013a aVar = (C72013a) uVar;
        if (this.f191747a == aVar.f191747a && this.f191748b == aVar.f191748b && Arrays.equals(this.f191749c, aVar.f191749c)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return this.f191747a;
    }

    public final int hashCode() {
        return (this.f191747a ^ this.f191748b) ^ C72123b.m105659a(this.f191749c) ? 1 : 0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        if (this.f191747a) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.f191748b));
        stringBuffer.append("]");
        if (this.f191749c != null) {
            stringBuffer.append(" #");
            stringBuffer.append(C72120f.m105653a(this.f191749c));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
