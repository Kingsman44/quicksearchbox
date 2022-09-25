package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ct */
/* compiled from: PG */
public final class C56563ct extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56563ct f151035b;

    /* renamed from: c */
    private static volatile C63010eb f151036c;

    /* renamed from: a */
    public C56562cs f151037a;

    static {
        C56563ct ctVar = new C56563ct();
        f151035b = ctVar;
        C62942bv.registerDefaultInstance(C56563ct.class, ctVar);
    }

    private C56563ct() {
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
                return newMessageInfo(f151035b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C56563ct();
            case 4:
                return new C56552ci();
            case 5:
                return f151035b;
            case 6:
                C63010eb ebVar = f151036c;
                if (ebVar == null) {
                    synchronized (C56563ct.class) {
                        ebVar = f151036c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151035b);
                            f151036c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
