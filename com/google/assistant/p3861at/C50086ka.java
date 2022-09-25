package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ka */
/* compiled from: PG */
public final class C50086ka extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50086ka f130212c;

    /* renamed from: d */
    private static volatile C63010eb f130213d;

    /* renamed from: a */
    public int f130214a;

    /* renamed from: b */
    public boolean f130215b;

    static {
        C50086ka kaVar = new C50086ka();
        f130212c = kaVar;
        C62942bv.registerDefaultInstance(C50086ka.class, kaVar);
    }

    private C50086ka() {
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
                return newMessageInfo(f130212c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50086ka();
            case 4:
                return new C50084jz();
            case 5:
                return f130212c;
            case 6:
                C63010eb ebVar = f130213d;
                if (ebVar == null) {
                    synchronized (C50086ka.class) {
                        ebVar = f130213d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130212c);
                            f130213d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
