package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.ac */
/* compiled from: PG */
public final class C52932ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52932ac f138781d;

    /* renamed from: e */
    private static volatile C63010eb f138782e;

    /* renamed from: a */
    public int f138783a;

    /* renamed from: b */
    public C52957v f138784b;

    /* renamed from: c */
    public int f138785c;

    static {
        C52932ac acVar = new C52932ac();
        f138781d = acVar;
        C62942bv.registerDefaultInstance(C52932ac.class, acVar);
    }

    private C52932ac() {
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
                return newMessageInfo(f138781d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52944i.f138823a});
            case 3:
                return new C52932ac();
            case 4:
                return new C52931ab();
            case 5:
                return f138781d;
            case 6:
                C63010eb ebVar = f138782e;
                if (ebVar == null) {
                    synchronized (C52932ac.class) {
                        ebVar = f138782e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138781d);
                            f138782e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
