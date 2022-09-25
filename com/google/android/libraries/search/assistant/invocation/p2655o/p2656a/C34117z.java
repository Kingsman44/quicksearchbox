package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.z */
/* compiled from: PG */
public final class C34117z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34117z f90863d;

    /* renamed from: f */
    private static volatile C63010eb f90864f;

    /* renamed from: a */
    public int f90865a = 0;

    /* renamed from: b */
    public Object f90866b;

    /* renamed from: c */
    public int f90867c;

    /* renamed from: e */
    private byte f90868e = 2;

    static {
        C34117z zVar = new C34117z();
        f90863d = zVar;
        C62942bv.registerDefaultInstance(C34117z.class, zVar);
    }

    private C34117z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90868e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90868e = b;
                return null;
            case 2:
                return newMessageInfo(f90863d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001\f\u0002м\u0000\u0003м\u0000", new Object[]{"b", "a", C45240c.f118157a, C34014ad.class, C34073ci.class});
            case 3:
                return new C34117z();
            case 4:
                return new C34115x();
            case 5:
                return f90863d;
            case 6:
                C63010eb ebVar = f90864f;
                if (ebVar == null) {
                    synchronized (C34117z.class) {
                        ebVar = f90864f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90863d);
                            f90864f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
