package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.l */
/* compiled from: PG */
public final class C33906l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33906l f90449c;

    /* renamed from: e */
    private static volatile C63010eb f90450e;

    /* renamed from: a */
    public C34053bp f90451a;

    /* renamed from: b */
    public int f90452b;

    /* renamed from: d */
    private byte f90453d = 2;

    static {
        C33906l lVar = new C33906l();
        f90449c = lVar;
        C62942bv.registerDefaultInstance(C33906l.class, lVar);
    }

    private C33906l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90453d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90453d = b;
                return null;
            case 2:
                return newMessageInfo(f90449c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C33906l();
            case 4:
                return new C33905k();
            case 5:
                return f90449c;
            case 6:
                C63010eb ebVar = f90450e;
                if (ebVar == null) {
                    synchronized (C33906l.class) {
                        ebVar = f90450e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90449c);
                            f90450e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
