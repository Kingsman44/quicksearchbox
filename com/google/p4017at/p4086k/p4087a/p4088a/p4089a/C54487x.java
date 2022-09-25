package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.x */
/* compiled from: PG */
public final class C54487x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54487x f143057a;

    /* renamed from: c */
    private static volatile C63010eb f143058c;

    /* renamed from: b */
    private byte f143059b = 2;

    static {
        C54487x xVar = new C54487x();
        f143057a = xVar;
        C62942bv.registerDefaultInstance(C54487x.class, xVar);
    }

    private C54487x() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143059b);
            case 1:
                this.f143059b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f143057a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54487x();
            case 4:
                return new C54486w();
            case 5:
                return f143057a;
            case 6:
                C63010eb ebVar = f143058c;
                if (ebVar == null) {
                    synchronized (C54487x.class) {
                        ebVar = f143058c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143057a);
                            f143058c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
