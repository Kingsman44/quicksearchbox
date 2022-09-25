package com.google.assistant.p3781ad.p3784b.p3785a.p3786a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.b.a.a.b */
/* compiled from: PG */
public final class C48480b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48480b f125234b;

    /* renamed from: d */
    private static volatile C63010eb f125235d;

    /* renamed from: a */
    public C50638an f125236a;

    /* renamed from: c */
    private int f125237c;

    static {
        C48480b bVar = new C48480b();
        f125234b = bVar;
        C62942bv.registerDefaultInstance(C48480b.class, bVar);
    }

    private C48480b() {
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
                return newMessageInfo(f125234b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C48480b();
            case 4:
                return new C48479a();
            case 5:
                return f125234b;
            case 6:
                C63010eb ebVar = f125235d;
                if (ebVar == null) {
                    synchronized (C48480b.class) {
                        ebVar = f125235d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125234b);
                            f125235d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
