package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bv */
/* compiled from: PG */
public final class C62070bv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62070bv f167669a;

    /* renamed from: c */
    private static volatile C63010eb f167670c;

    /* renamed from: b */
    private byte f167671b = 2;

    static {
        C62070bv bvVar = new C62070bv();
        f167669a = bvVar;
        C62942bv.registerDefaultInstance(C62070bv.class, bvVar);
    }

    private C62070bv() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167671b);
            case 1:
                this.f167671b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167669a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62070bv();
            case 4:
                return new C62069bu();
            case 5:
                return f167669a;
            case 6:
                C63010eb ebVar = f167670c;
                if (ebVar == null) {
                    synchronized (C62070bv.class) {
                        ebVar = f167670c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167669a);
                            f167670c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
