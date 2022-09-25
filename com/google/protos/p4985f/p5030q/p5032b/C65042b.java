package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.f.q.b.b */
/* compiled from: PG */
public final class C65042b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65042b f176137d;

    /* renamed from: g */
    private static volatile C63010eb f176138g;

    /* renamed from: a */
    public int f176139a = 0;

    /* renamed from: b */
    public Object f176140b;

    /* renamed from: c */
    public int f176141c;

    /* renamed from: e */
    private int f176142e;

    /* renamed from: f */
    private byte f176143f = 2;

    static {
        C65042b bVar = new C65042b();
        f176137d = bVar;
        C62942bv.registerDefaultInstance(C65042b.class, bVar);
    }

    private C65042b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176143f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176143f = b;
                return null;
            case 2:
                return newMessageInfo(f176137d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C65753ak.m96798c(), C65057d.class});
            case 3:
                return new C65042b();
            case 4:
                return new C65015a();
            case 5:
                return f176137d;
            case 6:
                C63010eb ebVar = f176138g;
                if (ebVar == null) {
                    synchronized (C65042b.class) {
                        ebVar = f176138g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176137d);
                            f176138g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
