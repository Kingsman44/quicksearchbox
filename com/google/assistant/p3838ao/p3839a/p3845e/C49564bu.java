package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.bu */
/* compiled from: PG */
public final class C49564bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49564bu f127892d;

    /* renamed from: e */
    private static volatile C63010eb f127893e;

    /* renamed from: a */
    public int f127894a;

    /* renamed from: b */
    public boolean f127895b;

    /* renamed from: c */
    public boolean f127896c;

    static {
        C49564bu buVar = new C49564bu();
        f127892d = buVar;
        C62942bv.registerDefaultInstance(C49564bu.class, buVar);
    }

    private C49564bu() {
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
                return newMessageInfo(f127892d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49564bu();
            case 4:
                return new C49563bt();
            case 5:
                return f127892d;
            case 6:
                C63010eb ebVar = f127893e;
                if (ebVar == null) {
                    synchronized (C49564bu.class) {
                        ebVar = f127893e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127892d);
                            f127893e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
