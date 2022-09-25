package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fa */
/* compiled from: PG */
public final class C53199fa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53199fa f139428a;

    /* renamed from: c */
    private static volatile C63010eb f139429c;

    /* renamed from: b */
    private byte f139430b = 2;

    static {
        C53199fa faVar = new C53199fa();
        f139428a = faVar;
        C62942bv.registerDefaultInstance(C53199fa.class, faVar);
    }

    private C53199fa() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139430b);
            case 1:
                this.f139430b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139428a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53199fa();
            case 4:
                return new C53197ez();
            case 5:
                return f139428a;
            case 6:
                C63010eb ebVar = f139429c;
                if (ebVar == null) {
                    synchronized (C53199fa.class) {
                        ebVar = f139429c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139428a);
                            f139429c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
