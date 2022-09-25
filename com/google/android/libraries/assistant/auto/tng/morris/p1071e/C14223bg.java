package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bg */
/* compiled from: PG */
public final class C14223bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14223bg f43046d;

    /* renamed from: f */
    private static volatile C63010eb f43047f;

    /* renamed from: a */
    public C14492lf f43048a;

    /* renamed from: b */
    public int f43049b;

    /* renamed from: c */
    public int f43050c;

    /* renamed from: e */
    private byte f43051e = 2;

    static {
        C14223bg bgVar = new C14223bg();
        f43046d = bgVar;
        C62942bv.registerDefaultInstance(C14223bg.class, bgVar);
    }

    private C14223bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43051e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43051e = b;
                return null;
            case 2:
                return newMessageInfo(f43046d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0002\u0004\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14223bg();
            case 4:
                return new C14222bf();
            case 5:
                return f43046d;
            case 6:
                C63010eb ebVar = f43047f;
                if (ebVar == null) {
                    synchronized (C14223bg.class) {
                        ebVar = f43047f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43046d);
                            f43047f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
