package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.z */
/* compiled from: PG */
public final class C24471z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24471z f66980d;

    /* renamed from: e */
    private static volatile C63010eb f66981e;

    /* renamed from: a */
    public int f66982a;

    /* renamed from: b */
    public C24465t f66983b;

    /* renamed from: c */
    public C24459n f66984c;

    static {
        C24471z zVar = new C24471z();
        f66980d = zVar;
        C62942bv.registerDefaultInstance(C24471z.class, zVar);
    }

    private C24471z() {
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
                return newMessageInfo(f66980d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C24471z();
            case 4:
                return new C24470y();
            case 5:
                return f66980d;
            case 6:
                C63010eb ebVar = f66981e;
                if (ebVar == null) {
                    synchronized (C24471z.class) {
                        ebVar = f66981e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66980d);
                            f66981e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
