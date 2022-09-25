package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yk */
/* compiled from: PG */
public final class C60668yk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60668yk f164582a;

    /* renamed from: e */
    private static volatile C63010eb f164583e;

    /* renamed from: b */
    private int f164584b;

    /* renamed from: c */
    private C62724b f164585c;

    /* renamed from: d */
    private byte f164586d = 2;

    static {
        C60668yk ykVar = new C60668yk();
        f164582a = ykVar;
        C62942bv.registerDefaultInstance(C60668yk.class, ykVar);
    }

    private C60668yk() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f164586d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f164586d = b;
                return null;
            case 2:
                return newMessageInfo(f164582a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60668yk();
            case 4:
                return new C60667yj();
            case 5:
                return f164582a;
            case 6:
                C63010eb ebVar = f164583e;
                if (ebVar == null) {
                    synchronized (C60668yk.class) {
                        ebVar = f164583e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164582a);
                            f164583e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
