package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.z */
/* compiled from: PG */
public final class C55990z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55990z f149100a;

    /* renamed from: b */
    private static volatile C63010eb f149101b;

    static {
        C55990z zVar = new C55990z();
        f149100a = zVar;
        C62942bv.registerDefaultInstance(C55990z.class, zVar);
    }

    private C55990z() {
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
                return newMessageInfo(f149100a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55990z();
            case 4:
                return new C55989y();
            case 5:
                return f149100a;
            case 6:
                C63010eb ebVar = f149101b;
                if (ebVar == null) {
                    synchronized (C55990z.class) {
                        ebVar = f149101b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149100a);
                            f149101b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
