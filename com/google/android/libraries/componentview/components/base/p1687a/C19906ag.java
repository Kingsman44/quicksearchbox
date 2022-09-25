package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ag */
/* compiled from: PG */
public final class C19906ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19906ag f55692f;

    /* renamed from: g */
    private static volatile C63010eb f55693g;

    /* renamed from: a */
    public int f55694a;

    /* renamed from: b */
    public float f55695b;

    /* renamed from: c */
    public float f55696c;

    /* renamed from: d */
    public float f55697d;

    /* renamed from: e */
    public float f55698e;

    static {
        C19906ag agVar = new C19906ag();
        f55692f = agVar;
        C62942bv.registerDefaultInstance(C19906ag.class, agVar);
    }

    private C19906ag() {
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
                return newMessageInfo(f55692f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19906ag();
            case 4:
                return new C19905af();
            case 5:
                return f55692f;
            case 6:
                C63010eb ebVar = f55693g;
                if (ebVar == null) {
                    synchronized (C19906ag.class) {
                        ebVar = f55693g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55692f);
                            f55693g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
