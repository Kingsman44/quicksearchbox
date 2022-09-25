package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bz */
/* compiled from: PG */
public final class C62074bz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62074bz f167675a;

    /* renamed from: c */
    private static volatile C63010eb f167676c;

    /* renamed from: b */
    private byte f167677b = 2;

    static {
        C62074bz bzVar = new C62074bz();
        f167675a = bzVar;
        C62942bv.registerDefaultInstance(C62074bz.class, bzVar);
    }

    private C62074bz() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167677b);
            case 1:
                this.f167677b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167675a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62074bz();
            case 4:
                return new C62073by();
            case 5:
                return f167675a;
            case 6:
                C63010eb ebVar = f167676c;
                if (ebVar == null) {
                    synchronized (C62074bz.class) {
                        ebVar = f167676c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167675a);
                            f167676c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
