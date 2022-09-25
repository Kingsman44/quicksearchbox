package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.aq */
/* compiled from: PG */
public final class C48809aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48809aq f126286a;

    /* renamed from: f */
    private static volatile C63010eb f126287f;

    /* renamed from: b */
    private int f126288b;

    /* renamed from: c */
    private C48808ap f126289c;

    /* renamed from: d */
    private C48806an f126290d;

    /* renamed from: e */
    private byte f126291e = 2;

    static {
        C48809aq aqVar = new C48809aq();
        f126286a = aqVar;
        C62942bv.registerDefaultInstance(C48809aq.class, aqVar);
    }

    private C48809aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126291e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126291e = b;
                return null;
            case 2:
                return newMessageInfo(f126286a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C48809aq();
            case 4:
                return new C48804al();
            case 5:
                return f126286a;
            case 6:
                C63010eb ebVar = f126287f;
                if (ebVar == null) {
                    synchronized (C48809aq.class) {
                        ebVar = f126287f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126286a);
                            f126287f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
