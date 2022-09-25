package com.google.common.p4552o.p4563i;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62579m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.b */
/* compiled from: PG */
public final class C59891b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59891b f161844g;

    /* renamed from: h */
    private static volatile C63010eb f161845h;

    /* renamed from: a */
    public int f161846a;

    /* renamed from: b */
    public float f161847b;

    /* renamed from: c */
    public float f161848c;

    /* renamed from: d */
    public float f161849d;

    /* renamed from: e */
    public float f161850e;

    /* renamed from: f */
    public int f161851f;

    static {
        C59891b bVar = new C59891b();
        f161844g = bVar;
        C62942bv.registerDefaultInstance(C59891b.class, bVar);
    }

    private C59891b() {
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
                return newMessageInfo(f161844g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C62579m.f168954a});
            case 3:
                return new C59891b();
            case 4:
                return new C59864a();
            case 5:
                return f161844g;
            case 6:
                C63010eb ebVar = f161845h;
                if (ebVar == null) {
                    synchronized (C59891b.class) {
                        ebVar = f161845h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161844g);
                            f161845h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
