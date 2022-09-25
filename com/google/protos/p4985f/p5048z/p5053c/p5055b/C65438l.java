package com.google.protos.p4985f.p5048z.p5053c.p5055b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.l */
/* compiled from: PG */
public final class C65438l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65438l f177885a;

    /* renamed from: e */
    private static volatile C63010eb f177886e;

    /* renamed from: b */
    private int f177887b;

    /* renamed from: c */
    private C65446t f177888c;

    /* renamed from: d */
    private byte f177889d = 2;

    static {
        C65438l lVar = new C65438l();
        f177885a = lVar;
        C62942bv.registerDefaultInstance(C65438l.class, lVar);
    }

    private C65438l() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177889d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177889d = b;
                return null;
            case 2:
                return newMessageInfo(f177885a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65438l();
            case 4:
                return new C65437k();
            case 5:
                return f177885a;
            case 6:
                C63010eb ebVar = f177886e;
                if (ebVar == null) {
                    synchronized (C65438l.class) {
                        ebVar = f177886e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177885a);
                            f177886e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
