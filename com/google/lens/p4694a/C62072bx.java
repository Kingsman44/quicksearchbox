package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bx */
/* compiled from: PG */
public final class C62072bx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62072bx f167672a;

    /* renamed from: c */
    private static volatile C63010eb f167673c;

    /* renamed from: b */
    private byte f167674b = 2;

    static {
        C62072bx bxVar = new C62072bx();
        f167672a = bxVar;
        C62942bv.registerDefaultInstance(C62072bx.class, bxVar);
    }

    private C62072bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167674b);
            case 1:
                this.f167674b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167672a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62072bx();
            case 4:
                return new C62071bw();
            case 5:
                return f167672a;
            case 6:
                C63010eb ebVar = f167673c;
                if (ebVar == null) {
                    synchronized (C62072bx.class) {
                        ebVar = f167673c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167672a);
                            f167673c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
