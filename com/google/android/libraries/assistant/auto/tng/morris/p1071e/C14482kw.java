package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kw */
/* compiled from: PG */
public final class C14482kw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14482kw f43766d;

    /* renamed from: f */
    private static volatile C63010eb f43767f;

    /* renamed from: a */
    public int f43768a;

    /* renamed from: b */
    public int f43769b;

    /* renamed from: c */
    public C53435nu f43770c;

    /* renamed from: e */
    private byte f43771e = 2;

    static {
        C14482kw kwVar = new C14482kw();
        f43766d = kwVar;
        C62942bv.registerDefaultInstance(C14482kw.class, kwVar);
    }

    private C14482kw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43771e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43771e = b;
                return null;
            case 2:
                return newMessageInfo(f43766d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0002ᐉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14482kw();
            case 4:
                return new C14480ku();
            case 5:
                return f43766d;
            case 6:
                C63010eb ebVar = f43767f;
                if (ebVar == null) {
                    synchronized (C14482kw.class) {
                        ebVar = f43767f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43766d);
                            f43767f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
