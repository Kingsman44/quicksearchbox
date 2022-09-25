package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aga */
/* compiled from: PG */
public final class C49822aga extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49822aga f129202a;

    /* renamed from: d */
    private static volatile C63010eb f129203d;

    /* renamed from: b */
    private int f129204b;

    /* renamed from: c */
    private afy f129205c;

    static {
        C49822aga aga = new C49822aga();
        f129202a = aga;
        C62942bv.registerDefaultInstance(C49822aga.class, aga);
    }

    private C49822aga() {
        emptyProtobufList();
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
                return newMessageInfo(f129202a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49822aga();
            case 4:
                return new afz();
            case 5:
                return f129202a;
            case 6:
                C63010eb ebVar = f129203d;
                if (ebVar == null) {
                    synchronized (C49822aga.class) {
                        ebVar = f129203d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129202a);
                            f129203d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
