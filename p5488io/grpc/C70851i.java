package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.i */
/* compiled from: PG */
public final class C70851i {

    /* renamed from: a */
    public static final C70851i f189015a = new C70851i();

    /* renamed from: b */
    public C70153aq f189016b;

    /* renamed from: c */
    public Executor f189017c;

    /* renamed from: d */
    public C70769g f189018d;

    /* renamed from: e */
    public String f189019e;

    /* renamed from: f */
    public List f189020f;

    /* renamed from: g */
    public Boolean f189021g;

    /* renamed from: h */
    public Integer f189022h;

    /* renamed from: i */
    public Integer f189023i;

    /* renamed from: j */
    private Object[][] f189024j;

    private C70851i() {
        this.f189020f = Collections.emptyList();
        this.f189024j = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
    }

    /* renamed from: a */
    public final C70851i mo62565a(C70153aq aqVar) {
        C70851i iVar = new C70851i(this);
        iVar.f189016b = aqVar;
        return iVar;
    }

    /* renamed from: b */
    public final C70851i mo62566b(Executor executor) {
        C70851i iVar = new C70851i(this);
        iVar.f189017c = executor;
        return iVar;
    }

    /* renamed from: c */
    public final C70851i mo62567c(int i) {
        C58838bb.m90871f(i >= 0, "invalid maxsize %s", i);
        C70851i iVar = new C70851i(this);
        iVar.f189022h = Integer.valueOf(i);
        return iVar;
    }

    /* renamed from: d */
    public final C70851i mo62568d(int i) {
        C58838bb.m90871f(i >= 0, "invalid maxsize %s", i);
        C70851i iVar = new C70851i(this);
        iVar.f189023i = Integer.valueOf(i);
        return iVar;
    }

    /* renamed from: e */
    public final C70851i mo62569e(C70846h hVar, Object obj) {
        C58838bb.m90866a(hVar, "key");
        C58838bb.m90866a(obj, "value");
        C70851i iVar = new C70851i(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f189024j;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (hVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        int length = this.f189024j.length;
        int i2 = i == -1 ? 1 : 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i2;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        iVar.f189024j = objArr2;
        Object[][] objArr3 = this.f189024j;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            iVar.f189024j[this.f189024j.length] = new Object[]{hVar, obj};
        } else {
            iVar.f189024j[i] = new Object[]{hVar, obj};
        }
        return iVar;
    }

    /* renamed from: f */
    public final C70851i mo62570f(C70904s sVar) {
        C70851i iVar = new C70851i(this);
        ArrayList arrayList = new ArrayList(this.f189020f.size() + 1);
        arrayList.addAll(this.f189020f);
        arrayList.add(sVar);
        iVar.f189020f = Collections.unmodifiableList(arrayList);
        return iVar;
    }

    /* renamed from: g */
    public final Object mo62571g(C70846h hVar) {
        C58838bb.m90866a(hVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f189024j;
            if (i >= objArr.length) {
                return hVar.f189005a;
            }
            if (hVar.equals(objArr[i][0])) {
                return this.f189024j[i][1];
            }
            i++;
        }
    }

    /* renamed from: h */
    public final boolean mo62572h() {
        return Boolean.TRUE.equals(this.f189021g);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("deadline", this.f189016b);
        Class<?> cls = null;
        b.mo56102b("authority", (Object) null);
        b.mo56102b("callCredentials", this.f189018d);
        Executor executor = this.f189017c;
        if (executor != null) {
            cls = executor.getClass();
        }
        b.mo56102b("executor", cls);
        b.mo56102b("compressorName", this.f189019e);
        b.mo56102b("customOptions", Arrays.deepToString(this.f189024j));
        b.mo56103c("waitForReady", String.valueOf(mo62572h()));
        b.mo56102b("maxInboundMessageSize", this.f189022h);
        b.mo56102b("maxOutboundMessageSize", this.f189023i);
        b.mo56102b("streamTracerFactories", this.f189020f);
        return b.toString();
    }

    public C70851i(C70851i iVar) {
        this.f189020f = Collections.emptyList();
        this.f189016b = iVar.f189016b;
        this.f189018d = iVar.f189018d;
        this.f189017c = iVar.f189017c;
        this.f189019e = iVar.f189019e;
        this.f189024j = iVar.f189024j;
        this.f189021g = iVar.f189021g;
        this.f189022h = iVar.f189022h;
        this.f189023i = iVar.f189023i;
        this.f189020f = iVar.f189020f;
    }
}
