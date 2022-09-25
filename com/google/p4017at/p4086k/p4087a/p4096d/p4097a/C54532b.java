package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.k.a.d.a.b */
/* compiled from: PG */
public final class C54532b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54532b f143180e;

    /* renamed from: f */
    private static volatile C63010eb f143181f;

    /* renamed from: a */
    public C62971cq f143182a = emptyProtobufList();

    /* renamed from: b */
    public int f143183b;

    /* renamed from: c */
    public C63088z f143184c = C63088z.f170246b;

    /* renamed from: d */
    public int f143185d;

    static {
        C54532b bVar = new C54532b();
        f143180e = bVar;
        C62942bv.registerDefaultInstance(C54532b.class, bVar);
    }

    private C54532b() {
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
                return newMessageInfo(f143180e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003\n\u0004\f", new Object[]{"a", C54536f.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C54532b();
            case 4:
                return new C54528a();
            case 5:
                return f143180e;
            case 6:
                C63010eb ebVar = f143181f;
                if (ebVar == null) {
                    synchronized (C54532b.class) {
                        ebVar = f143181f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143180e);
                            f143181f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
