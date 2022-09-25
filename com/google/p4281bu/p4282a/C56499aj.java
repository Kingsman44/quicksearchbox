package com.google.p4281bu.p4282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.aj */
/* compiled from: PG */
public final class C56499aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f150904d = new C56494ae();

    /* renamed from: e */
    public static final C56499aj f150905e;

    /* renamed from: f */
    private static volatile C63010eb f150906f;

    /* renamed from: a */
    public C56497ah f150907a;

    /* renamed from: b */
    public int f150908b;

    /* renamed from: c */
    public C62961ch f150909c = emptyIntList();

    static {
        C56499aj ajVar = new C56499aj();
        f150905e = ajVar;
        C62942bv.registerDefaultInstance(C56499aj.class, ajVar);
    }

    private C56499aj() {
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
                return newMessageInfo(f150905e, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\f\u0004,", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56499aj();
            case 4:
                return new C56495af();
            case 5:
                return f150905e;
            case 6:
                C63010eb ebVar = f150906f;
                if (ebVar == null) {
                    synchronized (C56499aj.class) {
                        ebVar = f150906f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150905e);
                            f150906f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
