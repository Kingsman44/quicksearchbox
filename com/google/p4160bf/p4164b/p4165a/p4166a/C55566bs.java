package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bs */
/* compiled from: PG */
public final class C55566bs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55566bs f146609a;

    /* renamed from: b */
    private static volatile C63010eb f146610b;

    static {
        C55566bs bsVar = new C55566bs();
        f146609a = bsVar;
        C62942bv.registerDefaultInstance(C55566bs.class, bsVar);
    }

    private C55566bs() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f146609a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55566bs();
            case 4:
                return new C55565br();
            case 5:
                return f146609a;
            case 6:
                C63010eb ebVar = f146610b;
                if (ebVar == null) {
                    synchronized (C55566bs.class) {
                        ebVar = f146610b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146609a);
                            f146610b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
