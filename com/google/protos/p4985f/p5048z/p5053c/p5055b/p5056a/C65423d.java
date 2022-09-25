package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.a.d */
/* compiled from: PG */
public final class C65423d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C65423d f177855a;

    /* renamed from: c */
    private static volatile C63010eb f177856c;

    /* renamed from: b */
    private byte f177857b = 2;

    static {
        C65423d dVar = new C65423d();
        f177855a = dVar;
        C62942bv.registerDefaultInstance(C65423d.class, dVar);
    }

    private C65423d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177857b);
            case 1:
                this.f177857b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f177855a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65423d();
            case 4:
                return new C65422c();
            case 5:
                return f177855a;
            case 6:
                C63010eb ebVar = f177856c;
                if (ebVar == null) {
                    synchronized (C65423d.class) {
                        ebVar = f177856c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177855a);
                            f177856c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
