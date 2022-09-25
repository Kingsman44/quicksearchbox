package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bp */
/* compiled from: PG */
public final class C34053bp extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C34053bp f90753a;

    /* renamed from: c */
    private static volatile C63010eb f90754c;

    /* renamed from: b */
    private byte f90755b = 2;

    static {
        C34053bp bpVar = new C34053bp();
        f90753a = bpVar;
        C62942bv.registerDefaultInstance(C34053bp.class, bpVar);
    }

    private C34053bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90755b);
            case 1:
                this.f90755b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f90753a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34053bp();
            case 4:
                return new C34052bo();
            case 5:
                return f90753a;
            case 6:
                C63010eb ebVar = f90754c;
                if (ebVar == null) {
                    synchronized (C34053bp.class) {
                        ebVar = f90754c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90753a);
                            f90754c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
