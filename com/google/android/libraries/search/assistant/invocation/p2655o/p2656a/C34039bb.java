package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bb */
/* compiled from: PG */
public final class C34039bb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C34039bb f90716f;

    /* renamed from: h */
    private static volatile C63010eb f90717h;

    /* renamed from: a */
    public int f90718a;

    /* renamed from: b */
    public int f90719b;

    /* renamed from: c */
    public C34053bp f90720c;

    /* renamed from: d */
    public C34038ba f90721d;

    /* renamed from: e */
    public C34065ca f90722e;

    /* renamed from: g */
    private byte f90723g = 2;

    static {
        C34039bb bbVar = new C34039bb();
        f90716f = bbVar;
        C62942bv.registerDefaultInstance(C34039bb.class, bbVar);
    }

    private C34039bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90723g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90723g = b;
                return null;
            case 2:
                return newMessageInfo(f90716f, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\f\u0003ဉ\u0000\u0004Љ\u0005Љ", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C34039bb();
            case 4:
                return new C34035ay();
            case 5:
                return f90716f;
            case 6:
                C63010eb ebVar = f90717h;
                if (ebVar == null) {
                    synchronized (C34039bb.class) {
                        ebVar = f90717h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90716f);
                            f90717h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
