package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dd */
/* compiled from: PG */
public final class C62106dd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62106dd f167722a;

    /* renamed from: c */
    private static volatile C63010eb f167723c;

    /* renamed from: b */
    private byte f167724b = 2;

    static {
        C62106dd ddVar = new C62106dd();
        f167722a = ddVar;
        C62942bv.registerDefaultInstance(C62106dd.class, ddVar);
    }

    private C62106dd() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167724b);
            case 1:
                this.f167724b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167722a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62106dd();
            case 4:
                return new C62105dc();
            case 5:
                return f167722a;
            case 6:
                C63010eb ebVar = f167723c;
                if (ebVar == null) {
                    synchronized (C62106dd.class) {
                        ebVar = f167723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167722a);
                            f167723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
