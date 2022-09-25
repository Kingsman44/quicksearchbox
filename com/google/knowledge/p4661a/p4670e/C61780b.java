package com.google.knowledge.p4661a.p4670e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.knowledge.a.e.b */
/* compiled from: PG */
public final class C61780b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61780b f166875a;

    /* renamed from: e */
    private static volatile C63010eb f166876e;

    /* renamed from: b */
    private int f166877b;

    /* renamed from: c */
    private C63771b f166878c;

    /* renamed from: d */
    private byte f166879d = 2;

    static {
        C61780b bVar = new C61780b();
        f166875a = bVar;
        C62942bv.registerDefaultInstance(C61780b.class, bVar);
    }

    private C61780b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166879d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166879d = b;
                return null;
            case 2:
                return newMessageInfo(f166875a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61780b();
            case 4:
                return new C61779a();
            case 5:
                return f166875a;
            case 6:
                C63010eb ebVar = f166876e;
                if (ebVar == null) {
                    synchronized (C61780b.class) {
                        ebVar = f166876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166875a);
                            f166876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
