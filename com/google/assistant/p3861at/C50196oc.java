package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.oc */
/* compiled from: PG */
public final class C50196oc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50196oc f130490b;

    /* renamed from: d */
    private static volatile C63010eb f130491d;

    /* renamed from: a */
    public boolean f130492a;

    /* renamed from: c */
    private int f130493c;

    static {
        C50196oc ocVar = new C50196oc();
        f130490b = ocVar;
        C62942bv.registerDefaultInstance(C50196oc.class, ocVar);
    }

    private C50196oc() {
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
                return newMessageInfo(f130490b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50196oc();
            case 4:
                return new C50195ob();
            case 5:
                return f130490b;
            case 6:
                C63010eb ebVar = f130491d;
                if (ebVar == null) {
                    synchronized (C50196oc.class) {
                        ebVar = f130491d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130490b);
                            f130491d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
