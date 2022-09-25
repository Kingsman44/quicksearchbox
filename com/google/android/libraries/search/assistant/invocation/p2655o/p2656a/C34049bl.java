package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bl */
/* compiled from: PG */
public final class C34049bl extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C34049bl f90749a;

    /* renamed from: c */
    private static volatile C63010eb f90750c;

    /* renamed from: b */
    private byte f90751b = 2;

    static {
        C34049bl blVar = new C34049bl();
        f90749a = blVar;
        C62942bv.registerDefaultInstance(C34049bl.class, blVar);
    }

    private C34049bl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90751b);
            case 1:
                this.f90751b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f90749a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34049bl();
            case 4:
                return new C34048bk();
            case 5:
                return f90749a;
            case 6:
                C63010eb ebVar = f90750c;
                if (ebVar == null) {
                    synchronized (C34049bl.class) {
                        ebVar = f90750c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90749a);
                            f90750c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
