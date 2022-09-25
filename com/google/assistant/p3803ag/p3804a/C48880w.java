package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.w */
/* compiled from: PG */
public final class C48880w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48880w f126488d;

    /* renamed from: e */
    private static volatile C63010eb f126489e;

    /* renamed from: a */
    public int f126490a;

    /* renamed from: b */
    public C48803ak f126491b;

    /* renamed from: c */
    public C48851br f126492c;

    static {
        C48880w wVar = new C48880w();
        f126488d = wVar;
        C62942bv.registerDefaultInstance(C48880w.class, wVar);
    }

    private C48880w() {
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
                return newMessageInfo(f126488d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48880w();
            case 4:
                return new C48879v();
            case 5:
                return f126488d;
            case 6:
                C63010eb ebVar = f126489e;
                if (ebVar == null) {
                    synchronized (C48880w.class) {
                        ebVar = f126489e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126488d);
                            f126489e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
