package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aom */
/* compiled from: PG */
public final class aom extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aom f135503c;

    /* renamed from: d */
    private static volatile C63010eb f135504d;

    /* renamed from: a */
    public int f135505a;

    /* renamed from: b */
    public int f135506b;

    static {
        aom aom = new aom();
        f135503c = aom;
        C62942bv.registerDefaultInstance(aom.class, aom);
    }

    private aom() {
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
                return newMessageInfo(f135503c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aok.f135502a});
            case 3:
                return new aom();
            case 4:
                return new aoj();
            case 5:
                return f135503c;
            case 6:
                C63010eb ebVar = f135504d;
                if (ebVar == null) {
                    synchronized (aom.class) {
                        ebVar = f135504d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135503c);
                            f135504d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
