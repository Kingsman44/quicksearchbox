package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.ap */
/* compiled from: PG */
public final class C55536ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55536ap f146546a;

    /* renamed from: b */
    private static volatile C63010eb f146547b;

    static {
        C55536ap apVar = new C55536ap();
        f146546a = apVar;
        C62942bv.registerDefaultInstance(C55536ap.class, apVar);
    }

    private C55536ap() {
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
                return newMessageInfo(f146546a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55536ap();
            case 4:
                return new C55535ao();
            case 5:
                return f146546a;
            case 6:
                C63010eb ebVar = f146547b;
                if (ebVar == null) {
                    synchronized (C55536ap.class) {
                        ebVar = f146547b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146546a);
                            f146547b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
