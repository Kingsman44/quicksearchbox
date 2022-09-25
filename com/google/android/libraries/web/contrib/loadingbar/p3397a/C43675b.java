package com.google.android.libraries.web.contrib.loadingbar.p3397a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.a.b */
/* compiled from: PG */
public final class C43675b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C43675b f113958d;

    /* renamed from: e */
    private static volatile C63010eb f113959e;

    /* renamed from: a */
    public int f113960a;

    /* renamed from: b */
    public int f113961b;

    /* renamed from: c */
    public float f113962c;

    static {
        C43675b bVar = new C43675b();
        f113958d = bVar;
        C62942bv.registerDefaultInstance(C43675b.class, bVar);
    }

    private C43675b() {
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
                return newMessageInfo(f113958d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C43675b();
            case 4:
                return new C43674a();
            case 5:
                return f113958d;
            case 6:
                C63010eb ebVar = f113959e;
                if (ebVar == null) {
                    synchronized (C43675b.class) {
                        ebVar = f113959e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113958d);
                            f113959e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
