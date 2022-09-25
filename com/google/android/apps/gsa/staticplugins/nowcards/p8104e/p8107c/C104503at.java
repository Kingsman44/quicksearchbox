package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.at */
/* compiled from: PG */
public final class C104503at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C104503at f290655d;

    /* renamed from: e */
    private static volatile C63010eb f290656e;

    /* renamed from: a */
    public int f290657a;

    /* renamed from: b */
    public boolean f290658b;

    /* renamed from: c */
    public boolean f290659c;

    static {
        C104503at atVar = new C104503at();
        f290655d = atVar;
        C62942bv.registerDefaultInstance(C104503at.class, atVar);
    }

    private C104503at() {
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
                return newMessageInfo(f290655d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C104503at();
            case 4:
                return new C104502as();
            case 5:
                return f290655d;
            case 6:
                C63010eb ebVar = f290656e;
                if (ebVar == null) {
                    synchronized (C104503at.class) {
                        ebVar = f290656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290655d);
                            f290656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
