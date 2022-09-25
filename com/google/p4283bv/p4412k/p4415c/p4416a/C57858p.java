package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.p */
/* compiled from: PG */
public final class C57858p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57858p f154570b;

    /* renamed from: d */
    private static volatile C63010eb f154571d;

    /* renamed from: a */
    public C57569am f154572a;

    /* renamed from: c */
    private byte f154573c = 2;

    static {
        C57858p pVar = new C57858p();
        f154570b = pVar;
        C62942bv.registerDefaultInstance(C57858p.class, pVar);
    }

    private C57858p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154573c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f154573c = b;
                return null;
            case 2:
                return newMessageInfo(f154570b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C57858p();
            case 4:
                return new C57857o();
            case 5:
                return f154570b;
            case 6:
                C63010eb ebVar = f154571d;
                if (ebVar == null) {
                    synchronized (C57858p.class) {
                        ebVar = f154571d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154570b);
                            f154571d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
