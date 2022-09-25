package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57614cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.z */
/* compiled from: PG */
public final class C54489z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54489z f143060b;

    /* renamed from: d */
    private static volatile C63010eb f143061d;

    /* renamed from: a */
    public C57614cd f143062a;

    /* renamed from: c */
    private byte f143063c = 2;

    static {
        C54489z zVar = new C54489z();
        f143060b = zVar;
        C62942bv.registerDefaultInstance(C54489z.class, zVar);
    }

    private C54489z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143063c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143063c = b;
                return null;
            case 2:
                return newMessageInfo(f143060b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54489z();
            case 4:
                return new C54488y();
            case 5:
                return f143060b;
            case 6:
                C63010eb ebVar = f143061d;
                if (ebVar == null) {
                    synchronized (C54489z.class) {
                        ebVar = f143061d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143060b);
                            f143061d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
