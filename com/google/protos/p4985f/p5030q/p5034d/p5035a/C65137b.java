package com.google.protos.p4985f.p5030q.p5034d.p5035a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65745ac;

/* renamed from: com.google.protos.f.q.d.a.b */
/* compiled from: PG */
public final class C65137b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65137b f176302b;

    /* renamed from: e */
    private static volatile C63010eb f176303e;

    /* renamed from: a */
    public int f176304a;

    /* renamed from: c */
    private int f176305c;

    /* renamed from: d */
    private byte f176306d = 2;

    static {
        C65137b bVar = new C65137b();
        f176302b = bVar;
        C62942bv.registerDefaultInstance(C65137b.class, bVar);
    }

    private C65137b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176306d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176306d = b;
                return null;
            case 2:
                return newMessageInfo(f176302b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C65745ac.f178609a});
            case 3:
                return new C65137b();
            case 4:
                return new C65136a();
            case 5:
                return f176302b;
            case 6:
                C63010eb ebVar = f176303e;
                if (ebVar == null) {
                    synchronized (C65137b.class) {
                        ebVar = f176303e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176302b);
                            f176303e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
