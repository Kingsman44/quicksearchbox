package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.cl */
/* compiled from: PG */
public final class C34076cl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34076cl f90797c;

    /* renamed from: e */
    private static volatile C63010eb f90798e;

    /* renamed from: a */
    public int f90799a = 0;

    /* renamed from: b */
    public Object f90800b;

    /* renamed from: d */
    private byte f90801d = 2;

    static {
        C34076cl clVar = new C34076cl();
        f90797c = clVar;
        C62942bv.registerDefaultInstance(C34076cl.class, clVar);
    }

    private C34076cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90801d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90801d = b;
                return null;
            case 2:
                return newMessageInfo(f90797c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C34039bb.class, C34060bw.class});
            case 3:
                return new C34076cl();
            case 4:
                return new C34074cj();
            case 5:
                return f90797c;
            case 6:
                C63010eb ebVar = f90798e;
                if (ebVar == null) {
                    synchronized (C34076cl.class) {
                        ebVar = f90798e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90797c);
                            f90798e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
