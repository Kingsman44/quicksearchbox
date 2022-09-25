package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57575as;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.p */
/* compiled from: PG */
public final class C54479p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54479p f143039b;

    /* renamed from: d */
    private static volatile C63010eb f143040d;

    /* renamed from: a */
    public C57575as f143041a;

    /* renamed from: c */
    private byte f143042c = 2;

    static {
        C54479p pVar = new C54479p();
        f143039b = pVar;
        C62942bv.registerDefaultInstance(C54479p.class, pVar);
    }

    private C54479p() {
        emptyBooleanList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143042c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143042c = b;
                return null;
            case 2:
                return newMessageInfo(f143039b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54479p();
            case 4:
                return new C54478o();
            case 5:
                return f143039b;
            case 6:
                C63010eb ebVar = f143040d;
                if (ebVar == null) {
                    synchronized (C54479p.class) {
                        ebVar = f143040d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143039b);
                            f143040d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
