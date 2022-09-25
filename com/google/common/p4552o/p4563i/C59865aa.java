package com.google.common.p4552o.p4563i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.aa */
/* compiled from: PG */
public final class C59865aa extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59865aa f161782g;

    /* renamed from: h */
    private static volatile C63010eb f161783h;

    /* renamed from: a */
    public int f161784a;

    /* renamed from: b */
    public float f161785b;

    /* renamed from: c */
    public float f161786c;

    /* renamed from: d */
    public float f161787d;

    /* renamed from: e */
    public float f161788e;

    /* renamed from: f */
    public float f161789f;

    static {
        C59865aa aaVar = new C59865aa();
        f161782g = aaVar;
        C62942bv.registerDefaultInstance(C59865aa.class, aaVar);
    }

    private C59865aa() {
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
                return newMessageInfo(f161782g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C59865aa();
            case 4:
                return new C59976z();
            case 5:
                return f161782g;
            case 6:
                C63010eb ebVar = f161783h;
                if (ebVar == null) {
                    synchronized (C59865aa.class) {
                        ebVar = f161783h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161782g);
                            f161783h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
