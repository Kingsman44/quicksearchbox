package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.ap */
/* compiled from: PG */
public final class C57572ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57572ap f153806b;

    /* renamed from: c */
    private static volatile C63010eb f153807c;

    /* renamed from: a */
    public C62961ch f153808a = emptyIntList();

    static {
        C57572ap apVar = new C57572ap();
        f153806b = apVar;
        C62942bv.registerDefaultInstance(C57572ap.class, apVar);
    }

    private C57572ap() {
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
                return newMessageInfo(f153806b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C57572ap();
            case 4:
                return new C57571ao();
            case 5:
                return f153806b;
            case 6:
                C63010eb ebVar = f153807c;
                if (ebVar == null) {
                    synchronized (C57572ap.class) {
                        ebVar = f153807c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153806b);
                            f153807c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
