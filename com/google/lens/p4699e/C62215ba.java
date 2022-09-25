package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ba */
/* compiled from: PG */
public final class C62215ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62215ba f167974c;

    /* renamed from: e */
    private static volatile C63010eb f167975e;

    /* renamed from: a */
    public int f167976a;

    /* renamed from: b */
    public int f167977b;

    /* renamed from: d */
    private byte f167978d = 2;

    static {
        C62215ba baVar = new C62215ba();
        f167974c = baVar;
        C62942bv.registerDefaultInstance(C62215ba.class, baVar);
    }

    private C62215ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167978d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167978d = b;
                return null;
            case 2:
                return newMessageInfo(f167974c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", C62212ay.f167973a});
            case 3:
                return new C62215ba();
            case 4:
                return new C62211ax();
            case 5:
                return f167974c;
            case 6:
                C63010eb ebVar = f167975e;
                if (ebVar == null) {
                    synchronized (C62215ba.class) {
                        ebVar = f167975e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167974c);
                            f167975e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
