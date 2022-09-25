package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fv */
/* compiled from: PG */
public final class C14346fv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14346fv f43407f;

    /* renamed from: g */
    private static volatile C63010eb f43408g;

    /* renamed from: a */
    public C62971cq f43409a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f43410b = emptyProtobufList();

    /* renamed from: c */
    public boolean f43411c;

    /* renamed from: d */
    public boolean f43412d;

    /* renamed from: e */
    public boolean f43413e;

    static {
        C14346fv fvVar = new C14346fv();
        f43407f = fvVar;
        C62942bv.registerDefaultInstance(C14346fv.class, fvVar);
    }

    private C14346fv() {
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
                return newMessageInfo(f43407f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"a", C14636z.class, "b", C14348fx.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C14346fv();
            case 4:
                return new C14345fu();
            case 5:
                return f43407f;
            case 6:
                C63010eb ebVar = f43408g;
                if (ebVar == null) {
                    synchronized (C14346fv.class) {
                        ebVar = f43408g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43407f);
                            f43408g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
