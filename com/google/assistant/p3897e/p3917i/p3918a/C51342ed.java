package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ed */
/* compiled from: PG */
public final class C51342ed extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51342ed f133723f;

    /* renamed from: g */
    private static volatile C63010eb f133724g;

    /* renamed from: a */
    public int f133725a;

    /* renamed from: b */
    public boolean f133726b;

    /* renamed from: c */
    public boolean f133727c;

    /* renamed from: d */
    public boolean f133728d;

    /* renamed from: e */
    public int f133729e;

    static {
        C51342ed edVar = new C51342ed();
        f133723f = edVar;
        C62942bv.registerDefaultInstance(C51342ed.class, edVar);
    }

    private C51342ed() {
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
                return newMessageInfo(f133723f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C51341ec.f133722a});
            case 3:
                return new C51342ed();
            case 4:
                return new C51340eb();
            case 5:
                return f133723f;
            case 6:
                C63010eb ebVar = f133724g;
                if (ebVar == null) {
                    synchronized (C51342ed.class) {
                        ebVar = f133724g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133723f);
                            f133724g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
