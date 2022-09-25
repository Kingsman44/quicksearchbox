package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.s */
/* compiled from: PG */
public final class C34110s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34110s f90846d;

    /* renamed from: f */
    private static volatile C63010eb f90847f;

    /* renamed from: a */
    public int f90848a;

    /* renamed from: b */
    public boolean f90849b;

    /* renamed from: c */
    public C34112u f90850c;

    /* renamed from: e */
    private byte f90851e = 2;

    static {
        C34110s sVar = new C34110s();
        f90846d = sVar;
        C62942bv.registerDefaultInstance(C34110s.class, sVar);
    }

    private C34110s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90851e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90851e = b;
                return null;
            case 2:
                return newMessageInfo(f90846d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34110s();
            case 4:
                return new C34109r();
            case 5:
                return f90846d;
            case 6:
                C63010eb ebVar = f90847f;
                if (ebVar == null) {
                    synchronized (C34110s.class) {
                        ebVar = f90847f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90846d);
                            f90847f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
