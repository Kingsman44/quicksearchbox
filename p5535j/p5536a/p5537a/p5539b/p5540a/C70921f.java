package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.f */
/* compiled from: PG */
public final class C70921f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C70921f f189120e;

    /* renamed from: f */
    private static volatile C63010eb f189121f;

    /* renamed from: a */
    public int f189122a;

    /* renamed from: b */
    public int f189123b;

    /* renamed from: c */
    public C62910ar f189124c;

    /* renamed from: d */
    public int f189125d;

    static {
        C70921f fVar = new C70921f();
        f189120e = fVar;
        C62942bv.registerDefaultInstance(C70921f.class, fVar);
    }

    private C70921f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189120e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", C70920e.m103844b(), C45240c.f118157a, "d"});
            case 3:
                return new C70921f();
            case 4:
                return new C70918c();
            case 5:
                return f189120e;
            case 6:
                C63010eb ebVar = f189121f;
                if (ebVar == null) {
                    synchronized (C70921f.class) {
                        ebVar = f189121f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189120e);
                            f189121f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
