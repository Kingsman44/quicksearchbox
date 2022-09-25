package com.google.protos.p4985f.p5009j.p5012c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.c.b */
/* compiled from: PG */
public final class C64876b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64876b f175782a;

    /* renamed from: b */
    private static volatile C63010eb f175783b;

    static {
        C64876b bVar = new C64876b();
        f175782a = bVar;
        C62942bv.registerDefaultInstance(C64876b.class, bVar);
    }

    private C64876b() {
        emptyProtobufList();
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
                return newMessageInfo(f175782a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64876b();
            case 4:
                return new C64875a();
            case 5:
                return f175782a;
            case 6:
                C63010eb ebVar = f175783b;
                if (ebVar == null) {
                    synchronized (C64876b.class) {
                        ebVar = f175783b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175782a);
                            f175783b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
