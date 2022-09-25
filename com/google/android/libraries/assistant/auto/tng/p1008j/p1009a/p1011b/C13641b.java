package com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.a.b.b */
/* compiled from: PG */
public final class C13641b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13641b f41678d;

    /* renamed from: e */
    private static volatile C63010eb f41679e;

    /* renamed from: a */
    public int f41680a;

    /* renamed from: b */
    public boolean f41681b = true;

    /* renamed from: c */
    public boolean f41682c;

    static {
        C13641b bVar = new C13641b();
        f41678d = bVar;
        C62942bv.registerDefaultInstance(C13641b.class, bVar);
    }

    private C13641b() {
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
                return newMessageInfo(f41678d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13641b();
            case 4:
                return new C13640a();
            case 5:
                return f41678d;
            case 6:
                C63010eb ebVar = f41679e;
                if (ebVar == null) {
                    synchronized (C13641b.class) {
                        ebVar = f41679e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41678d);
                            f41679e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
