package com.google.protos.p4985f.p4988b.p4996f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.f.e */
/* compiled from: PG */
public final class C64809e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64809e f175623a;

    /* renamed from: c */
    private static volatile C63010eb f175624c;

    /* renamed from: b */
    private C62995dn f175625b = C62995dn.f170057a;

    static {
        C64809e eVar = new C64809e();
        f175623a = eVar;
        C62942bv.registerDefaultInstance(C64809e.class, eVar);
    }

    private C64809e() {
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
                return newMessageInfo(f175623a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C64808d.f175622a});
            case 3:
                return new C64809e();
            case 4:
                return new C64807c();
            case 5:
                return f175623a;
            case 6:
                C63010eb ebVar = f175624c;
                if (ebVar == null) {
                    synchronized (C64809e.class) {
                        ebVar = f175624c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175623a);
                            f175624c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
