package com.google.protos.p4850an.p4853b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.q */
/* compiled from: PG */
public final class C63373q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63373q f171270a;

    /* renamed from: b */
    private static volatile C63010eb f171271b;

    static {
        C63373q qVar = new C63373q();
        f171270a = qVar;
        C62942bv.registerDefaultInstance(C63373q.class, qVar);
    }

    private C63373q() {
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
                return newMessageInfo(f171270a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63373q();
            case 4:
                return new C63372p();
            case 5:
                return f171270a;
            case 6:
                C63010eb ebVar = f171271b;
                if (ebVar == null) {
                    synchronized (C63373q.class) {
                        ebVar = f171271b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171270a);
                            f171271b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
