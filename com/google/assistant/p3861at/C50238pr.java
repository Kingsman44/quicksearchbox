package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pr */
/* compiled from: PG */
public final class C50238pr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50238pr f130626d;

    /* renamed from: e */
    private static volatile C63010eb f130627e;

    /* renamed from: a */
    public int f130628a;

    /* renamed from: b */
    public boolean f130629b;

    /* renamed from: c */
    public boolean f130630c;

    static {
        C50238pr prVar = new C50238pr();
        f130626d = prVar;
        C62942bv.registerDefaultInstance(C50238pr.class, prVar);
    }

    private C50238pr() {
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
                return newMessageInfo(f130626d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50238pr();
            case 4:
                return new C50237pq();
            case 5:
                return f130626d;
            case 6:
                C63010eb ebVar = f130627e;
                if (ebVar == null) {
                    synchronized (C50238pr.class) {
                        ebVar = f130627e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130626d);
                            f130627e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
