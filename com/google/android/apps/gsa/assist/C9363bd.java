package com.google.android.apps.gsa.assist;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.bd */
/* compiled from: PG */
public final class C9363bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9363bd f32511d;

    /* renamed from: e */
    private static volatile C63010eb f32512e;

    /* renamed from: a */
    public int f32513a;

    /* renamed from: b */
    public float f32514b;

    /* renamed from: c */
    public float f32515c;

    static {
        C9363bd bdVar = new C9363bd();
        f32511d = bdVar;
        C62942bv.registerDefaultInstance(C9363bd.class, bdVar);
    }

    private C9363bd() {
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
                return newMessageInfo(f32511d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9363bd();
            case 4:
                return new C9362bc();
            case 5:
                return f32511d;
            case 6:
                C63010eb ebVar = f32512e;
                if (ebVar == null) {
                    synchronized (C9363bd.class) {
                        ebVar = f32512e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32511d);
                            f32512e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
