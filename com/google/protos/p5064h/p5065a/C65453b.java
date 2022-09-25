package com.google.protos.p5064h.p5065a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5020k.C64926c;

/* renamed from: com.google.protos.h.a.b */
/* compiled from: PG */
public final class C65453b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65453b f177919a;

    /* renamed from: e */
    private static volatile C63010eb f177920e;

    /* renamed from: b */
    private int f177921b;

    /* renamed from: c */
    private C64926c f177922c;

    /* renamed from: d */
    private byte f177923d = 2;

    static {
        C65453b bVar = new C65453b();
        f177919a = bVar;
        C62942bv.registerDefaultInstance(C65453b.class, bVar);
    }

    private C65453b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177923d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177923d = b;
                return null;
            case 2:
                return newMessageInfo(f177919a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65453b();
            case 4:
                return new C65452a();
            case 5:
                return f177919a;
            case 6:
                C63010eb ebVar = f177920e;
                if (ebVar == null) {
                    synchronized (C65453b.class) {
                        ebVar = f177920e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177919a);
                            f177920e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
