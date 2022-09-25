package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ae */
/* compiled from: PG */
public final class C19904ae extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19904ae f55685f;

    /* renamed from: g */
    private static volatile C63010eb f55686g;

    /* renamed from: a */
    public int f55687a;

    /* renamed from: b */
    public float f55688b;

    /* renamed from: c */
    public float f55689c;

    /* renamed from: d */
    public float f55690d;

    /* renamed from: e */
    public float f55691e;

    static {
        C19904ae aeVar = new C19904ae();
        f55685f = aeVar;
        C62942bv.registerDefaultInstance(C19904ae.class, aeVar);
    }

    private C19904ae() {
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
                return newMessageInfo(f55685f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19904ae();
            case 4:
                return new C19903ad();
            case 5:
                return f55685f;
            case 6:
                C63010eb ebVar = f55686g;
                if (ebVar == null) {
                    synchronized (C19904ae.class) {
                        ebVar = f55686g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55685f);
                            f55686g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
