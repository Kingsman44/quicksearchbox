package com.google.protos.p5146w;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4730a.C62799s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.b */
/* compiled from: PG */
public final class C65942b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65942b f179355a;

    /* renamed from: e */
    private static volatile C63010eb f179356e;

    /* renamed from: b */
    private int f179357b;

    /* renamed from: c */
    private C62799s f179358c;

    /* renamed from: d */
    private byte f179359d = 2;

    static {
        C65942b bVar = new C65942b();
        f179355a = bVar;
        C62942bv.registerDefaultInstance(C65942b.class, bVar);
    }

    private C65942b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179359d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179359d = b;
                return null;
            case 2:
                return newMessageInfo(f179355a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65942b();
            case 4:
                return new C65922a();
            case 5:
                return f179355a;
            case 6:
                C63010eb ebVar = f179356e;
                if (ebVar == null) {
                    synchronized (C65942b.class) {
                        ebVar = f179356e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179355a);
                            f179356e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
