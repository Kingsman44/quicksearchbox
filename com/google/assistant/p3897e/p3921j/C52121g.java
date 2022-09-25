package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.g */
/* compiled from: PG */
public final class C52121g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52121g f136775b;

    /* renamed from: d */
    private static volatile C63010eb f136776d;

    /* renamed from: a */
    public C52094f f136777a;

    /* renamed from: c */
    private int f136778c;

    static {
        C52121g gVar = new C52121g();
        f136775b = gVar;
        C62942bv.registerDefaultInstance(C52121g.class, gVar);
    }

    private C52121g() {
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
                return newMessageInfo(f136775b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52121g();
            case 4:
                return new C51774d();
            case 5:
                return f136775b;
            case 6:
                C63010eb ebVar = f136776d;
                if (ebVar == null) {
                    synchronized (C52121g.class) {
                        ebVar = f136776d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136775b);
                            f136776d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
