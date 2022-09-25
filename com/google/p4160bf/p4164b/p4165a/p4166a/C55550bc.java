package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bc */
/* compiled from: PG */
public final class C55550bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55550bc f146575c;

    /* renamed from: d */
    private static volatile C63010eb f146576d;

    /* renamed from: a */
    public int f146577a;

    /* renamed from: b */
    public C55549bb f146578b;

    static {
        C55550bc bcVar = new C55550bc();
        f146575c = bcVar;
        C62942bv.registerDefaultInstance(C55550bc.class, bcVar);
    }

    private C55550bc() {
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
                return newMessageInfo(f146575c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55550bc();
            case 4:
                return new C55546az();
            case 5:
                return f146575c;
            case 6:
                C63010eb ebVar = f146576d;
                if (ebVar == null) {
                    synchronized (C55550bc.class) {
                        ebVar = f146576d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146575c);
                            f146576d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
