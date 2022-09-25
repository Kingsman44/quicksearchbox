package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bp */
/* compiled from: PG */
public final class C62064bp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62064bp f167661a;

    /* renamed from: c */
    private static volatile C63010eb f167662c;

    /* renamed from: b */
    private byte f167663b = 2;

    static {
        C62064bp bpVar = new C62064bp();
        f167661a = bpVar;
        C62942bv.registerDefaultInstance(C62064bp.class, bpVar);
    }

    private C62064bp() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167663b);
            case 1:
                this.f167663b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167661a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62064bp();
            case 4:
                return new C62063bo();
            case 5:
                return f167661a;
            case 6:
                C63010eb ebVar = f167662c;
                if (ebVar == null) {
                    synchronized (C62064bp.class) {
                        ebVar = f167662c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167661a);
                            f167662c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
