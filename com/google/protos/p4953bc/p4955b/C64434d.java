package com.google.protos.p4953bc.p4955b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.d */
/* compiled from: PG */
public final class C64434d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64434d f174795a;

    /* renamed from: c */
    private static volatile C63010eb f174796c;

    /* renamed from: b */
    private byte f174797b = 2;

    static {
        C64434d dVar = new C64434d();
        f174795a = dVar;
        C62942bv.registerDefaultInstance(C64434d.class, dVar);
    }

    private C64434d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174797b);
            case 1:
                this.f174797b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f174795a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64434d();
            case 4:
                return new C64433c();
            case 5:
                return f174795a;
            case 6:
                C63010eb ebVar = f174796c;
                if (ebVar == null) {
                    synchronized (C64434d.class) {
                        ebVar = f174796c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174795a);
                            f174796c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
