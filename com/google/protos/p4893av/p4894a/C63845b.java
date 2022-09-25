package com.google.protos.p4893av.p4894a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.av.a.b */
/* compiled from: PG */
public final class C63845b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63845b f172643a;

    /* renamed from: e */
    private static volatile C63010eb f172644e;

    /* renamed from: b */
    private int f172645b;

    /* renamed from: c */
    private C63771b f172646c;

    /* renamed from: d */
    private byte f172647d = 2;

    static {
        C63845b bVar = new C63845b();
        f172643a = bVar;
        C62942bv.registerDefaultInstance(C63845b.class, bVar);
    }

    private C63845b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172647d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172647d = b;
                return null;
            case 2:
                return newMessageInfo(f172643a, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\b", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63845b();
            case 4:
                return new C63844a();
            case 5:
                return f172643a;
            case 6:
                C63010eb ebVar = f172644e;
                if (ebVar == null) {
                    synchronized (C63845b.class) {
                        ebVar = f172644e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172643a);
                            f172644e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
