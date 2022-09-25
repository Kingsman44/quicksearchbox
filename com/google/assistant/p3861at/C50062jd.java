package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jd */
/* compiled from: PG */
public final class C50062jd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50062jd f130158a;

    /* renamed from: b */
    private static volatile C63010eb f130159b;

    static {
        C50062jd jdVar = new C50062jd();
        f130158a = jdVar;
        C62942bv.registerDefaultInstance(C50062jd.class, jdVar);
    }

    private C50062jd() {
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
                return newMessageInfo(f130158a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50062jd();
            case 4:
                return new C50061jc();
            case 5:
                return f130158a;
            case 6:
                C63010eb ebVar = f130159b;
                if (ebVar == null) {
                    synchronized (C50062jd.class) {
                        ebVar = f130159b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130158a);
                            f130159b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
