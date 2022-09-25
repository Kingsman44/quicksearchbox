package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bp */
/* compiled from: PG */
public final class C51718bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51718bp f135685d;

    /* renamed from: e */
    private static volatile C63010eb f135686e;

    /* renamed from: a */
    public int f135687a;

    /* renamed from: b */
    public C48090bx f135688b;

    /* renamed from: c */
    public C52428rj f135689c;

    static {
        C51718bp bpVar = new C51718bp();
        f135685d = bpVar;
        C62942bv.registerDefaultInstance(C51718bp.class, bpVar);
    }

    private C51718bp() {
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
                return newMessageInfo(f135685d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51718bp();
            case 4:
                return new C51717bo();
            case 5:
                return f135685d;
            case 6:
                C63010eb ebVar = f135686e;
                if (ebVar == null) {
                    synchronized (C51718bp.class) {
                        ebVar = f135686e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135685d);
                            f135686e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
