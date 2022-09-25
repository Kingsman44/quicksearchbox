package p5488io.grpc;

import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;
import com.google.common.p4541l.C59326i;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* renamed from: io.grpc.de */
/* compiled from: PG */
public final class C70334de {

    /* renamed from: a */
    public static final Logger f187479a = Logger.getLogger(C70334de.class.getName());

    /* renamed from: b */
    public static final C70293cv f187480b = new C70288cq();

    /* renamed from: c */
    public static final C70291ct f187481c = new C70289cr();

    /* renamed from: d */
    static final C59326i f187482d = C59326i.f157516d.mo56826f();

    /* renamed from: e */
    public Object[] f187483e;

    /* renamed from: f */
    public int f187484f;

    public C70334de() {
    }

    public C70334de(int i, Object[] objArr) {
        this.f187484f = i;
        this.f187483e = objArr;
    }

    /* renamed from: l */
    public static byte[] m102578l(InputStream inputStream) {
        try {
            return C59332o.m92213d(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    /* renamed from: o */
    private final int m102579o() {
        Object[] objArr = this.f187483e;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: p */
    private final void m102580p(int i) {
        Object[] objArr = new Object[i];
        if (!m102582r()) {
            Object[] objArr2 = this.f187483e;
            int i2 = this.f187484f;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.f187483e = objArr;
    }

    /* renamed from: q */
    private final void m102581q(int i, Object obj) {
        if (this.f187483e instanceof byte[][]) {
            m102580p(m102579o());
        }
        this.f187483e[i + i + 1] = obj;
    }

    /* renamed from: r */
    private final boolean m102582r() {
        return this.f187484f == 0;
    }

    /* renamed from: a */
    public final Iterable mo62026a(C70297cz czVar) {
        for (int i = 0; i < this.f187484f; i++) {
            if (Arrays.equals(czVar.f187371b, mo62036k(i))) {
                return new C70296cy(this, czVar, i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Object mo62027b(C70297cz czVar) {
        int i = this.f187484f;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(czVar.f187371b, mo62036k(i)));
        return mo62029d(i, czVar);
    }

    /* renamed from: c */
    public final Object mo62028c(int i) {
        return this.f187483e[i + i + 1];
    }

    /* renamed from: d */
    public final Object mo62029d(int i, C70297cz czVar) {
        C70294cw a;
        Object c = mo62028c(i);
        if (c instanceof byte[]) {
            return czVar.mo61979a((byte[]) c);
        }
        C70331db dbVar = (C70331db) c;
        if (!czVar.mo61983f() || (a = C70331db.m102571a(czVar)) == null) {
            return czVar.mo61979a(dbVar.mo62023c());
        }
        return a.mo61754b(dbVar.mo62022b());
    }

    /* renamed from: e */
    public final Set mo62030e() {
        if (m102582r()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f187484f);
        for (int i = 0; i < this.f187484f; i++) {
            hashSet.add(new String(mo62036k(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: f */
    public final void mo62031f(C70297cz czVar) {
        if (!m102582r()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f187484f;
                if (i < i3) {
                    if (!Arrays.equals(czVar.f187371b, mo62036k(i))) {
                        this.f187483e[i2 + i2] = mo62036k(i);
                        m102581q(i2, mo62028c(i));
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f187483e, i2 + i2, i3 + i3, (Object) null);
                    this.f187484f = i2;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r0 < (r2 + r2)) goto L_0x001a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62032g(p5488io.grpc.C70334de r6) {
        /*
            r5 = this;
            boolean r0 = r6.m102582r()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r5.m102579o()
            int r1 = r5.f187484f
            int r1 = r1 + r1
            int r0 = r0 - r1
            boolean r2 = r5.m102582r()
            if (r2 != 0) goto L_0x001a
            int r2 = r6.f187484f
            int r2 = r2 + r2
            if (r0 >= r2) goto L_0x0021
        L_0x001a:
            int r0 = r6.f187484f
            int r0 = r0 + r0
            int r1 = r1 + r0
            r5.m102580p(r1)
        L_0x0021:
            java.lang.Object[] r0 = r6.f187483e
            java.lang.Object[] r1 = r5.f187483e
            int r2 = r5.f187484f
            int r3 = r6.f187484f
            int r2 = r2 + r2
            int r3 = r3 + r3
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            int r0 = r5.f187484f
            int r6 = r6.f187484f
            int r0 = r0 + r6
            r5.f187484f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.C70334de.mo62032g(io.grpc.de):void");
    }

    /* renamed from: h */
    public final void mo62033h(C70297cz czVar, Object obj) {
        C58838bb.m90866a(czVar, "key");
        C58838bb.m90866a(obj, "value");
        int i = this.f187484f;
        int i2 = i + i;
        if (i2 == 0 || i2 == m102579o()) {
            m102580p(Math.max(i2 + i2, 8));
        }
        int i3 = this.f187484f;
        this.f187483e[i3 + i3] = czVar.f187371b;
        if (czVar.mo61983f()) {
            int i4 = this.f187484f;
            C70294cw a = C70331db.m102571a(czVar);
            a.getClass();
            m102581q(i4, new C70331db(a, obj));
        } else {
            mo62034i(this.f187484f, czVar.mo61980b(obj));
        }
        this.f187484f++;
    }

    /* renamed from: i */
    public final void mo62034i(int i, byte[] bArr) {
        this.f187483e[i + i + 1] = bArr;
    }

    /* renamed from: j */
    public final boolean mo62035j(C70297cz czVar) {
        for (int i = 0; i < this.f187484f; i++) {
            if (Arrays.equals(czVar.f187371b, mo62036k(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final byte[] mo62036k(int i) {
        return (byte[]) this.f187483e[i + i];
    }

    /* renamed from: m */
    public final byte[] mo62037m(int i) {
        Object c = mo62028c(i);
        if (c instanceof byte[]) {
            return (byte[]) c;
        }
        return ((C70331db) c).mo62023c();
    }

    /* renamed from: n */
    public final void mo62038n(C70297cz czVar) {
        if (!m102582r()) {
            int i = 0;
            ArrayList arrayList = null;
            int i2 = 0;
            while (true) {
                int i3 = this.f187484f;
                if (i < i3) {
                    if (Arrays.equals(czVar.f187371b, mo62036k(i))) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(mo62029d(i, czVar));
                    } else {
                        this.f187483e[i2 + i2] = mo62036k(i);
                        m102581q(i2, mo62028c(i));
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f187483e, i2 + i2, i3 + i3, (Object) null);
                    this.f187484f = i2;
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f187484f; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(mo62036k(i), C58913w.f156752a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                C59326i iVar = f187482d;
                byte[] m = mo62037m(i);
                sb.append(iVar.mo56837l(m, m.length));
            } else {
                sb.append(new String(mo62037m(i), C58913w.f156752a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
